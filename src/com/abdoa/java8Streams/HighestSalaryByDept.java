package com.abdoa.java8Streams;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class HighestSalaryByDept {

    public static void main(String[] args) {

        List<Employee> employees = Stream.of(
                new Employee("name1", "DEV", 50000),
                new Employee("name2", "IT", 45000),
                new Employee("name3", "DEV", 65000),
                new Employee("name4", "IT", 35000),
                new Employee("name5", "HR", 25000)
        ).collect(Collectors.toList());

        Map<String, List<Employee>> employeesByDept = employees.stream()
                .collect(groupingBy(Employee::getDepartment));
        System.out.println(employeesByDept);

        Comparator<Employee> compareBySalary = Comparator.comparing(Employee::getSalary);
        Map<String, Optional<Employee>> highestSalaryEmployeeByDept = employees.stream().collect(
                groupingBy(Employee::getDepartment,
                        Collectors.reducing(BinaryOperator.maxBy(compareBySalary))));
        System.out.println(highestSalaryEmployeeByDept);

        //Approach 2
        Map<String, Employee> highestSalaryEmployeeByDept2 = employees.stream().collect(
                groupingBy(
                        Employee::getDepartment,
                        collectingAndThen(maxBy(Comparator.comparingLong(Employee::getSalary)), Optional::get))
        );
        System.out.println(highestSalaryEmployeeByDept2);
    }
}
