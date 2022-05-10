package tech.blacklake.dev.openapi.codegenerator.util;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.util.Scanner;

/**
 * @author cuiyichen
 * @date 2022/05/09 22:19:17
 */
@Slf4j
public class FileUtil {
    private static final String CHARSET_NAME = "UTF-8";

    /**
     * 创建文件
     */
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static File createFile(String dir, String fileName) throws IOException {
        File file = getFile(dir, fileName);

        File parentDir;
        if (!(parentDir = file.getParentFile()).exists()) {
            parentDir.mkdirs();
        }
        file.createNewFile();

        return file;
    }

    /**
     * 写入文件
     */
    public static void writeFile(File file, StringBuilder sb) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, false))) {
            printWriter.println(sb);
        } catch (Exception e) {
            log.error("写入文件{}失败: {}", file.getName(), e.getMessage());
        }
    }

    /**
     * 读文件
     */
    public static Scanner readFile(String dir, String fileName) throws FileNotFoundException {
        File file = getFile(dir, fileName);
        return new Scanner(file, CHARSET_NAME);
    }

    private static File getFile(String dir, String fileName) {
        return new File(dir + File.separator + fileName);
    }
}