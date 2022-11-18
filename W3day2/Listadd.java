package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listadd {
	

	public static void main(String[] args) {
	
		 String[] names = {"Adam", "Ben", "Zara", "Adam", "Charlie", "James", "Ben"};
	        List<String> lst = new ArrayList<String>();
	        for (int i = 0; i < names.length; i++) {
	            lst.add(names[i]);
	            Collections.sort(lst);
	        }
	        for (int i = 0; i < lst.size() - 1; i++) {
	            if (lst.get(i) == lst.get(i + 1)) {
	                System.out.println(lst.get(i));
	            }
	        }
	        System.out.println(lst);
	    }
	
	
		
	}


