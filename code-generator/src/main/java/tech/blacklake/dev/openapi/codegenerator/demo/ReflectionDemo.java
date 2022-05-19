package tech.blacklake.dev.openapi.codegenerator.demo;

import io.swagger.annotations.Api;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * @author cuiyichen
 * @date 2022/05/12 15:52:06
 */
public class ReflectionDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String packageName = "tech.blacklake.dev.med.producedefine";
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL packageUrl = classLoader.getResource(packageName.replace(".", File.separator));
        assert packageUrl != null : packageName + "未找到";
        String packagePath = packageUrl.getPath();
        String jarPath = packagePath.substring(5, packagePath.indexOf("!"));

        JarFile jarFile = new JarFile(jarPath);

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
