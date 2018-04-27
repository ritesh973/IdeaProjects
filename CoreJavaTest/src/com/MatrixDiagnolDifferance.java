package com;

import java.util.Scanner;

public class MatrixDiagnolDifferance {

    public static int findDiagnoalDifferance(int matrix[][],int length) {
        int diagonal1=0;
        int diagonal2 = 0;
        int i,j;
        for (i = 0,j=length-1;i <length ; i++,j--) {
            diagonal1+=matrix[i][i];
            diagonal2+= matrix[j][i];

        }
        return diagonal1-diagonal2;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rowColumnSize = 0;

        System.out.println("Enter array row column size");
        rowColumnSize = s.nextInt();

        int firstMatrix[][] = new int[rowColumnSize][rowColumnSize];
        System.out.println("Enter all the elements of matrix:");
        for (int i = 0; i < rowColumnSize; i++) {
            for (int j = 0; j < rowColumnSize; j++) {
                firstMatrix[i][j] = s.nextInt();
            }
        }
          int result  = findDiagnoalDifferance(firstMatrix,rowColumnSize);
        System.out.println("Result is: "+Math.abs(result));

    }
}
