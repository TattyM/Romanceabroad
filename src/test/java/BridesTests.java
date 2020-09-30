import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BridesTests extends BaseUI{
    String getText;

    @Test
    public void testTextAllBrides() {
        WebElement allBrides = driver.findElement(Locators.TEXT_ALL_BRIDES);
        allBrides.click();
        getText = driver.getTitle();
    }
}
