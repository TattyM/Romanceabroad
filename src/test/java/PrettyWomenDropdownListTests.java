import org.testng.annotations.Test;

public class PrettyWomenDropdownListTests extends BaseUI {

    @Test
    public void testPrettyWomenPage() {
        mainPage.clickPrettyWomenLink();
        mainPage.getDropDownListByValue(driver.findElement(Locators.MIN_AGE_DROPDOWN_LIST),Data.minage);
        mainPage.getDropDownListByValue(driver.findElement(Locators.MAX_AGE_DROPDOWN_LIST), Data.maxage);
        searchPage.selectButtonNext();

    }

}

