import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class ArrayListsConditionsInLoopsTests extends BaseUI {


    @Test
    public void testHowWeWorkPrettyWomenPages() {
        String actualTitle;
        String actualUrlPrettyWomen;
        List<WebElement> links = driver.findElements(Locators.LINK_LOOP_HEADER);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String title = links.get(i).getText();
            System.out.println(title);
            links.get(i).click();
            if (title.contains("WORK")) {
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                actualTitle = driver.findElement(Locators.LINK_TITLE).getText();
                Assert.assertEquals(Data.expectedTitleWork, actualTitle);
            }
            if (title.startsWith("PR")) {
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                actualTitle = driver.findElement(Locators.LINK_TITLE).getText();
                actualUrlPrettyWomen = driver.getCurrentUrl();
                mainPage.getDropDownListByValue(driver.findElement(Locators.MIN_AGE_DROPDOWN_LIST), Data.minage);
                mainPage.getDropDownListByValue(driver.findElement(Locators.MAX_AGE_DROPDOWN_LIST), Data.maxage);
                wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_SEARCH));
                driver.findElement(Locators.BUTTON_SEARCH).click();
                Assert.assertEquals(Data.expectedTitleWomen, actualTitle);
                Assert.assertEquals(actualUrlPrettyWomen, Data.expectedUrlPrettyWomen);
            }
            driver.get(mainUrl);
            links = driver.findElements(Locators.LINK_LOOP_HEADER);
        }
    }

    @Test
    public void testPhotosGiftsPages() {
        String actualTitle;
        String actualUrlPhotos;
        String actualUrlGifts;
        List<WebElement> links = driver.findElements(Locators.LINK_LOOP_HEADER);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String title = links.get(i).getText();
            System.out.println(title);
            links.get(i).click();
            if (title.endsWith("OS")) {
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                actualTitle = driver.findElement(Locators.LINK_TITLE).getText();
                actualUrlPhotos = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitlePhotos, actualTitle);
                Assert.assertEquals(actualUrlPhotos, Data.expectedUrlPhotos);
                driver.findElement(Locators.LINK_LOOP_PHOTOS).isDisplayed();
            }
            if (title.contains("GIFTS")) {
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                driver.findElement(Locators.LINK_TEXT_FIELD).sendKeys(Data.inputsearch2);
                driver.findElement(Locators.BUTTON_SEARCH_GIFT).click();
                actualUrlGifts = driver.getCurrentUrl();
                Assert.assertEquals(actualUrlGifts, Data.expectedUrlGifts);
                driver.findElement(Locators.LINK_BLOCK).isDisplayed();
            }
            driver.get(mainUrl);
            links = driver.findElements(Locators.LINK_LOOP_HEADER);
        }
    }

    @Test
    public void testTourToUkrainePage() {
        String actualTitle;
        String actualUrlTourTo;
        List<WebElement> links = driver.findElements(Locators.LINK_LOOP_HEADER);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String title = links.get(i).getText();
            System.out.println(title);
            links.get(i).click();
            if (title.contains("TOURS TO ")) {
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                actualTitle = driver.findElement(Locators.LINK_TITLE).getText();
                actualUrlTourTo = driver.getCurrentUrl();
                driver.findElement(Locators.LINK_PHOTOS_TOUR).isDisplayed();
                driver.findElement(Locators.LINK_PHOTOS_CAROUSEL).isDisplayed();
                Assert.assertEquals(Data.expectedTitleTour, actualTitle);
                Assert.assertEquals(actualUrlTourTo, Data.expectedUrlTourTo);
            }
            driver.get(mainUrl);
            links = driver.findElements(Locators.LINK_LOOP_HEADER);
        }
    }


    @Test
    public void testBlogPageLoop() {
        String actualUrlBlog;
        String actualUrlBlogPage;
        mainPage.clickBlogPageLink();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String currentUrlBlog = driver.getCurrentUrl();
        softAssert.assertEquals(currentUrlBlog, Data.expectedUrlBlog, "Don't see page!");
        List<WebElement> links = driver.findElements(Locators.BLOCK_LIST);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String title = links.get(i).getText();
            System.out.println(title);
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            links.get(i).click();
            if (title.startsWith("Bl")) {
                actualUrlBlog = driver.getCurrentUrl();
                driver.findElement(Locators.LINK_TEXT_BLOCK).isDisplayed();
                Assert.assertEquals(actualUrlBlog, Data.expectedUrlBlog);
            }
            if (title.contains("Slavic")) {
                String actualTitle = driver.findElement(Locators.LINK_TITLE).getText();
                Assert.assertEquals(Data.expectedTitleSlavic, actualTitle);
            }
            if (title.contains("9 Factors")) {
                actualUrlBlogPage = driver.getCurrentUrl();
                driver.findElement(Locators.LINK_PHOTOS_GIRLS).isDisplayed();
                driver.findElement(Locators.LINK_TEXT_TITLE).isDisplayed();
                Assert.assertEquals(actualUrlBlogPage, Data.expectedUrlBlogPage);
            }
            driver.getCurrentUrl();
            links = driver.findElements(Locators.BLOCK_LIST);
        }
    }
    @Test
    public void testPrettyWomenPageLoop() {
        String currentUrlSearch;
        mainPage.clickPrettyWomenLink();
        currentUrlSearch = driver.getCurrentUrl();
        softAssert.assertEquals(currentUrlSearch, Data.expectedUrlPrettyWomen, "Cannot find the page!");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        List<WebElement> links = driver.findElements(Locators.LINK_LOOP_FOOTER);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String categories = links.get(i).getText();
            System.out.println(categories);
            links.get(i).click();
            if(categories.contains("2")){
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                driver.findElement(Locators.BLOCK_TITLE).isDisplayed();
                Assert.assertEquals(currentUrlSearch, Data.expectedUrlPrettyWomen);
                if(currentUrlSearch.contains("#")) {
                    Assert.fail("Not a good Url!!!");
                }else{
                    System.out.println("It is a good Url!!!");
                }
            }
            if(categories.contains("4")){
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                mainPage.getDropDownListByValue(driver.findElement(Locators.DROPDOWN_LIST),Data.select);
                driver.findElement(Locators.BLOCK_TITLE).isDisplayed();
                Assert.assertEquals(currentUrlSearch, Data.expectedUrlPrettyWomen2);
            }
            driver.getCurrentUrl();
            links = driver.findElements(Locators.LINK_LOOP_FOOTER);
        }
    }

}




