package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class button {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Point location = driver.findElement(By.id("position")).getLocation();
		System.out.println("The Loacation of the Pointer is "+ location);

		String value = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("The Colour is "+value);
		
		Dimension dim = driver.findElement(By.id("size")).getSize();
		System.out.println("The size is "+ dim);
		
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
