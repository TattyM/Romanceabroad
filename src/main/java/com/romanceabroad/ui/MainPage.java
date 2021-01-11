package com.romanceabroad.ui;

import org.openqa.selenium.By;
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
        WebElement linkJoinToday = driver.findElement(Locators.LINK_JOIN_TODAY);
        linkJoinToday.click();
    }

    public void firstPartOfRegistration(String email, String password) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_EMAIL).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_PASSWORD)));
        driver.findElement(Locators.TEXT_PASSWORD).sendKeys(password);

    }

    public void clickButtonNext() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void secondPartOfRegistration(String username, String month, String day, String year, String phone, String town, String location) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_USERNAME).sendKeys(username);
        driver.findElement(Locators.SELECT_DAY).click();
        clickValueOfList(Locators.SELECT_DAY_NUMBER, day);
        driver.findElement(Locators.SELECT_MONTH).click();
        clickValueOfList(Locators.SELECT_MONTH_NAME, month);
        driver.findElement(Locators.SELECT_YEAR).click();
        clickValueOfList(Locators.SELECT_YEAR_NUMBER, year);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_PHONE)));
        driver.findElement(Locators.TEXT_PHONE).sendKeys(phone);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).clear();
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
        WebElement pagePhotos = driver.findElement(Locators.LINK_PHOTOS);
        pagePhotos.click();
    }

    public void clickSingInPageLink() {
        WebElement buttonSingIn = driver.findElement(Locators.LINK_SIGN_IN);
        buttonSingIn.click();
    }

    public void sendKeysEmailAndPassword(String email, String password) {
        driver.findElement(Locators.SIGN_IN_EMAIL).sendKeys(email);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.SIGN_IN_PASSWORD).sendKeys(password);
        driver.findElement(Locators.BUTTON_SING_IN).click();
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

