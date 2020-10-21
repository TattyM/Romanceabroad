import org.openqa.selenium.By;

public class Locators {

    //JoinToday
    public static final By LINK_JOIN_TODAY = By.xpath("//a[(text()='JOIN TODAY!')]");
    public static final By TEXT_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_PASSWORD = By.cssSelector("input#password");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By TEXT_USERNAME = By.cssSelector("input#nickname");
    public static final By SELECT_DAY = By.cssSelector("#daySelect");
    public static final By SELECT_DAY_NUMBER = By.xpath("//li[@data-handler='selectDay']//a[text()='21']");
    public static final By SELECT_MONTH = By.cssSelector("#monthSelect");
    public static final By SELECT_MONTH_NAME = By.xpath("//li[@data-handler='selectMonth']//a[text()='Apr']");
    public static final By SELECT_YEAR = By.cssSelector("#yearSelect");
    public static final By SELECT_YEAR_NUMBER = By.xpath("//li[@data-handler='selectYear']//a[text()='1999']");
    public static final By TEXT_PHONE = By.cssSelector("input[name='data[phone]']");
    public static final By CHECKBOX_CONFIRM = By.cssSelector("#confirmation");

    //PrettyWomenDropdownList
    public static final By LINK_PRETTY_WOMEN = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By MIN_AGE_DROPDOWN_LIST = By.xpath("//select[@id='age_min']");
    public static final By MAX_AGE_DROPDOWN_LIST = By.xpath("//select[@id='age_max']");
    public static final By BUTTON_SEARCH = By.cssSelector("input#main_search_button_user_advanced");

    //PhotosPage
    public static final By LINK_PHOTOS = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
    public static final By BUTTON_ALBUMS = By.xpath("//a[@href='https://romanceabroad.com/media/albums']");
    public static final By BUTTON_РУССКИЙ = By.xpath("//a[contains(text(),'Русский')]");

    //BlogPage
    public static final By LINK_BLOG = By.xpath("//a[contains(text(),'BLOG')]");
    public static final By LINK_KHARKOV_AGENCY = By.xpath("//a[contains(text(),'Kharkov dating agency')]");

    //Gifts Page
    public static final By LINK_GIFTS = By.xpath("//a[text()='GIFTS']");
    public static final By BUTTON_QUICK_VIEW = By.xpath("//div[@id='product_quick_view_11']//input");

    // Gifts Search Page
    public static final By LINK_ICON_GIFTS = By.xpath("//a[contains(text(),'Gifts')]");
    public static final By LINK_TEXT_FIELD = By.cssSelector("input#search_product");
    public static final By BUTTON_SEARCH_GIFT = By.cssSelector("#search_friend");


}
