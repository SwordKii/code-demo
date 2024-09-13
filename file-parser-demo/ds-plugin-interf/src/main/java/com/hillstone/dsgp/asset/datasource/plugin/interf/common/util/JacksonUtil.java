package com.hillstone.dsgp.asset.datasource.plugin.interf.common.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.extern.slf4j.Slf4j;

import java.io.InputStream;

/**
 * JacksonUtil
 *
 * @author wangjian2
 * @date 2024/4/15 13:56
 */
@Slf4j
public class JacksonUtil {
    /**
     * 无属性JSON_MAPPER
     * <p>禁止修改此JsonMapper的configuration</p>
     */
    private static final JsonMapper JSON_MAPPER = new JsonMapper();
    /**
     * json to object
     *
     * @param t
     * @param inputStream
     * @param <T>
     * @return
     */
    public static <T> T toObject(InputStream inputStream, Class<T> t) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            return objectMapper.readValue(inputStream, t);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return null;
    }

    /**
     * object to json
     *
     * @param o
     * @return
     */
    public static String toJson(Object o) {

        JsonMapper jsonMapper = JsonMapper.builder()
                .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
                .build();
        try {
            return jsonMapper.writeValueAsString(o);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return null;
    }
    /**
     * 创建ObjectNode
     * @return
     */
    public static ObjectNode createJsonNode() {
        return JSON_MAPPER.createObjectNode();
    }

    /**
     * 转换成JsonNode
     * @param json
     * @return
     */
    public static JsonNode toJsonNode(String json) {
        if (json == null || json.length() == 0) {
            return null;
        }
        try {
            return JSON_MAPPER.readTree(json);
        } catch (JsonProcessingException e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }
}
