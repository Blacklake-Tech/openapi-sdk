package tech.blacklake.dev.openapi.codegenerator;

import lombok.extern.slf4j.Slf4j;
import tech.blacklake.dev.openapi.codegenerator.util.FileUtil;
import tech.blacklake.dev.openapi.codegenerator.util.RegexUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

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

    /**
     * 载入数据到模板文件并生成新文件
     *
     * @param templateFileName    模板文件名
     * @param outputFileName      输出文件名
     * @param normalParameters    普通参数
     * @param multiLoopParameters 多种循环参数
     */
    public static void writer(String templateFileName, String outDir, String outputFileName, Map<String, String> normalParameters, Map<String, Map<String, List<String>>> multiLoopParameters) {
        Scanner scanner;
        try {
            scanner = FileUtil.readFile(RESOURCE_PATH + File.separator + TEMPLATE_DIR, templateFileName);
        } catch (FileNotFoundException e) {
            log.error("文件{}读取失败: {}", templateFileName, e.getMessage());
            return;
        }

        File file;
        try {
            file = FileUtil.createFile(outDir, outputFileName);
        } catch (IOException e) {
            log.error("文件{}创建失败: {}", outputFileName, e.getMessage());
            return;
        }

        boolean loopFlag = false;
        String loopId = null;
        StringBuilder totalSb = new StringBuilder();
        StringBuilder loopSb = new StringBuilder();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();

            if (!loopFlag) {
                if ((loopId = RegexUtil.matchLoopBegin(line)) != null) {
                    loopFlag = true;
                } else {
                    String formatLine = RegexUtil.lineDecoder(line, normalParameters);
                    totalSb.append(formatLine).append("\n");
                }
            } else {
                if (!RegexUtil.matchEnd(line)) {
                    loopSb.append(line).append("\n");
                } else {
                    Map<String, List<String>> loopParameters = multiLoopParameters.get(loopId);
                    int len = checkLoopParameters(loopParameters);

                    for (int i = 0; i < len; i++) {
                        String formatLoopLines = RegexUtil.loopLinesDecoder(loopSb.toString(), loopParameters, i);
                        totalSb.append(formatLoopLines).append("\n");
                    }

                    loopFlag = false;
                    loopSb = new StringBuilder();
                }
            }
        }

        FileUtil.writeFile(file, totalSb);
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
}

