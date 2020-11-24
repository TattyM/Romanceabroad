import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class LoopPagesTests extends BaseUI{

    @Test
    public void testLoopPhotosPage() {
        List<WebElement> list = driver.findElements(Locators.LINK_LINKS);
        for (int i = 0; i < list.size(); i++) {
            if (i == 4) {
                mainPage.ajaxClick(driver.findElement(Locators.LINK_HOME));
                mainPage.javaWaitSec(1);
                mainPage.checkLinksOnWebPage("//img", "src");
            }
        }
    }

    @Test
    public void testLoopSignIn() {
        String actualUrl;
        actualUrl = driver.getCurrentUrl();
        mainPage.clickValueOfList((Locators.LINK_LOOP_HEADER), "navbar-nav");
        mainPage.ajaxClick(driver.findElement(Locators.LINK_SIGN_IN));
        Assert.assertEquals(actualUrl, Data.expectedUrl);
        System.out.println("Log in form is displayed!");
    }
}
