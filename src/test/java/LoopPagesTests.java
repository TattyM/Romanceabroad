import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoopPagesTests extends BaseUI {
    public static final boolean isTest6 = false;
    public static final boolean isTest7 = false;
    public static final boolean isTest8 = true;

    @Test(priority = 1, enabled = isTest6, groups = {"ie"})
    public void testLoopPhotosPageTest6() {
        List<WebElement> list = driver.findElements(Locators.LINK_LINKS);
        for (int i = 0; i < list.size(); i++) {
            if (i == 4) {
                mainPage.ajaxClick(driver.findElement(Locators.LINK_HOME));
                mainPage.javaWaitSec(1);
                mainPage.checkLinksOnWebPage("//img", "src");
            }
        }
    }

    @Test(priority = 2, enabled = isTest7, groups = {"ie", "user", "admin"})
    public void testLoopSignInTest7() {
        String actualUrl;
        actualUrl = driver.getCurrentUrl();
        mainPage.clickValueOfList((Locators.LINK_LOOP_HEADER), "navbar-nav");
        mainPage.ajaxClick(driver.findElement(Locators.LINK_SIGN_IN));
        Assert.assertEquals(actualUrl, Data.expectedUrl);
        System.out.println("Log in form is displayed!");
    }

    @Test (priority = 3,enabled = isTest8,groups = {"user"})
       public void smokeTestMainPage(){
           List<WebElement> mainTabs = driver.findElements(Locators.LINK_LOOP);
        for (int i = 0; i < mainTabs.size(); i++) {
            mainTabs.get(i).click();
            driver.get(Data.mainUrl);
            mainTabs = driver.findElements(Locators.LINK_LOOP);

        }

       }
}
