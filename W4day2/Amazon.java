package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	
	
//		1.Load the uRL https://www.amazon.in/
//		2.search as oneplus 9 pro 
//		3.Get the price of the first product
//		4. Print the number of customer ratings for the first displayed product
//		5. Mouse Hover on the stars
//		6. Get the percentage of ratings for the 5 star.
//		7. Click the first text link of the first image
//		8. Take a screen shot of the product displayed
//		9. Click 'Add to Cart' button
//		10. Get the cart subtotal and verify if it is correct.

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		String text = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("The Mobile Price is "+text);
		Thread.sleep(3000);
		String text2 = driver.findElement(By.xpath("//span[contains(@class,'a-size-base')]")).getText();
		System.out.println("The No of Customer rated 5 star "+text2);
		
		WebElement mouse = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(mouse).click().perform();
		
		String text3 = driver.findElement(By.xpath("(//span[@class='a-size-base'])[2]/a")).getText();
	
		System.out.println("The 5 Star rating Percentage is "+text3);
		
		driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color')])")).click();
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> win=new ArrayList<String>(windowHandles);
		driver.switchTo().window(win.get(1));
		
		//screenshot
		File ss = driver.getScreenshotAs(OutputType.FILE);
		File des=new File("./snap/prod.png");
		FileUtils.copyFile(ss, des);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(2000);
		String text4 = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		String replaceAll = text4.replaceAll("[^0-9]", "");
		System.out.println("The Sub total is "+replaceAll);
		
		if (text.equals(replaceAll)) {
			System.out.println("The Sub Total is Correct");
		}
		else {
			System.out.println("The Sub Total is InCorrect");
		}
	
	
	}

}
