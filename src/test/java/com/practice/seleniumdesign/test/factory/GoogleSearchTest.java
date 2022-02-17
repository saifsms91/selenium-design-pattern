package com.practice.seleniumdesign.test.factory;

import com.practice.seleniumdesign.factory.GoogleFactory;
import com.practice.seleniumdesign.factory.GooglePage;
import com.practice.seleniumdesign.test.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {

    private GooglePage googlePage;

    @Test(dataProvider = "getData")
    public void searchTest(String language,String keyword){
        this.googlePage= GoogleFactory.get(language,this.driver);
        this.googlePage.launchSite();
        this.googlePage.search(keyword);
        int resultCount = this.googlePage.getResultCount();
        System.out.println("Result Count:" + resultCount);

    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{

                {"ENG","Selenium"},
                {"FR","Selenium"},
                {"SA","Selenium"},
                {"ES","Selenium"},


        };
    }
}
