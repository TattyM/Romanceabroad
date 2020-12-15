package com.romanceabroad.ui;

import org.testng.annotations.Test;


public class ContactUsTests extends BaseUI {

    public static final boolean isTest1 = true;


    @Test(dataProvider = "QuestionForm", dataProviderClass = DataProviders.class, priority = 1, enabled = isTest1, groups = {"ie", "admin"})
    public void testContactUs(String reason, String name, String email, String subject, String message) {
        driver.get(Data.urlContactUs);
        contactUsPage.selectReason(reason);
        contactUsPage.personalInfo(name, email);
        contactUsPage.inputSubject(subject, message, (mainPage.generateNewNumber(Data.code, 5)));
    }
}
