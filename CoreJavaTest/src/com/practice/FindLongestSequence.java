package com.practice;

import java.util.*;
import java.util.stream.Collectors;

public class FindLongestSequence {
    public static void main(String[] args) {
        System.out.println(getStringInByFrequency("vivekkumaraurangabad"));
    }
    public static  String getStringInByFrequency(String str){
        String resultString = "";
        int count;
        Map<Character,Integer> dataMap =  new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(dataMap.containsKey(str.charAt(i))){
                count = dataMap.get(str.charAt(i));
                count ++;
                dataMap.put(str.charAt(i),count++);
            }else{
                dataMap.put(str.charAt(i),1);
            }

        }
        Map<Character, Integer> resultMap = dataMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        for(Map.Entry<Character, Integer> entry:resultMap.entrySet()){
            for (int i = 0; i < entry.getValue(); i++) {
                resultString+=entry.getKey();
            }
        }
        return resultString;
    }
}


