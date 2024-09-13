package com.hillstone.dsgp.asset.datasource.plugin.interf.database.privilege.entity.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

/**
 * 权限基础类
 *
 * @author wangjian2
 * @date 2024/3/9 13:44
 */
@Setter
@Getter
@ToString(callSuper = true)
public abstract class BasePrivilegeModel {
    /**
     * 权限名称
     */
    private String name;
    /**
     * 权限类型
     * @see com.hillstone.dsgp.asset.datasource.plugin.interf.database.privilege.constant.PrivilegeConstant#PRIVILEGE_TYPE_PERMIT
     * @see com.hillstone.dsgp.asset.datasource.plugin.interf.database.privilege.constant.PrivilegeConstant#PRIVILEGE_TYPE_FORBID
     */
    private Integer type;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BasePrivilegeModel)) {
            return false;
        }
        BasePrivilegeModel that = (BasePrivilegeModel) o;
        return getName().equals(that.getName()) && getType().equals(that.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getType());
    }
}
