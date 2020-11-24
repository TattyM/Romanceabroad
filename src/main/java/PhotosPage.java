import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PhotosPage extends BaseActions {
    public PhotosPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void selectLanguageButton() {
        WebElement buttonРусский = driver.findElement(Locators.BUTTON_РУССКИЙ);
        buttonРусский.click();
    }

}
