package week3.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
 
	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		
			System.out.println("There are "+text);
			
		List<WebElement> brandname = driver.findElements(By.className("brand"));	
			System.out.println("BrandName list size: "+brandname.size());
			System.out.println("The Brand Names are: ");
			for (WebElement brname : brandname) {
				String text2 = brname.getText();
				
				System.out.println(text2);
			}	
			
		List<WebElement> bagname = driver.findElements(By.className("nameCls"));
			System.out.println("BagName list size: "+bagname.size());
			
			System.out.println("The Bag Names are: ");
			for (WebElement bgname : bagname) {
				String text3 = bgname.getText();
				
				System.out.println(text3);
				
				
				
			}
			Thread.sleep(1000);
			driver.close();
			
			}

			
			
			
}
		


	
	

