import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoopHowWeWorkTourToPagesTests extends BaseUI {

        @Test
        public void testHowWeWorkTourToPages() {
        String actualTitle;
        String actualUrlHowWeWork;
        String actualUrlTourTo;
        List<WebElement> links = driver.findElements(Locators.LINK_LOOP_HEADER);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String title = links.get(i).getText();
            System.out.println(title);
            mainPage.ajaxClick(links.get(i));
            if (title.contains("WORK")) {
                mainPage.javaWaitSec(3);
                actualTitle = driver.findElement(Locators.LINK_TITLE).getText();
                actualUrlHowWeWork = driver.getCurrentUrl();
                mainPage.ajaxScroll(driver.findElement(Locators.PAGE_FOOTER));
                mainPage.javaWaitSec(5);
                Assert.assertEquals(Data.expectedTitleWork, actualTitle);
                mainPage.javaWaitSec(5);
                Assert.assertEquals(actualUrlHowWeWork, Data.expectedUrlHowWeWork);
                if (actualUrlHowWeWork.contains("#")) {
                    Assert.fail("It contains #");
                } else {
                    System.out.println("It is a good Url!");
                }
            }
            if (title.contains("TOURS TO ")) {
                mainPage.javaWaitSec(3);
                actualTitle = driver.findElement(Locators.LINK_TITLE).getText();
                actualUrlTourTo = driver.getCurrentUrl();
                driver.findElement(Locators.LINK_PHOTOS_TOUR).isDisplayed();
                driver.findElement(Locators.LINK_PHOTOS_CAROUSEL).isDisplayed();
                Assert.assertEquals(Data.expectedTitleTour, actualTitle);
                Assert.assertEquals(actualUrlTourTo, Data.expectedUrlTourTo);
            }
            mainPage.javaWaitSec(5);
            driver.get(mainUrl);
            links = driver.findElements(Locators.LINK_LOOP_HEADER);
        }
    }
}
