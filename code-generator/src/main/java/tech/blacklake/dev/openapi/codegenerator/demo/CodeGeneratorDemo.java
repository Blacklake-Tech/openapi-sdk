package tech.blacklake.dev.openapi.codegenerator.demo;

import tech.blacklake.dev.openapi.codegenerator.CodeGenerator;
import tech.blacklake.dev.openapi.codegenerator.data.ReflectionResult;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cuiyichen
 * @date 2022/05/12 15:40:06
 */
public class CodeGeneratorDemo {
    private static final String EL_TYPE = "type";
    private static final String EL_SUPERCLASS = "superclass";
    private static final String EL_DESCRIPTION = "description";
    private static final String EL_FIELD_TYPE = "field_type";
    private static final String EL_FIELD_NAME = "field_name";
    private static final String EL_FIELD_NAME_INIT_CAP = "field_name_init_cap";
    private static final String LOOP_ID_FIELD = "field";

    public static void main(String[] args) {

        String templateFileName = "dto-template";
        String outDir = "out";

        ReflectionResult reflectionResult = reflection();

        CodeGenerator.writer(
                templateFileName,
                outDir,
                reflectionResult.getClassName(),
                reflectionResult.getNormalParameters(),
                reflectionResult.getMultiLoopParameters());
    }

    /**
     * 模拟反射
     */
    private static ReflectionResult reflection() {
        Map<String, String> normalParameters = new HashMap<>();
        normalParameters.put(EL_TYPE, "req");
        normalParameters.put(EL_SUPERCLASS, "");

        Map<String, List<String>> loopParameters = new HashMap<>();
        List<String> descriptions = List.of("姓名", "id", "性别");
        List<String> fieldTypes = List.of("String", "Long", "boolean");
        List<String> fieldNames = List.of("name", "id", "isMale");
        List<String> fieldNamesInitCap = List.of("name", "id", "isMale");
        loopParameters.put(EL_DESCRIPTION, descriptions);
        loopParameters.put(EL_FIELD_TYPE, fieldTypes);
        loopParameters.put(EL_FIELD_NAME, fieldNames);
        loopParameters.put(EL_FIELD_NAME_INIT_CAP, fieldNamesInitCap);
        Map<String, Map<String, List<String>>> multiLoopParameter = new HashMap<>();

        ReflectionResult reflectionResult = new ReflectionResult();
        reflectionResult.setClassName("TestRequestDTO");
        reflectionResult.setNormalParameters(normalParameters);
        reflectionResult.setMultiLoopParameters(multiLoopParameter);
        multiLoopParameter.put(LOOP_ID_FIELD, loopParameters);
        return reflectionResult;
    }
}
