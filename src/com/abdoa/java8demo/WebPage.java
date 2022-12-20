package com.abdoa.java8demo;

@FunctionalInterface
public interface WebPage {
	
	void header(String value);
	public static void footer(String value) {
		
	}
	
	default void body() {
		
	}

}
