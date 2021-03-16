package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class MainPage extends BaseActions {
    @FindBy(xpath = "//a[(text()='JOIN TODAY!')]")
    WebElement buttonJoinToday;
    @FindBy(xpath = "//input[@id='email']")
    WebElement fieldEmail;
    @FindBy(xpath = "//input[@id='password']")
    WebElement fieldPassword;
    @FindBy(xpath = "//button[@type='button'][normalize-space()='Next']")
    WebElement buttonNext;
    @FindBy(xpath = "//input[@id='nickname']")
    WebElement fieldNickname;
    @FindBy(xpath = "//div[@id='daySelect']//a[@class='btn btn-default dropdown-toggle btn-lg btn-block']")
    WebElement fieldDay;
    @FindBy(xpath = "//div[@id='monthSelect']//a[@class='btn btn-default dropdown-toggle btn-lg btn-block']")
    WebElement fieldMonth;
    @FindBy(xpath = "//div[@id='yearSelect']//a[@class='btn btn-default dropdown-toggle btn-lg btn-block']")
    WebElement fieldYear;
    @FindBy(xpath = "//input[@type='text'][@name='data[phone]']")
    WebElement fieldPhone;
    @FindBy(xpath = "//input[@name='region_name']")
    WebElement fieldAutofillingForm;


    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void clickJoinTodayButton() {
        Reports.log("Click JoinToday button");
        WebElement linkJoinToday = buttonJoinToday;
        linkJoinToday.click();
    }


    public void firstPartOfRegistration(String email, String password) {
        Reports.log("Wait visibility of Email field");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(fieldEmail));

        Reports.log("Type Email in text field : " + email);
        fieldEmail.sendKeys(email);

        Reports.log("Wait visibility of Password field");
        wait.until(ExpectedConditions.visibilityOf(fieldPassword));

        Reports.log("Type Password  in field : " + password);
        fieldPassword.sendKeys(password);

    }

    public void clickButtonNext() {
        Reports.log("Wait Next button");
        wait.until(ExpectedConditions.elementToBeClickable(buttonNext));

        Reports.log("Click Next button");
        buttonNext.click();
    }

    public void secondPartOfRegistration(String username, String month, String day, String year, String phone, String town, String location) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Reports.log("Type username: " + username);
        fieldNickname.sendKeys(username);

        Reports.log("Click list of days");
        fieldDay.click();

        Reports.log("Select specific day: " + day);
        clickValueOfList(Locators.SELECT_DAY_NUMBER, day);

        Reports.log("Click list of months");
        fieldMonth.click();

        Reports.log("Select specific month: " + month);
        clickValueOfList(Locators.SELECT_MONTH_NAME, month);

        Reports.log("Click list of years");
        fieldYear.click();

        Reports.log("Select specific month: " + year);
        clickValueOfList(Locators.SELECT_YEAR_NUMBER, year);

        Reports.log("Wait for phone field");
        wait.until(ExpectedConditions.visibilityOf(fieldPhone));

        Reports.log("Type phone number: " + phone);
        fieldPhone.sendKeys(phone);

        Reports.log("Clean location autofilling form");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        fieldAutofillingForm.clear();

        Reports.log("Type any of town: " + town);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        fieldAutofillingForm.sendKeys(town);

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

    public void sendKeysPassword(String password,boolean requirement){
        driver.findElement(Locators.SIGN_IN_EMAIL).sendKeys(Data.email1);
        driver.findElement(Locators.SIGN_IN_PASSWORD).sendKeys(password);
        driver.findElement(Locators.BUTTON_SING_IN).click();
        if(!requirement){
            Assert.assertTrue(driver.findElement(Locators.TEXT_ERROR_MESSAGE).isDisplayed());
        }
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
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.EMAIL_FIELD).sendKeys(Data.email2);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.PASSWORD_FIELD).sendKeys(Data.password);
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

    public void clickMobileMenu(String valueOfBox) {
        if (valueOfBox.contains("mobile")) {
            driver.findElement(Locators.MOBILE_MENU).click();
        }
    }

    public void clickMobileMenu() {
        try {
            driver.findElement(Locators.MOBILE_MENU).click();
        } catch (Exception e) {
        }
    }

    public void clickMobileMenu2() {
        if (driver.findElement(Locators.MOBILE_MENU).isDisplayed()) {
            driver.findElement(Locators.MOBILE_MENU).click();
        }
    }

    public void clickMobileMenu3() {
        if (driver.findElements(Locators.MOBILE_MENU).size() > 1) {
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.findElement(Locators.MOBILE_MENU).click();
        }
    }

}