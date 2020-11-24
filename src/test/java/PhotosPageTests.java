import org.testng.Assert;
import org.testng.annotations.Test;


public class PhotosPageTests extends BaseUI {


    @Test
    public void testPhotosPage() {
        mainPage.clickPhotosPageLink();
        mainPage.javaWaitSec(3);
        String currentUrlPhotos = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlPhotos, Data.expectedUrlPhotos);
        mainPage.perfomClick(driver.findElement(Locators.BUTTON_ALBUMS));
        mainPage.javaWaitSec(3);
        photosPage.selectLanguageButton();
        System.out.println(" Язык страницы - Русский !");
    }
}