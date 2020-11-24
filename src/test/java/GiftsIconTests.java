import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftsIconTests extends BaseUI {


    @Test
    public void testGiftsSearchPage() {
        mainPage.clickPhotosPageLink();
        mainPage.javaWaitSec(3);
        String currentUrlPhotos = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlPhotos, Data.expectedUrlGiftsSearch);
        driver.findElement(Locators.LINK_ICON_GIFTS).click();
        mainPage.javaWaitSec(3);
        mainPage.ajaxSendKeys(driver.findElement(Locators.LINK_TEXT_FIELD),Data.inputsearch);
        giftsPage.clickButtonSearch();
        mainPage.verifyLinkActive(Data.expectedUrlTeddy);
    }

}

