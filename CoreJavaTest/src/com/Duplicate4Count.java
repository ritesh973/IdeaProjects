package com;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate4Count {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Array Length");

        int size = scanner.nextInt();

        int dataArray[] = new int[size];
        System.out.println("Enter Array Data one by one");

        for (int i = 0; i <dataArray.length ; i++) {
            dataArray[i] = scanner.nextInt();
        }
        findDuplicateCount(dataArray);

    }


    public  static void findDuplicateCount(int data[]){
        int duplicateCount = 0;
        for (int i = 0; i <data.length-3 ; i++) {
            int temp[] = new int[4];
            for (int j = i,k=0; j <i+4 ; j++,k++) {
                temp[k]=data[j];
            }
            System.out.print(Arrays.toString(temp));
            for (int j = 0; j < temp.length; j++) {
                for (int k = j+1; k <temp.length ; k++) {
                    if (temp[j]==temp[k])
                        duplicateCount++;
                }
            }
            System.out.println();
        }
        System.out.println("Duplicate Count :"+duplicateCount);

    }

}

