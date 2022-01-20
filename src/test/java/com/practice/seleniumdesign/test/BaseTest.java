package com.practice.seleniumdesign.test;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setUpDriver(){
        System.setProperty("webdriver.chrome.driver","\\Users\\siddis11\\Downloads\\chromedriver_win32\\chromedriver.exe");
    this.driver=new ChromeDriver();
    }


    @AfterTest
    public void quitDriver(){

        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        this.driver.quit();
    }
}
