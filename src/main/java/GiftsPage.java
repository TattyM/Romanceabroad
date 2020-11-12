import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GiftsPage extends BaseActions {
    public GiftsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void inputSearchGifts() {
        driver.findElement(Locators.LINK_TEXT_FIELD).sendKeys(Data.inputsearch);
    }

    public void clickButtonSearch() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.BUTTON_SEARCH_GIFT)));
        WebElement buttonSearch = driver.findElement(Locators.BUTTON_SEARCH_GIFT);
        buttonSearch.click();
    }

    public void selectProduct() {
        WebElement productBlock = driver.findElement(Locators.BLOCK_PRODUCT);
        if (productBlock.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_FRUITS));
            driver.findElement(Locators.LINK_FRUITS).click();
        }
    }

    public void selectProductDescription() {
        WebElement elementText = driver.findElement(Locators.TEXT_DESCRIPTION);
        if (elementText.isDisplayed()) {
            System.out.println("We can read description!");
        } else {
            System.out.println("We cannot read description!");

        }
    }
}
