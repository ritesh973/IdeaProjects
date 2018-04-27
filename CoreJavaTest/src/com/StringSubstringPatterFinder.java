package com;

import java.util.Scanner;

public class StringSubstringPatterFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your random string");
        String original = scanner.nextLine();
        System.out.println("Enter string patter to be count");
        String desiredSequence = scanner.nextLine();
        int count = sequenceCounter(original,desiredSequence);
        System.out.println("Total count of given sequence " + desiredSequence + " in original string"+original+" is:  "+ count);
    }
    private static int sequenceCounter(String original,String desiredSequence){
        int count = 0;
        for (int i = 0; i < original.length() - (desiredSequence.length() - 1); ) {
            boolean status = false;
            for (int j = 0, k = i; j < desiredSequence.length(); j++, k++) {
                if (original.charAt(k) == desiredSequence.charAt(j)) {
                    status = true;
                } else {
                    status = false;
                }
            }
            if (status) {
                count++;
                i = i + desiredSequence.length();
            } else {
                i++;
            }
        }
        return count;
    }

}

