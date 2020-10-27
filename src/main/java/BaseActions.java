import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseActions {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BaseActions(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;

    }
    public static String generateNewNumber(String name, int length) {
        return name + RandomStringUtils.random(length, "172984757");

    }
    public void getDropDownListByValue(WebElement element, String value) {
        Select minAgeDropdown = new Select(element);
        minAgeDropdown.selectByValue(value);

    }

}