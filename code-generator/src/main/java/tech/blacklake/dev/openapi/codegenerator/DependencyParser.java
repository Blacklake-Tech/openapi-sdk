package tech.blacklake.dev.openapi.codegenerator;

import lombok.extern.slf4j.Slf4j;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.unidal.tuple.Triple;
import tech.blacklake.dev.openapi.codegenerator.constant.Constant;
import tech.blacklake.dev.openapi.codegenerator.data.DependencyCoordinate;
import tech.blacklake.dev.openapi.codegenerator.util.StringUtil;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 依赖解析
 * */
@Slf4j
public class DependencyParser {
    /**
     * 版本管理
     * */
    private static Map<String, String> versionMap = new HashMap<>();

    /**
     * 父工程pom文件中依赖集合
     * */
    private static List<Triple<String, String, String>> dependencyList = new ArrayList<>();

    /**
     * 当前工程pom文件中依赖集合
     * */
    private static List<Dependency> dependencies;

    /**
     * 忽略，无需解析的groupIds
     * */
    private static List<String> ignoreGroupIds = List.of("tech.blacklake.dev.openapi");

    static {
        parseParentProjectPomXml();
        parseCurrentProjectPomXml();
    }

    public static List<DependencyCoordinate> getDependencyCoordinate() {
        List<DependencyCoordinate> dependencyCoordinates = new ArrayList<>();
        // 1.获取当前工程依赖的artifact集合
        Set<String> collect =
                dependencies.stream().map(it -> it.getArtifactId()).collect(Collectors.toSet());
        // 2.过滤后组装DependencyCoordinates
        dependencyList.stream()
                .filter(it -> it.getFirst().contains("tech.blacklake")
                        && collect.contains(it.getMiddle())
                        && (!ignoreGroupIds.contains(it.getFirst())))
                .forEach(it -> dependencyCoordinates.add(
                        new DependencyCoordinate(it.getFirst(), it.getMiddle(), it.getLast())));
        return dependencyCoordinates;
    }

    /**
     * 解析父工程的pom文件
     * */
    private static void parseParentProjectPomXml() {
        // 1.加载xml
        SAXReader saxReader = new SAXReader();
        try {
            Document document = saxReader.read(new File(StringUtil.concatPath(Constant.PROJECT_ROOT_PATH, "pom.xml")));

            // 2.获取根节点
            Element rootElement = document.getRootElement();
            List<Element> secondaryElements = rootElement.elements();
            // 3.装配版本管理
            List<Element> properties = secondaryElements.stream()
                    .filter(it -> it.getQName().getName().equals("properties"))
                    .collect(Collectors.toList())
                    .get(0)
                    .elements();
            for (Element property : properties) {
                versionMap.put(property.getQName().getName(), property.getStringValue());
            }
            // 4.装配父工程pom文件中依赖集合
            List<Element> dependencies = secondaryElements.stream()
                    .filter(it -> it.getQName().getName().equals("dependencyManagement"))
                    .collect(Collectors.toList())
                    .get(0)
                    .elements()
                    .stream()
                    .filter(it -> it.getQName().getName().equals("dependencies"))
                    .collect(Collectors.toList())
                    .get(0)
                    .elements();
            for (Element dependency : dependencies) {
                Triple<String, String, String> dependencyTriple = new Triple<>();
                dependencyTriple.setFirst(dependency.elements().get(0).getStringValue()); // groupId
                dependencyTriple.setMiddle(dependency.elements().get(1).getStringValue()); // artifactId
                dependencyTriple.setLast(
                        getRealVersion(dependency.elements().get(2).getStringValue())); // version
                dependencyList.add(dependencyTriple);
            }
        } catch (DocumentException e) {
            log.error("读取父工程pom文件失败");
            e.printStackTrace();
        } catch (Exception e2) {
            log.error("解析父工程pom文件失败");
            e2.printStackTrace();
        }
    }

    /**
     * 解析当前工程的pom文件
     * */
    private static void parseCurrentProjectPomXml() {
        Model model = null;
        try {
            // 用MavenXpp3Reader读取当前工程的pom文件
            FileInputStream fis = new FileInputStream(new File(StringUtil.concatPath(
                    Constant.PROJECT_ROOT_PATH, Constant.CODE_GENERATOR_PROJECT_NAME, "pom.xml")));
            MavenXpp3Reader reader = new MavenXpp3Reader();
            model = reader.read(fis);
        } catch (Exception e) {
            log.error("解析当前工程pom文件失败");
            e.printStackTrace();
        }
        dependencies = model.getDependencies();
    }

    /**
     * 获取具体的版本号
     * */
    private static String getRealVersion(String version) {
        String realVersion = version;
        if (version.charAt(0) == '$') { // todo 可以改成正则
            realVersion = versionMap.get(version.substring(2, version.length() - 1));
        }
        return realVersion;
    }
}
