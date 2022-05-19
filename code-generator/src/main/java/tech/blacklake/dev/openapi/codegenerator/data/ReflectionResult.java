package tech.blacklake.dev.openapi.codegenerator.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @author cuiyichen
 * @date 2022/05/12 15:44:27
 *
 * 封装反射结果
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReflectionResult {
    /**
     * 表示class的类型
     * 0: controller
     * 1: reqDto
     * 2: resDto
     * 3: common data
     */
    private Integer state;

    /**
     * 类名
     */
    private String className;

    /**
     * 非循环参数
     */
    private Map<String, String> normalParameters;

    /**
     * 循环参数（模板文件中由#for标识）
     */
    private Map<String, Map<String, List<String>>> multiLoopParameters;
}
