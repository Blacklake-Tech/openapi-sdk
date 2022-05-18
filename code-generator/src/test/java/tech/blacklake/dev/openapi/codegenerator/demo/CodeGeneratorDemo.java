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

    private static final String EL_PATH = "path";
    private static final String EL_RETURN_TYPE = "return_type";
    private static final String EL_METHOD_NAME = "method_name";
    private static final String EL_PARAMETER_TYPE = "parameter_type";
    private static final String EL_PARAMETER_NAME = "parameter_name";

    private static final String LOOP_ID_FIELD = "field";
    private static final String LOOP_ID_HANDLER = "handler";


    public static void main(String[] args) {
        controllerCodeGenTest();
    }

    private static void dtoCodeGenTest() {
        String templateFileName = "dto-template";
        String outDir = "out";

        ReflectionResult reflectionResult = dtoReflection();

        CodeGenerator.writer(
                templateFileName,
                outDir,
                reflectionResult.getClassName(),
                reflectionResult.getNormalParameters(),
                reflectionResult.getMultiLoopParameters());
    }

    private static void controllerCodeGenTest() {
        String templateFileName = "controller-template";
        String outDir = "out";

        ReflectionResult reflectionResult = controllerReflection();

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
    private static ReflectionResult dtoReflection() {
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

    private static ReflectionResult controllerReflection() {
        Map<String, List<String>> loopParameters = new HashMap<>();
        List<String> paths = List.of("med/mokods", "med/mokods", "med/okk");
        List<String> methodNames = List.of("medMokods", "medMokods", "medOkk");
        List<String> returnTypes = List.of("ADTO", "BDTO", "CDTO");
        List<String> parameterTypes = List.of("ADTO", "BDTO", "CDTO");
        List<String> parameterNames = List.of("adto", "bdto", "cdto");
        loopParameters.put(EL_PATH, paths);
        loopParameters.put(EL_RETURN_TYPE, returnTypes);
        loopParameters.put(EL_METHOD_NAME, methodNames);
        loopParameters.put(EL_PARAMETER_TYPE, parameterTypes);
        loopParameters.put(EL_PARAMETER_NAME, parameterNames);
        Map<String, Map<String, List<String>>> multiLoopParameter = new HashMap<>();
        multiLoopParameter.put(LOOP_ID_HANDLER, loopParameters);
        ReflectionResult reflectionResult = new ReflectionResult();
        reflectionResult.setMultiLoopParameters(multiLoopParameter);
        reflectionResult.setClassName("TemplateController");
        return reflectionResult;
    }
}
