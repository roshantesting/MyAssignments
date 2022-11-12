package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditField {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Test");
		String attribute = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("Value");
		System.out.println(attribute);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		boolean var = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		
		if (var==false) {
			
			System.out.println("The Field is disabbled");
		}
		else {
			System.out.println("The Field is enabled");
		}
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
