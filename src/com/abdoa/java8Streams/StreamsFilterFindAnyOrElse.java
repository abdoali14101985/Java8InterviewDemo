package com.abdoa.java8Streams;

import java.util.Arrays;
import java.util.List;

public class StreamsFilterFindAnyOrElse {

	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(
				new Customer("Tom", 30),
				new Customer("Steve", 31),
				new Customer("Peter", 34),
				new Customer("Simon", 23)
				);
		//FindAny
		Customer customer=customers.stream()
			     .filter(c -> "peter".equalsIgnoreCase(c.getName()))
			     .findAny()
			     .orElse(null);
		System.out.println(customer.toString());
		System.out.println("-----------------------------");
		Customer customer1=customers.stream()
			     					.filter(c -> "naveen".equalsIgnoreCase(c.getName()))
			     					.findAny()
			     					.orElse(null);
		System.out.println(customer1);
		
		System.out.println("-----------------------------");
		//Multiple Conditions
		Customer customer2=customers.stream()
			     					.filter(c -> "Simon".equalsIgnoreCase(c.getName()) && 20<c.getAge())
			     					.findAny()
			     					.orElse(null);
		System.out.println(customer2);
		
	}

}
