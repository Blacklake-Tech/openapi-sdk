package tech.blacklake.dev.openapi.codegenerator.loader;

import lombok.extern.slf4j.Slf4j;
import tech.blacklake.dev.openapi.codegenerator.util.StringUtil;

import java.io.*;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * @author cuiyichen
 * @date 2022/05/18 11:37:01
 */
@Slf4j
public class SdkClassLoader extends ClassLoader {
    /**
     * 先尝试通过appClassLoader加载classpath下的类
     * 如加载失败，说明jar打包方式为springboot格式，那么直接从外部jar文件中加载类
     *
     * @param className   类的全限定名
     * @param jarFile     jar文件
     * @param jarEntry    jar内文件的描述信息
     * @param jarEntryMap 用于处理class的依赖问题
     */
    public Class<?> loadClass(String className, JarFile jarFile, JarEntry jarEntry, Map<String, JarEntry> jarEntryMap) throws FileNotFoundException {
        /* 先尝试使用appClassLoader加载类 */
        if (className != null) {
            try {
                return loadClass(className, false);
            } catch (Throwable ignored) {
            }
        }

        /* 再尝试从外部jar中加载类 */
        byte[] classBytes;
        try (InputStream inputStream = jarFile.getInputStream(jarEntry)) {
            classBytes = inputStream.readAllBytes();
            return defineClass(null, classBytes, 0, classBytes.length);
        } catch (IOException e) {
            throw new FileNotFoundException(jarEntry.getName());
        } catch (NoClassDefFoundError e) {
            // 处理class依赖问题
            String classPath = StringUtil.concatPath("BOOT-INF/classes", e.getMessage() + ".class");
            JarEntry dependentJarEntry = jarEntryMap.get(classPath);
            loadClass(className, jarFile, dependentJarEntry, jarEntryMap);
            return loadClass(className, jarFile, jarEntry, jarEntryMap);
        }
    }
}
