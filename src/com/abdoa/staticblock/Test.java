package com.abdoa.staticblock;

public class Test {
    public static void main(String[] args) {
        StaticBlock3 obj1 = StaticBlock3.createObject();
        System.out.println(obj1.age);

        //StaticBlock4 s4 = new StaticBlock4();
        System.out.println(StaticBlock4.age);

    }

}
