import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookTests extends BaseUI{
    String currentUrlFacebook;

    @Test
    public void testFacebookPage () {
        driver.findElement(Locators.LINK_FACEBOOK).click();
        currentUrlFacebook = driver.getCurrentUrl();
        System.out.println(currentUrlFacebook);
        Assert.assertEquals(currentUrlFacebook, Data.expectedUrlFacebook);
    }
}
