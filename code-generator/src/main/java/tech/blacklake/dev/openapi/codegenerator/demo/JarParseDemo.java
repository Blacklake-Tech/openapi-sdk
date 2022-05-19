package tech.blacklake.dev.openapi.codegenerator.demo;

import tech.blacklake.dev.openapi.codegenerator.CodeGenerator;
import tech.blacklake.dev.openapi.codegenerator.JarParser;
import tech.blacklake.dev.openapi.codegenerator.data.Pair;
import tech.blacklake.dev.openapi.codegenerator.data.ReflectionResult;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author cuiyichen
 * @date 2022/05/18 11:01:58
 */
public class JarParseDemo {
    private static final String DTO_TEMPLATE_NAME = "dto-template";

    private static final String CONTROLLER_TEMPLATE_NAME = "controller-template";

    public static void main(String[] args) {
        /* mfg依赖坐标 */
        String groupId = "tech.blacklake.dev.mfg";
        String artifactId = "mfg-domain-service";
        String version = "6.4.1.1-RELEASE";

        // 解析jar
        Pair<List<ReflectionResult>, List<ReflectionResult>> pair = JarParser.parseJar(groupId, artifactId, version, new HashSet<>());
        List<ReflectionResult> controllerResults = pair.getLeft();
        List<ReflectionResult> dtoResults = pair.getRight();

        ReflectionResult allControllerResults = new ReflectionResult();
        allControllerResults.setState(0);
        allControllerResults.setClassName("TemplateController");
        allControllerResults.setNormalParameters(new HashMap<>());
        JarParser.addAllReflectionResults(allControllerResults, controllerResults);

        CodeGenerator.writer(CONTROLLER_TEMPLATE_NAME, "out",
                allControllerResults.getClassName(),
                allControllerResults.getNormalParameters(),
                allControllerResults.getMultiLoopParameters());
        dtoResults.forEach(it -> CodeGenerator.writer(DTO_TEMPLATE_NAME, "out", it.getClassName(), it.getNormalParameters(), it.getMultiLoopParameters()));
    }
}
