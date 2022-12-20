package com.abdoa.java8demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

	public static void main(String[] args) {
		
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Predicate<Integer> function = (x) -> x>5;
		
		System.out.println(numberList.stream().filter(function.negate()).collect(Collectors.toList()));

	}

}
