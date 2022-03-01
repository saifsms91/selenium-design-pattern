package com.practice.seleniumdesign.test.command;

import com.practice.seleniumdesign.command.HomePage;
import com.practice.seleniumdesign.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    private HomePage homePage;

    @BeforeTest
    public void setHomePage(){
        this.homePage = new HomePage(driver);


    }

    @Test
    public void homePageTest(){
        this.homePage.goTo();
        this.homePage.getElementValidator()
                .stream().parallel()
                .parallel()
                .map(ev -> ev.validate())
                .forEach(b -> Assert.assertTrue(b));
    }
}
