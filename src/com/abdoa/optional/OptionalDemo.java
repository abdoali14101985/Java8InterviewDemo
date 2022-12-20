package com.abdoa.optional;

import javax.sound.midi.Soundbank;
import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        String str1 = "";
        Optional<String> optionalString1 = Optional.ofNullable(str1);

        System.out.println(optionalString1.get());

        String str2 = null;
        Optional<String> optionalString2 = Optional.ofNullable(str2);

        System.out.println(optionalString2.orElse("Default"));


    }

}
