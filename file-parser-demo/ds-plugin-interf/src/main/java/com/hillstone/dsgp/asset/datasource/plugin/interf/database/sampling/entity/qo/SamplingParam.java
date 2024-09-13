package com.hillstone.dsgp.asset.datasource.plugin.interf.database.sampling.entity.qo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * 数据采样架构信息
 *
 * @author wangjian2
 * @date 2024/3/9 14:57
 */
@Setter
@Getter
@ToString(callSuper = true)
public class SamplingParam {
    private String catalog;
    private String schema;
    private String table;
    private List<String> columns;
    /**
     * 采样数量
     */
    private Integer count;
}
