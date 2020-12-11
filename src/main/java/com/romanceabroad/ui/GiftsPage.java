package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GiftsPage extends BaseActions {
    public GiftsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void clickButtonSearch() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.BUTTON_SEARCH_GIFT)));
        WebElement buttonSearch = driver.findElement(Locators.BUTTON_SEARCH_GIFT);
        buttonSearch.click();
    }
}
