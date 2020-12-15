package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoopMainTests extends BaseUI {
    public static final boolean isTest4 = true;
    public static final boolean isTest5 = true;
    public static final boolean isTest6 = true;
    public static final boolean isTest7 = true;
    public static final boolean isTest8 = true;


    @Test(priority = 1, enabled = isTest4, groups = {"ie", "admin"})
    public void testHowWeWorkTourToPagesTest3() {
        String actualTitle;
        String actualUrlHowWeWork;
        String actualUrlTourTo;
        List<WebElement> links = driver.findElements(Locators.LINK_LOOP_HEADER);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String title = links.get(i).getText();
            System.out.println(title);
            mainPage.ajaxClick(links.get(i));
            if (title.contains("WORK")) {
                mainPage.javaWaitSec(3);
                actualTitle = driver.findElement(Locators.LINK_TITLE).getText();
                actualUrlHowWeWork = driver.getCurrentUrl();
                mainPage.ajaxScroll(driver.findElement(Locators.PAGE_FOOTER));
                mainPage.javaWaitSec(5);
                Assert.assertEquals(Data.expectedTitleWork, actualTitle);
                mainPage.javaWaitSec(5);
                Assert.assertEquals(actualUrlHowWeWork, Data.expectedUrlHowWeWork);
                if (actualUrlHowWeWork.contains("#")) {
                    Assert.fail("It contains #");
                } else {
                    System.out.println("It is a good Url!");
                }
            }
            if (title.contains("TOURS TO ")) {
                mainPage.javaWaitSec(3);
                actualTitle = driver.findElement(Locators.LINK_TITLE).getText();
                actualUrlTourTo = driver.getCurrentUrl();
                driver.findElement(Locators.LINK_PHOTOS_TOUR).isDisplayed();
                driver.findElement(Locators.LINK_PHOTOS_CAROUSEL).isDisplayed();
                Assert.assertEquals(Data.expectedTitleTour, actualTitle);
                Assert.assertEquals(actualUrlTourTo, Data.expectedUrlTourTo);
            }
            mainPage.javaWaitSec(5);
            driver.get(mainUrl);
            links = driver.findElements(Locators.LINK_LOOP_HEADER);
        }
    }

    @Test(priority = 2, enabled = isTest5, groups = {"user", "admin"})
    public void testPrettyWomenPagesTest4() {
        String actualTitle;
        String actualUrlPrettyWomen;
        List<WebElement> links = driver.findElements(Locators.LINK_LOOP_HEADER);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String title = links.get(i).getText();
            System.out.println(title);
            mainPage.perfomClick(links.get(i));
            if (title.startsWith("PR")) {
                mainPage.javaWaitSec(3);
                actualTitle = driver.findElement(Locators.LINK_TITLE).getText();
                actualUrlPrettyWomen = driver.getCurrentUrl();
                mainPage.getDropDownListByValue((Locators.MIN_AGE_DROPDOWN_LIST), Data.minage);
                mainPage.getDropDownListByValue((Locators.MAX_AGE_DROPDOWN_LIST), Data.maxage);
                wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_SEARCH));
                mainPage.perfomClick(driver.findElement(Locators.BUTTON_SEARCH));
                mainPage.javaWaitSec(1);
                Assert.assertEquals(Data.expectedTitleWomen, actualTitle);
                Assert.assertEquals(actualUrlPrettyWomen, Data.expectedUrlPrettyWomen);
            }
            driver.get(mainUrl);
            links = driver.findElements(Locators.LINK_LOOP_HEADER);
        }
    }

    @Test(priority = 3, enabled = isTest6, groups = {"ie", "user", "admin"})
    public void testPhotosGiftsPagesTest5() {
        String actualTitle;
        String actualUrlPhotos;
        List<WebElement> links = driver.findElements(Locators.LINK_LOOP_HEADER);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String title = links.get(i).getText();
            System.out.println(title);
            mainPage.perfomClick(links.get(i));
            if (title.endsWith("OS")) {
                mainPage.javaWaitSec(3);
                actualTitle = driver.findElement(Locators.LINK_TITLE).getText();
                actualUrlPhotos = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitlePhotos, actualTitle);
                Assert.assertEquals(actualUrlPhotos, Data.expectedUrlPhotos);
                mainPage.javaWaitSec(3);
                driver.findElement(Locators.LINK_LOOP_PHOTOS).isDisplayed();

            }
            if (title.contains("GIFTS")) {
                mainPage.javaWaitSec(3);
                mainPage.ajaxSendKeys(driver.findElement(Locators.LINK_TEXT_FIELD), (Data.inputsearch2));
                mainPage.perfomClick(driver.findElement(Locators.BUTTON_SEARCH_GIFT));
                mainPage.javaWaitSec(3);
                driver.findElement(Locators.LINK_BLOCK).isDisplayed();
            }
            driver.get(mainUrl);
            links = driver.findElements(Locators.LINK_LOOP_HEADER);
        }
    }

    @Test(priority = 4, enabled = isTest7, groups = {"user", "admin"})
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

    @Test(priority = 5, enabled = isTest8, groups = {"ie"})
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
