package org.rits.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java8Intro {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,5,1);
//        numbers.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });


        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
    }
}
