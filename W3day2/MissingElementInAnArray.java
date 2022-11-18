package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {
	
	// Here is the input
			//int[] arr = {1,2,3,4,7,6,8};

			// Sort the array	
			

			// loop through the array (start i from arr[0] till the length of the array)

				// check if the iterator variable is not equal to the array values respectively
				
					// print the number
					
					// once printed break the iteration

	public static void main(String[] args) {
		
		Integer[] arr = {1,2,3,4,7,6,8};
		List <Integer> lst=new ArrayList<Integer>(Arrays.asList(arr));
		Collections.sort(lst);
		System.out.println(lst);
		for (int i = 0; i <= lst.size()-1; i++) {
			Integer a = lst.get(i);
			        int b = i+1;
				
				if (a!=(b)) {
					
					System.out.println("The missing value is "+(i+1));
					
					break;
				
				}
	
		}
	}
}
		
		
		
	


