import org.testng.annotations.Test;

public class GiftsTests extends BaseUI {


    @Test
    public void testGiftsSearchPage() {
        mainPage.clickPhotosPageLink();
        photosPage.clickIconGifts();
        giftsPage.inputSearchGifts();
        giftsPage.clickButtonSearch();


    }

}

