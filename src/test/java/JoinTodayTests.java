import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JoinTodayTests extends BaseUI {

    @Test
    public void testJoinToday() {
        mainPage.clickJoinTodayButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage.firstPartOfRegistration();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage.secondPartOfRegistration();
        mainPage.checkboxConfirmation();
    }
}

