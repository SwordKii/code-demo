package com.hillstone.dsgp.asset.datasource.plugin.interf.common.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.util.Objects;

/**
 * 国际化语言描述
 *
 * @author wangjian2
 * @date 2024/4/8 9:19
 */
@Setter
@Getter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"en", "zh"})
public class I18nDesc {
    /**
     * 英文
     */
    private String en;
    /**
     * 中文
     */
    private String zh;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof I18nDesc)) {
            return false;
        }
        I18nDesc i18nDesc = (I18nDesc) o;
        return Objects.equals(getEn(), i18nDesc.getEn()) && Objects.equals(getZh(), i18nDesc.getZh());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEn(), getZh());
    }
}
