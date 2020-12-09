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
    public void clickButtonNext(){
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
