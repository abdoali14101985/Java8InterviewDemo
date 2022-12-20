package com.abdoa.java8demo;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> function1=(x,y)->x+y;
		System.out.println(function1.apply(10, 20));
		
		BiFunction<Integer,Integer, Integer> function2 = (x,y) -> x*y;
		System.out.println(function2.apply(10, 20));
	}

}
