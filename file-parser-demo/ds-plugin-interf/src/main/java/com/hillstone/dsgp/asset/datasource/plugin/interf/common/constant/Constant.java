package com.hillstone.dsgp.asset.datasource.plugin.interf.common.constant;

/**
 * 常量类
 *
 * @author wangjian2
 * @date 2024/3/20 17:09
 */
public class Constant {
    private Constant() {
    }

    /**
     * 是否是角色
     */
    public static final int ACCOUNT_IS_ROLE_FALSE = 0;
    public static final int ACCOUNT_IS_ROLE_TURE = 1;

    /**
     * 连接超时时间
     * <p>单位：ms</p>
     */
    public static final int DEFAULT_CONNECT_TIMEOUT = 10000;
}
