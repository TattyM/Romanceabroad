import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Gifts {
    String mainUrl = "https://romanceabroad.com/store/category-sweets";
    WebDriver driver;
    String currentUrl;
    String expectedUrlGifts1 = "https://romanceabroad.com/store/sweets/16-sushi_set";
    String expectedUrlGifts2 = "https://romanceabroad.com/store/category/4";
    String expectedUrlGifts3 = "https://romanceabroad.com/store/sweets/11-teddy_bear";
    String expectedUrlGifts = "https://romanceabroad.com/store/category-sweets";
    By LINK_SUSHI_SET = By.xpath("//div[@class='contrasting-block']//a[@href='https://romanceabroad.com/store/sweets/16-sushi_set']");
    By BUTTON_SEARCH_FRIEND = By.xpath("//button[@id='search_friend']");
    By LINK_TEDDY_BEAR = By.cssSelector("a[href='https://romanceabroad.com/store/sweets/11-teddy_bear']");
    By LINK_BESTSELLERS = By.cssSelector("#bestsellers-title");
    By SELECT_SIDE_MENU = By.cssSelector(".uam-top.link-open-menu.btn-slide");

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }
    @Test
    public void testGifts1() {
        driver.findElement(LINK_SUSHI_SET).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlGifts1);
    }
    @Test
    public void testGifts2() {
        driver.findElement(BUTTON_SEARCH_FRIEND).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlGifts2);
    }
    @Test
    public void testGifts3() {
        driver.findElement(LINK_TEDDY_BEAR).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlGifts3);
    }
    @Test
    public void testGifts4() {
        driver.findElement(LINK_BESTSELLERS).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlGifts);
    }
    @Test
    public void testGifts5() {
        driver.findElement(SELECT_SIDE_MENU).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, expectedUrlGifts);
    }
    @AfterMethod
    public void afterActions() {
        //driver.quit();
    }

}