package com.romanceabroad.ui;

import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(VideoListener.class)
public class SingInTests extends BaseUI {
    public static final boolean isTest22 = true;
    String currentUrl;

    @Video(name = "SingIn")
    @Test(dataProvider = "SingIn", dataProviderClass = DataProviders.class, priority = 1, enabled = isTest22, groups = {"ie"})
    public void negativeTestsSingIn(String email, String password) {
        Reports.log("Test Sing In Form");
        mainPage.clickSingInPageLink();
        mainPage.javaWaitSec(3);
        mainPage.sendKeysEmailAndPassword(email, password);
        currentUrl = driver.getCurrentUrl();
        mainPage.javaWaitSec(3);
        Assert.assertEquals(currentUrl, Data.expectedUrlSingIn);
    }
}
