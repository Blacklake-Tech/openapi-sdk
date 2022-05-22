package tech.blacklake.dev.openapi.codegenerator.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cuiyichen
 * @date 2022/05/20 16:56:23
 *
 * 依赖坐标对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DependencyCoordinate {
    private String groupId;
    private String artifactId;
    private String version;
}
