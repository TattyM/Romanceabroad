import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PrettyWomenDropdownListTests extends BaseUI {

    @Test
    public void testPrettyWomenPage() {
        mainPage.clickPrettyWomenLink();
        String currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlPrettyWomen);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        mainPage.getDropDownListByValue(driver.findElement(Locators.MIN_AGE_DROPDOWN_LIST), Data.minage);
        mainPage.getDropDownListByValue(driver.findElement(Locators.MAX_AGE_DROPDOWN_LIST), Data.maxage);
        searchPage.selectButtonNext();

    }

}

