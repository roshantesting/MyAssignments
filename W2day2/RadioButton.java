package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://testleaf.herokuapp.com/pages/radio.html");	
		driver.findElement(By.xpath("(//input[@class='myradio'])[1]")).click();
		boolean selected = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).isSelected();
		boolean selected2 = driver.findElement(By.xpath("(//input[@type='radio'])[4]")).isSelected();
		
		if (selected==true) {
			
			System.out.println("Unchecked is selected");
			
		} else if (selected2==true) {
			
			System.out.println("checked is selected");
		}

		else {
			System.out.println("None is selected");
		}
		
		
		boolean enabled = driver.findElement(By.xpath("(//input[@type='radio'])[6]")).isEnabled();
		
		if (enabled==true) {
			System.out.println("My Age is already Selected");
		}
		}
	
		
	}


