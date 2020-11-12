import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class BlogPageTests extends BaseUI {


    @Test
    public void testBlogPage() {
        mainPage.clickBlogPageLink();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String currentUrlBlog = driver.getCurrentUrl();
        System.out.println("Blog Page!");
        blogPage.clickLinkKharkovAgency();
        Assert.assertEquals(currentUrlBlog, Data.expectedUrlBlog);
    }

}

