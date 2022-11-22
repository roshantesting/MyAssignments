package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		WebElement fr = driver.findElement(By.xpath("(//button[@id='Click'])[1]"));
		fr.click();
		System.out.println(fr.getText());
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement fr1 = driver.findElement(By.xpath("(//button[@id='Click'])[1]"));
		fr1.click();
		System.out.println(fr1.getText());
		driver.switchTo().defaultContent();
	
		List<WebElement> outer = driver.findElements(By.tagName("iframe"));
		System.out.println("Total Frames without Nested are "+outer.size());
		int outercount=outer.size();
		int count=0;
		for (int i = 0; i < outer.size(); i++) {
			
			driver.switchTo().frame(outer.get(i));
			List<WebElement> inner = driver.findElements(By.tagName("iframe"));	
			count=count+inner.size();
			driver.switchTo().defaultContent();
		}
		
		int framesize=count+outercount;
		System.out.println("Total Frames with Nested are "+framesize);
			
		
		
		
		
		

	}

}
