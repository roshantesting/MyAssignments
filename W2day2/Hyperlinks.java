package week2.day2;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlinks {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[1]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		String attribute = driver.findElement(By.xpath("(//a[@link='blue'])[2]")).getAttribute("href");
		System.out.println("The link will go to "+attribute);
		
		driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("404")) {
			
			System.out.println("Link is broken");
			
		}
		else {
			System.out.println("The link is not broken");
		}
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		int totallink= link.size();
		System.out.println("links available are "+totallink);
	}

}
