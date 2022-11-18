package week3.day2;

public class Automation extends MultipleLangauge implements TestTool,Language1 {

	public void java() {
		
		System.out.println("This is java method");
	}

	public void selenium() {
		
		System.out.println("This is Selenium method");
	}

	public static void main(String[] args) {
		
		Automation obj=new Automation();
			obj.ruby();
			obj.selenium();
			obj.java();
			obj.selenium();
		
	}
}
