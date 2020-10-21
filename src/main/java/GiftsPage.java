import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class GiftsPage extends BaseActions {
    public GiftsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickButtonQuickView() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String currentUrlGifts = driver.getCurrentUrl();
        System.out.println(currentUrlGifts);
        Assert.assertEquals(currentUrlGifts, Data.expectedUrlGifts);
        WebElement buttonQuickView = driver.findElement(Locators.BUTTON_QUICK_VIEW);
        buttonQuickView.click();
    }

    public void inputSearchGifts() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(Locators.LINK_TEXT_FIELD).sendKeys(Data.inputsearch);
    }

    public void clickButtonSearch() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.BUTTON_SEARCH_GIFT)));
        WebElement buttonSearch = driver.findElement(Locators.BUTTON_SEARCH_GIFT);
        buttonSearch.click();
    }
}
