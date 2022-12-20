package com.abdoa.java8Streamsflatmap;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberWithParallelStream {

	public static void main(String[] args) {
		//System.out.println(isPrime(23));
		Instant start = Instant.now();
		long count = Stream.iterate(0,n->n+1)
						   .limit(1000000)
						   .parallel()
						   .filter(PrimeNumberWithParallelStream:: isPrime)
						   .peek(System.out::println)
						   .count();
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		System.out.println(timeElapsed.toMillis()/1000); 
		System.out.println(count);
		
		//Sequential PT1M13.725S
		//parallel PT42.537S

	}
	
	public static boolean isPrime(int number) {
		if(number<= 1)return false;
		return !IntStream.rangeClosed(2, number/2)
					    .anyMatch(x->number%x==0);
	}

}
