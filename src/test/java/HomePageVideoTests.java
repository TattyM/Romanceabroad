import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePageVideoTests extends BaseUI {


    @Test
    public void testHomePage() throws InterruptedException {
        Thread.sleep(3000);
        WebElement element = driver.findElement(Locators.LINK_YOUTUBE_VIDEO);
        driver.switchTo().frame(element);
        driver.findElement(Locators.BUTTON_PLAY).click();
        driver.switchTo().parentFrame();
    }
}
