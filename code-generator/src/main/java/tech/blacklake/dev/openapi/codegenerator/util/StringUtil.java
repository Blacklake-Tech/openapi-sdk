package tech.blacklake.dev.openapi.codegenerator.util;

import java.io.File;

/**
 * @author cuiyichen
 * @date 2022/05/12 10:14:07
 * <p>
 * 字符串工具类
 */
public class StringUtil {
    /**
     * 首字母大写
     */
    public static String upperCaseFirstChar(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    /**
     * 首字母小写
     */
    public static String lowerCaseFirstChar(String str) {
        return Character.toLowerCase(str.charAt(0)) + str.substring(1);
    }

    /**
     * 拼接路径
     */
    public static String concatPath(String... paths) {
        StringBuilder sb = new StringBuilder();
        for (String path : paths) {
            sb.append(path);
            if (!path.endsWith(File.separator)) {
                sb.append(File.separator);
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /**
     * 将.分隔符替换为系统文件路径分隔符
     */
    public static String replaceDotToFileSep(String str) {
        return str.replace(".", File.separator);
    }

    /**
     * 将系统文件路径分隔符替换为.分隔符
     */
    public static String replaceFileSepToDot(String str) {
        return str.replace(File.separator, ".");
    }
}
