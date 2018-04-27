package com;

import java.util.Scanner;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
//    static int birthdayCakeCandles(int n, int[] ar) {
//        int count=1;
//        int maxHeight=ar[0];
//        for (int i = 0; i <n-1 ; i++) {
//            if (maxHeight<ar[i+1]) {
//                maxHeight =ar[i+1];
//                count=1;
//                continue;
//            }
//            if (maxHeight==ar[i+1]){
//                count++;
//            }
//        }
//        System.out.println("The count of maximum elemnt "+maxHeight+" is "+count);
//        return count;
//    }
static int birthdayCakeCandles(int n, int[] ar) {
    int count=0;
    int maxHeight=0;
    for (int i = 0; i <ar.length ; i++) {
        int num=ar[i];
        if(num==maxHeight){
         count++;
        }else if(num>maxHeight){
            maxHeight = num;
            count=1;
        }

    }
    System.out.println("The count of maximum elemnt "+maxHeight+" is "+count);
    return count;
}
}
