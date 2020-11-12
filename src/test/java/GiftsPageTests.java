import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class GiftsPageTests extends BaseUI {

    @Test
    public void testGifts() {
        mainPage.clickGiftsPageLink();
        String currentUrlGifts = driver.getCurrentUrl();
        System.out.println(currentUrlGifts);
        softAssert.assertEquals(currentUrlGifts, Data.expectedUrlGifts, "Url is wrong");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        giftsPage.selectProduct();
        giftsPage.selectProductDescription();

    }
}
