package com.romanceabroad.ui;

import org.openqa.selenium.By;

public class Locators {

    //Contact Us
    public static final By SELECT_REASON = By.xpath("//option[contains(text(),'Other')]");
    public static final By SELECT_NAME = By.xpath("//input[@name='user_name']");
    public static final By SELECT_EMAIL = By.xpath("//input[@name='user_email']");
    public static final By TEXT_REASON = By.xpath("//select[@name='id_reason']");
    public static final By TEXT_SUBJECT = By.xpath("//input[@name='subject']");
    public static final By TEXT_MESSAGE = By.xpath("//textarea[@name='message']");
    public static final By TEXT_CODE = By.cssSelector("#g-recaptcha-response");
    public static final By BUTTON_SEND = By.xpath("//input[@class='btn btn-primary']");


    //JoinToday
    public static final By LINK_JOIN_TODAY = By.xpath("//a[(text()='JOIN TODAY!')]");
    public static final By TEXT_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_PASSWORD = By.cssSelector("input#password");
    public static final By TEXT_USERNAME = By.cssSelector("input#nickname");
    public static final By TEXT_TOOLTIP = By.xpath("//div[@class='tooltip']");
    public static final By TEXT_PHONE = By.cssSelector("input[name='data[phone]']");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By SELECT_DAY = By.cssSelector("#daySelect");
    public static final By SELECT_DAY_NUMBER = By.xpath("//li[@data-handler='selectDay']");
    public static final By SELECT_MONTH = By.cssSelector("#monthSelect");
    public static final By SELECT_MONTH_NAME = By.xpath("//li[@data-handler='selectMonth']");
    public static final By SELECT_YEAR = By.cssSelector("#yearSelect");
    public static final By SELECT_YEAR_NUMBER = By.xpath("//li[@data-handler='selectYear']");
    public static final By AUTOFILLING_FORM_LOCATION = By.xpath("//input[@name='region_name']");
    public static final By LIST_VALUE_LOCATION = By.xpath("//div[@class='dropdown dropdown_location']//ul//li");
    public static final By CHECKBOX_CONFIRM = By.cssSelector("#confirmation");

    //PrettyWomenDropdownList
    public static final By LINK_PRETTY_WOMEN = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By MIN_AGE_DROPDOWN_LIST = By.xpath("//select[@id='age_min']");
    public static final By MAX_AGE_DROPDOWN_LIST = By.xpath("//select[@id='age_max']");
    public static final By BUTTON_SEARCH = By.cssSelector("input#main_search_button_user_advanced");
    public static final By DROP_DOWN_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    public static final By TEXT_INFO_USER = By.xpath("//div[@class='text-overflow']");

    //PhotosPage
    public static final By LINK_PHOTOS = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
    public static final By BUTTON_ALBUMS = By.xpath("//a[@href='https://romanceabroad.com/media/albums']");
    public static final By BUTTON_РУССКИЙ = By.xpath("//a[contains(text(),'Русский')]");

    //BlogPage
    public static final By LINK_BLOG = By.xpath("//a[contains(text(),'BLOG')]");
    public static final By LINK_KHARKOV_AGENCY = By.xpath("//a[contains(text(),'Kharkov dating agency')]");

    //Gifts Page
    public static final By LINK_GIFTS = By.xpath("//a[text()='GIFTS']");
    public static final By LINK_ICON_GIFTS = By.xpath("//a[contains(text(),'Gifts')]");
    public static final By LINK_TEXT_FIELD = By.cssSelector("input#search_product");
    public static final By BUTTON_SEARCH_GIFT = By.cssSelector("#search_friend");

    // ConditionsArrayListsLoopsTestsExtended
    public static final By LINK_TOUR_TO = By.xpath("//li//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    public static final By LINK_FRUITS = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/3-chocolate_and_fruits_in_one_basket']");
    public static final By BLOCK_PRODUCT = By.xpath("//div[@id='result_products_block']");
    public static final By BLOCK_LIST = By.xpath("//ul[@class='nav nav-pills nav-stacked content-pages-tree']/li");
    public static final By BLOCK_FOOTER = By.xpath("//ul[@class='footer-menu-list-block list-group']//li");
    public static final By TEXT_DESCRIPTION = By.xpath("//div[contains(text(),'Amazing mix chocolate and fruits in one basket for')]");

