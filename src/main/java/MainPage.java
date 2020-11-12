import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;


public class MainPage extends BaseActions {
    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void clickJoinTodayButton() {
        WebElement linkJoinToday = driver.findElement(Locators.LINK_JOIN_TODAY);
        linkJoinToday.click();

    }

    public void firstPartOfRegistration() {
        driver.findElement(Locators.TEXT_EMAIL).sendKeys(Data.email);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_PASSWORD)));
        driver.findElement(Locators.TEXT_PASSWORD).sendKeys(Data.password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void secondPartOfRegistration() {
        driver.findElement(Locators.TEXT_USERNAME).sendKeys(generateNewNumber(Data.username, 6));
        driver.findElement(Locators.SELECT_DAY).click();
        driver.findElement(Locators.SELECT_DAY_NUMBER).click();
        driver.findElement(Locators.SELECT_MONTH).click();
        driver.findElement(Locators.SELECT_MONTH_NAME).click();
        driver.findElement(Locators.SELECT_YEAR).click();
        driver.findElement(Locators.SELECT_YEAR_NUMBER).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_PHONE)));
        driver.findElement(Locators.TEXT_PHONE).sendKeys(Data.phone);

    }

    public void checkboxConfirmation() {
        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRM);
        if (!driver.findElement(Locators.LINK_JOIN_TODAY).isSelected()) {
            checkboxConfirmation.click();
        } else {
            Assert.fail("Checkbox is selected!");
        }
    }

    public void clickGiftsPageLink() {
        WebElement pageGifts = driver.findElement(Locators.LINK_GIFTS);
        pageGifts.click();

    }

    public void clickPrettyWomenLink() {
        WebElement pagePrettyWomen = driver.findElement(Locators.LINK_PRETTY_WOMEN);
        pagePrettyWomen.click();
    }

    public void clickBlogPageLink() {
        WebElement pageBlog = driver.findElement(Locators.LINK_BLOG);
        pageBlog.click();
    }

    public void clickPhotosPageLink() {
        WebElement pagePhotos = driver.findElement(Locators.LINK_PHOTOS);
        pagePhotos.click();
    }

}
