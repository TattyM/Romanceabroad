import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Users {
    String mainUrl = "https://romanceabroad.com/users/search";
    WebDriver driver;
    String currentUrl;
    String expectedUrl = "https://romanceabroad.com/users/search";
    String expectedUrl2 = "https://romanceabroad.com/users/view/329/profile";
    By LINK_PAGE_2 = By.xpath("//a[@href='https://romanceabroad.com/users/search/default/DESC/2']");
    By LINK_USER_PROFILE = By.xpath("//a[@href='https://romanceabroad.com/users/view/329/profile']");
    By LINK_LIST_VIEW = By.xpath("//div[@class='search-header']//a[1]");
    By BUTTON_SEARCH = By.cssSelector("input#main_search_button_user_advanced");
    By SELECT_MIN_AGE = By.cssSelector("select#age_min");

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }
    @Test
    public void testUsers1() {
        driver.findElement(LINK_PAGE_2).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrl);

    }
    @Test
    public void testUsers2() {
        driver.findElement(LINK_USER_PROFILE).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrl2);

    }
    @Test
    public void testUsers3() {
        driver.findElement(LINK_LIST_VIEW).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrl);

    }
    @Test
    public void testUsers4() {
        driver.findElement(BUTTON_SEARCH).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrl);

    }
    @Test
    public void testUsers5() {
        driver.findElement(SELECT_MIN_AGE).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrl);

    }
    @AfterMethod
    public void afterActions() {
        //driver.quit();
    }
}

