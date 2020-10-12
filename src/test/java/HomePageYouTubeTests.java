import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class HomePageYouTubeTests extends BaseUI {
    String currentUrlYouTube;

    @Test
    public void testYoutubePage() {
        driver.findElement(Locators.LINK_YOUTUBE).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        currentUrlYouTube = driver.getCurrentUrl();
        System.out.println(currentUrlYouTube);
        Assert.assertEquals(currentUrlYouTube, Data.expectedUrlYoutube);
    }
}
