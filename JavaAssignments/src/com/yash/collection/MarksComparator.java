package com.yash.collection;

import java.util.Comparator;

public class MarksComparator implements Comparator<Program7Student> {



	   @Override
	    public int compare(Program7Student o1, Program7Student o2) {
	        if (o1.totalmarks == o2.totalmarks)
	            return 0;
	        else if (o1.totalmarks > o2.totalmarks)
	            return 1;
	        else
	            return -1;



	   }



	}