package com.abdoa.java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap {

	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(
				new Customer("Tom", 30),
				new Customer("Steve", 31),
				new Customer("Peter", 34),
				new Customer("Simon", 23)
				);
		String name =customers.stream()
				 			  .filter(c -> "peter".equalsIgnoreCase(c.getName()))
				 			  .map(Customer::getName)
				 			  .findAny()
				 			  .orElse(null);
		System.out.println(name);
		System.out.println("------------------------");
		List<String>nameList=customers.stream()
		  		 					  .map(Customer::getName)
		  		                      .collect(Collectors.toList());
		nameList.forEach(System.out::println);
		  

	}

}
