package tech.blacklake.dev.openapi.codegenerator.constant;

import tech.blacklake.dev.openapi.codegenerator.util.StringUtil;

import java.io.File;

/**
 * @author cuiyichen
 * @date 2022/5/20 16:51:54
 */
public enum ClassTypeEnum {
    CONTROLLER(StringUtil.concatPath("tech", "blacklake", "dev", "openapi", "sdk", "api")),
    REQUEST_DTO(StringUtil.concatPath("tech", "blacklake", "dev", "openapi", "sdk", "api", "req")),
    RESPONSE_DTO(StringUtil.concatPath("tech", "blacklake", "dev", "openapi", "sdk", "api", "res")),
    COMMON_DATA(StringUtil.concatPath("tech", "blacklake", "dev", "openapi", "sdk", "api", "common"));

    ClassTypeEnum(String dir) {
        this.dir = dir;
    }

    public String getDir() {
        return dir;
    }

    private final String dir;

    private final String prefix = StringUtil.concatPath("tech", "blacklake", "dev", "openapi", "sdk");
}
