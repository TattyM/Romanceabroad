import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class HomePageJoinTodayTests extends BaseUI {


    @Test
    public void testJoinToday() {
        WebElement linkJoinToday = driver.findElement(Locators.LINK_JOIN_TODAY);
        linkJoinToday.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_EMAIL).sendKeys(Data.email);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_PASSWORD)));
        driver.findElement(Locators.TEXT_PASSWORD).sendKeys(Data.password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_USERNAME).sendKeys(Data.username);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_PHONE)));
        driver.findElement(Locators.TEXT_PHONE).sendKeys(Data.phone);
        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRM);
        boolean selectedCheckbox = checkboxConfirmation.isSelected();
        System.out.println(selectedCheckbox + " ALL SET!");
        checkboxConfirmation.click();
    }
}

