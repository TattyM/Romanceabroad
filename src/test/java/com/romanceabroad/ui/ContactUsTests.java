package com.romanceabroad.ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ContactUsTests extends BaseUI {
    @DataProvider(name = "QuestionForm")
    public static Object[][] testRegistration2() throws Exception {
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("QuestionForm.csv")).stream().forEach(s -> {
            String[] data = s.split(",");
            out.add(new Object[]{data[0], data[1], data[2], data[3], data[4]});
        });
        return out.toArray(new Object[out.size()][]);
    }

    @Test(dataProvider = "QuestionForm")
    public void testContactUs(String reason,String name,String email,String subject,String message) {
        driver.get(Data.urlContactUs);
        contactUsPage.selectReason(reason);
        contactUsPage.personalInfo(name, email);
        contactUsPage.inputSubject(subject,message, (mainPage.generateNewNumber(Data.code, 5)));
    }
}
