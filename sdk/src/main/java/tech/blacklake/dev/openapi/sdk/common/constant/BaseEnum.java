package tech.blacklake.dev.openapi.sdk.common.constant;

/**
 * @author cyc
 * @date 2022/04/23 20:34:01
 */
public interface BaseEnum<C extends Enum<C>> {
    /**
     * 获得枚举
     *
     * @return 枚举
     */
    C get();

    /**
     * 获得枚举名
     *
     * @return 枚举名
     */
    String getName();

    /**
     * 获得枚举信息
     *
     * @return 枚举信息
     */
    String getMessage();
}
