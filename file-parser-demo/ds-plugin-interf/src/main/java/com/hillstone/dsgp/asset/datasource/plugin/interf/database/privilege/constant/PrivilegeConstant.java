package com.hillstone.dsgp.asset.datasource.plugin.interf.database.privilege.constant;

/**
 * 账号权限相关常量
 *
 * @author wangjian2
 * @date 2024/3/14 11:13
 */
public class PrivilegeConstant {
    private PrivilegeConstant() {
    }

    public static final int ACCOUNT_TYPE_PREDEFINED = 1;
    public static final int ACCOUNT_TYPE_CUSTOM = 2;
    /**
     * 权限类型
     */
    public static final int PRIVILEGE_TYPE_PERMIT = 1;
    public static final int PRIVILEGE_TYPE_FORBID = 0;
}
