package week1.day2;

public class Primenumber {
	
	public static void main(String[] args) {
			
		    int n = 23;
		    boolean flag = false;
		    for (int i = 2; i <= n / 2; i++) {
		      
		      if (n % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(n + " is a Prime Number.");
		    else
		      System.out.println(n + " is not a prime number.");

   }

}


