package com.practice.seleniumdesign.template.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonProductDescriptionPage {
    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(css = ".a-price")
    private WebElement price;

    public AmazonProductDescriptionPage(WebDriver driver){

        this.driver=driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);

    }
    public void buy() {
        this.wait.until((d) -> price.isDisplayed());
        System.out.println(price.getText());
    }
}
