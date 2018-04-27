package com;

import java.util.Scanner;

public class StairCaseProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter stair length");
        int n = scanner.nextInt();
        staircase(n);
        
    }
    public static void staircase(int n){
        for (int i = 0,k=n-1; i <n ; i++,--k) {
            for (int j = 0; j <n ; j++) {
                if(j<k) {
                    System.out.print(" ");
                }else {
                    System.out.print("#");
                }
            }
            System.out.println("");

        }

    }
}
