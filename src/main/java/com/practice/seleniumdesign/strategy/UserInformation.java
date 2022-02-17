package com.practice.seleniumdesign.strategy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.jws.WebService;

public class UserInformation {

    @FindBy(id="fn")
    private WebElement firstName;
    @FindBy(id="ln")
    private WebElement lastName;
    @FindBy(id="fn")
    private WebElement email;

    public UserInformation(final WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void enterDetails(String fn,String ln,String email) {

        this.firstName.sendKeys();
        this.lastName.sendKeys();
        this.email.sendKeys();

    }
}
