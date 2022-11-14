package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String input1 = "equal";
		String input2 = "leqau";
		
		char[] char1 = input1.toCharArray();
		char[] char2 = input2.toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
			
		if (Arrays.equals(char1, char2)) {
			System.out.println("It is Anagram");
		}
		
		else {
			System.out.println("It is Not Anagram");
		
		}
	} 

}
