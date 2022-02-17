package com.practice.seleniumdesign.test.strategy;

import com.practice.seleniumdesign.strategy.PaymentOptionFactory;
import com.practice.seleniumdesign.strategy.PaymentScreen;
import com.practice.seleniumdesign.test.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.collections.Maps;

import java.util.Map;

public class PaymentScreenTest extends BaseTest {

    private PaymentScreen paymentScreen;

    @BeforeTest
    public void setPaymentScreen() {
        this.paymentScreen = new PaymentScreen(this.driver);
    }

    @Test(dataProvider = "getData")
    public void paymentTest(String option, Map<String, String> paymentDetails) {
        this.paymentScreen.goTO();
        this.paymentScreen.getUserInformation().enterDetails("saif", "t", "test@test.in");
        this.paymentScreen.setPaymentOption(PaymentOptionFactory.get(option));
        this.paymentScreen.pay(paymentDetails);
        String orderNumber = this.paymentScreen.getOrder().placeOrder();
        System.out.println("Order number : " + orderNumber);
    }

    @DataProvider
    public Object[][] getData() {

        Map<String, String> cc = Maps.newHashMap();
        cc.put("cc", "22332");
        cc.put("year", "123");
        cc.put("cvv", "333");

        Map<String, String> nb = Maps.newHashMap();
        nb.put("bank", "WELLS FARGO");
        nb.put("account", "myaccount123");
        nb.put("pin", "999");


        return new Object[][]{
                {"CC", cc},
                {"NB", nb}

        };
    }
}
