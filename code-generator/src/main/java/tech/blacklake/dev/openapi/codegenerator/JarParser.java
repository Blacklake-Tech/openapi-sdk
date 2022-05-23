package tech.blacklake.dev.openapi.codegenerator;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.blacklake.dev.openapi.codegenerator.constant.ClassTypeEnum;
import tech.blacklake.dev.openapi.codegenerator.data.Pair;
import tech.blacklake.dev.openapi.codegenerator.data.ReflectionResult;
import tech.blacklake.dev.openapi.codegenerator.loader.SdkClassLoader;
import tech.blacklake.dev.openapi.codegenerator.util.ShellUtil;
import tech.blacklake.dev.openapi.codegenerator.util.StringUtil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.*;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Collectors;

/**
 * @author cuiyichen
 * @date 2022/05/17 17:12:11
 * <p>
 * jar包解析器
 */
@Slf4j
public class JarParser {
    /**
     * 获取maven本地仓库的shell命令
     */
    private static final String GET_MAVEN_LOCAL_REPOSITORY_COMMAND = "mvn help:evaluate -Dexpression=settings.localRepository | grep -v '[INFO]'";

    /**
     * maven本地仓库路径
     */
    private static final String MAVEN_LOCAL_REPOSITORY = ShellUtil.runShellCommand(GET_MAVEN_LOCAL_REPOSITORY_COMMAND);

    private static final String EL_TYPE = "type";
    private static final String EL_SUPERCLASS_AND_INTERFACES = "superclass_and_interfaces";
    private static final String EL_DESCRIPTION = "description";
    private static final String EL_FIELD_TYPE = "field_type";
    private static final String EL_FIELD_NAME = "field_name";
    private static final String EL_DEFAULT_VALUE = "default_value";
    private static final String EL_FIELD_NAME_INIT_CAP = "field_name_init_cap";

    private static final String EL_PATH = "path";
    private static final String EL_RETURN_TYPE = "return_type";
    private static final String EL_METHOD_NAME = "method_name";
    private static final String EL_PARAMETER_TYPE = "parameter_type";
    private static final String EL_PARAMETER_NAME = "parameter_name";

    private static final String LOOP_ID_FIELD = "field";
    private static final String LOOP_ID_HANDLER = "handler";

    private static final String DTO_REQUEST = "RequestDTO";
    private static final String DTO_RESPONSE = "ResponseDTO";
    private static final String DTO_VO = "VO";
    private static final String DTO_CO = "CO";
    private static final String DTO_RES = "ResDTO";
    private static final String DTO_REQ = "ReqDTO";
    private static final String TYPE_REQ = "req";
    private static final String TYPE_RES = "res";
    private static final String TYPE_COMMON = "common";
    private static final String IMPLEMENTS = "implements";
    private static final String EXTENDS = "extends";
    private static final String SPACE = " ";
    private static final String COMMA = ",";
    private static final String EMPTY_STR = "";
    private static final String JAVA_BASE_MODULE = "java.base";

    private static final Set<String> INVALID_SUPERCLASSES = Set.of("BaseDO", "BasePO", "BaseVO", "BaseDTO", "BaseCO", "BaseCheckCO", "Serializable", "Comparable");

