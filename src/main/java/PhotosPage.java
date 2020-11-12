import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class PhotosPage extends BaseActions {
    public PhotosPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickAlbumsButton() {
        WebElement buttonAlbums = driver.findElement(Locators.BUTTON_ALBUMS);
        buttonAlbums.click();
    }

    public void selectLanguageButton() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_РУССКИЙ));
        WebElement buttonРусский = driver.findElement(Locators.BUTTON_РУССКИЙ);
        buttonРусский.click();
    }

    public void clickIconGifts() {
        WebElement iconGifts = driver.findElement(Locators.LINK_ICON_GIFTS);
        iconGifts.click();
    }

}
