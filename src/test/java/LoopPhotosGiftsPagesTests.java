import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoopPhotosGiftsPagesTests extends BaseUI {
    @Test
    public void testPhotosGiftsPages() {
        String actualTitle;
        String actualUrlPhotos;
        List<WebElement> links = driver.findElements(Locators.LINK_LOOP_HEADER);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String title = links.get(i).getText();
            System.out.println(title);
            mainPage.perfomClick(links.get(i));
            if (title.endsWith("OS")) {
                mainPage.javaWaitSec(3);
                actualTitle = driver.findElement(Locators.LINK_TITLE).getText();
                actualUrlPhotos = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitlePhotos, actualTitle);
                Assert.assertEquals(actualUrlPhotos, Data.expectedUrlPhotos);
                mainPage.javaWaitSec(3);
                driver.findElement(Locators.LINK_LOOP_PHOTOS).isDisplayed();

            }
            if (title.contains("GIFTS")) {
                mainPage.javaWaitSec(3);
                mainPage.ajaxSendKeys(driver.findElement(Locators.LINK_TEXT_FIELD), (Data.inputsearch2));
                mainPage.perfomClick(driver.findElement(Locators.BUTTON_SEARCH_GIFT));
                mainPage.javaWaitSec(3);
                driver.findElement(Locators.LINK_BLOCK).isDisplayed();
            }
            driver.get(mainUrl);
            links = driver.findElements(Locators.LINK_LOOP_HEADER);
        }
    }
}