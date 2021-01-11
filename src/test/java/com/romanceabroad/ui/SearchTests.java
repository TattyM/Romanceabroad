package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTests extends BaseUI {
    public static final boolean isTest16 = true;
    public static final boolean isTest17 = true;
    public static final boolean isTest18 = true;

    @Test(priority = 1, enabled = isTest16, groups = {"admin"})
    public void testPrettyWomenPageTest12() {
        searchPage.clickPrettyWomenLink();
        String currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlPrettyWomen);
        mainPage.javaWaitSec(3);
        int sizeOfDropDownListMinAge = searchPage.getSizeDropDownList(Locators.MIN_AGE_DROPDOWN_LIST);
        System.out.println(sizeOfDropDownListMinAge);
        for (int i = 0; i < 5; i++) {

            searchPage.selectItemDropDownRandomOption(Locators.MIN_AGE_DROPDOWN_LIST, "age_min");
            mainPage.javaWaitSec(5);
        }
        int sizeOfDropDownListMaxAge = searchPage.getSizeDropDownList(Locators.MAX_AGE_DROPDOWN_LIST);
        System.out.println(sizeOfDropDownListMaxAge);
        for (int i = 0; i < 5; i++) {

            searchPage.selectItemDropDownRandomOption(Locators.MAX_AGE_DROPDOWN_LIST, "age_max");
            mainPage.javaWaitSec(5);
        }
    }

    @Test(dataProvider = "Search", dataProviderClass = DataProviders.class, priority = 2, enabled = isTest17, groups = {"ie"})
    public void searchDifferentResults1(String minAge, String maxAge, String sortBy) {
        int min = Integer.parseInt(minAge);
        int max = Integer.parseInt(maxAge);
        System.out.println(min);
        System.out.println(max);
        searchPage.clickPrettyWomenLink();
        searchPage.getDropDownListByText(driver.findElement(Locators.MIN_AGE_DROPDOWN_LIST), minAge);
        searchPage.getDropDownListByText(driver.findElement(Locators.MAX_AGE_DROPDOWN_LIST), maxAge);
        searchPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_SORT_BY), sortBy);
        searchPage.selectButtonNext();

        List<WebElement> infoAboutUser = driver.findElements(Locators.TEXT_INFO_USER);
        for (int i = 0; i < infoAboutUser.size(); i++) {
            WebElement text = infoAboutUser.get(i);
            String info = text.getText();
            System.out.println(info);
            infoAboutUser = driver.findElements(Locators.TEXT_INFO_USER);

        }
    }

    @Test(dataProvider = "Search", dataProviderClass = DataProviders.class, priority = 3, enabled = isTest18, groups = {"ie"})
    public void searchDifferentResults2(String minAge, String maxAge, String sortBy) {
        int min = Integer.parseInt(minAge);
        int max = Integer.parseInt(maxAge);

        searchPage.clickPrettyWomenLink();
        searchPage.getDropDownListByText(driver.findElement(Locators.MIN_AGE_DROPDOWN_LIST), minAge);
        searchPage.getDropDownListByText(driver.findElement(Locators.MAX_AGE_DROPDOWN_LIST), maxAge);
        searchPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_SORT_BY), sortBy);
        searchPage.selectButtonNext();

        List<WebElement> infoAboutUser = driver.findElements(Locators.TEXT_INFO_USER);
        for (int i = 0; i < infoAboutUser.size(); i++) {
            if (i % 2 == 0) {
                WebElement text = infoAboutUser.get(i);
                String info = text.getText();
                String[] splitedPhrase = info.split(", ");
                String age = splitedPhrase[1];
                int ageNumber = Integer.parseInt(age);

                if (min <= ageNumber || ageNumber <= max) {
                    System.out.println("This age: " + ageNumber + " is correct");
                } else {
                    Assert.fail("Wrong age: " + ageNumber);
                }
            }

            mainPage.javaWaitSec(3);
            infoAboutUser = driver.findElements(Locators.TEXT_INFO_USER);

        }
    }
}


