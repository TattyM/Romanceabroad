import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class MainPageTests extends BaseUI {
    public static final boolean isTest9 = false;
    public static final boolean isTest10 = true;
    public static final boolean isTest11 = false;
    public static final boolean isTest12 = true;


    @Test(priority = 1,enabled = isTest9,groups = {"user","admin"})
    public void testBlogPageTest9() {
        mainPage.clickBlogPageLink();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String currentUrlBlog = driver.getCurrentUrl();
        System.out.println("Blog Page!");
        blogPage.perfomClick(driver.findElement(Locators.LINK_KHARKOV_AGENCY));
        Assert.assertEquals(currentUrlBlog, Data.expectedUrlBlog);

    }
    @Test(priority = 4,enabled = isTest10,groups = {"user"})
    public void testPhotosPageTest10() {
        mainPage.clickPhotosPageLink();
        mainPage.javaWaitSec(3);
        String currentUrlPhotos = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlPhotos, Data.expectedUrlPhotos);
        mainPage.perfomClick(driver.findElement(Locators.BUTTON_ALBUMS));
        mainPage.javaWaitSec(3);
        photosPage.selectLanguageButton();
        System.out.println(" Язык страницы - Русский !");
    }

    @Test(priority = 3,enabled = isTest12,groups = {"ie","admin"})
    public void testPrettyWomenPageTest12() {
        mainPage.clickPrettyWomenLink();
        String currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlPrettyWomen);
        mainPage.javaWaitSec(3);
        int sizeOfDropDownListMinAge = searchPage.getSizeDropDownList(Locators.MIN_AGE_DROPDOWN_LIST);
        System.out.println(sizeOfDropDownListMinAge);
        for (int i = 0; i < sizeOfDropDownListMinAge; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.MIN_AGE_DROPDOWN_LIST, "age_min");
            mainPage.javaWaitSec(5);
        }
        int sizeOfDropDownListMaxAge = searchPage.getSizeDropDownList(Locators.MAX_AGE_DROPDOWN_LIST);
        System.out.println(sizeOfDropDownListMaxAge);
        for (int i = 0; i < sizeOfDropDownListMaxAge; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.MAX_AGE_DROPDOWN_LIST, "age_max");
            mainPage.javaWaitSec(5);
        }
}
}
