package tech.blacklake.dev.openapi.sdk.common.data;

/**
 * @author cuiyichen
 * @date 2022/04/23 20:07:28
 */
public class BlackLakeResult<T> {
    /**
     * 200 success
     * 非200 failure 不同区间标识来自不同服务
     */
    private Integer code = 200;

    /**
     * 返回前端需要内容
     * 如果是带分页的list 返回
     */
    protected T data;

    /**
     * 错误码信息
     */
    private String subCode = null;

    private String message = "成功";

    /**
     * 强弱管控标识
     */
    private Integer needCheck;

    public BlackLakeResult() {
    }

    public BlackLakeResult(T data) {
        this.data = data;
    }

    public BlackLakeResult(T data, Integer code) {
        this.data = data;
        this.code = code;
    }

    public BlackLakeResult(String subCode, String message, Integer code) {
        this.subCode = subCode;
        this.message = message;
        this.code = code;
    }

    public BlackLakeResult(String subCode, String message, Integer code, T data, Integer needCheck) {
        this.subCode = subCode;
        this.message = message;
        this.code = code;
        this.data = data;
        this.needCheck = needCheck;
    }

    public Integer getCode() {
        return code;
    }

    public T getData() {
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

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", data=" + data +
                ", subCode='" + subCode + '\'' +
                ", message='" + message + '\'' +
                ", needCheck=" + needCheck +
                '}';
    }
}
