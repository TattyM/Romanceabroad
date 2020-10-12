import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class PrettyWomenDropdownListTests extends BaseUI {
    String currentUrlSearch;

    @Test
    public void testPrettyWomenPage() {
        driver.findElement(Locators.LINK_PRETTY_WOMEN).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlPrettyWomen);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Select minAgeDropdown = new Select(driver.findElement(Locators.MIN_AGE_DROPDOWN_LIST));
        minAgeDropdown.selectByValue(Data.minage);
        Select maxAgeDropdown = new Select(driver.findElement(Locators.MAX_AGE_DROPDOWN_LIST));
        maxAgeDropdown.selectByValue(Data.maxage);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_SEARCH));
        driver.findElement(Locators.BUTTON_SEARCH).click();

    }
}

