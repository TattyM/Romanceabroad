import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Blog {
    String mainUrl = "https://romanceabroad.com/content/view/blog";
    WebDriver driver;
    String currentUrl;
    String expectedUrlBlog1 = "https://romanceabroad.com/content/view/kiev-dating-agency";
    String expectedUrlBlog2 = "https://romanceabroad.com/content/view/legal-terms";
    String expectedUrlBlog3 = "https://romanceabroad.com/users/search";
    String expectedUrlBlog4 = "https://romanceabroad.com/content/view/beautiful-urkainian-girls";
    String expectedUrlBlog5 = "https://romanceabroad.com/content/view/blog";
    By LINK_KIEV_AGENCY = By.xpath("//a[contains(text(),'Kiev dating agency')]");
    By LINK_TERMS = By.xpath("//a[@href='https://romanceabroad.com/content/view/legal-terms']");
    By BUTTON_FIND_PEOPLE = By.cssSelector(" #main_search_button_user_line");
    By LINK_GIRLS = By.cssSelector("a[href='https://romanceabroad.com/content/view/beautiful-urkainian-girls']");
    By LINK_LOGIN = By.cssSelector("#ajax_login_link");

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }
    @Test
    public void testBlog1() {
        driver.findElement(LINK_KIEV_AGENCY).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlBlog1);

    }
    @Test
    public void testBlog2()  {
        driver.findElement(LINK_TERMS).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlBlog2);

    }
    @Test
    public void testBlog3() {
        driver.findElement(BUTTON_FIND_PEOPLE).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlBlog3);

    }
    @Test
    public void testBlog4() {
        driver.findElement(LINK_GIRLS).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlBlog4);

    }
    @Test
    public void testBlog5() {
        driver.findElement(LINK_LOGIN).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlBlog5);

    }
    @AfterMethod
    public void afterActions() {
        //driver.quit();
    }
}


