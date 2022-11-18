package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
//		/*
//		 * Pseudo Code
//		
//		 * a) Declare An array for {3,2,11,4,6,7};	 
//		 * b) Declare another array for {1,2,8,4,9,7};
//		 * c) Declare for loop iterator from 0 to array length
//		 * d) Declare a nested for another array from 0 to array length
//		 * e) Compare Both the arrays using a condition statement
//		 
//		 *  f) Print the first array (should match item in both arrays)
//		 */
//		
		
		Integer[] num1= {3,2,11,4,6,7};	
		List <Integer> lst1= new ArrayList<Integer>();
		lst1.addAll(Arrays.asList(num1));
		
		Integer[] num2= {1,2,8,4,9,7};
		List<Integer> lst2= new ArrayList<Integer>(Arrays.asList(num2));
		
		
		
//		for (int i = 0; i < num1.length; i++) {
//			for (int j = 0; j < num2.length; j++) {
//				if (num1[i]==(num2[j])) {
//					System.out.println(num1[i]);
//					
//				
		
			for (int i = 0; i < lst1.size(); i++) {
			
				for (int j = 0; j < lst2.size(); j++) {
				
					if (lst1.get(i).equals(lst2.get(i))) {
					
						System.out.println(lst1.get(i));
						break;
		
					}	
				}
				
			}
	}
}
