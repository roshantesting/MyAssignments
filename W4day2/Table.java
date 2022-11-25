package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		
		List<WebElement> row1 = driver.findElements(By.xpath("//table[@cellspacing='0']//tr"));
		System.out.println("The no of Row present "+row1.size());
		List<WebElement> col = driver.findElements(By.xpath("//table[@cellspacing='0']//th"));
		System.out.println("The no of Column present "+col.size());
		
		WebElement learn = driver.findElement(By.xpath("//table[@cellspacing='0']//tr[3]//td[2]"));
	
		String text = learn.getText();
		
		System.out.println("Progress value of Learn to interact with Elements is "+text);
		
		List<WebElement> data1 = driver.findElements(By.xpath("//table[@cellspacing='0']//td[2]"));
		List<Integer> in =new ArrayList<Integer>();
		for (WebElement ele : data1) {
			
			String val = ele.getText();
			String num = val.replaceAll("[^0-9]", "");
			int parseInt = Integer.parseInt(num);
			in.add(parseInt);
		
		}
			System.out.println(in);
		Collections.sort(in);
		Thread.sleep(1000);
		Integer integer = in.get(0);
		driver.findElement(By.xpath("//font[contains(text(),'"+integer+"%')]//following::input")).click();
	
	
	
	}

}
