package tech.blacklake.dev.openapi.codegenerator.util;

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
}
