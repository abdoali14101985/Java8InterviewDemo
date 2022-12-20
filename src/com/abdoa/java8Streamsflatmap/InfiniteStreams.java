package com.abdoa.java8Streamsflatmap;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreams {

	public static void main(String[] args) {
		
		// Infinite stream is used to generate infinite stream of data
		
		//1.iterate() - static method of stream (T seed, UnaryOperator<T> function), 
		// return a stream
		List<Integer> collect=IntStream.iterate(0, n-> n+2)
			     .mapToObj(Integer::valueOf)
			     .limit(10)
			     .collect(Collectors.toList());
		System.out.println(collect);
		
		//2 generate() - static generate(Supplier<T>)
		List<Integer> collect1=Stream.generate(()-> (new Random()).nextInt(100))
			  .limit(10)
			  .collect(Collectors.toList());
		System.out.println(collect1);
		

	}

}
