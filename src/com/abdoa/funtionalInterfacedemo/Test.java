package com.abdoa.funtionalInterfacedemo;

import java.util.function.Function;

public class Test {

    public static void main(String[] args) {
        MyFunction1 function = (i) -> System.out.println("Number passed to function is: "+ i);
        function.test(67);

        MyFunction2  function2 = (i) -> i*2;
        System.out.println("Double of 10 is : "+ function2.multiplyByTwo(10));

        Function function3 = (t) ->  "Output: "+t;
        System.out.println(function3.apply(69));
    }
}
