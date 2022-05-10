package tech.blacklake.dev.openapi.codegenerator.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author cuiyichen
 * @date 2022/05/10 17:13:41
 */
public class RegexUtil {
    /**
     * el表达式pattern
     */
    private static final Pattern EL_EXP_PATTERN = Pattern.compile("\\$\\{\\w*}");

    private static final Pattern LOOP_BEGIN_PATTERN = Pattern.compile("#loop\\(\\w*\\)");

    private static final Pattern END_PATTERN = Pattern.compile("^#end$");

    public static String lineDecoder(String line, Map<String, String> parameters) {
        List<String> elExps = getElExps(line);
        List<String> elKeys = getElKeys(elExps);

        String formatLine = line;
        if (elExps.size() > 0) {
            for (int i = 0; i < elExps.size(); i++) {
                formatLine = formatLine.replace(elExps.get(i), parameters.get(elKeys.get(i)));
            }
        }
        return formatLine;
    }

    public static String loopLinesDecoder(String loopLines, Map<String, List<String>> loopParameters, int index) {
        List<String> elExps = getElExps(loopLines);
        List<String> elKeys = getElKeys(elExps);

        String formatLoopLines = loopLines;
        if (elExps.size() > 0) {
            for (int i = 0; i < elExps.size(); i++) {
                formatLoopLines = formatLoopLines.replace(elExps.get(i), loopParameters.get(elKeys.get(i)).get(index));
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

    public static String matchLoopBegin(String line) {
        Matcher matcher = LOOP_BEGIN_PATTERN.matcher(line);
        if (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            return line.substring(start + 6, end - 1);
        }
        return null;
    }

    public static boolean matchEnd(String line) {
        line = line.trim();
        return END_PATTERN.matcher(line).matches();
    }
}
