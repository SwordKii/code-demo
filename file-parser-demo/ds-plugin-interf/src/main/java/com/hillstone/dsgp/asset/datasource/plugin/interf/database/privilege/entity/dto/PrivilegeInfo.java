package com.hillstone.dsgp.asset.datasource.plugin.interf.database.privilege.entity.dto;

import com.hillstone.dsgp.asset.datasource.plugin.interf.database.privilege.entity.model.BaseAccountIdentification;
import com.hillstone.dsgp.asset.datasource.plugin.interf.database.privilege.entity.model.BasePrivilegeModel;
import com.hillstone.dsgp.asset.datasource.plugin.interf.database.privilege.entity.model.PrivilegeScope;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

/**
 * 权限类
 * <p>每个权限应当对应到账户或角色（二选一），但需要包含所有账户和角色</p>
 *
 * @author wangjian2
 * @date 2024/3/9 14:10
 */
@Setter
@Getter
@ToString(callSuper = true)
public class PrivilegeInfo extends BasePrivilegeModel {
    /**
     * 权限作用范围
     */
    private PrivilegeScope scope;
    /**
     * 所属用户或角色
     */
    private AccountInfo account;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrivilegeInfo)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        PrivilegeInfo that = (PrivilegeInfo) o;
        return getAccount().equals(that.getAccount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAccount());
    }

    @Setter
    @Getter
    @ToString(callSuper = true)
    public static class AccountInfo extends BaseAccountIdentification {
    }
}
