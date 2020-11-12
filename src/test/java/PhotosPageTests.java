import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PhotosPageTests extends BaseUI {


    @Test
    public void testPhotosPage() {
        mainPage.clickPhotosPageLink();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String currentUrlPhotos = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlPhotos, Data.expectedUrlPhotos);
        photosPage.clickAlbumsButton();
        photosPage.selectLanguageButton();
        System.out.println(" Язык страницы - Русский !");
    }
}