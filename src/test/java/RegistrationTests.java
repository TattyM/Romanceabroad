import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {


    @Test
    public void testRegistration() {
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
        driver.findElement(Locators.TEXT_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.TEXT_USERNAME).sendKeys(Data.username);
        driver.findElement(Locators.TEXT_PHONE).sendKeys(Data.phone);





    }
}
