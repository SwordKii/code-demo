package com.hillstone.dsgp.asset.datasource.plugin.interf.common.constant;

/**
 * 操作系统
 *
 * @author wangjian2
 * @date 2024/3/10 11:07
 */
public enum OSEnum {
    /**
     * 操作系统
     */
    ALL, MAC, WINDOWS, LINUX;

    public static OSEnum getByName(String name){
        for (OSEnum value : OSEnum.values()) {
            if (value.name().equalsIgnoreCase(name)) {
                return value;
            }
        }
        return null;
    }
}
