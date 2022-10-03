package com.yash.collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Program7 {
	static Map<Program7Student, Double> smap = new HashMap<>();

	public static void main(String[] args) {

		List<Program7Student> sList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of Programme7Students");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("enter roll no.");
			int rollNo = sc.nextInt();
			System.out.println("enter Sname");
			String sname = sc.next();
			System.out.println("enter className");
			String classname = sc.next();
			System.out.println("enter total marks");
			double marks = sc.nextInt();

			sList.add(new Program7Student(rollNo, sname, classname, marks));
		}

		Collections.sort(sList, new MarksComparator());
		Collections.reverse(sList);
		System.out.println("Programme7Student who secure First,second and third position");

		if (sList.size() < 3) {
			for (Program7Student s : sList) {
				System.out.println(s.getTotalmarks());
			}
		} else {
			for (int i = 0; i < 3; i++) {
				System.out.println(sList.get(i).sname + " ");
			}
		}

		for (int i = 0; i < sList.size(); i++) {
			smap.put(sList.get(i), sList.get(i).totalmarks / sList.size());
		}

		sortedByValue();

		for (Program7Student name : smap.keySet()) {
			String key = name.toString();
			double value = smap.get(name);
			System.out.println(key + " Percentage =  " + value);
		}

	}

	private static void sortedByValue() {
		ArrayList<Double> arr = new ArrayList<>(smap.values());
		Collections.sort(arr);
		System.out.println("Programme7Student whose marks are below 50%");

		for (Double s : arr) {
			if (s < 50) {
				getKeyByValue(s);
			}
		}

		System.out.println("Programme7Student whose marks are below 35% i.e Fail");

		for (Double s : arr) {
			if (s < 35) {
				getKeyByValue(s);
			}
		}

		System.out.println("Programme7Student whose marks are above average socre");
		double totalMarksOfProgramme7Programme7Student = 0.0;
		for (Double s : arr) {
			totalMarksOfProgramme7Programme7Student += (s * smap.size());
		}
		double averageMarks = totalMarksOfProgramme7Programme7Student / smap.size();
		System.out.println("Average Marks : " + averageMarks);
		for (Double s : arr) {
			if ((s * smap.size()) > averageMarks) {
				getKeyByValue(s);
			}
		}

	}

	private static void getKeyByValue(Double mark) {
		for (Entry<Program7Student, Double> entry : smap.entrySet()) {
			if (entry.getValue() == mark) {
				System.out.println(entry.getKey().sname);
				break;
			}
		}
	}
}