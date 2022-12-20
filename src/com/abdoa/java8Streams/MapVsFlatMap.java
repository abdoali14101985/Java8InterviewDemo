package com.abdoa.java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMap {

    public static void main(String[] args) {
        List<User> users = Stream.of(
                new User("name1", "1234567890", Arrays.asList("abc@xyz.com","efg@ijk.com")),
                new User("name2", "6789012345", Arrays.asList("abc1@xyz.com","efg1@ijk.com"))
        ).collect(Collectors.toList());

        //map
        List<String> phoneNumbers = users.stream().map(User::getPhone).collect(Collectors.toList());
        System.out.println(phoneNumbers);

        //Flatmap
        List<String> emailIds = users.stream().flatMap(u -> u.getEmailIds().stream())
                .collect(Collectors.toList());
        System.out.println(emailIds);
    }
}
