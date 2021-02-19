package com.romanceabroad.ui;

import org.testng.annotations.Test;

public class PasswordTests extends BaseUI {

    @Test(dataProvider = "PasswordExamples", dataProviderClass = DataProviders.class)
    public void password(String password, boolean requirement) {
        mainPage.clickSingInPageLink();
        mainPage.javaWaitSec(3);
        mainPage.sendKeysPassword(password, requirement);

    }
}
