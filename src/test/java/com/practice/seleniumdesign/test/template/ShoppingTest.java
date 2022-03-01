package com.practice.seleniumdesign.test.template;

import com.practice.seleniumdesign.template.AmazonShopping;
import com.practice.seleniumdesign.template.ShoppingTemplate;
import com.practice.seleniumdesign.test.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ShoppingTest extends BaseTest {


    @Test(dataProvider = "getData")
    public void shoppingTest(ShoppingTemplate shoppingTemplate) {
        shoppingTemplate.shop();

    }

    @DataProvider
    public Object[] getData() {
        return new Object[]{
      new AmazonShopping(driver, "samsung")
            //  new EBayShopping(driver, "samsung")
        };
    }


}
