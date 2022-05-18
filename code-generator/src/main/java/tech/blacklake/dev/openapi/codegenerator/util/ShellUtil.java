package tech.blacklake.dev.openapi.codegenerator.util;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author cuiyichen
 * @date 2022/05/17 17:14:45
 */
@Slf4j
public class ShellUtil {
    /**
     * 执行shell命令
     */
    public static String runShellCommand(String command) {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("bash", "-c", command);

        try {
            Process process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            StringBuilder output = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                if (output.length() > 0) {
                    output.append("\n");
                }
                output.append(line);
            }

            int exitVal = process.waitFor();
            if (exitVal == 0) {
                return output.toString();
            } else {
                throw new Exception(command + "执行失败");
            }
        } catch (Exception e) {
            log.error("执行shell指令失败");
            throw new RuntimeException(e);
        }
    }
}
