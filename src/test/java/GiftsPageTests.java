import org.testng.annotations.Test;


public class GiftsPageTests extends BaseUI {

    @Test
    public void testGifts() {
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
