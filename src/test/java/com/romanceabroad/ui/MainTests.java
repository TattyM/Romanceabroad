package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainTests extends BaseUI {
    public static final boolean isTest9 = false;
    public static final boolean isTest10 = true;
    public static final boolean isTest11 = false;

    @Test(priority = 1,enabled = isTest9,groups = {"user"})
    public void testSignInTest7() {
        String actualUrl;
        actualUrl = driver.getCurrentUrl();
        mainPage.clickValueOfList((Locators.LINK_LOOP_HEADER), "navbar-nav");
        mainPage.ajaxClick(driver.findElement(Locators.LINK_SIGN_IN));
        Assert.assertEquals(actualUrl, Data.expectedUrl);
        System.out.println("Log in form is displayed!");
    }


    @Test(priority = 2,enabled = isTest10,groups = {"user","admin"})
    public void testBlogPageTest9() {
        mainPage.clickBlogPageLink();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String currentUrlBlog = driver.getCurrentUrl();
        System.out.println("Blog Page!");
        blogPage.perfomClick(driver.findElement(Locators.LINK_KHARKOV_AGENCY));
        Assert.assertEquals(currentUrlBlog, Data.expectedUrlBlog);

    }
    @Test(priority = 3, enabled = isTest11, groups = {"ie", "user", "admin"})
    public void smokeTestMainPage() {
        List<WebElement> mainTabs = driver.findElements(Locators.LINK_LOOP);
        for (int i = 0; i < mainTabs.size(); i++) {
            mainTabs.get(i).click();
            driver.get(Data.mainUrl);
            mainTabs = driver.findElements(Locators.LINK_LOOP);
        }
    }
}
