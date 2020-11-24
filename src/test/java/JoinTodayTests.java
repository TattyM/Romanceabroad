import org.testng.annotations.Test;

public class JoinTodayTests extends BaseUI {

    @Test
    public void testJoinToday() {
        mainPage.ajaxScroll(driver.findElement(Locators.LINK_JOIN_TODAY));
        mainPage.clickJoinTodayButton();
        mainPage.ajaxSendKeys(driver.findElement(Locators.TEXT_EMAIL), (Data.email));
        mainPage.javaWaitSec(3);
        driver.findElement(Locators.TEXT_PASSWORD).sendKeys(Data.password);
        mainPage.javaWaitSec(3);
        driver.findElement(Locators.BUTTON_NEXT).click();
        mainPage.ajaxSendKeys(driver.findElement(Locators.TEXT_USERNAME), (Data.username));
        mainPage.partOfRegistration();
        mainPage.javaWaitSec(3);
        mainPage.ajaxSendKeys(driver.findElement(Locators.TEXT_PHONE), (Data.phone));
        mainPage.clickUnselectedCheckbox(Locators.CHECKBOX_CONFIRM);
    }

}