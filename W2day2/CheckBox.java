package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");	
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		Thread.sleep(2000);
		boolean selected = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected();
		if (selected==true) {
			System.out.println("Selinium is Selected");
		}
		else {
			System.out.println("Selinium is Not Selected");
		}
		Thread.sleep(2000);
		
		boolean selected2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).isSelected();
		boolean selected3 = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).isSelected();
		
			if (selected2==true) {
			
			 driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).click();
			
		} else if (selected3==true) {
			
			driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[14]")).click();
		
		Thread.sleep(2000);
		
	
	}
		
	
	}


