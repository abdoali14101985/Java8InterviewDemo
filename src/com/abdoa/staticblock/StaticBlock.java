package com.abdoa.staticblock;

public class StaticBlock {

    static{
        System.out.println("static block1");
    }

    static{
        System.out.println("static block2");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }
    static{
        System.out.println("static block3");
    }
}
