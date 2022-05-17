package tech.blacklake.dev.openapi.codegenerator;

import lombok.extern.slf4j.Slf4j;
import tech.blacklake.dev.openapi.codegenerator.util.FileUtil;

import java.io.File;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author cuiyichen
 * @date 2022/05/09 22:12:40
 */
@Slf4j
public class CodeGenerator {

    public static final String RESOURCE_PATH;

    static {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        RESOURCE_PATH = Objects.requireNonNull(classLoader.getResource("")).getPath();
    }

    private static final String TEMPLATE_DIR = "templates";

    private static final String EL_CLASS_NAME = "class_name";

    private static final String JAVA_FILE_SUFFIX = ".java";

    /**
     * el表达式pattern
     */
    private static final Pattern EL_EXP_PATTERN = Pattern.compile("\\$\\{\\w*}");

    private static final Pattern LOOP_BEGIN_PATTERN = Pattern.compile("#loop\\(\\w*\\)");

    private static final Pattern END_PATTERN = Pattern.compile("^#end$");

    /**
     * 载入数据到模板文件并生成新文件
     *
     * @param templateFileName    模板文件名
     * @param normalParameters    普通参数
     * @param multiLoopParameters 多种循环参数
     */
    public static void writer(String templateFileName, String outputDir, String className, Map<String, String> normalParameters, Map<String, Map<String, List<String>>> multiLoopParameters) {
        String templateFilePath = FileUtil.concatPath(RESOURCE_PATH, TEMPLATE_DIR, templateFileName);
        String outputFilePath = FileUtil.concatPath(RESOURCE_PATH, outputDir, className + JAVA_FILE_SUFFIX);
        if (normalParameters != null) {
            normalParameters.put(EL_CLASS_NAME, className);
        }

        log.info("#####代码生成开始...");
        log.info("模板文件: {}", templateFileName);
        log.info("目标类: {}", className);
        log.info("生成文件路径: {}", outputFilePath);

        Scanner scanner = FileUtil.readFile(templateFilePath);
        File file = FileUtil.createFile(outputFilePath);

        boolean loopFlag = false;
        String loopId = null;
        StringBuilder totalSb = new StringBuilder();
        StringBuilder loopSb = new StringBuilder();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();

            if (!loopFlag) {
                if ((loopId = matchLoopBegin(line)) != null) {
                    loopFlag = true;
                } else {
                    String formatLine = lineDecoder(line, normalParameters);
                    totalSb.append(formatLine).append("\n");
                }
            } else {
                if (!matchEnd(line)) {
                    loopSb.append(line).append("\n");
                } else {
                    Map<String, List<String>> loopParameters = multiLoopParameters.get(loopId);
                    int len = checkLoopParameters(loopParameters);

                    for (int i = 0; i < len; i++) {
                        String formatLoopLines = loopLinesDecoder(loopSb.toString(), loopParameters, i);
                        totalSb.append(formatLoopLines);
                        if (i != len - 1) {
                            totalSb.append("\n");
                        }
                    }

                    loopFlag = false;
                    loopSb = new StringBuilder();
                }
            }
        }

        FileUtil.writeFile(file, totalSb);

        log.info("#####代码生成成功!");
    }

    private static int checkLoopParameters(Map<String, List<String>> loopParameters) {
        int len = -1;
        for (List<String> parameters : loopParameters.values()) {
            if (len == -1) {
                len = parameters.size();
            } else if (len != parameters.size()) {
                throw new RuntimeException("循环参数维度不一致");
            }
        }

        return len;
    }

    private static String lineDecoder(String line, Map<String, String> parameters) {
        List<String> elExps = getElExps(line);
        List<String> elKeys = getElKeys(elExps);

        String formatLine = line;
        if (elExps.size() > 0) {
            for (int i = 0; i < elExps.size(); i++) {
                try {
                    formatLine = formatLine.replace(elExps.get(i), parameters.get(elKeys.get(i)));
                } catch (NullPointerException e) {
                    log.error("参数{}为空!", elKeys.get(i));
                    throw new RuntimeException(e);
                }
            }
        }
        return formatLine;
    }

    private static String loopLinesDecoder(String loopLines, Map<String, List<String>> loopParameters, int index) {
        List<String> elExps = getElExps(loopLines);
        List<String> elKeys = getElKeys(elExps);

        String formatLoopLines = loopLines;
        if (elExps.size() > 0) {
            for (int i = 0; i < elExps.size(); i++) {
                try {
                    formatLoopLines = formatLoopLines.replace(elExps.get(i), loopParameters.get(elKeys.get(i)).get(index));
                } catch (NullPointerException e) {
                    log.error("参数{}为空!", elKeys.get(i));
                    throw new RuntimeException(e);
                }
            }
        }
        return formatLoopLines;
    }

    private static List<String> getElKeys(List<String> elExps) {
        return elExps.stream().map(it -> it.substring(2, it.length() - 1)).collect(Collectors.toList());
    }

    private static List<String> getElExps(String str) {
        List<String> elExps = new ArrayList<>();
        Matcher matcher = EL_EXP_PATTERN.matcher(str);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            elExps.add(str.substring(start, end));
        }
        return elExps;
    }

    private static String matchLoopBegin(String line) {
        Matcher matcher = LOOP_BEGIN_PATTERN.matcher(line);
        if (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            return line.substring(start + 6, end - 1);
        }
        return null;
    }

    private static boolean matchEnd(String line) {
        line = line.trim();
        return END_PATTERN.matcher(line).matches();
    }
}

