package com.yash.java8;

import java.util.Scanner;

/*
user will enter following sequences 1,2,3,4,6,7,8,11,13,14,15,19,20,21.
You have to generate following output.
1-4,6-8,11,13-15,19-21.

*/


interface Sequence{

    void sqnce(int a[]);
}


public class Program5 {

   public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[] {1,2,3,4,6,7,8,11,13,14,15,19,20,21};

       System.out.println("1");
        for(int i=0;i<arr.length-1;i++) {
        if(arr[i]+2-arr[i+1]==1) {
        //    System.out.println(arr[i]);
        }

       else

            System.out.println("---");
        System.out.println(arr[i+1]);

   }

       Sequence obj=(int[] x)->{

        };




}
    }
