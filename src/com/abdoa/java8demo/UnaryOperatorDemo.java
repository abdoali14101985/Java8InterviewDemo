package com.abdoa.java8demo;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		UnaryOperator<String> function = (str) -> "Hello! "+ str;
		System.out.println(function.apply("Ali"));
	}
}
