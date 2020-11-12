import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BlogPage extends BaseActions {
    public BlogPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickLinkKharkovAgency() {
        driver.findElement(Locators.LINK_KHARKOV_AGENCY).click();

    }


}
