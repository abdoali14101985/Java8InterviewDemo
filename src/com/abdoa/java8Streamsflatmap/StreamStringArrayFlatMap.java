package com.abdoa.java8Streamsflatmap;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamStringArrayFlatMap {

	public static void main(String[] args) {
		String data[][]= new String[][] {
			{"a","b"},{"c","d"},{"e","f"}
		};
		Stream<String[]> dataStream = Arrays.stream(data);
		//Apply flatmap on data stream
		Stream<String> streamFlatMap = dataStream.flatMap(x-> Arrays.stream(x));
		Stream<String>dataStreamFilter=streamFlatMap.filter(x-> "a".equals(x.toString()));
		dataStreamFilter.forEach(System.out::println);
		
		Stream<String>dataStreamFilter1=Arrays.stream(data).flatMap(x->Arrays.stream(x)).filter(s -> "b".equals(s.toString()));
		dataStreamFilter1.forEach(System.out::println);
	}

}
