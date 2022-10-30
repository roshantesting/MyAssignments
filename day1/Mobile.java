package week1.day1;

public class Mobile {
	
	private void makeCall() {
		
		String mobileModel= "Nokia";
		float mobileWeight= 156.8f;
		
		System.out.println("This is my mobile" + mobileModel);
		System.out.println("This is my mobile Weight" + mobileWeight);
		
		}
	private void sendMsg() {
		
		boolean isFullCharged = true;
		int mobileCost = 8999;
		
		System.out.println("Mobile is Charged"+ isFullCharged);
		System.out.println("This is my mobile cost" + mobileCost);
		
		}
	public static void main(String[] args) {
		
		Mobile obj=new Mobile();
		obj.makeCall();
		obj.sendMsg();
		
		
	}
	

}
