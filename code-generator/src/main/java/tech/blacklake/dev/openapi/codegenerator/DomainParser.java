package tech.blacklake.dev.openapi.codegenerator;

import lombok.extern.slf4j.Slf4j;
import tech.blacklake.dev.openapi.codegenerator.data.Pair;
import tech.blacklake.dev.openapi.codegenerator.data.ReflectionResult;
import tech.blacklake.dev.openapi.codegenerator.loader.SdkClassLoader;
import tech.blacklake.dev.openapi.codegenerator.util.ShellUtil;
import tech.blacklake.dev.openapi.codegenerator.util.StringUtil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Collectors;

/**
 * @author cuiyichen
 * @date 2022/05/17 17:12:11
 */
@Slf4j
public class DomainParser {
    /**
     * AppClassLoader
     */
    private static final SdkClassLoader SDK_CLASS_LOADER = new SdkClassLoader();

    /**
     * 获取maven本地仓库的shell命令
     */
    private static final String GET_MAVEN_LOCAL_REPOSITORY_COMMAND = "mvn help:evaluate -Dexpression=settings.localRepository | grep -v '[INFO]'";

    /**
     * maven本地仓库路径
     */
    private static final String MAVEN_LOCAL_REPOSITORY = ShellUtil.runShellCommand(GET_MAVEN_LOCAL_REPOSITORY_COMMAND);

    private static final String DTO_TEMPLATE_NAME = "dto-template";

    private static final String CONTROLLER_TEMPLATE_NAME = "controller-template";

    private static final String EL_TYPE = "type";
    private static final String EL_SUPERCLASS = "superclass";
    private static final String EL_DESCRIPTION = "description";
    private static final String EL_FIELD_TYPE = "field_type";
    private static final String EL_FIELD_NAME = "field_name";
    private static final String EL_FIELD_NAME_INIT_CAP = "field_name_init_cap";

    private static final String EL_PATH = "path";
    private static final String EL_RETURN_TYPE = "return_type";
    private static final String EL_METHOD_NAME = "method_name";
    private static final String EL_PARAMETER_TYPE = "parameter_type";
    private static final String EL_PARAMETER_NAME = "parameter_name";

    private static final String LOOP_ID_FIELD = "field";
    private static final String LOOP_ID_HANDLER = "handler";

    /**
     * 解析jar文件
     */
    public static Pair<ReflectionResult, List<ReflectionResult>> parseJar(String groupId, String artifactId, String version) {
        String jarPath = getJarPath(groupId, artifactId, version);
        List<Class<?>> openapiControllers = getOpenapiControllers(jarPath);

        Set<String> dtoClassNames = new HashSet<>();
        ReflectionResult allControllerReflectionResult = new ReflectionResult();
        openapiControllers.forEach(it -> {
            Pair<ReflectionResult, List<String>> pair = parseController(it);
            addReflectionResult(allControllerReflectionResult, pair.getLeft());
            dtoClassNames.addAll(pair.getRight());
        });

        List<ReflectionResult> dtoReflectionResultList = dtoClassNames.stream().map(it -> {
            try {
                return SDK_CLASS_LOADER.loadClass(it);
            } catch (ClassNotFoundException e) {
                log.info("未找到类: {}", it);
                throw new RuntimeException(e);
            }
        }).map(DomainParser::parseDto).collect(Collectors.toList());

        return new Pair<>(allControllerReflectionResult, dtoReflectionResultList);
    }

    /**
     * 加载指定路径jar的类并返回OpenapiController.class
     */
    private static List<Class<?>> getOpenapiControllers(String jarPath) {
        JarFile jarFile;
        try {
            jarFile = new JarFile(jarPath);
        } catch (IOException e) {
            log.error("读取jar失败");
            throw new RuntimeException(e);
        }
        Enumeration<JarEntry> entrys = jarFile.entries();

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
        List<Class<?>> openapiControllers = new ArrayList<>();
        for (Pair<String, JarEntry> pair : classNameAndJarEntryList) {
            String className = pair.getLeft();
            JarEntry jarEntry = pair.getRight();
            Class<?> clazz;
            try {
                clazz = SDK_CLASS_LOADER.loadClass(className, jarFile, jarEntry, jarEntryMap);
                if (isOpenapiController(clazz)) {
                    openapiControllers.add(clazz);
                }
            } catch (FileNotFoundException e) {
                log.error("未找到类文件: {}", jarEntry.getName());
                throw new RuntimeException(e);
            }
        }

        return openapiControllers;
    }

    /**
     * 获取本地maven仓库的jar路径
     */
    private static String getJarPath(String groupId, String artifactId, String version) {
        groupId = StringUtil.replaceDotToFileSep(groupId);
        String jarFileName = artifactId + "-" + version + ".jar";
        return StringUtil.concatPath(MAVEN_LOCAL_REPOSITORY, groupId, artifactId, version, jarFileName);
    }

    private static boolean isOpenapiController(Class<?> clazz) {
        return clazz.getPackageName().contains("controller.open") && clazz.getName().endsWith("Controller");
    }

    private static void addReflectionResult(ReflectionResult allResult, ReflectionResult newResult) {
        Map<String, Map<String, List<String>>> allMultiLoopParameters = allResult.getMultiLoopParameters();
        if (allMultiLoopParameters == null) {
            allMultiLoopParameters = new HashMap<>();
            allResult.setMultiLoopParameters(allMultiLoopParameters);
        }

        Map<String, Map<String, List<String>>> multiLoopParameters = newResult.getMultiLoopParameters();
        if (multiLoopParameters != null) {
            Map<String, Map<String, List<String>>> finalAllMultiLoopParameters = allMultiLoopParameters;

            multiLoopParameters.keySet().forEach(mk -> {
                Map<String, List<String>> loopParameters = multiLoopParameters.get(mk);
                if (finalAllMultiLoopParameters.containsKey(mk)) {
                    Map<String, List<String>> allLoopParameters = finalAllMultiLoopParameters.get(mk);
                    loopParameters.keySet().forEach(lk -> {
                        List<String> paras = loopParameters.get(lk);
                        if (allLoopParameters.containsKey(lk)) {
                            allLoopParameters.put(lk, paras);
                        } else {
                            allLoopParameters.get(lk).addAll(paras);
                        }
                    });
                } else {
                    finalAllMultiLoopParameters.put(mk, loopParameters);
                }
            });
        }
    }

    /**
     * 解析DTO.class
     */
    private static ReflectionResult parseDto(Class<?> dtoClass) {
        ReflectionResult dtoResult = new ReflectionResult();

        String simpleClassName = dtoClass.getSimpleName();
        dtoResult.setClassName(dtoClass.getSimpleName());

        Arrays.stream(dtoClass.getFields()).forEach(it -> {

        });

        return null;
    }

    /**
     * 解析controller.class
     */
    private static Pair<ReflectionResult, List<String>> parseController(Class<?> controllerClass) {
        return null;
    }
}
