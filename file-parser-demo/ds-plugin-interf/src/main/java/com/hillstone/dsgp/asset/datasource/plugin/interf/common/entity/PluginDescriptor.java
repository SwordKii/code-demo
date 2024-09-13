package com.hillstone.dsgp.asset.datasource.plugin.interf.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.hillstone.dsgp.asset.datasource.plugin.interf.common.constant.DataSourceTypeEnum;
import com.hillstone.dsgp.asset.datasource.plugin.interf.common.constant.OSEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * 插件配置信息
 * <p>对应配置文件中的plugin.json，使用jackson序列化生成plugin.json</p>
 *
 * @author wangjian2
 * @date 2024/3/10 11:06
 */
@Setter
@Getter
@ToString(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"artifactId", "version", "unSupportPlatformVersion", "oem", "type", "category", "className",
        "aliases", "os", "supportVersion", "supportPrivilegeScan", "grantCommand", "architectureDesc", "defaultPort"})
public class PluginDescriptor {
    /**
     * 插件jar包artifactId
     */
    private String artifactId;
    /**
     * 插件jar包版本
     */
    private String version;
    /**
     * 不支持的平台版本
     * <p>例如："2.2.0-2.3.0, 2.5.0", 表示不支持"DSGP 2.2.0"到"DSGP 2.3.0"(左右都包含), 以及不支持"DSGP 2.5.0"</p>
     * <p>平台版本和插件版本的不匹配，只需要平台或插件一方配置不支持即可</p>
     */
    private String unSupportPlatformVersion;
    /**
     * oem定制化插件标志
     */
    private String oem;
    /**
     * 数据源类型
     */
    private DataSourceTypeEnum type;
    /**
     * 数据源类型名称，如MySQL
     */
    private String category;
    /**
     * 插件Driver实现类全类名
     */
    private String className;
    /**
     * 别名
     * <p>nmap扫描结果，匹配时，忽略大小写。和category相同则无需写</p>
     */
    private List<String> aliases;
    /**
     * 支持数据源的操作系统
     */
    private OSEnum os;
    /**
     * 插件数据源支持版本，如5.0-8.0
     * <p>""表示支持所有</p>
     */
    private String supportVersion;
    /**
     * 是否支持账户权限扫描
     */
    private Boolean supportPrivilegeScan;
    /**
     * 默认授权语句
     */
    private String grantCommand;
    /**
     * 架构描述
     */
    private ArchitectureDesc architectureDesc;
    /**
     * 数据源默认接口
     */
    private Integer defaultPort;

}
