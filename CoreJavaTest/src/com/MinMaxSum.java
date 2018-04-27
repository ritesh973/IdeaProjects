package com;

import java.util.Scanner;

public class MinMaxSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = scanner.nextInt();
        int dataArray[] = new int[n];
        System.out.println("Provide Value one by one");
        for (int i = 0; i <n ; i++) {
            dataArray[i]=scanner.nextInt();

        }
        miniMaxSum(dataArray);
    }

    static void miniMaxSum(int[] arr) {
        long maxSum=0;
        long minSum=0;

        for (int i = 0; i < arr.length; i++) {
            long temp=0;
            for (int j = 0; j <arr.length ; j++) {
               if (i==j)
                   continue;
                temp+=arr[j];
            }
            if (i==0)
                minSum=temp;
            if(temp>maxSum) {
                maxSum = temp;
            }
            if (temp<minSum)
                minSum = temp;
        }
        System.out.println("Max Sum "+maxSum);
        System.out.println("Min Sum "+minSum);

    }
}
