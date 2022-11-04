package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		int num=34343;
		int remainder,sum=0,temp;
		 temp=num;
			
		while(num>0)
		{
			remainder=num%10;
			sum=(sum*10)+remainder;
			num=num/10;
			
		}
		if(temp==sum)
		{
			System.out.println(temp + "  is palindrome");
		}
		else
		{
			System.out.println(temp + "  is not palindrome");
			
			
		}
	}
	
	}



