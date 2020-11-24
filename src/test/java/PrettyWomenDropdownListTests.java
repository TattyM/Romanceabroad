import org.testng.Assert;
import org.testng.annotations.Test;


public class PrettyWomenDropdownListTests extends BaseUI {

    @Test
    public void testPrettyWomenPage() {
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

