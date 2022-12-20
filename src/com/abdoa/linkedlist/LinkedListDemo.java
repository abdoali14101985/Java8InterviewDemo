package com.abdoa.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> demoList = new LinkedList<>();
        demoList.add("a");
        demoList.add("b");
        demoList.add("c");
        demoList.add("d");
        demoList.add("e");
        System.out.println(demoList);
        demoList.get(0);
    }
}
