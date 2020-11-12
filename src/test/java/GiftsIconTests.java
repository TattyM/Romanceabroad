import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class GiftsIconTests extends BaseUI {


    @Test
    public void testGiftsSearchPage() {
        mainPage.clickPhotosPageLink();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String currentUrlPhotos = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlPhotos, Data.expectedUrlGiftsSearch);
        photosPage.clickIconGifts();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        giftsPage.inputSearchGifts();
        giftsPage.clickButtonSearch();
    }

}

