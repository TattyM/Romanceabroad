import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

 public class MainPage {
     String mainUrl = "https://romanceabroad.com/";
     WebDriver driver;
     String currentUrl;
     String getText;
     String password = "868hb4";
     String email = "111@gmail.com";
     String expectedUrlHome = "https://romanceabroad.com/#";
     String expectedUrlHowItWorks = "https://romanceabroad.com/content/view/how-it-works";
     String expectedUrlMedia = "https://romanceabroad.com/media/index";
     String expectedUrlSearch = "https://romanceabroad.com/users/search";
     String expectedUrlSweets = "https://romanceabroad.com/store/category-sweets";
     String expectedUrlTour = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";
     String expectedUrlBlog = "https://romanceabroad.com/content/view/blog";
     String expectedUrlBookNow = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";
     String expectedUrlTourInfo = "https://romanceabroad.com/";
     String expectedUrlPhone = "https://romanceabroad.com/";
     String expectedUrlSupport = "https://romanceabroad.com/";
     String expectedUrlFacebook = "https://romanceabroad.com/";
     String expectedUrlYoutube = "https://romanceabroad.com/";
     By HOME_PAGE = By.xpath("//a[text()='HOME']");
     By HOW_IT_WORKS = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
     By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
     By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
     By LINK_GIFTS = By.xpath("//a[text()='GIFTS']");
     By LINK_TOUR= By.cssSelector("ul>li>a[href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
     By LINK_BLOG = By.xpath("//a[(text()='BLOG')]");
     By LINK_BOOK_NOW = By.xpath("//a[contains(text(),'BOOK NOW')]");
     By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
     By BUTTON_TOUR_INFO = By.xpath("//a[@href='https://romanceabroad.com/REQUEST_TOUR_INFO+Application_Form.doc']");
     By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
     By BUTTON_JOIN_TODAY = By.xpath("//a[(text()='JOIN TODAY!')]");
     By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
     By TEXT_LOVE = By.xpath("//p[text()='FIND YOUR LOVE, YOUR WIFE, YOUR DREAM!']");
     By TEXT_MEET_BRIDES = By.xpath("//h2[@class='section-heading text-white']");
     By TEXT_ALL_BRIDES = By.xpath("//h3[@class='text-white']");
     By TEXT_GET_IN_TOUCH = By.xpath("//h2[contains(text(),'Get In Touch')]");
     By TEXT_EMAIL = By.cssSelector("input#email");
     By TEXT_PASSWORD = By.cssSelector("input#password");
     By VIDEO_IMAGE = By.xpath("//div[@class='video']//iframe");
     By IMAGE_NAME = By.xpath("//a//img[@src='/img/logo.jpg']");
     By IMAGE_NAME2 = By.xpath("//div[@class='col-lg-7 footerlg']//img[@src='/img/logo.jpg']");
     By IMAGE_BACKGROUND = By.cssSelector(".masthead.text-center.text-white.d-flex");
     By IMAGE_BRIDES = By.xpath("//div[@class='carousel-item active']");
     By LINK_PHONE = By.xpath("//a[@href='callto:18885997816']");
     By LINK_SUPPORT = By.xpath("//a[@href='mailto:support@romanceabroad.com']");
     By LINK_FACEBOOK = By.xpath("//a[@href='https://m.facebook.com/RomanceAbroad/?ref=bookmarks']");
     By LINK_YOUTUBE = By.xpath("//a[@href='https://www.youtube.com/channel/UCCmXAG1ToSyHymqYzzJcTfQ']");
     int indexLinkSignIn = 0;


     @BeforeMethod
     public void setUp() {
         System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get(mainUrl);
     }
     @Test
     public void testHomePage() {
         driver.findElement(HOME_PAGE).click();
         currentUrl = driver.getCurrentUrl();
         System.out.println(currentUrl);
         Assert.assertEquals(currentUrl, expectedUrlHome);
     }
     @Test
     public void testHowItWorksPage() {
         driver.findElement(HOW_IT_WORKS).click();
         currentUrl = driver.getCurrentUrl();
         System.out.println(currentUrl);
         Assert.assertEquals(currentUrl,expectedUrlHowItWorks);
     }
     @Test
     public void testSearchPage() {
         driver.findElement(LINK_SEARCH).click();
         currentUrl = driver.getCurrentUrl();
         System.out.println(currentUrl);
         Assert.assertEquals(currentUrl, expectedUrlSearch);
     }
     @Test
     public void testMediaPage() {
         driver.findElement(LINK_MEDIA).click();
         currentUrl = driver.getCurrentUrl();
         System.out.println(currentUrl);
         Assert.assertEquals(currentUrl, expectedUrlMedia);
     }
     @Test
     public void testGiftsPage() {
         driver.findElement(LINK_GIFTS).click();
         currentUrl = driver.getCurrentUrl();
         System.out.println(currentUrl);
         Assert.assertEquals(currentUrl, expectedUrlSweets);
     }
     @Test
     public void testTourPage() {
         driver.findElement(LINK_TOUR).click();
         currentUrl = driver.getCurrentUrl();
         System.out.println(currentUrl);
         Assert.assertEquals(currentUrl, expectedUrlTour);
     }
     @Test
     public void testBlogPage() {
         driver.findElement(LINK_BLOG).click();
         currentUrl = driver.getCurrentUrl();
         System.out.println(currentUrl);
         Assert.assertEquals(currentUrl, expectedUrlBlog);
     }
     @Test
     public void testBookNowPage() {
         driver.findElement(LINK_BOOK_NOW).click();
         currentUrl = driver.getCurrentUrl();
         System.out.println(currentUrl);
         Assert.assertEquals(currentUrl, expectedUrlBookNow);
     }
     @Test
     public void testTextLove() {
         WebElement textLove = driver.findElement(TEXT_LOVE);
         textLove.click();
         getText = driver.getTitle();
     }
     @Test
     public void testTextMeetBrides() {
         WebElement meetBrides = driver.findElement(TEXT_MEET_BRIDES);
         meetBrides.click();
         getText = driver.getTitle();
     }
     @Test
     public void testTextAllBrides() {
         WebElement allBrides = driver.findElement(TEXT_ALL_BRIDES);
         allBrides.click();
         getText = driver.getTitle();
     }
     @Test
     public void testTextGetInTouch() {
         WebElement getInTouch = driver.findElement(TEXT_GET_IN_TOUCH);
         getInTouch.click();
         getText = driver.getTitle();
     }
     @Test
     public void testVideoImage(){
         WebElement videoImage = driver.findElement(VIDEO_IMAGE);
         videoImage.click();
     }
     @Test
     public void testImageName() {
         WebElement imageName = driver.findElement(IMAGE_NAME);
         imageName.click();
     }
     @Test
     public void testImageName2() {
         WebElement imageName2 = driver.findElement(IMAGE_NAME2);
         imageName2.click();
     }
     @Test
     public void testImage1() {
         WebElement image1 = driver.findElement(IMAGE_BACKGROUND);
         image1.click();
     }
     @Test
     public void testImage2() {
         WebElement image2 = driver.findElement(IMAGE_BRIDES);
         image2.click();
     }
     @Test
     public void testTourInfo() {
         driver.findElement(BUTTON_TOUR_INFO).click();
         currentUrl = driver.getCurrentUrl();
         System.out.println(currentUrl);
         Assert.assertEquals(currentUrl, expectedUrlTourInfo);
     }
     @Test
     public void testSingIn()
     {
         driver.findElements(LINK_SIGN_IN).get(indexLinkSignIn).click();
     }
     @Test
     public void testRegistration() {
         driver.findElement(BUTTON_REGISTRATION).click();
         driver.findElement(TEXT_EMAIL).sendKeys(email);
         driver.findElement(TEXT_PASSWORD).sendKeys(password);
         driver.findElement(BUTTON_NEXT).click();
     }
     @Test
     public void testJoinToday() {
         driver.findElement(BUTTON_JOIN_TODAY).click();
         driver.findElement(TEXT_EMAIL).sendKeys(email);
         driver.findElement(TEXT_PASSWORD).sendKeys(password);
         driver.findElement(BUTTON_NEXT).click();
     }
     @Test
     public void testPhone() {
         driver.findElement(LINK_PHONE).click();
         currentUrl = driver.getCurrentUrl();
         System.out.println(currentUrl);
         Assert.assertEquals(currentUrl,expectedUrlPhone);
     }
     @Test
     public void testSupport() {
         driver.findElement(LINK_SUPPORT).click();
         currentUrl = driver.getCurrentUrl();
         System.out.println(currentUrl);
         Assert.assertEquals(currentUrl,expectedUrlSupport);
     }
     @Test
     public void testFacebookPage() {
         driver.findElement(LINK_FACEBOOK).click();
         currentUrl = driver.getCurrentUrl();
         System.out.println(currentUrl);
         Assert.assertEquals(currentUrl, expectedUrlFacebook);
     }
     @Test
     public void testYoutubePage() {
         driver.findElement(LINK_YOUTUBE).click();
         currentUrl = driver.getCurrentUrl();
         System.out.println(currentUrl);
         Assert.assertEquals(currentUrl, expectedUrlYoutube);
     }
     @AfterMethod
     public void afterActions() {
         //driver.quit();
     }
 }









