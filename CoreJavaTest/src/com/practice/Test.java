package com.practice;

class A{
     static Integer m1(int d){
         System.out.println("Class A");
       return d;
    }
}
class B extends A{
     static Integer m1(int s){
         System.out.println("Class B");
       return s;
    }
}

public class Test {
    public static void main(String[] args) {
        A a= new B();
        System.out.println("Output is : "+a.m1(1));
    }
}




