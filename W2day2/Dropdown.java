package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		WebElement drop = driver.findElement(By.id("dropdown1"));
		Select index=new Select(drop);
		index.selectByIndex(1);
		
		WebElement drop1 = driver.findElement(By.name("dropdown2"));
		Select text=new Select(drop1);
		text.selectByVisibleText("Appium");
		
		WebElement drop2 = driver.findElement(By.id("dropdown3"));
		Select value=new Select(drop2);
		value.selectByValue("3");
		
		WebElement drop3 = driver.findElement(By.className("dropdown"));
		Select num=new Select(drop3);
		int size = num.getOptions().size();
		System.out.println("No of option available is "+size);
		
		
	driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//option[text()='You can also use sendKeys to select']//following-sibling::option)[1]")).click();
	Thread.sleep(2000);
	
		driver.findElement(By.xpath("(//option[@value='1'])[6]")).click();
		
		
	
		

	}

	
}
