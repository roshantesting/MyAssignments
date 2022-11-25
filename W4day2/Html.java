package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Html {

	public static void main(String[] args) {
	
//			Assignment2:
//			============
//			1. Launch the URL https://html.com/tags/table/
//			2. Get the count of number of rows
//			3. Get the count of number of columns
//
//			Assignment3:
//			============
//			1. Launch the URL https://html.com/tags/table/
//			2. You have to print the respective values based on given Library
//			(hint: if the library was absolute usage, then print all its value)


		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://html.com/tags/table/");
		
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='render']//table//tr"));
		List<WebElement> coloumn = driver.findElements(By.xpath("//div[@class='render']//table//tr[1]//th"));
		System.out.println("No of Rows are "+row.size());
		System.out.println("No of Coloumns are "+coloumn.size());
		
		List<WebElement> abs = driver.findElements(By.xpath("//div[@class='render']//table//tr[2]//td"));

		for (int i = 0; i <abs.size(); i++) {
			
			String text = abs.get(i).getText();
			
			System.out.println(text);
		}
		}
		
	}


