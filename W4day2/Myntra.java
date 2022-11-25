package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {
	
//		1) Open https://www.myntra.com/
//		2) Mouse hover on MeN 
//		3) Click Jackets 
//		4) Find the total count of item 
//		5) Validate the sum of categories count matches
//		6) Check jackets
//		7) Click + More option under BRAND
//		8) Type Duke and click checkbox
//		9) Close the pop-up x
//		10) Confirm all the Coats are of brand Duke
//		    Hint : use List 
//		11) Sort by Better Discount
//		12) Find the price of first displayed item
//		Click on the first product
//		13) Take a screen shot
//		14) Click on WishList Now
//		15) Close Browser

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup(); 
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		
		WebElement mouse = driver.findElement(By.xpath("//a[text()='Men']"));
		Actions act=new Actions(driver);
		act.moveToElement(mouse).perform();
		
		driver.findElement(By.xpath("//a[text()='Jackets']")).click();
		String text = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		String count = text.replaceAll("[^0-9]","");
		int parseInt = Integer.parseInt(count);
		System.out.println("The total count of the item is "+parseInt);
		
		String text2 = driver.findElement(By.xpath("//span[@class='categories-num']")).getText();
		String in = text2.replaceAll("[^0-9]", "").trim();
		int parseInt1 = Integer.parseInt(in);
		System.out.println("count of Jackets categories is "+parseInt1);
		
		String text3 = driver.findElement(By.xpath("(//span[@class='categories-num'])[2]")).getText();
		String in2 = text3.replaceAll("[^0-9]","");
		int parseInt2 = Integer.parseInt(in2);
		System.out.println("Count of RainJackets categories is "+parseInt2);

		int total=parseInt1+parseInt2;
		System.out.println("Sum of Jackets and RainJackets is "+total);
		
		if (total==parseInt) {
			System.out.println("Count is Matching");
		}
		else {
			System.out.println("Count is Not Matching");
		}
		
		driver.findElement(By.xpath("//label[contains(@class,'common-customCheckbox')][1]")).click();
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).sendKeys("Duke");
		driver.findElement(By.xpath("//label[@class=' common-customCheckbox']")).click();
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		Thread.sleep(2000);
		List<WebElement> brand = driver.findElements(By.className("product-brand"));
		
		System.out.println("Total Product under Duke is "+brand.size());
		String list="";
		for (WebElement names : brand) {
			
			String nameList=names.getText();
			list=nameList;
		
		}
		if (list.contains("Duke")) {
		System.out.println("All the Coats displayed are of brand Duke ");
		}
		
		else {
		System.out.println(" Coats displayed are not a brand of Duke");
		}
		
		WebElement mouse1 = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
		act.moveToElement(mouse1).perform();
		driver.findElement(By.xpath("(//label[@class='sort-label '])[4]")).click();
		String text4 = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])")).getText();
		System.out.println("The First displayed Coat Price is "+text4);
		driver.findElement(By.xpath("(//div[@class='product-productMetaInfo'])")).click();
		Set<String> wh = driver.getWindowHandles();
		List<String> win=new ArrayList<String>(wh);
		driver.switchTo().window(win.get(1));
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snap/myntra.png");
		FileUtils.copyFile(src, dest);
		
		driver.findElement(By.xpath("//span[contains(@class,'WishlistedIcon sprites-notWishlisted pdp-flex pdp-center ')]")).click();
		
	}
}
