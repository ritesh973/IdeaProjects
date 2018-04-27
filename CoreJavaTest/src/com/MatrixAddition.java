package com;

import java.util.Scanner;

public class MatrixAddition {
    public static int[][] findMatricsSum(int firstMatix[][],int secondMatrix[][],int row,int column){
        int result[][] = new int[row][column];
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                for (int k = 0; k < row; k++)
                {
                    result[i][j] = firstMatix[i][j] + secondMatrix[i][j];
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {

        int row =2;
        int column=2;
        int firstMatrix[][] = new int[row][column];
        int secondMatrix[][] = new int[row][column];

        Scanner s = new Scanner(System.in);


        if (row == row && column == column)
        {
            System.out.println("Enter all the elements of first matrix:");
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < column; j++)
                {
                    firstMatrix[i][j] = s.nextInt();
                }
            }
            System.out.println("Enter all the elements of second matrix:");
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < column; j++)
                {
                    secondMatrix[i][j] = s.nextInt();
                }
            }
            System.out.println("First Matrix:");
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < column; j++)
                {
                    System.out.print(firstMatrix[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("Second Matrix:");
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < column; j++)
                {
                    System.out.print(secondMatrix[i][j]+" ");
                }
                System.out.println("");
            }

            int result[][] = findMatricsSum(firstMatrix,secondMatrix,row,column);
            System.out.println("Matrix after addition:");

            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < column; j++)
                {
                    System.out.print(result[i][j]+" ");
                }
                System.out.println("");
            }

        }



    }
}
