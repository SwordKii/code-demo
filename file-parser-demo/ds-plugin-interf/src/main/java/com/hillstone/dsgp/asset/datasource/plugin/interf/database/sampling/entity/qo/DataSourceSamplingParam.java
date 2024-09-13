package com.hillstone.dsgp.asset.datasource.plugin.interf.database.sampling.entity.qo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * 数据采样参数
 *
 * @author wangjian2
 * @date 2024/3/9 14:35
 */
@Setter
@Getter
@ToString(callSuper = true)
public class DataSourceSamplingParam {
    private List<SamplingParam> architectureParams;
}
