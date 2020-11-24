import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage extends BaseActions {
    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void clickJoinTodayButton() {
        WebElement linkJoinToday = driver.findElement(Locators.LINK_JOIN_TODAY);
        linkJoinToday.click();

    }

    public void partOfRegistration() {
        driver.findElement(Locators.SELECT_DAY).click();
        driver.findElement(Locators.SELECT_DAY_NUMBER).click();
        driver.findElement(Locators.SELECT_MONTH).click();
        driver.findElement(Locators.SELECT_MONTH_NAME).click();
        driver.findElement(Locators.SELECT_YEAR).click();
        driver.findElement(Locators.SELECT_YEAR_NUMBER).click();

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
