package tech.blacklake.dev.openapi.codegenerator;

import io.swagger.annotations.Api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author cuiyichen
 * @date 2022/05/10 19:39:51
 */
public class Test {
    public static void main(String[] args) throws Exception {
        testCodeGenerator();
    }

    private static final String EL_TYPE = "type";
    private static final String EL_ENTITY_NAME = "entity_name";
    private static final String EL_SUPERCLASS = "superclass";
    private static final String EL_DESCRIPTION = "description";
    private static final String EL_FIELD_TYPE = "field_type";
    private static final String EL_FIELD_NAME = "field_name";
    private static final String LOOP_ID_FIELD = "field";

    private static void testCodeGenerator() {
        Map<String, String> normalParameters = new HashMap<>();
        normalParameters.put(EL_TYPE, "req");
        normalParameters.put(EL_ENTITY_NAME, "TestRequestDTO");
        normalParameters.put(EL_SUPERCLASS, "");

        Map<String, List<String>> loopParameters = new HashMap<>();
        List<String> descriptions = Stream.of("姓名", "id", "性别").collect(Collectors.toList());
        List<String> fieldTypes = Stream.of("String", "Long", "boolean").collect(Collectors.toList());
        List<String> fieldNames = Stream.of("name", "id", "isMale").collect(Collectors.toList());
        loopParameters.put(EL_DESCRIPTION, descriptions);
        loopParameters.put(EL_FIELD_TYPE, fieldTypes);
        loopParameters.put(EL_FIELD_NAME, fieldNames);
        Map<String, Map<String, List<String>>> multiLoopParameter = new HashMap<>();

        String templateFileName = "dto-template";
        String outDir = CodeGenerator.RESOURCE_PATH + File.separator + "out";
        String outputFileName = normalParameters.get(EL_ENTITY_NAME) + ".java";

        multiLoopParameter.put(LOOP_ID_FIELD, loopParameters);
        CodeGenerator.writer(templateFileName, outDir, outputFileName, normalParameters, multiLoopParameter);
    }

    private static void reflectionTest() throws ClassNotFoundException, IOException {
        String packageName = "tech.blacklake.dev.order.domain";
        boolean sourceJar = false;

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL packageUrl = classLoader.getResource(packageName.replace(".", File.separator));
        assert packageUrl != null : packageName + "未找到";
        String packagePath = packageUrl.getPath();
        String sourceJarPath = packagePath.substring(5, packagePath.indexOf("!"));

        if (sourceJar) {
            sourceJarPath = sourceJarPath.substring(0, sourceJarPath.indexOf(".jar")) + "-sources" + ".jar";
        }

        JarFile jarFile = new JarFile(sourceJarPath);

        Enumeration<JarEntry> entrys = jarFile.entries();

        List<String> classNames = new ArrayList<>();
        while (entrys.hasMoreElements()) {
            JarEntry jarEntry = entrys.nextElement();
            String entryName = jarEntry.getName();
            if (entryName.endsWith(".class")) {
                String className = entryName.replace(File.separator, ".").substring(
                        0, entryName.lastIndexOf("."));
                classNames.add(className);
            }
        }

        for (String className : classNames) {
            Class<?> clazz = classLoader.loadClass(className);
            System.out.println("类名: " + clazz.getName());
            if (clazz.isAnnotationPresent(Api.class)) {
                System.out.println("有@Api注解");
                Api apiAnnotation = clazz.getAnnotation(Api.class);
                System.out.println("tags: " + Arrays.toString(apiAnnotation.tags()));
            } else {
                System.out.println("无@Api注解");
            }
        }
    }
}
