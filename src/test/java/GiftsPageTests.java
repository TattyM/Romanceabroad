import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftsPageTests extends BaseUI {
    public static final boolean isTest1 = true;
    public static final boolean isTest2 = true;



    @Test(priority = 2,enabled = isTest1,groups = {"ie"})
    public void testGiftsIconPageTest1() {
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
    @Test(priority = 1,enabled = isTest2,groups = {"user","admin"})
    public void testGiftsBasketPageTest2() {
        mainPage.clickGiftsPageLink();
        String currentUrlGifts = driver.getCurrentUrl();
        System.out.println(currentUrlGifts);
        softAssert.assertEquals(currentUrlGifts, Data.expectedUrlGifts, "Url is wrong");
        mainPage.javaWaitSec(3);
        mainPage.perfomClick(driver.findElement(Locators.BLOCK_PRODUCT));
        mainPage.javaWaitSec(3);
        mainPage.perfomClick(driver.findElement(Locators.LINK_FRUITS));
        System.out.println("We can see product!");

    }

}

