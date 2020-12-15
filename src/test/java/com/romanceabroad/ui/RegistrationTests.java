package com.romanceabroad.ui;

import org.testng.Assert;
import org.testng.annotations.Test;


public class RegistrationTests extends BaseUI {
    public static final boolean isTest14 = true;
    public static final boolean isTest15 = true;


    @Test(dataProvider = "JoinToday", dataProviderClass = DataProviders.class, priority = 1, enabled = isTest14, groups = {"ie"})
    public void testRegistration(String email, String username, boolean requirement) {
        System.out.println(email);
        mainPage.ajaxScroll(driver.findElement(Locators.LINK_JOIN_TODAY));
        mainPage.clickJoinTodayButton();
        mainPage.firstPartOfRegistration(email, Data.password);
        if (!requirement) {
            Assert.assertTrue(driver.findElement(Locators.TEXT_TOOLTIP).isDisplayed());
        } else {
            mainPage.clickButtonNext();
            mainPage.secondPartOfRegistration(username, Data.month, Data.day, Data.year, Data.phone, Data.town, Data.location);
            mainPage.clickUnselectedCheckbox(Locators.CHECKBOX_CONFIRM);
        }
    }

    @Test(dataProvider = "JoinToday2", dataProviderClass = DataProviders.class, priority = 2, enabled = isTest15, groups = {"ie"})
    public void testRegistration2(String email, String password, String day, String month, String year, String phone, String town, String location) {
        mainPage.ajaxScroll(driver.findElement(Locators.LINK_JOIN_TODAY));
        mainPage.clickJoinTodayButton();
        mainPage.firstPartOfRegistration(email, password);
        mainPage.clickButtonNext();
        mainPage.secondPartOfRegistration(mainPage.generateNewNumber(Data.username, 3), month, day, year, phone, town, location);
        mainPage.clickUnselectedCheckbox(Locators.CHECKBOX_CONFIRM);
    }
}

