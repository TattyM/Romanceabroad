package com.romanceabroad.ui;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class UserProfileTests extends BaseUI {
    public static final boolean isTest21 = true;
    String actualTitle;
    String currentUrl;

    @Test(priority = 1, enabled = isTest21, groups = {"admin"})
    public void testUserProfile() {
        driver.get(Data.expectedUrlUserProfile);
        currentUrl = driver.getCurrentUrl();
        actualTitle = photosPage.getAnyTitle();
        Assert.assertEquals(actualTitle, Data.expectedTitleUser);
        Assert.assertEquals(currentUrl, Data.expectedUrlUserProfile);
        System.out.println(actualTitle);
        userProfilePage.verifyFindPeopleButton();
        actualTitle = photosPage.getAnyTitle();
        Assert.assertEquals(actualTitle, Data.expectedTitleWomen);
        System.out.println(actualTitle);
        userProfilePage.verifyLoginForm(Data.email1, Data.password);
        mainPage.javaWaitSec(3);
        userProfilePage.verifySendItemsTabs();
        if (currentUrl.contains("#")) {
            Assert.fail("It contains #");
        } else {
            System.out.println("It is a good Url!");
        }
        List<WebElement> tabsUser = driver.findElements(Locators.USER_LOOP);
        System.out.println(tabsUser.size());
        for (int i = 0; i < tabsUser.size(); i++) {
            String infoPage = tabsUser.get(i).getText();
            System.out.println(infoPage);
            mainPage.ajaxClick(tabsUser.get(i));
            mainPage.javaWaitSec(3);
            if (tabsUser.contains("Wall")) {
                currentUrl = driver.getCurrentUrl();
                Assert.assertEquals(actualTitle, Data.expectedUrlTabWall);
                Assert.assertTrue(driver.findElement(Locators.USER_PROFILE_PICTURE).isDisplayed());
                Assert.assertTrue(driver.findElement(Locators.USER_PROFILE_NEW_USERS).isDisplayed());
                String textUserInfo = driver.findElement(Locators.USER_INFO).getText();
                if (textUserInfo.contains(Data.userinfo)) {
                    System.out.println("Text user updates is displayed!");
                }
            } else if (tabsUser.contains("Profile")) {
                currentUrl = driver.getCurrentUrl();
                Assert.assertEquals(actualTitle, Data.expectedUrlUserProfile);
                driver.findElement(Locators.USER_PROFILE_INFO).isDisplayed();

            } else if (tabsUser.contains("Gallery")) {
                currentUrl = driver.getCurrentUrl();
                Assert.assertEquals(currentUrl, Data.expectedUrlTabGallery);
                Assert.assertTrue(driver.findElement(Locators.USER_PROFILE_GALLERY_PICTURE).isDisplayed());
                mainPage.getDropDownListByText(Locators.LINK_DROP_DOWN_LIST, Data.views);
            }
            tabsUser = driver.findElements(Locators.USER_LOOP);
        }
        mainPage.checkLinksOnWebPage(Data.element, Data.attribute);
    }
}
