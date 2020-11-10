import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JoinTodayTests extends BaseUI {

    @Test
    public void testJoinToday() {
        mainPage.clickJoinTodayButton();
        mainPage.firstPartOfRegistration();
        mainPage.secondPartOfRegistration();
        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRM);
        if (!driver.findElement(Locators.LINK_JOIN_TODAY).isSelected()){
        checkboxConfirmation.click();
        }else{
            Assert.fail("Checkbox is selected!");
        }
    }
}

