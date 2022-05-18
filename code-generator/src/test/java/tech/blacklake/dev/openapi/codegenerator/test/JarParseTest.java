package tech.blacklake.dev.openapi.codegenerator.test;

import tech.blacklake.dev.openapi.codegenerator.DomainParser;
import tech.blacklake.dev.openapi.codegenerator.data.ReflectionResult;

/**
 * @author cuiyichen
 * @date 2022/05/18 11:01:58
 */
public class JarParseTest {
    public static void main(String[] args) {
        /* mfg依赖坐标 */
//        String groupId = "tech.blacklake.dev.mfg";
//        String artifactId = "mfg-domain-service";
//        String version = "6.4.1.1-RELEASE";

        /* med依赖坐标 */
        String artifactId = "med-domain-produce-define-service";
        String groupId = "tech.blacklake.dev.med";
        String version = "6.4.1-RELEASE";

        // 根据依赖坐标信息获取jar本地maven仓库路径
        String jarPath = DomainParser.getJarPath(groupId, artifactId, version);
        // 解析jar
        ReflectionResult reflectionResult = DomainParser.parseJar(jarPath);
    }
}
