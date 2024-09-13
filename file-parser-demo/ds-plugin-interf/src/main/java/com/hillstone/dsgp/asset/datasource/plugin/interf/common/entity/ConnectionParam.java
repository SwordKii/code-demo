package com.hillstone.dsgp.asset.datasource.plugin.interf.common.entity;

import com.fasterxml.jackson.databind.JsonNode;
import com.hillstone.dsgp.asset.datasource.plugin.interf.common.constant.Constant;
import com.hillstone.dsgp.asset.datasource.plugin.interf.common.constant.OSEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 连接参数
 *
 * @author wangjian2
 * @date 2024/4/8 18:08
 */
@Setter
@Getter
@ToString(callSuper = true)
public class ConnectionParam {
    /**
     * 地址
     */
    private String host;
    /**
     * 端口
     */
    private Integer port;
    /**
     * 数据源版本号
     * <p>提供给Driver区分版本建立连接</p>
     */
    private String version;
    /**
     * 数据源操作系统
     */
    private OSEnum os;
    /**
     * 连接超时时间
     * <p>单位：ms</p>
     */
    private Integer connectTimeout = Constant.DEFAULT_CONNECT_TIMEOUT;
    /**
     * 动态连接参数
     * <p>例如, instance, database, path, useSSL, encode等</p>
     * <p>动态连接参数前端表单展示，需要插件定义的认证参数jsonSchema</p>
     */
    private JsonNode dynamicConnectionParam;
}
