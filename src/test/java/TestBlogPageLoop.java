import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestBlogPageLoop extends BaseUI{
    @Test
    public void testBlogPageLoop() {
        String actualUrlBlog;
        String actualUrlBlogPage;
        String actualTitle;
        mainPage.perfomClick(driver.findElement(Locators.LINK_BLOG));
        mainPage.javaWaitSec(3);
        String currentUrlBlog = driver.getCurrentUrl();
        softAssert.assertEquals(currentUrlBlog, Data.expectedUrlBlog, "Don't see page!");
        List<WebElement> links = driver.findElements(Locators.BLOCK_LIST);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String title = links.get(i).getText();
            System.out.println(title);
            mainPage.javaWaitSec(5);
            (links.get(i)).click();               //ajaxClick(); performClick(); doesn't work for me in this particular test case
            if (title.startsWith("Bl")) {
                actualUrlBlog = driver.getCurrentUrl();
                driver.findElement(Locators.LINK_TEXT_BLOCK).isDisplayed();
                Assert.assertEquals(actualUrlBlog, Data.expectedUrlBlog);
            }
            if (title.contains("9 Factors")) {
                actualUrlBlogPage = driver.getCurrentUrl();
                mainPage.javaWaitSec(5);
                driver.findElement(Locators.LINK_PHOTOS_GIRLS).isDisplayed();
                driver.findElement(Locators.LINK_TEXT_TITLE).isDisplayed();
                Assert.assertEquals(actualUrlBlogPage, Data.expectedUrlBlogPage);
            }
            driver.getCurrentUrl();
            links = driver.findElements(Locators.BLOCK_LIST);
        }
    }
}
