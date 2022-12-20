package com.abdoa.java8Streamsflatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.BaseStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) {
		System.out.println(ForkJoinPool.commonPool().getParallelism());
		
		//1. parallel() method on stream
		Stream stream=Stream.of("Abdo","Ali","Sakina","Batul","Amena","Hatim","Altaf");
		//BaseStream parallelStream=stream.parallel();
		stream.forEach(System.out::println);
		System.out.println("---------------------");
		Stream.of("Abdo","Ali","Sakina","Batul","Amena","Hatim","Altaf").parallel().forEach(System.out::println);
		System.out.println("---------------------");
		
		//2. parallelStream() method on stream
		Arrays.asList("Abdo","Ali","Sakina","Batul","Amena","Hatim","Altaf").parallelStream().forEach(System.out::println);
		
		
		//3. print 1-10
		System.out.println("----------Sequential Stream-----------");
		IntStream.rangeClosed(1,10).forEach(System.out::println);
		System.out.println("----------Parallel Stream-----------");
		IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);
		System.out.println("---------------------");
		
		// 4 to print a-z -->97 to 122
		System.out.println(getAlphabetsList());
		System.out.println("----------Sequential Stream-----------");
		getAlphabetsList().stream().forEach(System.out::println);
		System.out.println("----------Parallel Stream-----------");
		getAlphabetsList().parallelStream().forEach(System.out::println);
		
		//5 to check stream is running in parallel mode
		IntStream range = IntStream.range(1, 10);
		System.out.println(range.isParallel());
		
		IntStream range1 = IntStream.range(1, 10);
		range1.parallel();
		System.out.println(range1.isParallel());
		
		



	}
	
	public static List<String> getAlphabetsList() {
		List<String> alpha = new ArrayList<String>();
		int n =97;
		while (n<= 122) {
			char c = (char)n;
			alpha.add(String.valueOf(c));
			n++;
		}
		return alpha;
	}

}