    /**
     * 解析jar文件
     *
     * @return pair.left为所有controller的解析结果, pair.right为所有dto的解析结果
     */
    public static Pair<List<ReflectionResult>, List<ReflectionResult>> parseJar(String groupId, String artifactId, String version, Set<String> parsedDtoSet, boolean needParse) {
        // 获取classloader
        SdkClassLoader sdkClassLoader = SdkClassLoader.getSdkClassLoader();
        // 获取application name
        String applicationName = getApplicationName(groupId);
        // 获取jar包路径
        groupId = StringUtil.replaceDotToFileSep(groupId);
        String jarFileName = artifactId + "-" + version + ".jar";
        log.info("开始解析{}...", jarFileName);
        String jarPath = StringUtil.concatPath(MAVEN_LOCAL_REPOSITORY, groupId, artifactId, version, jarFileName);
        // 加载jar中的class
        List<Class<?>> loadedClasses = loadJarClasses(jarPath);
        // 如果只需要加载class而不需要解析, 则直接返回
        if (!needParse) {
            return null;
        }

        // 获取jar中所有OpenapiController
        List<Class<?>> openapiControllers = loadedClasses.stream().filter(JarParser::isOpenapiController).collect(Collectors.toList());

        // controller解析结果
        List<ReflectionResult> controllerReflectionResultList = new ArrayList<>();
        // 待解析的dto名
        List<String> waitParseDtoNames = new ArrayList<>();
        // 解析controller
        for (Class<?> openapiController : openapiControllers) {
            Pair<ReflectionResult, List<String>> pair = parseController(openapiController, applicationName);
            controllerReflectionResultList.add(Objects.requireNonNull(pair).getLeft());
            waitParseDtoNames.addAll(pair.getRight());
        }

        // 解析dto
        List<ReflectionResult> dtoReflectionResultList = new ArrayList<>();
        while ((waitParseDtoNames = waitParseDtoNames.stream()
                .distinct()
                .filter(it -> !parsedDtoSet.contains(it.substring(it.lastIndexOf(".") + 1)))
                .collect(Collectors.toList())).size() > 0) {

            List<String> newWaitParseDtoNames = new ArrayList<>();
            try {
                for (String dtoName : waitParseDtoNames) {
                    Class<?> clazz;
                    clazz = sdkClassLoader.loadClass(dtoName);
                    Pair<ReflectionResult, List<String>> pair = parseDto(clazz);
                    dtoReflectionResultList.add(pair.getLeft());
                    newWaitParseDtoNames.addAll(pair.getRight());
                }
            } catch (ClassNotFoundException e) {
                log.info("未找到类: {}", e.getMessage());
                throw new RuntimeException(e);
            }

            // 解析过的dto放入set，避免重复解析dto
            parsedDtoSet.addAll(waitParseDtoNames.stream().map(it -> it.substring(it.lastIndexOf(".") + 1)).collect(Collectors.toList()));
            waitParseDtoNames = newWaitParseDtoNames;
        }

        return new Pair<>(controllerReflectionResultList, dtoReflectionResultList);
    }

    /**
     * 加载指定路径jar的类并返回所有已加载的类
     */
    private static List<Class<?>> loadJarClasses(String jarPath) {
        JarFile jarFile;
        try {
            jarFile = new JarFile(jarPath);
        } catch (IOException e) {
            log.error("读取jar失败");
            throw new RuntimeException(e);
        }
        Enumeration<JarEntry> entrys = jarFile.entries();
        SdkClassLoader sdkClassLoader = SdkClassLoader.getSdkClassLoader();

        /* 1. 获取jar文件中所有类的全限定名 */
        List<Pair<String, JarEntry>> classNameAndJarEntryList = new ArrayList<>();
        // jarEntryMap用于解决class依赖问题
        Map<String, JarEntry> jarEntryMap = new HashMap<>();
        while (entrys.hasMoreElements()) {
            JarEntry jarEntry = entrys.nextElement();
            String entryName = jarEntry.getName();
            if (entryName.endsWith(".class")) {
                if (entryName.startsWith("BOOT-INF/classes/")) {
                    entryName = entryName.substring(17);
                }
                String className = StringUtil.replaceFileSepToDot(entryName).substring(0, entryName.lastIndexOf("."));
                // 不加载springboot引导类
                if (!className.startsWith("org.springframework.boot.loader")) {
                    classNameAndJarEntryList.add(new Pair<>(className, jarEntry));
                    jarEntryMap.put(jarEntry.getName(), jarEntry);
                }
            }
        }

        /* 2. 反射 */
        List<Class<?>> loadedClasses = new ArrayList<>();
        for (Pair<String, JarEntry> pair : classNameAndJarEntryList) {
            String className = pair.getLeft();
            JarEntry jarEntry = pair.getRight();
            Class<?> clazz;
            try {
                clazz = sdkClassLoader.loadClass(className, jarFile, jarEntry, jarEntryMap);
                loadedClasses.add(clazz);
            } catch (FileNotFoundException e) {
                log.error("未找到类文件: {}", jarEntry.getName());
                throw new RuntimeException(e);
            }
        }

        return loadedClasses;
    }

