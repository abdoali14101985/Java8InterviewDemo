package com.abdoa.funtionalInterfacedemo;

public class PaymentAppAlpha {
    public static void main(String[] args) {
        Payment payment = (sourceAccount, destinationAccount) ->
                System.out.println("Payment done from account "+sourceAccount+" to account "+ destinationAccount);
        payment.doPayment("1234", "6789");
    }

}
