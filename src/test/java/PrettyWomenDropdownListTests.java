import org.testng.annotations.Test;

public class PrettyWomenDropdownListTests extends BaseUI {

    @Test
    public void testPrettyWomenPage() {
        mainPage.clickPrettyWomenLink();
        searchPage.selectMinAge();
        searchPage.selectMaxAge();
        searchPage.selectButtonNext();
    }

}

