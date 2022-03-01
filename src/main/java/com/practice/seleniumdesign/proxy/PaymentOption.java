package com.practice.seleniumdesign.proxy;

import java.util.Map;

public interface PaymentOption {
    void enterPaymentInformation(Map<String,String> paymentDetails);
}
