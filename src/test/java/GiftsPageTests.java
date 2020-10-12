import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class GiftsPageTests extends BaseUI {
    String currentUrlGifts;


    @Test
    public void testGiftsPage() {
        driver.findElement(Locators.LINK_GIFTS).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        currentUrlGifts = driver.getCurrentUrl();
        System.out.println(currentUrlGifts);
        Assert.assertEquals(currentUrlGifts, Data.expectedUrlGifts);

    }

}

