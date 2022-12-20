package com.abdoa.java8demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaAndMethodReference {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Abdo","Ali","Amena","Batul","Sakina");
		// With Anonymous class
		names.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
			
		});
		System.out.println("------------------");
		// With lambda
		names.forEach(str -> System.out.println(str));

		System.out.println("------------------");
		// With method refrence
		names.forEach(System.out::println);
		
		// with for loop
		System.out.println("------------------");
		for (int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		
		// with for loop
		System.out.println("------------------");
		for(String t: names) {
			System.out.println(t);
		}
	}

}
