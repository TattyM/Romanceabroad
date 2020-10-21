import org.testng.annotations.Test;

public class GiftsSearchTests extends BaseUI {


    @Test
    public void testGiftsSearchPage() {
        mainPage.clickPhotosPageLink();
        photosPage.clickIconGifts();
        giftsPage.inputSearchGifts();
        giftsPage.clickButtonSearch();


    }

}