    /**
     * 解析DTO.class
     */
    private static Pair<ReflectionResult, List<String>> parseDto(Class<?> dtoClass) {
        ReflectionResult dtoResult = new ReflectionResult();

        /* 1. 类名解析 */
        Map<String, String> normalParameters = new HashMap<>();
        String simpleClassName = switchDtoName(dtoClass.getSimpleName());
        simpleClassName = simpleClassName.replace("Open", EMPTY_STR);
        dtoResult.setClassName(simpleClassName);

        /* 2. type/state解析 */
        String type;
        ClassTypeEnum state;
        if (simpleClassName.endsWith(DTO_REQUEST)) {
            type = TYPE_REQ;
            state = ClassTypeEnum.REQUEST_DTO;
        } else if (simpleClassName.endsWith(DTO_RESPONSE)) {
            type = TYPE_RES;
            state = ClassTypeEnum.RESPONSE_DTO;
        } else {
            type = TYPE_COMMON;
            state = ClassTypeEnum.COMMON_DATA;
        }
        dtoResult.setState(state);
        normalParameters.put(EL_TYPE, type);

        /* 2. 超类解析 */
        StringBuilder superclassAndInterfaces = new StringBuilder();
        Class<?> superclass = dtoClass.getSuperclass();
        Class<?>[] interfaces = dtoClass.getInterfaces();
        if (superclass != null && superclass != Object.class && !INVALID_SUPERCLASSES.contains(superclass.getSimpleName())) {
            superclassAndInterfaces.append(EXTENDS).append(SPACE).append(superclass.getSimpleName()).append(SPACE);
        }
        if (interfaces.length > 0) {
            boolean hasValidInterface = false;
            for (int i = 0; i < interfaces.length; i++) {
                String interfaceSimpleName = interfaces[i].getSimpleName();
                if (INVALID_SUPERCLASSES.contains(interfaceSimpleName)) {
                    continue;
                }
                if (!hasValidInterface) {
                    superclassAndInterfaces.append(IMPLEMENTS).append(SPACE);
                    hasValidInterface = true;
                }
                if (i != 0) {
                    superclassAndInterfaces.append(COMMA).append(SPACE);
                }
                superclassAndInterfaces.append(interfaceSimpleName);
            }
            superclassAndInterfaces.append(SPACE);
        }
        normalParameters.put(EL_SUPERCLASS_AND_INTERFACES, superclassAndInterfaces.toString());
        dtoResult.setNormalParameters(normalParameters);

        /* 3. 字段解析 */
        Map<String, List<String>> loopParameters = new HashMap<>();
        List<String> descriptions = new ArrayList<>();
        List<String> fieldTypeNames = new ArrayList<>();
        List<String> defaultValues = new ArrayList<>();
        List<String> fieldNames = new ArrayList<>();
        List<String> fieldNamesInitCap = new ArrayList<>();

        Field[] fields = dtoClass.getDeclaredFields();
        List<String> needParseDtoNames = new ArrayList<>();
        Arrays.stream(fields).forEach(it -> {
            // 字段名
            String fieldName = it.getName();
            fieldName = switchDtoName(fieldName);

            // 首字母大写字段名，用于getter、setter
            String fieldNameIntiCap = StringUtil.upperCaseFirstChar(fieldName);

            // 字段描述
            String description = fieldName;
            ApiModelProperty annotation = it.getAnnotation(ApiModelProperty.class);
            if (annotation != null) {
                description = annotation.value();
            }

            // 字段默认值
            int modifiers = it.getModifiers();
            boolean isStatic = Modifier.isStatic(modifiers);
            String defaultValStr = "";
            it.setAccessible(true);
            try {
                Object defaultValObj = isStatic ? it.get(null) : it.get(dtoClass.getConstructor().newInstance());
                if (defaultValObj != null) {
                    String defaultValName = null;
                    if (defaultValObj instanceof Enum) {
                        defaultValName = defaultValObj.getClass().getSimpleName() + "." + defaultValObj;
                    } else if (defaultValObj instanceof String) {
                        defaultValName = "\"" + defaultValObj + "\"";
                    } else if (defaultValObj instanceof Short || defaultValObj instanceof Integer || defaultValObj instanceof Long || defaultValObj instanceof Float || defaultValObj instanceof Double || defaultValObj instanceof Byte || defaultValObj instanceof Boolean) {
                        defaultValName = String.valueOf(defaultValObj);
                    }

                    if (defaultValName != null) {
                        defaultValStr = SPACE + "=" + SPACE + defaultValName;
                    }
                }
            } catch (Exception ignored) {
                // 构造实例时，可能由于没有无参构造导致异常，无视即可
            }

            // 字段类型名
            String fieldTypeName;
            Type genericFieldType = it.getGenericType();
            if (genericFieldType instanceof ParameterizedType) {
                fieldTypeName = handleParameterizedType((ParameterizedType) genericFieldType, needParseDtoNames);
            } else {
                Class<?> fieldType = it.getType();
                needToParse(fieldType, needParseDtoNames);
                fieldTypeName = fieldType.getSimpleName();
            }
            fieldTypeName = switchDtoName(fieldTypeName);

            descriptions.add(description);
            fieldNames.add(fieldName);
            defaultValues.add(defaultValStr);
            fieldTypeNames.add(fieldTypeName);
            fieldNamesInitCap.add(fieldNameIntiCap);
        });

        loopParameters.put(EL_DESCRIPTION, descriptions);
        loopParameters.put(EL_FIELD_TYPE, fieldTypeNames);
        loopParameters.put(EL_DEFAULT_VALUE, defaultValues);
        loopParameters.put(EL_FIELD_NAME, fieldNames);
        loopParameters.put(EL_FIELD_NAME_INIT_CAP, fieldNamesInitCap);
        Map<String, Map<String, List<String>>> multiLoopParameter = new HashMap<>();
        multiLoopParameter.put(LOOP_ID_FIELD, loopParameters);
        dtoResult.setMultiLoopParameters(multiLoopParameter);

        return new Pair<>(dtoResult, needParseDtoNames);
    }

