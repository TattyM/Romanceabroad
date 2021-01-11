package com.romanceabroad.ui;

import org.testng.annotations.DataProvider;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DataProviders {


    @DataProvider(name = "JoinToday")
    public static Object[][] testRegistration() {
        return new Object[][]{
                {Data.email1, Data.username, true},
                {Data.email2, Data.username, false},
                {Data.email3, Data.username, true}
        };
    }

    @DataProvider(name = "SingIn")
    public static Object[][] testSingInTest() {
        return new Object[][]{
                {Data.emptyField, Data.emptyField}, // blank email and password fields
                {Data.email1, Data.emptyField},     // correct email and blank password
                {Data.emptyField, Data.username},   // blank email and correct password
                {Data.email4, Data.password1},      // incorrect email and password
        };
    }

    @DataProvider(name = "Search")
    public static Object[][] testSearchInputs() {
        return new Object[][]{
                {"18", "80", "Default"},
                {"25", "26", "Name"},
                {"40", "65", "Views"},
                {"37", "79", "Registration date"},
        };
    }
    @DataProvider(name = "ContactUsForm")
    public static Object[][] testFormFooter() {
        return new Object[][]{
                {Data.reason2, Data.name, Data.email1,Data.select,Data.message,Data.code},

        };
    }

    @DataProvider(name = "JoinToday2")
    public static Object[][] testRegistration2() throws Exception {
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("JoinToday.csv")).stream().forEach(s -> {
            String[] data = s.split(",");
            out.add(new Object[]{data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]});
        });
        return out.toArray(new Object[out.size()][]);
    }

    @DataProvider(name = "InputsSearch")
    public static Object[][] testGifts() throws Exception {
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("InputsSearch.csv")).stream().forEach(s -> {
            String[] data = s.split(",");
            out.add(new Object[]{data[0]});
        });
        return out.toArray(new Object[out.size()][]);
    }

    @DataProvider(name = "QuestionForm")
    public static Object[][] testContactUsForm() throws Exception {
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("QuestionForm.csv")).stream().forEach(s -> {
            String[] data = s.split(",");
            out.add(new Object[]{data[0], data[1], data[2], data[3], data[4]});
        });
        return out.toArray(new Object[out.size()][]);
    }
}
