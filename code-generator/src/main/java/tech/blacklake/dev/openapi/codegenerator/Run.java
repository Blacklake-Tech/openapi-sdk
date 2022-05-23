package tech.blacklake.dev.openapi.codegenerator;

import tech.blacklake.dev.openapi.codegenerator.constant.ClassTypeEnum;
import tech.blacklake.dev.openapi.codegenerator.constant.Constant;
import tech.blacklake.dev.openapi.codegenerator.data.DependencyCoordinate;
import tech.blacklake.dev.openapi.codegenerator.data.Pair;
import tech.blacklake.dev.openapi.codegenerator.data.ReflectionResult;
import tech.blacklake.dev.openapi.codegenerator.util.FileUtil;
import tech.blacklake.dev.openapi.codegenerator.util.StringUtil;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author cuiyichen
 * @date 2022/05/19 20:04:40
 * <p>
 * 代码生成器启动类
 */
public class Run {
    /**
     * dto模板文件名
     */
    private static final String DTO_TEMPLATE_NAME = "dto-template";

    /**
     * controller模板文件名
     */
    private static final String CONTROLLER_TEMPLATE_NAME = "controller-template";

    /**
     * 预置类文件夹
     */
    private static final String PRESET_DIR = "preset";

    public static void main(String[] args) {
        // 获取预置类
        File[] presetClassFiles = FileUtil.getDirFiles(StringUtil.concatPath(Constant.RESOURCE_PATH, PRESET_DIR));
        // 预置类名
        List<String> presetClassNames;
        if (presetClassFiles != null) {
            // 复制预置类到common包
            Arrays.stream(presetClassFiles).forEach(it -> FileUtil.copyFile(it, new File(StringUtil.concatPath(Constant.RESOURCE_PATH, "out", ClassTypeEnum.COMMON_DATA.getDir(), it.getName()))));
            // 获取预置类名
            presetClassNames = Arrays.stream(presetClassFiles)
                    .map(File::getName)
                    .filter(it -> it.endsWith(".java"))
                    .map(it -> it.substring(0, it.length() - 5))
                    .collect(Collectors.toList());
        } else {
            presetClassNames = new ArrayList<>();
        }

        // 获取需要生成open代码的依赖坐标
        List<DependencyCoordinate> dependencyCoordinates = getDependencyCoordinates();

        // 开始解析所有jar
        // 所有jar中controller的TemplateController解析结果
        ReflectionResult templateControllerResult = ReflectionResult.getControllerReflectionResult();
        // 所有jar中dto的解析结果
        List<ReflectionResult> allDtoResults = new ArrayList<>();
        // 已解析的/不需要再解析的dto名
        Set<String> parsedDtoSet = new HashSet<>(presetClassNames);
        dependencyCoordinates.forEach(it -> {
            Pair<List<ReflectionResult>, List<ReflectionResult>> jarPair = JarParser.parseJar(
                    it.getGroupId(),
                    it.getArtifactId(),
                    it.getVersion(),
                    parsedDtoSet,
                    true);
            List<ReflectionResult> controllerResults = jarPair.getLeft();
            List<ReflectionResult> dtoResults = jarPair.getRight();

            allDtoResults.addAll(dtoResults);
            addAllReflectionResults(templateControllerResult, controllerResults);
        });

        // 生成dto代码
        allDtoResults.forEach(it -> CodeGenerator.writer(
                DTO_TEMPLATE_NAME,
                StringUtil.concatPath("out", it.getState().getDir()),
                it.getClassName(),
                it.getNormalParameters(),
                it.getMultiLoopParameters()));

        // 生成TemplateController代码
        CodeGenerator.writer(
                CONTROLLER_TEMPLATE_NAME,
                StringUtil.concatPath("out", templateControllerResult.getState().getDir()),
                templateControllerResult.getClassName(),
                templateControllerResult.getNormalParameters(),
                templateControllerResult.getMultiLoopParameters());
    }

    // TODO 尝试从pom中获取?

