import org.testng.annotations.Test;

public class ContactUsTests extends BaseUI {

    @Test
    public void testContactUs() {
        driver.get(Data.urlContactUs);
        contactUsPage.selectReason(Data.reason);
        contactUsPage.personalInfo(Data.name, Data.email);
        contactUsPage.inputSubject(Data.subject, Data.message, (mainPage.generateNewNumber(Data.code, 5)));
    }
}
