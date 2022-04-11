package com.company;

import java.util.Comparator;
import java.util.List;


public class StreamMain {
    public static void StreamForm(List<Integer> intList) {

        System.out.println("Yes Stream");
        intList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}
