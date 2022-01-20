package com.practice.seleniumdesign.srp;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SearchWidget extends AbstractComponent {

    @FindBy(name = "q")
    private WebElement searchBox;

    public SearchWidget(final WebDriver driver) {
        super(driver);
    }

    public void enter(String keyword){
        this.searchBox.clear();

        for (char ch:keyword.toCharArray()) {
            Uninterruptibles.sleepUninterruptibly(20, TimeUnit.MILLISECONDS);
            this.searchBox.sendKeys(keyword);


        }


    }
    @Override
    public boolean isDisplayed() {
         this.wait.until(ExpectedConditions.visibilityOf(this.searchBox));
        return this.wait.until((d)->this.searchBox.isDisplayed());
    }
}
