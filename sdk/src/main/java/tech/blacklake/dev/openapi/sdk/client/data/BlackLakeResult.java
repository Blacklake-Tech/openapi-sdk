package tech.blacklake.dev.openapi.sdk.client.data;

import java.util.LinkedHashMap;

/**
 * @author cuiyichen
 * @date 2022/04/23 20:07:28
 *
 * copy of blacklake.Result
 */
public class BlackLakeResult {
    /**
     * 200 success
     * 非200 failure 不同区间标识来自不同服务
     */
    private Integer code = 200;

    /**
     * 返回数据
     */
    protected LinkedHashMap<String, Object> data;

    /**
     * 错误码
     */
    private String subCode = null;

    /**
     * 错误信息
     */
    private String message = "成功";

    /**
     * 强弱管控标识
     */
    private Integer needCheck;

    /**
     * 字段权限标识
     */
    private FieldPermission fieldPermission;

    public Integer getCode() {
        return code;
    }

    public LinkedHashMap<String, Object> getData() {
        return data;
    }

    public String getSubCode() {
        return subCode;
    }

    public String getMessage() {
        return message;
    }

    public Integer getNeedCheck() {
        return needCheck;
    }

    public FieldPermission getFieldPermission() {
        return fieldPermission;
    }

    @Override
    public String toString() {
        return "BlackLakeResult{" +
                "code=" + code +
                ", data=" + data +
                ", subCode='" + subCode + '\'' +
                ", message='" + message + '\'' +
                ", needCheck=" + needCheck +
                ", fieldPermission=" + fieldPermission +
                '}';
    }
}
