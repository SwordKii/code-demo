package com.hillstone.dsgp.asset.datasource.plugin.interf.database.privilege.entity.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

/**
 * 权限作用对象
 *
 * @author wangjian2
 * @date 2024/3/20 19:08
 */
@Setter
@Getter
@ToString(callSuper = true)
public class PrivilegeScope {
    private String catalog;
    private String schema;
    private String table;
    private String column;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrivilegeScope)) {
            return false;
        }
        PrivilegeScope that = (PrivilegeScope) o;
        return Objects.equals(getCatalog(), that.getCatalog()) && Objects.equals(getSchema(), that.getSchema()) && Objects.equals(getTable(), that.getTable()) && Objects.equals(getColumn(), that.getColumn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCatalog(), getSchema(), getTable(), getColumn());
    }
}
