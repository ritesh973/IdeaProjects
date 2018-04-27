package com;

import java.util.Arrays;
import java.util.Scanner;

public class MaxHourGlass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Row Column Size");
        int size = scanner.nextInt();
        int dataArr[][]={{1, 1, 1, 0, 0, 0},{0, 1, 0, 0, 0, 0},{1, 1, 1, 0, 0, 0},{0 ,0, 2, 4, 4, 0},{0, 0, 0, 2, 0, 0},{ 0, 0, 1, 2, 4, 0}};

//      int dataArr[][] = new int[size][size];
//        for (int i = 0; i <dataArr.length ; i++) {
//            for (int j = 0; j <dataArr.length ; j++) {
//                dataArr[i][j]=scanner.nextInt();
//            }
//
//        }
        int result = findMaxHourGlass(dataArr);

    }

    public static int findMaxHourGlass(int dataArr[][]){
        System.out.println(Arrays.deepToString(dataArr));
        for (int i = 0; i <dataArr.length-2 ; i++) {
            for (int j = 0; j < dataArr.length-2; j++) {

                System.out.println(dataArr[i][j]);
            }
            break;
        }
        return 0;

    }
}
