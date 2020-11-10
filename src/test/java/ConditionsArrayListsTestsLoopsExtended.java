import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class ConditionsArrayListsTestsLoopsExtended extends BaseUI {


    @Test
    public void test1() {       //ConditionsWebElements1
        Assert.assertTrue(driver.findElement(Locators.LINK_TOUR_TO).isDisplayed(), "Link is not displayed!");
        WebElement pageTourTo = driver.findElement(Locators.LINK_TOUR_TO);
        if (pageTourTo.getText().contains("TOUR TO UKRAINE") || pageTourTo.isDisplayed()) {
            pageTourTo.click();
            System.out.println("We can see the page!");
        } else {
            Assert.fail("!!!!!!");
        }
    }


    @Test
    public void test2() {        //ConditionsWebElements2
        WebElement pageGifts = driver.findElement(Locators.LINK_GIFTS);
        pageGifts.click();
        String currentUrlGifts = driver.getCurrentUrl();
        System.out.println(currentUrlGifts);
        softAssert.assertEquals(currentUrlGifts, Data.expectedUrlGifts, "Url is wrong");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement productBlock = driver.findElement(Locators.BLOCK_PRODUCT);
        if (productBlock.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_FRUITS));
            driver.findElement(Locators.LINK_FRUITS).click();
        }
        WebElement elementText = driver.findElement(Locators.TEXT_DESCRIPTION);
        if (elementText.isDisplayed()) {
            System.out.println("We can read description!");
        } else {
            System.out.println("We cannot read description!");

        }

    }

    @Test
    public void test3() {         //ArraysWebElements
        List<WebElement> mainLinks = driver.findElements(Data.tagName);
        for (WebElement mainCurrentLinks : mainLinks) {
            String mainLinkText = mainCurrentLinks.getText();
            System.out.println(mainLinkText);

        }
    }

    @Test
    public void test4() {         //LoopWebElements1
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement pageBlog = driver.findElement(Locators.LINK_BLOG);
        pageBlog.click();
        String currentUrlBlog = driver.getCurrentUrl();
        System.out.println("Blog Page!");
        softAssert.assertEquals(currentUrlBlog, Data.expectedUrlBlog, "Wrong Url!");
        List<WebElement> links = driver.findElements(Locators.BLOCK_LIST);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            System.out.println(links.get(i).getText());
        }
    }

    @Test
    public void test5() {          //LoopWebElements2
        WebElement pagePrettyWomen = driver.findElement(Locators.LINK_PRETTY_WOMEN);
        pagePrettyWomen.click();
        String currentUrlSearch = driver.getCurrentUrl();
        softAssert.assertEquals(currentUrlSearch, Data.expectedUrlPrettyWomen, "Cannot find the page!");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        List<WebElement> links = driver.findElements(Locators.BLOCK_FOOTER);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String categories = links.get(i).getText();
            System.out.println(categories);


        }
    }
}

