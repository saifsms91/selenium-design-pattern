package com.practice.seleniumdesign.command;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DismissalAlertValidator extends ElementValidator{

    private final WebElement dismissalAlert;

    public DismissalAlertValidator(final WebElement element) {
        this.dismissalAlert = element;
    }

    @Override
    public boolean validate() {

        boolean result1 = this.dismissalAlert.isDisplayed();
        this.dismissalAlert.findElement(By.cssSelector("button.close"));

        boolean result2 = this.dismissalAlert.isDisplayed();

        return result1 && (!result2);
    }
}
