import org.testng.annotations.Test;

public class PhotosPageTests extends BaseUI {


    @Test
    public void testPhotosPage() {
        mainPage.clickPhotosPageLink();
        photosPage.clickAlbumsButton();
        photosPage.selectLanguageButton();
    }
}