    /**
     * 解析controller.class
     */
    private static Pair<ReflectionResult, List<String>> parseController(Class<?> controllerClass, String applicationName) {
        ReflectionResult controllerResult = new ReflectionResult();
        controllerResult.setState(ClassTypeEnum.CONTROLLER);

        RequestMapping requestMapping = controllerClass.getAnnotation(RequestMapping.class);
        String parentPath = requestMapping.value()[0];

        Map<String, List<String>> loopParameters = new HashMap<>();
        List<String> descriptions = new ArrayList<>();
        List<String> paths = new ArrayList<>();
        List<String> methodNames = new ArrayList<>();
        List<String> returnTypeNames = new ArrayList<>();
        List<String> parameterTypeNames = new ArrayList<>();
        List<String> parameterNames = new ArrayList<>();

        Method[] methods = controllerClass.getDeclaredMethods();
        List<String> needParseDtoNames = new ArrayList<>();
        Arrays.stream(methods)
                .filter(it -> it.getAnnotation(ApiOperation.class) != null)
                .forEach(it -> {
                    ApiOperation apiOperation = it.getAnnotation(ApiOperation.class);
                    String description = apiOperation.value();
                    PostMapping postMapping = it.getAnnotation(PostMapping.class);
                    String path = parentPath + postMapping.value()[0];
                    String methodName = getMethodNameByPath(path);
                    path = "/" + applicationName + path;

                    String returnTypeName;
                    Type genericReturnType = it.getGenericReturnType();
                    if (genericReturnType instanceof ParameterizedType) {
                        returnTypeName = handleParameterizedType((ParameterizedType) genericReturnType, needParseDtoNames);
                    } else {
                        Class<?> returnType = it.getReturnType();
                        needToParse(returnType, needParseDtoNames);
                        returnTypeName = returnType.getSimpleName();
                    }
                    returnTypeName = switchDtoName(returnTypeName);

                    String parameterTypeName;
                    Type genericParameterType = it.getGenericParameterTypes()[0];
                    if (genericParameterType instanceof ParameterizedType) {
                        parameterTypeName = handleParameterizedType((ParameterizedType) genericParameterType, needParseDtoNames);
                    } else {
                        Class<?> parameterType = it.getParameterTypes()[0];
                        needToParse(parameterType, needParseDtoNames);
                        parameterTypeName = parameterType.getSimpleName();
                    }
                    parameterTypeName = switchDtoName(parameterTypeName);
                    String parameterName = StringUtil.lowerCaseFirstChar(parameterTypeName);

                    descriptions.add(description);
                    paths.add(path);
                    methodNames.add(methodName);
                    returnTypeNames.add(returnTypeName);
                    parameterTypeNames.add(parameterTypeName);
                    parameterNames.add(parameterName);
                });

        loopParameters.put(EL_DESCRIPTION, descriptions);
        loopParameters.put(EL_PATH, paths);
        loopParameters.put(EL_RETURN_TYPE, returnTypeNames);
        loopParameters.put(EL_METHOD_NAME, methodNames);
        loopParameters.put(EL_PARAMETER_TYPE, parameterTypeNames);
        loopParameters.put(EL_PARAMETER_NAME, parameterNames);
        Map<String, Map<String, List<String>>> multiLoopParameter = new HashMap<>();
        multiLoopParameter.put(LOOP_ID_HANDLER, loopParameters);
        controllerResult.setMultiLoopParameters(multiLoopParameter);

        return new Pair<>(controllerResult, needParseDtoNames);
    }

