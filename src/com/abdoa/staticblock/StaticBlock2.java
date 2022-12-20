package com.abdoa.staticblock;

public class StaticBlock2 {
    static {
        System.out.println("Static block");
    }

    public static void test(){
        System.out.println("Test method");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        test();
    }
}
