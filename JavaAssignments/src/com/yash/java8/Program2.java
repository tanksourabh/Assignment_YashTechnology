package com.yash.java8;

import java.util.Scanner;

@FunctionalInterface
interface StringInterface{
    String isSubStringPresent(String str,String sub);
}
public class Program2 {



   public static void main(String[] args) {
           
        StringInterface obj = (str,sub) ->{
            
            if(str.contains(sub)) {
                return "String is present";
            }else {
                return "String not found";
            }
        };
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name-");
        String str = sc.next();
        System.out.println("Enter the checkname");



       String sub = sc.next();
        
        System.out.println(obj.isSubStringPresent(str, sub));
        




   }

    }