    private static boolean isOpenapiController(Class<?> clazz) {
        return clazz.getPackageName().contains("controller.open") && clazz.getName().endsWith("Controller");
    }

    private static String getMethodNameByPath(String path) {
        String[] phrases = path.split("/");
        StringBuilder methodName = new StringBuilder();

        Arrays.stream(phrases)
                .filter(it -> !"open".equals(it) && !"v1".equals(it))
                .flatMap(it -> Arrays.stream(it.split("_")))
                .filter(it -> it.length() > 0)
                .map(StringUtil::upperCaseFirstChar)
                .forEach(methodName::append);

        return StringUtil.lowerCaseFirstChar(methodName.toString());
    }

    private static String switchDtoName(String dtoName) {
        if (dtoName.endsWith(DTO_CO)) {
            dtoName = dtoName.replace(DTO_CO, DTO_REQUEST);
        } else if (dtoName.endsWith(DTO_VO)) {
            dtoName = dtoName.replace(DTO_VO, DTO_RESPONSE);
        } else if (dtoName.endsWith(DTO_REQ)) {
            dtoName = dtoName.replace(DTO_REQ, DTO_REQUEST);
        } else if (dtoName.endsWith(DTO_RES)) {
            dtoName = dtoName.replace(DTO_RES, DTO_RESPONSE);
        }
        dtoName = dtoName.replace("Open", EMPTY_STR);
        return dtoName;
    }

    private static void needToParse(String className, List<String> needParseDtoNames) {
        try {
            needToParse(SdkClassLoader.getSdkClassLoader().loadClass(className), needParseDtoNames);
        } catch (ClassNotFoundException e) {
            log.error("类文件未找到: {}", className);
            throw new RuntimeException(e);
        }
    }

    private static void needToParse(Class<?> clazz, List<String> needParseDtoNames) {
        if (!JAVA_BASE_MODULE.equals(clazz.getModule().getName())) {
            needParseDtoNames.add(clazz.getName());
        }
    }

    /**
     * 处理泛型Object
     */
    private static String handleParameterizedType(ParameterizedType type, List<String> needParseDtoNames) {
        Type[] actualTypeArguments = type.getActualTypeArguments();
        StringBuilder actualSimpleName = new StringBuilder();
        actualSimpleName.append(getSimpleClassName(type.getRawType().getTypeName())).append("<");

        for (int i = 0; i < actualTypeArguments.length; i++) {
            Type actualTypeArgument = actualTypeArguments[i];
            if (i != 0) {
                actualSimpleName.append(COMMA).append(SPACE);
            }
            String typeArgName;
            if (actualTypeArgument instanceof ParameterizedType) {
                typeArgName = handleParameterizedType((ParameterizedType) actualTypeArgument, needParseDtoNames);
            } else {
                typeArgName = actualTypeArgument.getTypeName();
                // 如果是? extends ...格式
                if (typeArgName.startsWith("? extends")) {
                    // FIXME 直接字符串截取, 不太优雅
                    typeArgName = typeArgName.substring(10);
                }
                needToParse(typeArgName, needParseDtoNames);
            }
            actualSimpleName.append(switchDtoName(getSimpleClassName(typeArgName)));
        }

        actualSimpleName.append(">");
        return actualSimpleName.toString();
    }

    private static String getSimpleClassName(String className) {
        return className.contains(".") ? className.substring(className.lastIndexOf(".") + 1) : className;
    }


    private static String getApplicationName(String str) {
        return str.substring(str.lastIndexOf(".") + 1);
    }
}
