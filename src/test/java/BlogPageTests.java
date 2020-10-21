import org.testng.annotations.Test;

public class BlogPageTests extends BaseUI {


    @Test
    public void testBlogPage() {
        mainPage.clickBlogPageLink();
        blogPage.clickLinkKharkovAgency();
    }

}