    /**
     * 获取需要生成open层代码的jar的依赖坐标
     */
    private static List<DependencyCoordinate> getDependencyCoordinates() {
        DependencyCoordinate dependencyCoordinate0 = new DependencyCoordinate();
        dependencyCoordinate0.setGroupId("tech.blacklake.dev.med");
        dependencyCoordinate0.setArtifactId("med-domain-produce-define-service");
        dependencyCoordinate0.setVersion("6.4.1-RELEASE");

//        DependencyCoordinate dependencyCoordinate0_1 = new DependencyCoordinate();
//        dependencyCoordinate0.setGroupId("tech.blacklake.dev.med");
//        dependencyCoordinate0.setArtifactId("med-domain-produce-define-api");
//        dependencyCoordinate0.setVersion("6.4.1-RELEASE");

//        DependencyCoordinate dependencyCoordinate1 = new DependencyCoordinate();
//        dependencyCoordinate1.setGroupId("tech.blacklake.dev.med");
//        dependencyCoordinate1.setArtifactId("med-domain-work-order-service");
//        dependencyCoordinate1.setVersion("6.4.1-RELEASE");

        DependencyCoordinate dependencyCoordinate2 = new DependencyCoordinate();
        dependencyCoordinate2.setGroupId("tech.blacklake.dev.mfg");
        dependencyCoordinate2.setArtifactId("mfg-domain-service");
        dependencyCoordinate2.setVersion("6.4.1.1-RELEASE");

        DependencyCoordinate dependencyCoordinate3 = new DependencyCoordinate();
        dependencyCoordinate3.setGroupId("tech.blacklake.dev.resource");
        dependencyCoordinate3.setArtifactId("resource-service");
        dependencyCoordinate3.setVersion("6.4.1-RELEASE");

        DependencyCoordinate dependencyCoordinate4 = new DependencyCoordinate();
        dependencyCoordinate4.setGroupId("tech.blacklake.dev.order");
        dependencyCoordinate4.setArtifactId("order-domain-service");
        dependencyCoordinate4.setVersion("6.4.1-RELEASE");

        DependencyCoordinate dependencyCoordinate5 = new DependencyCoordinate();
        dependencyCoordinate5.setGroupId("tech.blacklake.dev.quality");
        dependencyCoordinate5.setArtifactId("quality-domain-service");
        dependencyCoordinate5.setVersion("6.4.1-RELEASE");

        DependencyCoordinate dependencyCoordinate6 = new DependencyCoordinate();
        dependencyCoordinate6.setGroupId("tech.blacklake.dev.workcenter");
        dependencyCoordinate6.setArtifactId("work-center-service");
        dependencyCoordinate6.setVersion("6.4.1-RELEASE");

        return List.of(
                dependencyCoordinate0,
//                dependencyCoordinate0_1,
//                dependencyCoordinate1,
                dependencyCoordinate2);
//                dependencyCoordinate3,
//                dependencyCoordinate4,
//                dependencyCoordinate5,
//                dependencyCoordinate6);
    }

    /**
     * 将newResults中的内容累加到targetResult
     */
    private static void addAllReflectionResults(ReflectionResult targetResult, List<ReflectionResult> newResults) {
        newResults.forEach(it -> addReflectionResult(targetResult, it));
    }

    /**
     * 将newResult中的内容累加到targetResult
     */
    private static void addReflectionResult(ReflectionResult targetResult, ReflectionResult newResult) {
        Map<String, Map<String, List<String>>> allMultiLoopParameters = targetResult.getMultiLoopParameters();
        if (allMultiLoopParameters == null) {
            allMultiLoopParameters = new HashMap<>();
            targetResult.setMultiLoopParameters(allMultiLoopParameters);
        }

        Map<String, Map<String, List<String>>> newMultiLoopParameters = newResult.getMultiLoopParameters();
        if (newMultiLoopParameters != null) {
            for (String mk : newMultiLoopParameters.keySet()) {
                Map<String, List<String>> newLoopParameters = newMultiLoopParameters.get(mk);
                if (allMultiLoopParameters.containsKey(mk)) {
                    Map<String, List<String>> allLoopParameters = allMultiLoopParameters.get(mk);
                    newLoopParameters.keySet().forEach(lk -> {
                        List<String> paras = newLoopParameters.get(lk);
                        if (allLoopParameters.containsKey(lk)) {
                            allLoopParameters.get(lk).addAll(paras);
                        } else {
                            allLoopParameters.put(lk, paras);
                        }
                    });
                } else {
                    allMultiLoopParameters.put(mk, newLoopParameters);
                }
            }
        }
    }
}
