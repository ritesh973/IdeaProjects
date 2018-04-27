package com.practice;

public class SPatternTest {

    public static void main(String[] args) {
        int row = 4;
        int col = 3;
        int fcount = 0;
        int lcount = 0;
        int divider = (row/2)+(row%2);
        System.out.println(divider);
        for (int i=0;i<divider;i++){
            for (int j=0;j<col;j++){
                ++fcount;
                System.out.print(fcount);
                if(j<col-1)
                    System.out.print("*");

            }
            for (int k=0;k<col;k++){
                ++fcount;
            }
            System.out.println();
        }
        for (int i=0;i<divider-1;i++){
            for (int j=0;j<col;j++){
                ++lcount;
            }
            for (int k=0;k<col;k++){
                System.out.print(lcount);
                if(k<col-1)
                    System.out.print("*");
            }
            System.out.println();
    }
}
}
