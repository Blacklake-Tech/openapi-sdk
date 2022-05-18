package tech.blacklake.dev.openapi.codegenerator;

import lombok.extern.slf4j.Slf4j;
import tech.blacklake.dev.openapi.codegenerator.data.ReflectionResult;
import tech.blacklake.dev.openapi.codegenerator.util.ShellUtil;
import tech.blacklake.dev.openapi.codegenerator.util.StringUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * @author cuiyichen
 * @date 2022/05/17 17:12:11
 */
@Slf4j
public class DomainParser {
    /**
     * AppClassLoader
     */
    private static final ClassLoader CLASS_LOADER = Thread.currentThread().getContextClassLoader();

    /**
     * 获取maven本地仓库的shell命令
     */
    private static final String GET_MAVEN_LOCAL_REPOSITORY_COMMAND = "mvn help:evaluate -Dexpression=settings.localRepository | grep -v '[INFO]'";

    /**
     * maven本地仓库路径
     */
    private static final String MAVEN_LOCAL_REPOSITORY = ShellUtil.runShellCommand(GET_MAVEN_LOCAL_REPOSITORY_COMMAND);

    /**
     * 解析jar文件
     */
    public static ReflectionResult parseJar(String jarPath) {
        JarFile jarFile;
        try {
            jarFile = new JarFile(jarPath);
        } catch (IOException e) {
            log.error("读取jar失败");
            throw new RuntimeException(e);
        }
        Enumeration<JarEntry> entrys = jarFile.entries();

        /* 1. 获取jar文件中所有类的全限定名 */
        List<String> classNames = new ArrayList<>();
        while (entrys.hasMoreElements()) {
            JarEntry jarEntry = entrys.nextElement();
            String entryName = jarEntry.getName();
            if (entryName.endsWith(".class")) {
                String className = StringUtil.replaceFileSepToDot(entryName).substring(0, entryName.lastIndexOf("."));
                classNames.add(className);
            }
        }

        /* 2. 反射 */
        for (String className : classNames) {
            Class<?> clazz;
            try {
                // TODO 这里有问题，加载不到springboot格式jar中的类
                clazz = CLASS_LOADER.loadClass(className);
                log.info(clazz.getName());
            } catch (ClassNotFoundException e) {
                log.error("未找到类文件: {}", className);
                throw new RuntimeException(e);
            }
        }

        return null;
    }

    /**
     * 获取本地maven仓库的jar路径
     */
    public static String getJarPath(String groupId, String artifactId, String version) {
        groupId = StringUtil.replaceDotToFileSep(groupId);
        String jarFileName = artifactId + "-" + version + ".jar";
        return StringUtil.concatPath(MAVEN_LOCAL_REPOSITORY, groupId, artifactId, version, jarFileName);
    }

    /**
     * 解析DTO.class
     */
    public static ReflectionResult parseDto(Class<?> dtoClass) {
        // TODO
        return null;
    }

    /**
     * 解析controller.class
     */
    public static ReflectionResult parseController(Class<?> controllerClass) {
        // TODO
        return null;
    }
}
