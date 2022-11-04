package week1.day2;

public class Fibonacciseries {
	
	public static void main(String[] args) {
		
		int range=7,firstNum=0,secondNum=1;
		int sum;
		System.out.println(firstNum);
		System.out.println(secondNum);
		for(int i=1;i<range-1;i++)
		{
			sum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;

			System.out.println(sum);
			
			
		}

			}
	

}
