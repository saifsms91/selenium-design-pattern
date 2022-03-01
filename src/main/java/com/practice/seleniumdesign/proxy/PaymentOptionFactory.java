package com.practice.seleniumdesign.proxy;

import java.util.HashMap;
import java.util.function.Supplier;

public class PaymentOptionFactory {

    private static final Supplier<PaymentOption> CC = () -> new CreditCard();
    private static final Supplier<PaymentOption> NB = () -> new NetBanking();

    private static final java.util.Map<String, Supplier<PaymentOption>> Map = new HashMap<>();

    static {

        Map.put("CC", CC);
        Map.put("NB", NB);
    }

    public static PaymentOption get(String option) {

        return Map.get(option).get();
    }
}
