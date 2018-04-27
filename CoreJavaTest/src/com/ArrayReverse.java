package com;

import java.util.Scanner;

public class ArrayReverse {

    public static int[] reverseArray(int dataArray[]){
        int result[] = new int[dataArray.length];
        int j;
        int i;
        for (i = dataArray.length-1,j=0; i>=0 ; j++,--i) {
            result[j] = dataArray[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int arraySize = 0;
        System.out.println("Enter array size");
        arraySize = s.nextInt();

        int dataArray[] = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            dataArray[i] = s.nextInt();
        }

        int resultArray[] = reverseArray(dataArray);
        for (int data:resultArray) {
            System.out.print(data+" ");
        }
    }
}
