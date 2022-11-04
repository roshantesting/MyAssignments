package week1.day2;

import java.util.Arrays;

public class FindtheMissingNo {

	public static void main(String[] args) {
		
		int[] num={1,2,3,4,7,6,8};
		Arrays.sort(num);
		
		for (int i = 0; i <= num.length-1; i++) {
			
			if (num[i]!= (i+1)) {
               System.out.println((i+1));
               break;
               
			}
			
		}

	}

}
