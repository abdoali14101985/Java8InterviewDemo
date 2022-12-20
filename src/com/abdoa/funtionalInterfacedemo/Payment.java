package com.abdoa.funtionalInterfacedemo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface Payment {
//forces implementation class to override it
    void doPayment(String sourceAccount, String destinationAccount);

    // do not need to override in implementation class
    default double getScratchCard(){
        return new Random().nextDouble();
    }

    //To provide some utility methods

    static String dateFormat(String pattern){
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(new Date());
    }
}
