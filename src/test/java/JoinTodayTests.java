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
        Assert.assertTrue(!driver.findElement(Locators.LINK_JOIN_TODAY).isSelected(),"Check box does not selected!");
        checkboxConfirmation.click();
    }
}

