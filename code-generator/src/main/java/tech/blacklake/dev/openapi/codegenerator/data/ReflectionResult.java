package tech.blacklake.dev.openapi.codegenerator.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.blacklake.dev.openapi.codegenerator.constant.ClassTypeEnum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cuiyichen
 * @date 2022/05/12 15:44:27
 * <p>
 * 反射/解析结果
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReflectionResult {
    private ClassTypeEnum state;

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

    public static ReflectionResult getControllerReflectionResult() {
        ReflectionResult controllerResults = new ReflectionResult();
        controllerResults.setState(ClassTypeEnum.CONTROLLER);
        controllerResults.setClassName("TemplateController");
        controllerResults.setNormalParameters(new HashMap<>());
        return controllerResults;
    }
}
