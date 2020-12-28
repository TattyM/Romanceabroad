package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class BlogPage extends BaseActions {
    public BlogPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickLinkKharkovAgency() {
        driver.findElement(Locators.LINK_KHARKOV_AGENCY).click();
    }

    public List<WebElement> collectAllLinksOfArticles() {   //method for return
        List<WebElement> linksOfArticles = driver.findElements(Locators.LINK_OF_ARTICLES);
        return linksOfArticles;

    }
}



