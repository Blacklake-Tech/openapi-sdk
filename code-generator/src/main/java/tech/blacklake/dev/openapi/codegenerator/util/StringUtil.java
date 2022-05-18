package tech.blacklake.dev.openapi.codegenerator.util;

import java.io.File;

/**
 * @author cuiyichen
 * @date 2022/05/12 10:14:07
 */
public class StringUtil {
    /**
     * 首字母大写
     */
    public static String initialsInCapitals(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    /**
     * 拼接路径
     */
    public static String concatPath(String... paths) {
        StringBuilder sb = new StringBuilder();
        for (String path : paths) {
            sb.append(path);
            if (!File.separator.equals(String.valueOf(path.charAt(path.length() - 1)))) {
                sb.append(File.separator);
            }
        }
        return sb.toString();
    }

    /**
     * 将.分隔符替换问系统文件路径分隔符
     */
    public static String switchDotSepToFileSep(String str){
        return str.replaceAll("\\.", File.separator);
    }
}
