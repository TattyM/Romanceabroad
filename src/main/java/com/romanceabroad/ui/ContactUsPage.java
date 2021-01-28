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
        Reports.log("Check Contact Us Page");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Reports.log("Click field reason");
        driver.findElement(Locators.TEXT_REASON).click();
        Reports.log("Select reason" + reason);
        clickValueOfList(Locators.SELECT_REASON, reason);
    }

    public void personalInfo(String name, String email) {
        Reports.log("Type user name" +name);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.SELECT_NAME).sendKeys(name);
        Reports.log("Wait for email field");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.SELECT_EMAIL)));
        Reports.log("Type user email" + email);
        driver.findElement(Locators.SELECT_EMAIL).sendKeys(email);
    }

    public void inputSubject(String subject, String message, String code) {
        Reports.log("Wait for subject field");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_SUBJECT)));
        Reports.log("Type subject in form" + subject);
        driver.findElement(Locators.TEXT_SUBJECT).sendKeys(subject);
        Reports.log("Type message in form" + message);
        driver.findElement(Locators.TEXT_MESSAGE).sendKeys(message);
        Reports.log("Type user code in form" + code);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_CODE).sendKeys(code);
        Reports.log("Select button Send");
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

