package com.yash.java8;

import java.util.Scanner;

/**
 * 
 * @author sourabh.tank
 * WAP to print the following patterns using lambda expression
			ABCDEFEDCBA
			ABCDE EDCBA
			 ABCD DCBA
			  ABC CBA
			   AB BA
			    A A
 */
public class Program6 {
	public static void main(String[] args) {
		 // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to in the pattern ");

        int rows = scanner.nextInt();
        
        System.out.println("## Printing the pattern ##");
        
        int alphabet = 65;
        
        for(int i=0;i<= rows;i++)
        {
            for(int j=0;j<=rows-i;j++)
            {
                System.out.print((char)(alphabet+j));
            }
            for(int k=1;k<=i*2-1; k++)
            {
                System.out.print(" ");
            }
            for(int l=rows-i; l>=0; l--)
            {
                if(l!=rows)
                    System.out.print((char)(alphabet+l));
            }
           System.out.println();
        }
   	}
}