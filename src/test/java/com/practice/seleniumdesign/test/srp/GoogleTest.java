package com.practice.seleniumdesign.test.srp;

import com.practice.seleniumdesign.srp.main.GoogleMainPage;
import com.practice.seleniumdesign.srp.result.GoogleResultPage;
import com.practice.seleniumdesign.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    GoogleResultPage googleResultPage;
    GoogleMainPage googleMainPage;

    @BeforeTest
    public void setUpPages(){
        this.googleMainPage = new GoogleMainPage(driver);
        this.googleResultPage = new GoogleResultPage(driver);
    }

    @Test(dataProvider = "getData")
    public void googleWorkFlow(String keyword,int index){

//        String keyWord = "Selenium Webdriver";
//        int index = 3;
        googleMainPage.goTO();
        Assert.assertTrue(googleMainPage.getSearchWidget().isDisplayed());
        googleMainPage.getSearchWidget().enter(keyword);
        Assert.assertTrue(googleMainPage.getSearchSuggestion().isDisplayed());
        googleMainPage.getSearchSuggestion().clickSuggestionByIndex(index);
        Assert.assertTrue(googleResultPage.getNavigationBar().isDisplayed());

        googleResultPage.getSearchWidget().enter(keyword);
        Assert.assertTrue(googleResultPage.getSearchSuggestion().isDisplayed());


        googleResultPage.getSearchSuggestion().clickSuggestionByIndex(index);

        googleResultPage.getNavigationBar().goToNews();
        System.out.print(googleResultPage.getResultStat().getStat());

    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {"Selenium",3},
                {"Docker",2}
        };
    }
}
