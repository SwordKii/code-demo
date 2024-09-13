package com.hillstone.dsgp.asset.datasource.plugin.interf.common.constant;

import com.hillstone.dsgp.asset.datasource.plugin.interf.common.DataSourceDriver;
import com.hillstone.dsgp.asset.datasource.plugin.interf.database.DataBaseDriver;
import com.hillstone.dsgp.asset.datasource.plugin.interf.file.FileSystemDriver;
import lombok.AllArgsConstructor;

/**
 * 数据源分类枚举类
 *
 * @author wangjian2
 * @date 2024/3/13 9:18
 */
@AllArgsConstructor
public enum DataSourceTypeEnum {
    /**
     * 数据源分类枚举类
     */
    DATA_BASE(0, DataBaseDriver.class),
    FILE_SYSTEM(1, FileSystemDriver.class)
    ;
    private Integer code;
    private Class<? extends DataSourceDriver> driverClass;

    public Integer getCode() {
        return code;
    }

    public Class<? extends DataSourceDriver> getDriverClass() {
        return driverClass;
    }

    public static DataSourceTypeEnum getByCode(int code) {
        for (DataSourceTypeEnum value : DataSourceTypeEnum.values()) {
            if (value.code.equals(code)) {
                return value;
            }
        }
        throw new IllegalArgumentException(String.format("code %s is illegal!", code));
    }
}
