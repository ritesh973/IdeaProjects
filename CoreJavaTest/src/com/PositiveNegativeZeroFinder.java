package com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PositiveNegativeZeroFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        int length = scanner.nextInt();
        int dataArray[] = new int[length];
        int positiveCount=0;
        int negativeCount=0;
        int zeroCount =0;

        System.out.println("Enter Array data");

        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = scanner.nextInt();
        }

        for (int i = 0; i <dataArray.length ; i++) {
            if(dataArray[i]<0){
                negativeCount++;
            }
            if(dataArray[i]>0){
                positiveCount++;
            }
            if(dataArray[i]==0){
                zeroCount++;
            }
        }
        System.out.println("Positive fractions "+findFractionValue(dataArray.length,positiveCount));
        System.out.println("Negative fractions "+findFractionValue(dataArray.length,negativeCount));
        System.out.println("Zero fractions "+findFractionValue(dataArray.length,zeroCount));


    }

    public static double findFractionValue(int dataLength,int value){
        return (double)value/(double)dataLength;
    }


}
