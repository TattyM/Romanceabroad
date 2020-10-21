import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class SearchPage extends BaseActions {
    public SearchPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public void selectMinAge() {
        String currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlPrettyWomen);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement minAgeDropDownList = driver.findElement(Locators.MIN_AGE_DROPDOWN_LIST);
        getDropDownListByValue(minAgeDropDownList, Data.minage);
    }

    public void selectMaxAge() {
        WebElement maxAgeDropDownList = driver.findElement(Locators.MAX_AGE_DROPDOWN_LIST);
        getDropDownListByValue(maxAgeDropDownList, Data.maxage);
    }

    public void selectButtonNext() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_SEARCH));
        driver.findElement(Locators.BUTTON_SEARCH).click();

    }
}




