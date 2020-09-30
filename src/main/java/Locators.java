import org.openqa.selenium.By;

public class Locators {

    //Search Page
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");

    //Blog Page
    public static final By LINK_BLOG = By.xpath("//a[(text()='BLOG')]");

    //Facebook Page
    public static final By LINK_FACEBOOK = By.xpath("//a[@href='https://m.facebook.com/RomanceAbroad/?ref=bookmarks']");

    //Brides Page
    public static final By TEXT_ALL_BRIDES = By.xpath("//h3[@class='text-white']");

    //Registration
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By TEXT_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_PASSWORD = By.cssSelector("input#password");
    public static final By TEXT_USERNAME = By.cssSelector("input#nickname");
    public static final By TEXT_PHONE = By.cssSelector("input[name='data[phone]']");




}
