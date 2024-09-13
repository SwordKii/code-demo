package com.hillstone.dsgp.asset.datasource.plugin.interf.database.sampling.entity.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * 数据库采样数据
 *
 * @author wangjian2
 * @date 2024/3/12 9:40
 */
@Setter
@Getter
@ToString(callSuper = true)
public class DataBaseSampleData {
    private String catalog;
    private String schema;
    private String table;
    private String column;
    private List<Object> cells;
}
