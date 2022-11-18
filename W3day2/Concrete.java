package week3.day2;

public class Concrete extends Language implements AutomationTool {

	
		public static void main(String[] args) {
			
			Concrete obj=new Concrete();
			obj.java();
			obj.python();
			obj.selenium();
			obj.playwright();
			
		}

		public void selenium() {
			
			System.out.println("This is Seleinium");
			
		}

		public void playwright() {
			
			System.out.println("This is playwright");
			
		}

		@Override
		public void python() {
			
			System.out.println("This is Phthon");
			
		}
	
	
	

//	ClassRoom:
//		Abstract class-Language(two method java(Im),python(Um))
//		interface-one interface(Automation tool)( two methods(Um)-selenium,playwright )
//		Concrete class-Testing call and implement the un implemented method
//	
	
	
	
	
}
