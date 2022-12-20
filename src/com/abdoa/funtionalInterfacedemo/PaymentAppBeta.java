package com.abdoa.funtionalInterfacedemo;

public class PaymentAppBeta implements Payment{
    @Override
    public void doPayment(String sourceAccount, String destinationAccount) {
        String txDate = Payment.dateFormat("dd-MM-yyyy");
    }
}
