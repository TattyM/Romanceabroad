import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchPage extends BaseActions {
    public SearchPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public void selectButtonNext() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_SEARCH));
        driver.findElement(Locators.BUTTON_SEARCH).click();

    }
}




