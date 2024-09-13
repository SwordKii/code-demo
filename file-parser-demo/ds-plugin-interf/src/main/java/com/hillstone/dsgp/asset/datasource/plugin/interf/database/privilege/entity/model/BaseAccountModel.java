package com.hillstone.dsgp.asset.datasource.plugin.interf.database.privilege.entity.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

/**
 * 账户基础类
 *
 * @author wangjian2
 * @date 2024/3/9 13:40
 */
@Setter
@Getter
@ToString(callSuper = true)
public abstract class BaseAccountModel extends BaseAccountIdentification {
    /**
     * 账户类型
     * @see com.hillstone.dsgp.asset.datasource.plugin.interf.database.privilege.constant.PrivilegeConstant#ACCOUNT_TYPE_UNKNOWN
     * @see com.hillstone.dsgp.asset.datasource.plugin.interf.database.privilege.constant.PrivilegeConstant#ACCOUNT_TYPE_PREDEFINED
     * @see com.hillstone.dsgp.asset.datasource.plugin.interf.database.privilege.constant.PrivilegeConstant#ACCOUNT_TYPE_CUSTOM
     */
    private Integer type;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseAccountModel)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        BaseAccountModel that = (BaseAccountModel) o;
        return Objects.equals(getType(), that.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getType());
    }
}
