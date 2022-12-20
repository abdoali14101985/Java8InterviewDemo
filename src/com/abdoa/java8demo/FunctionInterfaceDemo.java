package com.abdoa.java8demo;

import java.util.function.Function;

public class FunctionInterfaceDemo {

	public static void main(String[] args) {
		Function<String, Integer> function =x -> x.length();
		int length = function.apply("This is Java 8"); 
		System.out.println(length);
		
		//chaining function
		Function<Integer, Integer> function2 =x -> x+10;
		System.out.println(function.andThen(function2).apply("This is Java 8"));
	}

}
