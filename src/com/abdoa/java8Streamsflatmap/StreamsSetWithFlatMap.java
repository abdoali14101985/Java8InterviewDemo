package com.abdoa.java8Streamsflatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSetWithFlatMap {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setName("Ali");
		emp1.addDevice("Galaxy Note 10");
		emp1.addDevice("Tab A 10");
		emp1.addDevice("Surface Pro 7");
		
		Employee emp2 = new Employee();
		emp2.setName("Batul");
		emp2.addDevice("S10E");
		emp2.addDevice("Tab A 10");
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		
		List<String> distinctDevices=empList.stream()
											.map(x->x.getDevices())
											.flatMap(x->x.stream())
											.distinct()
											.collect(Collectors.toList());
		
			distinctDevices.forEach(System.out::println);   

	}

}
