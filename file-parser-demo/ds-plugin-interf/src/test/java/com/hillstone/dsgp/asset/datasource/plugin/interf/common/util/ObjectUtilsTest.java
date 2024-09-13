package com.hillstone.dsgp.asset.datasource.plugin.interf.common.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.Optional;

public class ObjectUtilsTest {

    @Test
    public void isEmpty() {
        Assert.assertTrue(ObjectUtils.isEmpty(null));

        Assert.assertTrue(ObjectUtils.isEmpty(Optional.empty()));

        Assert.assertTrue(ObjectUtils.isEmpty(""));

        Assert.assertTrue(ObjectUtils.isEmpty(new int[0]));

        Assert.assertTrue(ObjectUtils.isEmpty(Collections.emptyList()));

        Assert.assertTrue(ObjectUtils.isEmpty(Collections.emptyMap()));

        Assert.assertFalse(ObjectUtils.isEmpty(1));
    }
}