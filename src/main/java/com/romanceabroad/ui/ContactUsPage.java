package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ContactUsPage extends BaseActions {
    public ContactUsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void selectReason(String reason) {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_REASON).click();
        clickValueOfList(Locators.SELECT_REASON, reason);
    }

    public void personalInfo(String name, String email) {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.SELECT_NAME).sendKeys(name);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.SELECT_EMAIL)));
        driver.findElement(Locators.SELECT_EMAIL).sendKeys(email);
    }

    public void inputSubject(String subject, String message, String code) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_SUBJECT)));
        driver.findElement(Locators.TEXT_SUBJECT).sendKeys(subject);
        driver.findElement(Locators.TEXT_MESSAGE).sendKeys(message);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_CODE).sendKeys(code);
        WebElement buttonSend = driver.findElement(Locators.BUTTON_SEND);
        buttonSend.click();
    }

    public void testContactUsForm() {
        driver.findElement(Locators.TEXT_REASON).click();
        clickValueOfList(Locators.SELECT_REASON, Data.reason);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.SELECT_NAME).sendKeys(Data.name);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.SELECT_EMAIL)));
        driver.findElement(Locators.SELECT_EMAIL).sendKeys(Data.email1);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_SUBJECT)));
        driver.findElement(Locators.TEXT_SUBJECT).sendKeys(Data.subject);
        driver.findElement(Locators.TEXT_MESSAGE).sendKeys(Data.message);
        driver.findElement(Locators.TEXT_CODE).sendKeys(Data.code);
        driver.findElement(Locators.BUTTON_SEND).click();

    }

}

