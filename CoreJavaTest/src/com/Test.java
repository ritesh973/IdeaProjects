package com;

import org.jetbrains.annotations.Contract;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
//    static String name = "Sattu";
//    String title;
//    public static void myFriendName(String title) {
//        System.out.println("My Friend Name is: " + name + " " + title);
//    }
//
//    public void myName() {
//        System.out.println("My Name is: " + this.name + " " + this.title);
//    }

//    static public  void main(String[] args) {
//        System.out.println("Hii Sattu");
//    }


//        char[] data=new char[]{'h','s','e','t','i','R'};
//        String name="";
//        for (int i = data.length-1; i >=0 ; i--) {
//            name+=data[i];
//        }
//        System.out.println("My Name Is "+name);
//
//
//        Tell output
//        int arr2[] = new int[3];
//        arr2 = { 11, 22, 33 };
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i] + " ");
//        }


//                int x;
//                x = 5;
//                {
//                    int y = 6;
//                    System.out.print(x + " " + y);
//                }
//                System.out.println(x + " " + y);


//        double a, b;
//        a = 3.0;
//        b = 4.0;
//        double c = Math.sqrt(a * a + b * b);
//        System.out.println(c);


//        Test test = new Test();
//        test.title = "kumar";
//        myFriendName(test.title);
//        test.name = "Neetesh";
//        test.myName();


//        int arr2[] = new int[3];
//        arr2[] = { 11, 22, 33 };
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i] + " ");
//        }

//        int a[] = {1, 2, 3};
//        int b[] = {1, 2, 3};
//        if (a == b)
//            System.out.println("Same");
//        else
//            System.out.println("Not same");


//    }
//}


    // int a[] = new int[10]{1,2};
//       int[][] b= new int[10][9];
//               b[9]=new int[5];
//               b[8][1]=1;
//
//        System.out.println(b[8][1]);
    // System.out.println(a[0]);


//        int a[][][]= {{{1,'b',3},{2,1,1},{'g',2}},{{'a',2},{2,'r'}}};
//        System.out.println(a[1][0][0]);

//        int a[]=new char[5];
//        a=new int[5];
//        a[1]='a';
//        System.out.println(a[1]);


//        Object[] o = new String[7];
//        o[1]='a';
//        System.out.println(o[1]);

//        Object[] o = new String[7];
//        o[0]='a';
//        System.out.println(o[0]);
//
//        int a[] = new int[]{1,2,3};
//        for(int i=0;i<=a.length;i++){
//            System.out.println(a[i]);
//        }


    // }
//    public void myMethod(){
//        static String name = "Ritesh";
//        System.out.println(name);
//    }


//}
//public static  int calculateTotal(int... marks){
//    int total=0;
//    for (int mark:marks) {
//     total+=mark;
//    }
//    return total;
//
//}
//class Test{
//public static  boolean isSearchFound(int key,int ... data){
//    for (int val:data) {
//        if (val==key){
//            return true;
//        }
//
//    }
//    return false;
//}
//
//
//    public static void main(String... args) {
//
//
//        int data[]=new int[]{1,4,7,2,8,9,5,5,6};
//        boolean status=isSearchFound(3,data);
//        if (status){
//            System.out.println("Your search 3 is found");
//        }else{
//            System.out.println("Your search 3 is not found");
//        }
//    }


//    public static void main(String[] args)
//    {
//        System.out.println("Execution starts from this method");
//    }
//
//    public static void main(String[]... args)
//    {
//        System.out.println("Execution starts from this method Also");
//    }

//        public static void main(String[] args)
//        {
//            static int i, j, k = 257;
//            System.out.println(i+"------"+k+"---------"+j);
//        }

//    public static int findTotal(int...data){
//        int total=0;
//        for (int val:data) {
//            total+=val;
//        }
//        return total;
//
//    }
//    public static void myMethod() {
//        int number;
//        System.out.println(number);
//    }
//class Test{
//public static void myMethod() {
//    for(int i = 0; 0; i++)
//    {
//        System.out.println("Hello");
//        break;
//    }
//}


//    public static int[] removeElement(int data[], int index) {
//        int result[] = new int[data.length];
//        for (int i = 0; i < data.length; i++) {
//            if (i == index)
//                continue;
//            result[i] = data[i];
//        }
//        return result;
//    }
//
//    public static void main(String... args) {
//
//        int[] dataArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//
//        System.out.println(Arrays.toString(dataArray));
//        int result[] = removeElement(dataArray, 6);
//        System.out.println(Arrays.toString(result));
//    }
//}


//class Test{
//    public static void main(String[] args) {
//        int[] a = new int[10];
//        a[0] = "a";
//        System.out.println(a[0]);
//    }

    // class Test{

//    public static void main(String[] args) {
//
//    }

//}


    //class Test{
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        first:
        {
            second:
            {
                third:
                {
                    if (a < b )
                        break second;
                }
                System.out.println(a);
            }
            System.out.println(b);
            break first;

        }
        System.out.println("Hello Guys");
    }
}
