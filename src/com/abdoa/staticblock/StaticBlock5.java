package com.abdoa.staticblock;

public class StaticBlock5 {
    String name;
    static int age;

    static {
        StaticBlock5 obj = new StaticBlock5();
        obj.name = "Abdo Ali";
        age = 30;

        System.out.println(obj.name+" "+age);
    }

    public static void main(String[] args) {
        
    }
}
