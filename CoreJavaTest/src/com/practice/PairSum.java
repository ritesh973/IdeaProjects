package com.practice;

import java.util.ArrayList;
import java.util.List;

public class PairSum {

    public static void main(String[] args) {
        int arr[] = {1,5,4,9,14,7,-2,-1};
        int num = 6;
        List<String> pairs  = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==num){
                    pairs.add(arr[i]+","+arr[j]);
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
        for (String val:pairs) {
            System.out.println(val);

        }

    }

}
