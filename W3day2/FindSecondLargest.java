package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	
	public static void main(String[] args) {
		
//		// Here is the input
//				int[] data = {3,2,11,4,6,7};
//
//				
//				/*
//				 Pseudo Code:
//				 1) Arrange the array in ascending order
//				 2) Pick the 2nd element from the last and print it
//				 */

		
		Integer[] data = {3,2,11,4,6,7};
		List<Integer> lst= new ArrayList<Integer>(Arrays.asList(data));
		
		Collections.sort(lst);
		int size = lst.size();
		
		
		System.out.println(lst);
		System.out.println("The second Largest no is "+lst.get(size-2));
		
			
			
		}
		
		
	}


