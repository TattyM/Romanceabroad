import org.testng.annotations.Test;

public class JoinTodayTests extends BaseUI {

    @Test
    public void testJoinToday() {
        mainPage.clickJoinTodayButton();
        mainPage.firstPartOfRegistration();
        mainPage.secondPartOfRegistration();
    }
}

