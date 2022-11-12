package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://testleaf.herokuapp.com/pages/Image.html");
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		String attribute = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).getAttribute("naturalWidth");
		if (attribute.equals("0")) {
			
			System.out.println("Image is broken");
			
		}
		else {
			System.out.println("Image is Not broken");
		}
		Thread.sleep(3000);
		
		WebElement mouse = driver.findElement(By.xpath("//img[@src='../images/keyboard.png']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(mouse).click().perform();
		Thread.sleep(3000); 
		driver.navigate().back();
		
		 
		
	}

}
