package com.abdoa.java8demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> func = x-> System.out.println(x);
		func.accept("This is Consumer Demo.");
		
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		numberList.forEach(System.out::println);

	}

}
