package com.abdoa.java8demo;


import java.util.function.BiConsumer;

public class LambdaDemo {

	public static void main(String[] args) {
		LambdaDemo demo = new LambdaDemo();
		demo.add(10,5);
		BiConsumer<Integer, Integer> biConsumer = (a,b)-> System.out.println(a+b);
		biConsumer.accept(10, 5);
		/*
		 * WebPage wp1 = new WebPage() {
		 * 
		 * @Override public void header(String value) {
		 * System.out.println("Header value is: "+value);
		 * 
		 * } };
		 */
		WebPage wp1 =value -> System.out.println("Header value is: "+value);;
		wp1.header("Google");
		
	}

	private void add(int i, int j) {
		System.out.println(i+j);
		
	}

}
