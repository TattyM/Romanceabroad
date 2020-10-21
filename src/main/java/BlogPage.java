import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class BlogPage extends BaseActions {
    public BlogPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickLinkKharkovAgency() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String currentUrlBlog = driver.getCurrentUrl();
        System.out.println("Blog Page!");
        driver.findElement(Locators.LINK_KHARKOV_AGENCY).click();
        Assert.assertEquals(currentUrlBlog, Data.expectedUrlBlog);
    }


}
