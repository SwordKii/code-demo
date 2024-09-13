package com.hillstone.dsgp.asset.datasource.plugin.interf.common.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 数据源连接相关信息
 *
 * @author wangjian2
 * @date 2024/3/8 18:54
 */
@Setter
@Getter
@ToString(callSuper = true)
public class DataSourceConnectionParam {
    /**
     * 连接参数
     */
    private ConnectionParam connectionParam;
    /**
     * 认证参数
     */
    private AuthenticationParam authenticationParam;

}
