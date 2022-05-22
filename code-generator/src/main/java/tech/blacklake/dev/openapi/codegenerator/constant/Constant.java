package tech.blacklake.dev.openapi.codegenerator.constant;

import java.util.Objects;

/**
 * @author cuiyichen
 * @date 2022/05/21 14:51:44
 */
public class Constant {
    public static final String RESOURCE_PATH;

    static {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        RESOURCE_PATH = Objects.requireNonNull(classLoader.getResource("")).getPath();
    }
}
