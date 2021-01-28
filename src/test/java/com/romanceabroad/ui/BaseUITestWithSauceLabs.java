//package com.romanceabroad.ui;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;
//import org.testng.asserts.SoftAssert;
//
//import java.lang.reflect.Method;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class BaseUITestWithSauceLabs {
//    WebDriver driver;
//    WebDriverWait wait;
//    String mainUrl = "https://romanceabroad.com/";
//    MainPage mainPage;
//    SearchPage searchPage;
//    GiftsPage giftsPage;
//    BlogPage blogPage;
//    PhotosPage photosPage;
//    ContactUsPage contactUsPage;
//    UserProfilePage userProfilePage;
//    SoftAssert softAssert = new SoftAssert();
//
//    @BeforeMethod
//    @Parameters({"browser", "version", "platform"})
//    public void setup(String browser, String version, String platform, Method method)
//            throws MalformedURLException {
//        Reports.start(method.getName());
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("username", "tattaa");
//        capabilities.setCapability("accessKey", "b42fe63ec5b74ac39dfb32daa1fae250");
//        capabilities.setCapability("browserName", browser);
//        capabilities.setCapability("platform", platform);
//        capabilities.setCapability("version", version);
//        capabilities.setCapability("name", method.getName());
//        driver = new RemoteWebDriver(
//                new URL("http://" + System.getenv("SAUCE_USERNAME") + ":" + System.getenv("SAUSE_ACCESS_KEY") +
//                        "@ondemand.saucelabs.com:80/wd/hub"), capabilities);
//        wait = new WebDriverWait(driver, 20);
//        mainPage = new MainPage(driver, wait);
//        searchPage = new SearchPage(driver, wait);
//        giftsPage = new GiftsPage(driver, wait);
//        blogPage = new BlogPage(driver, wait);
//        photosPage = new PhotosPage(driver, wait);
//        contactUsPage = new ContactUsPage(driver, wait);
//        userProfilePage = new UserProfilePage(driver, wait);
//        driver.manage().window().maximize();
//        driver.get(mainUrl);
//    }
//
//    @AfterMethod(groups = {"admin", "user"})
//    public void tearDown(ITestResult testResult) {
//        //local reports
//        if (testResult.getStatus() == ITestResult.FAILURE) {
//            Reports.fail(driver, testResult.getName());
//        }
//        Reports.stop();
//        //sauce labs
//        ((JavascriptExecutor) driver).executeScript("sauce:job-result=" + (testResult.isSuccess() ? "passed" : "failed"));
//        driver.quit();
//    }
//
//}
