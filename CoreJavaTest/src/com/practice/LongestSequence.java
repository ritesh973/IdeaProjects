package com.practice;

public class LongestSequence {

    public static void main(String[] args) {
        String s = "2222023450123456";  //2222023450123456 //124167874649
        int longestSequenceLength = 0;
        char prev = s.charAt(0);
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)>=prev)
                count++;
            else {
                if(count>longestSequenceLength){
                    longestSequenceLength = count;
                }
                count = 1;
            }
            prev = s.charAt(i);
        }
        if(count>longestSequenceLength){
            longestSequenceLength = count;
        }
        System.out.println("Max length of non-decreasing sequence is : "+longestSequenceLength);
    }


}
