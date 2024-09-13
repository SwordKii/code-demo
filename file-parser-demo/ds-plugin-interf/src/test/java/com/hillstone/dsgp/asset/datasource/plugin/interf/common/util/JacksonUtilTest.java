package com.hillstone.dsgp.asset.datasource.plugin.interf.common.util;

import com.hillstone.dsgp.asset.datasource.plugin.interf.common.entity.I18nDesc;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class JacksonUtilTest {

    @Test
    public void toObject() throws IOException {
        String str = "{\"en\": \"schema\", \"zh\": \"架构\"}";

        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8))) {
            I18nDesc i18nDesc = JacksonUtil.toObject(byteArrayInputStream, I18nDesc.class);
            Assert.assertNotNull(i18nDesc);
        }

        String str2 = "{\"en\": \"schema\", \"zh\": {}}";

        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str2.getBytes(StandardCharsets.UTF_8))) {
            I18nDesc i18nDesc = JacksonUtil.toObject(byteArrayInputStream, I18nDesc.class);
            Assert.assertNull(i18nDesc);
        }
    }

    @Test
    public void toJson() {
        I18nDesc i18nDesc = new I18nDesc("en", "zh");
        Assert.assertNotNull(JacksonUtil.toJson(i18nDesc));
    }

    @Test
    public void createJsonNode() {
        Assert.assertNotNull(JacksonUtil.createJsonNode());
    }

    @Test
    public void toJsonNode() {
        Assert.assertNull(JacksonUtil.toJsonNode(null));

        String str = "{\"en\": \"schema\", \"zh\": }";
        Assert.assertNull(JacksonUtil.toJsonNode(str));

        str = "{\"en\": \"schema\", \"zh\": \"架构\"}";
        Assert.assertNotNull(JacksonUtil.toJsonNode(str));
    }
}