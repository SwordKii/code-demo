package com.example.fileparserdemo.filetypedetector.util;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * todo
 *
 * @author wangjian2
 * @date 2024/9/11 15:56
 */
public class YamlUtil {

    private static final String DETECTOR_YAML = "/detector.yaml";
    public static final String STRUCTURED_FILES = "structured-files";

    public static Object getProperty(String property) {
        Yaml yaml = new Yaml();
        try (InputStream inputStream = YamlUtil.class.getResourceAsStream(DETECTOR_YAML)) {
            Map<String, Object> load = yaml.load(inputStream);
            return ((Map<String, Object>) load.get("detector")).get(property);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
