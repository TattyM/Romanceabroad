package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainTests extends BaseUI {
    public static final boolean isTest9 = true;
    public static final boolean isTest10 = true;
    public static final boolean isTest11 = true;
    public static final boolean isTest19 = true;


    @Test(priority = 1, enabled = isTest9, groups = {"user"})
    public void testSignInTest7() {
        String actualUrl;
        actualUrl = driver.getCurrentUrl();
        mainPage.clickValueOfList((Locators.LINK_LOOP_HEADER), "navbar-nav");
        mainPage.ajaxClick(driver.findElement(Locators.LINK_SIGN_IN));
        Assert.assertEquals(actualUrl, Data.expectedUrl);
        System.out.println("Log in form is displayed!");
    }

    @Test(priority = 2, enabled = isTest10, groups = {"ie", "user", "admin"})
    public void smokeTestMainPage() {
        List<WebElement> mainTabs = driver.findElements(Locators.LINK_LOOP);
        for (int i = 0; i < mainTabs.size(); i++) {
            mainTabs.get(i).click();
            driver.get(Data.mainUrl);
            mainTabs = driver.findElements(Locators.LINK_LOOP);
        }
    }

    @Test(priority = 3, enabled = isTest11, groups = {"user", "admin"})
    public void testBlogPageTest9() {
        String currentUrlBlog;
        mainPage.clickBlogPageLink();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        currentUrlBlog = driver.getCurrentUrl();
        System.out.println("Blog Page!");
        blogPage.perfomClick(driver.findElement(Locators.LINK_KHARKOV_AGENCY));
        Assert.assertEquals(currentUrlBlog, Data.expectedUrlBlog);

    }

    @Test(priority = 4, enabled = isTest19, groups = {"user", "admin"})
    public void testArticlesAndTitles() {
        String nameOfArticle;
        String titleOfArticle;
        mainPage.clickHowWeWorkPageLink();
        List<WebElement> linksOfArticles = blogPage.collectAllLinksOfArticles();

        for (int i = 0; i < linksOfArticles.size(); i++) {
            WebElement link = linksOfArticles.get(i);
            nameOfArticle = link.getText();
            if (nameOfArticle.contains("How it works")) {
            } else if (nameOfArticle.contains("Real Ukrainian brides")) {
            } else if (nameOfArticle.contains("Kharkov dating agency")) {
            } else if (nameOfArticle.contains("Kiev dating agency")) {
            } else if (nameOfArticle.contains("Odessa dating agency")) {
            } else if (nameOfArticle.contains("Mail order girls")) {
            } else if (nameOfArticle.contains("Beautiful urkainian girls")) {
            } else if (nameOfArticle.contains("Eastern European women")) {
            } else if (nameOfArticle.contains("Marriage agency in Ukraine")) {
            } else if (nameOfArticle.contains("Kiev dating site")) {
            } else if (nameOfArticle.contains("Find Ukrainian girlfriend")) {
            } else if (nameOfArticle.contains("Slavic women for marriage")) {
            } else if (nameOfArticle.contains("How to marry Ukrainian lady")) {
            } else if (nameOfArticle.contains("Free Ukrainian dating site")) {
            } else if (nameOfArticle.contains("9 Factors to Keep in Mind When Dating a Ukrainian Woman")) {
            } else if (nameOfArticle.contains("Is There a Difference Between Dating or Courting a Ukrainian Woman?")) {
            } else {
                link.click();
                titleOfArticle = blogPage.getAnyTitle();
                mainPage.javaWaitSec(5);
                Assert.assertEquals(nameOfArticle, titleOfArticle);
                linksOfArticles = blogPage.collectAllLinksOfArticles();
            }


        }
    }
}
