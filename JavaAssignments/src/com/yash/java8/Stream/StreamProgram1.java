package com.yash.java8.Stream;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 
 * @author sourabh.tank
 *  1. WAP to find the average price of item from the list of given items. 
 *  2. WAP to print detail of item which is having highest and lowest price. (separate programs should be used.) 
 *  3. WAP to print the item with maximum price and not having any expiry date(item like water bottle, and dresses 
 *  not having any expiry date) 
 *  4. WAP to store item name and price from list to set. 
 *  5. WAP to remove duplicate prices from the list of the items.
 */
public class StreamProgram1 {

	public static void main(String[] args) throws Exception {
		ArrayList<Item> itemList = new ArrayList<Item>();
		itemList.add(0, new Item(101, "chocoCake", 200.50f, LocalDateTime.now(), LocalDateTime.now()));
		itemList.add(1, new Item(102, "orangecandy", 100.50f, LocalDateTime.now(), LocalDateTime.now()));
		itemList.add(2, new Item(103, "muffins", 250.50f, LocalDateTime.now(), LocalDateTime.now()));
		itemList.add(3, new Item(104, "vanilaCake", 200.50f, LocalDateTime.now(), LocalDateTime.now()));
		itemList.add(4, new Item(105, "new pastery", 100.50f, LocalDateTime.now(), LocalDateTime.now()));
		itemList.add(5, new Item(106, "old pastery", 100.50f, LocalDateTime.now(), LocalDateTime.now()));
		itemList.add(6, new Item(107, "brownie", 80.50f, LocalDateTime.now(), LocalDateTime.now()));
		itemList.add(7, new Item(108, "chocoCake", 200.50f, LocalDateTime.now(), LocalDateTime.now()));
		itemList.add(8, new Item(109, "brownie", 80.50f, LocalDateTime.now(), LocalDateTime.now()));
		itemList.add(9, new Item(110, "vanilaCake", 200.50f, LocalDateTime.now(), LocalDateTime.now()));

		//1.
		averagePrice(itemList);
		//2.
		highestPrice(itemList);
		//2.
		lowestPrice(itemList);
		//4.5.
		storeFromListToSet(itemList);
		
	}

	private static void averagePrice(ArrayList<Item> itemList) {

	}

	private static void highestPrice(ArrayList<Item> itemList) {
		Optional<Item> max = itemList.stream().max(Comparator.comparing(Item::getPrice));
		System.out.println("The Highest Price is - " + max.get().getPrice());
	}

	private static void lowestPrice(ArrayList<Item> itemList) {
		Optional<Item> min = itemList.stream().min(Comparator.comparing(Item::getPrice));
		System.out.println("The Lowest Price is - " + min.get().getPrice());
	}

	private static void storeFromListToSet(ArrayList<Item> itemList) {
		
		Set<Item> setItemList = itemList.stream().map(item -> new Item(item.getItemName(), item.getPrice()))
		.collect(Collectors.toSet());
		setItemList.stream().collect(Collectors.toSet()).forEach(System.out::println);
		//System.out.println(setItemList.toString());
	}
	
	
	
}
