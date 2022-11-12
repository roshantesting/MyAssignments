package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Roshan");
		driver.findElement(By.name("lastname")).sendKeys("M");
		driver.findElement(By.name("reg_email__")).sendKeys("9159335353");
		driver.findElement(By.id("password_step_input")).sendKeys("xyz@1234");
		
		WebElement birthday = driver.findElement(By.name("birthday_day"));
		Select bd=new Select(birthday);
		bd.selectByIndex(19);
		
		WebElement birthmonth = driver.findElement(By.name("birthday_month"));
		Select bm=new Select(birthmonth);
		bm.selectByIndex(03);
		
		WebElement birthyear = driver.findElement(By.name("birthday_year"));
		Select byear=new Select(birthyear);
		byear.selectByValue("1991");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		
		
		
		
		
		
		
		
		

	}

}
