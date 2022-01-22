package com.practice.seleniumdesign.srp.result;

import com.practice.seleniumdesign.srp.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends AbstractComponent {


    @FindBy(id = "hdtb")
    private WebElement bar;

    @FindBy(linkText = "Images")
    private WebElement images;

    @FindBy(xpath = "//div[@aria-current='page']")
    private WebElement news;

    public void goToImages(){

        this.images.click();
    }

    public void goToNews(){

        this.news.click();
    }
    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d)->this.bar.isDisplayed());
    }
}
