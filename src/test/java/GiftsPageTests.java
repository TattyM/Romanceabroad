import org.testng.annotations.Test;

public class GiftsPageTests extends BaseUI{


    @Test
    public void testGiftsPage() {
        mainPage.clickGiftsPageLink();
        giftsPage.clickButtonQuickView();
    }
}
