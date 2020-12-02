import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {
    @Test
    public void testRegistration() {
        mainPage.ajaxScroll(driver.findElement(Locators.LINK_JOIN_TODAY));
        mainPage.clickJoinTodayButton();
        mainPage.firstPartOfRegistration(Data.email,Data.password);
        mainPage.secondPartOfRegistration(Data.username,Data.month,Data.day,Data.year,Data.phone,Data.town,Data.location);
        mainPage.clickUnselectedCheckbox(Locators.CHECKBOX_CONFIRM);
    }
}
