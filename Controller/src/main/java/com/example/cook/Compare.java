package com.example.cook;
import java.util.*; 
import java.io.*; 

public class Compare
{ 
	
	
	public static void main(String args[]) 
	{ 
		/* Make it private, in order to prevent the 
		creation of new instances of the Singleton 
		class. */

		// Create a random ID 
		String[] cities = {"Bang","Pune","San Fra","New York"};
        MySort ms = new MySort();
        Arrays.sort(cities,ms);
        System.out.println(cities);
        System.out.println(Arrays.binarySearch(cities, "New York"));
	} 

	static class MySort implements Comparator 
	{ 
		
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			return o2.toString().compareTo(o1.toString());
		}
	} 
}
