package tech.blacklake.dev.openapi.codegenerator.util;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.*;

/**
 * @author cuiyichen
 * @date 2022/05/09 22:19:17
 * <p>
 * 文件工具类
 */
@Slf4j
public class FileUtil {
    private static final String CHARSET_NAME = "UTF-8";

    /**
     * 创建文件
     */
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static File createFile(File file) {
        File parentDir;
        if (!(parentDir = file.getParentFile()).exists()) {
            parentDir.mkdirs();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            log.error("文件创建失败: {}", file.getName());
            throw new RuntimeException(e);
        }

        return file;
    }

    /**
     * 创建文件
     */
    public static File createFile(String filePath) {
        return createFile(new File(filePath));
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

    /**
     * 获得文件夹下的所有文件
     */
    public static File[] getDirFiles(String dirPath) {
        return new File(dirPath).listFiles();
    }

    /**
     * 复制文件
     */
    public static void copyFile(File source, File dest) {
        if (!dest.exists()) {
            createFile(dest);
        }

        try (FileChannel inputChannel = new FileInputStream(source).getChannel();
                FileChannel outputChannel = new FileOutputStream(dest).getChannel()) {
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
        } catch (IOException e) {
            log.error("文件{}复制到{}失败", source.getName(), dest.getName());
            throw new RuntimeException(e);
        }
    }
}
