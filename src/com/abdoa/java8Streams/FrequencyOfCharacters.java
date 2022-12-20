package com.abdoa.java8Streams;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String input = "AbdoAli";

        Map<String, Long> characterCount = Arrays.stream(input.toLowerCase().split(""))
                .collect(
                        groupingBy(identity(), counting())
                );

        System.out.println(characterCount);

    }
}
