package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class MainPage extends BaseActions {
    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void clickJoinTodayButton() {
        Reports.log("Click JoinToday button");
        WebElement linkJoinToday = driver.findElement(Locators.LINK_JOIN_TODAY);
        linkJoinToday.click();
    }

    public void firstPartOfRegistration(String email, String password) {
        Reports.log("Wait visibility of Email field");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_EMAIL)));

        Reports.log("Type Email in text field : " + email);
        driver.findElement(Locators.TEXT_EMAIL).sendKeys(email);

        Reports.log("Wait visibility of Password field");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_PASSWORD)));

        Reports.log("Type Password  in field : " + password);
        driver.findElement(Locators.TEXT_PASSWORD).sendKeys(password);

    }

    public void clickButtonNext() {
        Reports.log("Wait Next button");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));

        Reports.log("Click Next button");
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void secondPartOfRegistration(String username, String month, String day, String year, String phone, String town, String location) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Reports.log("Type username: " + username);
        driver.findElement(Locators.TEXT_USERNAME).sendKeys(username);

        Reports.log("Click list of days");
        driver.findElement(Locators.SELECT_DAY).click();

        Reports.log("Select specific day: " + day);
        clickValueOfList(Locators.SELECT_DAY_NUMBER, day);

        Reports.log("Click list of months");
        driver.findElement(Locators.SELECT_MONTH).click();

        Reports.log("Select specific month: " + month);
        clickValueOfList(Locators.SELECT_MONTH_NAME, month);

        Reports.log("Click list of years");
        driver.findElement(Locators.SELECT_YEAR).click();

        Reports.log("Select specific month: " + year);
        clickValueOfList(Locators.SELECT_YEAR_NUMBER, year);

        Reports.log("Wait for phone field");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_PHONE)));

        Reports.log("Type phone number: " + phone);
        driver.findElement(Locators.TEXT_PHONE).sendKeys(phone);

        Reports.log("Clean location autofilling form");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).clear();

        Reports.log("Type any of town: " + town);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).sendKeys(town);

        clickValueOfList(Locators.LIST_VALUE_LOCATION, location);
    }

    public void clickHowWeWorkPageLink() {

        driver.findElement(Locators.LINK_HOW_WE_WORK).click();
    }

    public void clickGiftsPageLink() {
        WebElement pageGifts = driver.findElement(Locators.LINK_GIFTS);
        pageGifts.click();
    }

    public void clickBlogPageLink() {
        WebElement pageBlog = driver.findElement(Locators.LINK_BLOG);
        pageBlog.click();
    }

    public void clickPhotosPageLink() {
        Reports.log("Click Photo page");
        WebElement pagePhotos = driver.findElement(Locators.LINK_PHOTOS);
        pagePhotos.click();
    }

    public void clickSingInPageLink() {
        WebElement buttonSingIn = driver.findElement(Locators.LINK_SIGN_IN);
        buttonSingIn.click();
    }

    public void sendKeysEmailAndPassword(String email, String password) {
        Reports.log("Type user email" + email);
        driver.findElement(Locators.SIGN_IN_EMAIL).sendKeys(email);
        Reports.log("Type user password" + password);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.SIGN_IN_PASSWORD).sendKeys(password);
        Reports.log("Click sing in button");
        driver.findElement(Locators.BUTTON_SING_IN).click();
        Reports.log("Check presents of error massage");
        WebElement errorAlert = driver.findElement(Locators.TEXT_ERROR_MESSAGE);
        if (errorAlert.isDisplayed()) {
            System.out.println("Error massage is displayed!");
        }
    }

    public void testSingInForm() {
        driver.findElement(Locators.LINK_LOGIN_FORM).click();
        driver.findElement(Locators.TEXT_EMAIL).sendKeys(Data.email2);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.SING_IN_BUTTON).click();
        WebElement errorAlert = driver.findElement(Locators.TEXT_ERROR_MESSAGE);
        if (errorAlert.isDisplayed()) {
            System.out.println("---Error massage is displayed!---");
        }
    }

    public void verifyLinkPageContent() {
        WebElement linkPage = driver.findElement(Locators.LINK_PAGE_CONTENT);
        linkPage.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void linkSingInStartPage() {
        driver.findElement(Locators.LINK_SING_IN_FORM).click();
        System.out.println("---Registration form is displayed!---");
    }

    public void testRegistrationFormStartPage() {
        driver.findElement(Locators.BUTTON_GENDER).click();
        driver.findElement(Locators.INPUT_USERNAME).sendKeys(Data.name);
        driver.findElement(Locators.INPUT_EMAIL).sendKeys(Data.email1);
        driver.findElement(Locators.INPUT_PASSWORD).sendKeys(Data.password);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        getDropDownListByValue(Locators.INPUT_DAY, Data.day1);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        getDropDownListByValue(Locators.INPUT_MONTH, Data.month1);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        getDropDownListByValue(Locators.INPUT_YEAR, Data.year1);
        clickUnselectedCheckbox(Locators.SELECT_CHECKBOX);
        driver.findElement(Locators.INPUT_SUBMIT).click();
    }
}

