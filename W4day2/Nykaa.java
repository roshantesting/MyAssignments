package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		
//			1) Go to https://www.nykaa.com/
//			2) Mouseover on Brands and Search L'Oreal Paris
//			3) Click L'Oreal Paris
//			4) Check the title contains L'Oreal Paris(Hint-GetTitle)
//			5) Click sort By and select customer top rated
//			6) Click Category and click Hair->Click haircare->Shampoo
//			7) Click->Concern->Color Protection
//			8)  Check whether the Filter is applied with Shampoo
//			9)  Click on L'Oreal Paris Colour Protect Shampoo
//			10) GO to the new window and select size as 175ml
//			11) Print the MRP of the product
//			12) Click on ADD to BAG
//			13) Go to Shopping Bag 
//			14) Print the Grand Total amount
//			15) Click Proceed
//			16) Click on Continue as Guest
//			17) Check if this grand total is the same in step 14
//			18) Close all windows
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.nykaa.com/");
		
		WebElement mouse = driver.findElement(By.xpath("(//a[@class='css-1mavm7h'])[2]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(mouse).perform();
		
		driver.findElement(By.xpath("//div[@id='scroller-container']//div[7]//a[1]")).click();
		String title = driver.getTitle();	
		System.out.println(title);
		driver.findElement(By.id("first-filter")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='css-xrzmfa'])[1]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> wn=new ArrayList<String>(windowHandles);
		driver.switchTo().window(wn.get(1));
		
		WebElement click = driver.findElement(By.xpath("//select[@title='SIZE']"));
		Select sl=new Select(click);
		sl.selectByIndex(1);
		
		String text = driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[2]")).getText();
		String mrp = text.replaceAll("[^0-9]","");
		System.out.println("The MRP is "+mrp);
		
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();	
		driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']")).click();
		
		
		driver.switchTo().frame(0);
		String text2 = driver.findElement(By.xpath("//span[@class='css-n8gwxi e171rb9k3']")).getText();
		String price = text2.replaceAll("[^0-9]","");
		System.out.println("Grand total is "+price);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='css-207d6f e25lf6d6']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		driver.findElement(By.xpath("(//img[@class='css-16z7tzi ek8d9s80'])[2]")).click();
	
		String text3 = driver.findElement(By.xpath("//p[@class='css-5t7v9l eka6zu20']")).getText();
		String fn = text3.replaceAll("[^0-9]", "");
		//System.out.println(fn);
		
		if (price.equals(fn)) {
			System.out.println("Grand Total is Same");
		}
		else {
			System.out.println("Grand Total is not Same");
		}
	
	}

}
