package com.romanceabroad.ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SingInTests extends BaseUI {
    public static final boolean isTest22 = true;
    String currentUrl;


    @Test(dataProvider = "SingIn", dataProviderClass = DataProviders.class, priority = 1, enabled = isTest22, groups = {"ie"})
    public void negativeTestsSingIn(String email, String password) {
        mainPage.clickSingInPageLink();
        mainPage.javaWaitSec(3);
        mainPage.sendKeysEmailAndPassword(email, password);
        currentUrl = driver.getCurrentUrl();
        mainPage.javaWaitSec(3);
        Assert.assertEquals(currentUrl, Data.expectedUrlSingIn);
    }
}
