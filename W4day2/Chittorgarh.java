package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {
		
//			1. Launch the URL https://www.chittorgarh.com/
//			2. Click on stock market
//			3. Click on NSE bulk Deals
//			    hint-(Table-2)
//			4. Get all the Security names
//			5. Ensure whether there are duplicate Security names

	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.chittorgarh.com/");
		
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr"));
		
		System.out.println("Total Name size are "+row.size());
		
		List<String> strList=new ArrayList<String>();
		for (int i = 1; i < row.size(); i++) {
			List<WebElement> details = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr["+i+"]//td[3]"));
			
			for (int j = 0; j < details.size(); j++) { 	
				
				String text = details.get(j).getText();
				strList.add(text);	
			}
		}
			Set<String> strSet=new LinkedHashSet <String>(strList);
			
			if (strList.size()==strSet.size()) {
				
				System.out.println("No Duplicates");
			}
			
			else {
				
				System.out.println("Duplicates Present");
			}
			
			List<String> strList1=new ArrayList<String>(strSet);
			for (int i = 0; i < strList1.size(); i++) {
				
				String text2 = strList1.get(i);
				
				System.out.println(text2);
			}
		
		
	
	}

}
