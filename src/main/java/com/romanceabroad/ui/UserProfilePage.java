package com.romanceabroad.ui;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class UserProfilePage extends BaseActions {
    public UserProfilePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void verifyLoginForm(String email1, String password) {
        WebElement buttonLogin = driver.findElement(Locators.USER_LOGIN);
        buttonLogin.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.USER_FORM_EMAIL).sendKeys(email1);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.USER_FORM_PASSWORD)));
        driver.findElement(Locators.USER_FORM_PASSWORD).sendKeys(password);
        driver.findElement(Locators.USER_FORM_SING_IN).click();
    }

    public void verifySendItemsTabs() {
        driver.get(Data.expectedUrlUserProfile);
        driver.findElement(Locators.BUTTON_MENU).click();
        driver.findElement(Locators.LINK_DONATE).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(Locators.BUTTON_CLOSE_FORM ).click();
        System.out.println("Log in form is displayed!");
    }

    public void verifyFindPeopleButton() {
        driver.findElement(Locators.USER_FIND_PEOPLE).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }
}
