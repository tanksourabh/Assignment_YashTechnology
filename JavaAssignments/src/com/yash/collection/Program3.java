package com.yash.collection;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;


/**
*
* @author sourabh.tank
*             WAP to store elements in List and remove all duplicates
*         value from it. (Numbers should be inserted). When duplicates are
*         removed print all elements in ascending order.
*/
public class Program3 {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements - ");
        int next = scan.nextInt();
        
        for (int i = 0; i < next; i++) {
            list.add(scan.nextInt());
        }
        
        System.out.println("your inserted list is -"+list);
        
        /**
         * Here we using Set for removing duplicate items as its a Set Property
         */
        HashSet<Integer> set = new HashSet<Integer>();
        set.addAll(list);
        
        System.out.println("your Update list after removing duplicate element is -"+set);
        
        Collections.sort(list);
        
    }
}