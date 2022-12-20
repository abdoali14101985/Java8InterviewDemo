package com.abdoa.java8demo;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		getText(()->"Java");
		getText(()->"Abdo");
		getText(()->"Ali");

	}
	
	public static void getText(Supplier<String> text) {
		System.out.println(text.get().length());
	}

}
