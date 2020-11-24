import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestPrettyWomenPageLoop extends BaseUI{
    @Test
    public void testPrettyWomenPageLoop() {
        String currentUrlSearch;
        mainPage.perfomClick(driver.findElement(Locators.LINK_PRETTY_WOMEN));
        currentUrlSearch = driver.getCurrentUrl();
        softAssert.assertEquals(currentUrlSearch, Data.expectedUrlPrettyWomen, "Cannot find the page!");
        mainPage.javaWaitSec(3);
        List<WebElement> links = driver.findElements(Locators.LINK_LOOP_FOOTER);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String categories = links.get(i).getText();
            System.out.println(categories);
            mainPage.javaWaitSec(5);
            mainPage.ajaxClick(links.get(i));
            if (categories.contains("2")) {
                mainPage.javaWaitSec(5);
                driver.findElement(Locators.BLOCK_TITLE).isDisplayed();
                if (currentUrlSearch.contains("#")) {
                    Assert.fail("Not a good Url!!!");
                } else {
                    System.out.println("It is a good Url!!!");
                }
            }
            if (categories.contains("4")) {
                mainPage.javaWaitSec(3);
                mainPage.getDropDownListByValue(Locators.DROPDOWN_LIST, Data.select);
                driver.findElement(Locators.BLOCK_TITLE).isDisplayed();
                mainPage.javaWaitSec(5);
                Assert.assertEquals(currentUrlSearch, Data.expectedUrlPrettyWomen2);
            }
            driver.getCurrentUrl();
            links = driver.findElements(Locators.LINK_LOOP_FOOTER);
        }
    }
}
