import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoopMainPagesTests extends BaseUI {
    public static final boolean isTest3 = true;
    public static final boolean isTest4 = true;
    public static final boolean isTest5 = true;


    @Test(priority = 2, enabled = isTest3, groups = {"ie", "admin"})
    public void testHowWeWorkTourToPagesTest3() {
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

    @Test(priority = 4, enabled = isTest4, groups = {"user", "admin"})
    public void testPrettyWomenPagesTest4() {
        String actualTitle;
        String actualUrlPrettyWomen;
        List<WebElement> links = driver.findElements(Locators.LINK_LOOP_HEADER);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String title = links.get(i).getText();
            System.out.println(title);
            mainPage.perfomClick(links.get(i));
            if (title.startsWith("PR")) {
                mainPage.javaWaitSec(3);
                actualTitle = driver.findElement(Locators.LINK_TITLE).getText();
                actualUrlPrettyWomen = driver.getCurrentUrl();
                mainPage.getDropDownListByValue((Locators.MIN_AGE_DROPDOWN_LIST), Data.minage);
                mainPage.getDropDownListByValue((Locators.MAX_AGE_DROPDOWN_LIST), Data.maxage);
                wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_SEARCH));
                mainPage.perfomClick(driver.findElement(Locators.BUTTON_SEARCH));
                mainPage.javaWaitSec(1);
                Assert.assertEquals(Data.expectedTitleWomen, actualTitle);
                Assert.assertEquals(actualUrlPrettyWomen, Data.expectedUrlPrettyWomen);
            }
            driver.get(mainUrl);
            links = driver.findElements(Locators.LINK_LOOP_HEADER);
        }
    }

    @Test(priority = 1, enabled = isTest5, groups = {"ie", "user", "admin"})
    public void testPhotosGiftsPagesTest5() {
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
