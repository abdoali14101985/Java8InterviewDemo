package com.abdoa.staticblock;

public class StaticBlock3 {
    int age;
     private StaticBlock3(){
         int age = 30;
     }
     static {
         StaticBlock3 obj1 = new StaticBlock3();
     }

     public static StaticBlock3 createObject(){
         StaticBlock3 obj1 = new StaticBlock3();
         obj1.age= 20;
         return obj1;
     }
    public static void main(String[] args) {
        StaticBlock3 obj = new StaticBlock3();
        System.out.println(obj.age);
    }
}
