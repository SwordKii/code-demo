package com.hillstone.dsgp.asset.datasource.plugin.interf.common;

import com.fasterxml.jackson.databind.JsonNode;
import com.hillstone.dsgp.asset.datasource.plugin.interf.common.exception.PluginException;
import com.hillstone.dsgp.asset.datasource.plugin.interf.common.util.JacksonUtil;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/**
 * 数据源驱动
 *
 * @author wangjian2
 * @date 2024/3/14 15:12
 */
public interface DataSourceDriver {
    /**
     * 是否支持该版本
     *
     * @param version
     * @return
     */
    boolean acceptVersion(String version);

    /**
     * 获取连接参数jsonSchema
     *
     * @return
     */
    default JsonNode getConnectJsonSchema(Locale locale) {
        StringBuilder jsonSchemaPath = new StringBuilder("jsonSchema/connect");
        return getJsonSchema(locale, jsonSchemaPath);
    }

    default JsonNode getJsonSchema(Locale locale, StringBuilder jsonSchemaPathPrefix) {
        if (Locale.SIMPLIFIED_CHINESE.equals(locale)) {
            jsonSchemaPathPrefix.append("/zh.json");
        } else {
            jsonSchemaPathPrefix.append("/en.json");
        }
        try (InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream(jsonSchemaPathPrefix.toString())) {
            return JacksonUtil.toObject(resourceAsStream, JsonNode.class);
        } catch (IOException e) {
            throw new PluginException(e);
        }
    }


    /**
     * 获取认证参数jsonSchema
     *
     * @return
     */
    default JsonNode getAuthenticationJsonSchema(Locale locale) {
        StringBuilder jsonSchemaPath = new StringBuilder("jsonSchema/authentication");
        return getJsonSchema(locale, jsonSchemaPath);
    }
}