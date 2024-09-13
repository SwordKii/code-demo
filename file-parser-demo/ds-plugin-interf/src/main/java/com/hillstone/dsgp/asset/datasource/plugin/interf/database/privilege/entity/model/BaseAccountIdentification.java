package com.hillstone.dsgp.asset.datasource.plugin.interf.database.privilege.entity.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

/**
 * account唯一标识
 *
 * @author wangjian2
 * @date 2024/3/18 15:03
 */
@Setter
@Getter
@ToString(callSuper = true)
public abstract class BaseAccountIdentification {
    /**
     * 名称
     */
    private String name;
    /**
     * 地址
     */
    private String host;
    /**
     * 是否是角色
     */
    private Integer isRole;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseAccountIdentification)) {
            return false;
        }
        BaseAccountIdentification that = (BaseAccountIdentification) o;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getHost(), that.getHost()) && Objects.equals(getIsRole(), that.getIsRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getHost(), getIsRole());
    }
}
