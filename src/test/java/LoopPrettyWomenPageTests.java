import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoopPrettyWomenPageTests extends BaseUI{
    @Test
    public void testPrettyWomenPages() {
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
}