    // ArrayListsConditionsInLoopsTests
    public static final By LINK_TITLE = By.xpath("//h1");
    public static final By LINK_LINKS = By.xpath("//a");
    public static final By LINK_HOME = By.xpath("//a[contains(text(),'HOME')]");
    public static final By LINK_LOOP_HEADER = By.xpath("//ul[@class='navbar-nav']//li");
    public static final By LINK_LOOP = By.xpath("//ul[@class='navbar-nav']//li/a");
    public static final By LINK_LOOP_FOOTER = By.xpath("//ul[@class='pagination']");
    public static final By LINK_LOOP_PHOTOS = By.xpath("//a[@class='g-pic-border g-rounded g-users-gallery__photo-img']");
    public static final By LINK_BLOCK = By.xpath("//div[@class='contrasting-block row g-bestsellers-gallery']");
    public static final By LINK_PHOTOS_TOUR = By.xpath("//div[@class='product-main-media pg-thumbnail']");
    public static final By LINK_PHOTOS_CAROUSEL = By.xpath("//div[@class='pre-main-inner-content']");
    public static final By LINK_TEXT_BLOCK = By.xpath("//div[@class='info-content-block wysiwyg']");
    public static final By LINK_PHOTOS_GIRLS = By.xpath("//img[@src='https://romanceabroad.com/uploads/info-page-logo/0/0/0/25/big-9aff795b78.jpg']");
    public static final By LINK_TEXT_TITLE = By.xpath("//strong[contains(text(),'Old-fashioned')]");
    public static final By LINK_SIGN_IN = By.xpath("//a[@id='ajax_login_link']");
    public static final By BLOCK_TITLE = By.xpath("//div[contains(text(),'People found: 71')]");
    public static final By DROPDOWN_LIST = By.xpath(" //select[@id='sorter-select-9384']");
    public static final By PAGE_FOOTER = By.xpath("//div[@id='footer-menu-title-2']");

    //Locators with 2 attributes
    public static final By LINK_FRUITS_BASKET = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/3-chocolate_and_fruits_in_one_basket'][contains(text(),'Chocolate and fruits')]");
    public static final By LINK_PRIVACY = By.xpath("//a[@id='footer_footer-menu-policy-item_footer-menu-privacy-item'][@href='https://romanceabroad.com/content/view/privacy-and-security']");
    public static final By PHOTO_SUSHI = By.xpath("//img[@class='img-rounded img-responsive'][@title='Sushi sets']");
    public static final By BUTTON_PAYPAL = By.xpath("//a[@class='btn btn-primary btn-block'][@target='_blank']");
    public static final By TEXT_ADVERTISING = By.xpath("//a[@rel='nofollow'][@target='_blank']");
    public static final By IMAGE_FIRST_SLIDE = By.xpath("//img[@class=' img-fluid'][@src='/img/portfolio/slideimg4.jpg']");
    public static final By LINK_CONTENT = By.xpath("//a[@href='https://romanceabroad.com/content/'][@id='breadcrumb_']");
    public static final By BUTTON_TOGGLE = By.xpath("//button[@type='button'][@class='btn btn-secondary dropdown-toggle']");
    public static final By LINK_USER = By.xpath("//a[@title='Tafita, 35'][@href='https://romanceabroad.com/users/view/305/profile']");
    public static final By LINK_VIDEO = By.xpath("//a[@href='https://romanceabroad.com/media/video'][@class='b-tabs__text']");
    public static final By LINK_USER_CAROUSEL = By.xpath("//div[@class='swiper-slide  slick-slide slick-active']//img[@src='https://romanceabroad.com/uploads/user-logo/0/0/3/314/small-f87f88a850.PNG?1607034032'][@alt='romo4kaly']");

    //Locators with 2 parents
    public static final By TEXT_PRICE = By.xpath("//div[@class='price']//span[contains(text(),'$99.00')]");
    public static final By TEXT_PHONE2 = By.xpath("//div[@class='col-lg-5']//a[contains(text(),'+1(888)599-7816')]");
    public static final By TEXT_WHITE = By.xpath("//div[@class='col-lg-12 text-center']//h3[@class='text-white']");
    public static final By TEXT_MENU = By.xpath("//div[@class='menu']//a[@title='Gallery view']");
    public static final By LOGO_FOOTER = By.xpath("//div[@class='col-lg-7 footerlg']//img[@src='/img/logo.jpg']");
    public static final By LOGO_GLOBE = By.xpath("//ul[@class='footer-languages']//i[@class='fa fa-globe']");
    public static final By PHOTO_IMAGE = By.xpath("//div[@class='g-users-gallery__content']//img[@src='https://romanceabroad.com/uploads/gallery_image/0/0/1/119/big-28ae30463c.jpg']");
    public static final By LINK_INPUT = By.xpath("//div[@class='input-group input-group no-padding-left'] //input[@id='search_product']");
    public static final By TEXT_PRICE2 = By.xpath("//div[@class='price']//span[contains(text(),'$99.00')]");
    public static final By BUTTON_FIND_PEOPLE = By.xpath("//div[@class='menu-top-right-block']//form[@id='main_search_form_user_line']");


}
