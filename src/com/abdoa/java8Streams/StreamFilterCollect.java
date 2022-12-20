package com.abdoa.java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCollect {

	public static void main(String[] args) {
		List<String> productList= Arrays.asList("Macbook","iPhone","Shoes","Battery Charger","Bat");
		productList.forEach(System.out::println);
		System.out.println("--------------------------");
		List<String> filteredProductList1=productList.stream()
				   .filter(p-> !p.equals("Shoes"))
				   .collect(Collectors.toList());
		filteredProductList1.forEach(System.out::println);
		System.out.println("--------------------------");
		List<String> filteredProductList2=productList.stream()
				   .filter(p-> !p.equals("iPhone"))
				   .collect(Collectors.toList());
		filteredProductList2.forEach(System.out::println);

	}

}
