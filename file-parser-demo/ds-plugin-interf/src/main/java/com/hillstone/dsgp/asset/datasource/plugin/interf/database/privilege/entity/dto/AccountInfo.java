package com.hillstone.dsgp.asset.datasource.plugin.interf.database.privilege.entity.dto;

import com.hillstone.dsgp.asset.datasource.plugin.interf.database.privilege.entity.model.BaseAccountIdentification;
import com.hillstone.dsgp.asset.datasource.plugin.interf.database.privilege.entity.model.BaseAccountModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * 用户/角色信息
 *
 * @author wangjian2
 * @date 2024/3/18 14:58
 */
@Setter
@Getter
@ToString(callSuper = true)
public class AccountInfo extends BaseAccountModel {
    /**
     * 所属用户/角色
     */
    private List<ParentAccount> parentAccounts;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccountInfo)) {
            return false;
        }
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Setter
    @Getter
    @ToString(callSuper = true)
    public static class ParentAccount extends BaseAccountIdentification {
    }
}
