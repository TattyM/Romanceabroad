package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoopBlogPrettyWomen extends BaseUI {
    public static final boolean isTest13 = true;
    public static final boolean isTest14 = true;

    @Test(priority = 1, enabled = isTest13, groups = {"user", "admin"})
    public void verifyAllTabsBlogTest13() {
        String actualUrlBlog;
        String actualUrlBlogPage;
        mainPage.perfomClick(driver.findElement(Locators.LINK_BLOG));
        mainPage.javaWaitSec(3);
        String currentUrlBlog = driver.getCurrentUrl();
        softAssert.assertEquals(currentUrlBlog, Data.expectedUrlBlog, "Don't see page!");
        List<WebElement> links = driver.findElements(Locators.BLOCK_LIST);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String title = links.get(i).getText();
            System.out.println(title);
            mainPage.javaWaitSec(5);
            (links.get(i)).click();
            if (title.startsWith("Bl")) {
                actualUrlBlog = driver.getCurrentUrl();
                driver.findElement(Locators.LINK_TEXT_BLOCK).isDisplayed();
                Assert.assertEquals(actualUrlBlog, Data.expectedUrlBlog);
            }
            if (title.contains("9 Factors")) {
                actualUrlBlogPage = driver.getCurrentUrl();
                mainPage.javaWaitSec(5);
                driver.findElement(Locators.LINK_PHOTOS_GIRLS).isDisplayed();
                driver.findElement(Locators.LINK_TEXT_TITLE).isDisplayed();
                Assert.assertEquals(actualUrlBlogPage, Data.expectedUrlBlogPage);
            }
            driver.getCurrentUrl();
            links = driver.findElements(Locators.BLOCK_LIST);
        }
    }

    @Test(priority = 2, enabled = isTest14, groups = {"ie"})
    public void verifyAllTabsPrettyWomenTest14() {
        String currentUrlSearch;
        mainPage.perfomClick(driver.findElement(Locators.LINK_PRETTY_WOMEN));
        currentUrlSearch = driver.getCurrentUrl();
        softAssert.assertEquals(currentUrlSearch, Data.expectedUrlPrettyWomen, "Cannot find the page!");
        mainPage.javaWaitSec(3);
        List<WebElement> links = driver.findElements(Locators.LINK_LOOP_FOOTER);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String categories = links.get(i).getText();
            System.out.println(categories);
            mainPage.javaWaitSec(5);
            mainPage.ajaxClick(links.get(i));
            if (categories.contains("2")) {
                mainPage.javaWaitSec(5);
                driver.findElement(Locators.BLOCK_TITLE).isDisplayed();
                if (currentUrlSearch.contains("#")) {
                    Assert.fail("Not a good Url!!!");
                } else {
                    System.out.println("It is a good Url!!!");
                }
            }
            if (categories.contains("4")) {
                mainPage.javaWaitSec(3);
                mainPage.getDropDownListByValue(Locators.DROPDOWN_LIST, Data.select);
                driver.findElement(Locators.BLOCK_TITLE).isDisplayed();
                mainPage.javaWaitSec(5);
                Assert.assertEquals(currentUrlSearch, Data.expectedUrlPrettyWomen2);
            }
            driver.getCurrentUrl();
            links = driver.findElements(Locators.LINK_LOOP_FOOTER);
        }
    }
}
