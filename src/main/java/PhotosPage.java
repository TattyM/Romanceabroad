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
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String currentUrlPhotos = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlPhotos, Data.expectedUrlPhotos);
        WebElement buttonAlbums = driver.findElement(Locators.BUTTON_ALBUMS);
        buttonAlbums.click();
    }

    public void selectLanguageButton() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_РУССКИЙ));
        WebElement buttonРусский = driver.findElement(Locators.BUTTON_РУССКИЙ);
        buttonРусский.click();
        System.out.println(" Язык страницы - Русский !");
    }

    public void clickIconGifts() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String currentUrlPhotos = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlPhotos, Data.expectedUrlGiftsSearch);
        WebElement iconGifts = driver.findElement(Locators.LINK_ICON_GIFTS);
        iconGifts.click();
    }

}
