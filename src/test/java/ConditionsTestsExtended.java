import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ConditionsTestsExtended extends BaseUI {

    @Test
    public void test1() {
        WebElement linkPhotos = driver.findElement(Locators.LINK_PHOTOS);
        if (linkPhotos.getText().contains("PHOTOS")) {
            linkPhotos.click();
        } else {
            Assert.fail("Cannot find PHOTOS page");
        }
    }

    @Test
    public void test2() {
        WebElement linkGifts = driver.findElement(Locators.LINK_GIFTS);
        if (linkGifts.isDisplayed()) {
            linkGifts.click();
        } else {
            Assert.fail("Cannot find GIFTS page");
        }
    }

    @Test
    public void test3() {
        mainPage.clickJoinTodayButton();
        mainPage.firstPartOfRegistration();

        WebElement checkbox = driver.findElement(Locators.CHECKBOX_CONFIRM);
        if (!checkbox.isSelected()) {
            checkbox.click();
            System.out.println("Checkbox is selected!");
        }
    }

    @Test
    public void test4() {
        List<WebElement> links = driver.findElements(Locators.LINK_LOOP);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            driver.get(mainUrl);
            links = driver.findElements(Locators.LINK_LOOP_HEADER);
        }
    }

}
