package com.abdoa.java8skipLimit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class SkipAndLimitDemo {

    public static void main(String[] args) throws IOException {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //skip 1st element and read up to 8
        intList.stream()
                .skip(1)
                .limit(7)
                .forEach(System.out::println);

        List<String> fileData = Files.readAllLines(Paths.get("data.txt"));
        //fileData.forEach(System.out::println);
        fileData.stream()
                .skip(1)
                .limit(fileData.size()-2)
                .forEach(System.out::println);
    }
}
