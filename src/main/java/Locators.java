import org.openqa.selenium.By;

public class Locators {

    //PrettyWomenDropdownList
    public static final By LINK_PRETTY_WOMEN = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By MIN_AGE_DROPDOWN_LIST = By.xpath("//select[@id='age_min']");
    public static final By MAX_AGE_DROPDOWN_LIST = By.xpath("//select[@id='age_max']");
    public static final By BUTTON_SEARCH = By.cssSelector("input#main_search_button_user_advanced");


    //Gifts Page
    public static final By LINK_GIFTS = By.xpath("//a[text()='GIFTS']");

    //HomePageVideo
    public static final By LINK_YOUTUBE_VIDEO = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By BUTTON_PLAY = By.cssSelector(".ytp-large-play-button.ytp-button");


    //HomePageYouTube
    public static final By LINK_YOUTUBE = By.xpath("//a[@href='https://www.youtube.com/channel/UCCmXAG1ToSyHymqYzzJcTfQ']");

    //HomePageJoinToday
    public static final By LINK_JOIN_TODAY = By.xpath("//a[(text()='JOIN TODAY!')]");
    public static final By TEXT_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_PASSWORD = By.cssSelector("input#password");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By TEXT_USERNAME = By.cssSelector("input#nickname");
    public static final By TEXT_PHONE = By.cssSelector("input[name='data[phone]']");
    public static final By CHECKBOX_CONFIRM = By.cssSelector("#confirmation");


}
