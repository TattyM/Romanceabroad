package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;


public class FooterTabsTests extends BaseUI {
    public static final boolean isTest22 = true;

    @Test(priority = 3, enabled = isTest22, groups = {"user"})
    public void testWebElementsFooter() {
        String currentUrl;
        String actualTitle;
        mainPage.clickGiftsPageLink();
        List<WebElement> tabsFooter = driver.findElements(Locators.LIST_FOOTER);
        System.out.println(tabsFooter.size());
        for (int i = 0; i < tabsFooter.size(); i++) {
            String infoTabs = tabsFooter.get(i).getText();
            System.out.println(infoTabs);
            mainPage.ajaxClick(tabsFooter.get(i));
            if (i == 0) {
                mainPage.javaWaitSec(3);
                currentUrl = driver.getCurrentUrl();
                actualTitle = mainPage.getAnyTitle();
                Assert.assertEquals(currentUrl, Data.urlContactUs);
                Assert.assertEquals(actualTitle, Data.expectedTitleContactUs);
                contactUsPage.testContactUsForm();
            } else if (i == 1) {
                actualTitle = mainPage.getAnyTitle();
                Assert.assertEquals(actualTitle, Data.expectedTitleSitemap);
                mainPage.testSingInForm();
                currentUrl = driver.getCurrentUrl();
                mainPage.javaWaitSec(3);
                Assert.assertEquals(currentUrl, Data.expectedUrlSingIn);
            } else if (i == 2) {
                currentUrl = driver.getCurrentUrl();
                actualTitle = mainPage.getAnyTitle();
                Assert.assertEquals(Data.expectedTitleWork, actualTitle);
                Assert.assertEquals(currentUrl, Data.expectedUrlHowWeWork);
            } else if (i == 3) {
                Assert.assertTrue(driver.findElement(Locators.PHOTOS_BLOCK).isDisplayed());
                String textPageNews = driver.findElement(Locators.TEXT_PAGE).getText();
                if (textPageNews.contains(Data.textPageNews)) {
                    System.out.println("---Text media is correct!---");
                }
            } else if (i == 4) {
                actualTitle = mainPage.getAnyTitle();
                Assert.assertEquals(actualTitle, Data.expectedTitlePrivacy);
                mainPage.verifyLinkPageContent();
                currentUrl = driver.getCurrentUrl();
                Assert.assertEquals(currentUrl, Data.expectedUrlContent);
            } else if (i == 5) {
                actualTitle = mainPage.getAnyTitle();
                Assert.assertEquals(actualTitle, Data.expectedTitleTerms);
                Assert.assertTrue(driver.findElement(Locators.PHOTOS_BLOCK).isDisplayed());
            } else if (i == 6) {
                mainPage.javaWaitSec(3);
                currentUrl = driver.getCurrentUrl();
                Assert.assertEquals(currentUrl, Data.expectedUrlStart);
                if (currentUrl.contains("#")) {
                    System.out.println("---Current URL contains # !---");
                }
                mainPage.linkSingInStartPage();
                mainPage.testRegistrationFormStartPage();
            }
            tabsFooter = driver.findElements(Locators.LIST_FOOTER);

        }

    }
}





