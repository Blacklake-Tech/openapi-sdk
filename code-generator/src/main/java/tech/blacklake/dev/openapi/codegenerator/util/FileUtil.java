package tech.blacklake.dev.openapi.codegenerator.util;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.util.Scanner;

/**
 * @author cuiyichen
 * @date 2022/05/09 22:19:17
 *
 * 文件工具类
 */
@Slf4j
public class FileUtil {
    private static final String CHARSET_NAME = "UTF-8";

    /**
     * 创建文件
     */
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static File createFile(String filePath) {
        File file = new File(filePath);

        File parentDir;
        if (!(parentDir = file.getParentFile()).exists()) {
            parentDir.mkdirs();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            log.error("文件创建失败: {}", filePath);
            throw new RuntimeException(e);
        }

        return file;
    }

    /**
     * 写入文件
     */
    public static void writeFile(File file, StringBuilder sb) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, false))) {
            printWriter.println(sb);
        } catch (Exception e) {
            log.error("写入文件失败: {}", file.getName());
            throw new RuntimeException(e);
        }
    }

    /**
     * 读文件
     */
    public static Scanner readFile(String filePath) {
        File file = new File(filePath);
        try {
            return new Scanner(file, CHARSET_NAME);
        } catch (FileNotFoundException e) {
            log.error("文件读取失败: {}", filePath);
            throw new RuntimeException(e);
        }
    }
}