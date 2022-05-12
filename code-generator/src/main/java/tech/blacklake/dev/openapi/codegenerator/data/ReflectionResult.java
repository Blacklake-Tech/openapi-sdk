package tech.blacklake.dev.openapi.codegenerator.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @author cuiyichen
 * @date 2022/05/12 15:44:27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReflectionResult {
    private String className;
    private Map<String, String> normalParameters;
    private Map<String, Map<String, List<String>>> multiLoopParameters;
}
