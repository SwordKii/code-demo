package com.hillstone.dsgp.asset.datasource.plugin.interf.common.entity;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Optional;

/**
 * 认证参数
 * <p>认证参数前端表单展示，需要插件定义的认证参数jsonSchema</p>
 *
 * @author wangjian2
 * @date 2024/4/8 18:09
 */
@Setter
@Getter
@ToString(callSuper = true)
public class AuthenticationParam {
    public static final String TYPE_NODE = "authentication";
    /**
     * 认证类型
     * <p>通过dynamicAuthenticationParam.authentication获取</p>
     */
    private Integer authenticationType;
    /**
     * 动态认证参数
     * <p>固定jsonNode: authentication</p>
     * <p>例如：username, password, token等，插件根据情况定义</p>
     */
    private JsonNode dynamicAuthenticationParam;

    public Integer getAuthenticationType() {
        if (authenticationType == null) {
            return Optional.ofNullable(getDynamicAuthenticationParam())
                    .map(jsonNode -> jsonNode.get(TYPE_NODE))
                    .map(JsonNode::intValue)
                    .orElse(null);
        }
        return this.authenticationType;
    }
}
