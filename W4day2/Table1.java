package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/table.xhtml");
		//Getting the names in Table
		
		List<WebElement> nameSize = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr//td[1]"));
		System.out.println(nameSize.size());
		
		
		for (int i = 1; i < nameSize.size(); i++) {
			
			WebElement name = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr["+i+"]//td[1]"));
			String text = name.getText();
			System.out.println("Names in the Table are "+text);
		}

	}

}
