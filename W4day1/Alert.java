package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	
//driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
    
//    Alert sa = driver.switchTo().alert();
//    
//    //print information
//        String text = sa.getText();
//        System.out.println("simple Alert"+text);
//    
//        sa.accept();
//    
//    //find the element Alert (Confirm Dialog)
//    driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
//    //handle alert
//    Alert ca = driver.switchTo().alert();//ctrl+2+l
//   //to get the text of information
//    String msg = ca.getText();
//    System.out.println("Confirm Alert"+msg);
//    Thread.sleep(2000);
//    ca.dismiss();
//    String verify = driver.findElement(By.xpath("//span[@id='result']")).getText();
//    System.out.println(verify);
//    
//    //prompt alert
//    driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).click();
//    
//    Alert pa = driver.switchTo().alert();
//    pa.sendKeys("Testleaf");
//    String text2 = pa.getText();
//    System.out.println("prompt message"+text2);
//    pa.accept();
    

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		org.openqa.selenium.Alert sa = driver.switchTo().alert();
		String text2 = sa.getText();
		System.out.println(text2);
		sa.accept();
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']/span[2]")).click();
		org.openqa.selenium.Alert pa = driver.switchTo().alert();
		pa.sendKeys("Roshan");	
		String text = pa.getText();
		System.out.println(text);
		pa.accept();
		String text3 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(text3);
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		org.openqa.selenium.Alert ca = driver.switchTo().alert();
		String text4 = ca.getText();
		System.out.println(text4);
		ca.accept();
		String text5 = driver.findElement(By.xpath("(//span[@id='result'])")).getText();
		System.out.println(text5);
		
		
		driver.findElement(By.xpath("(//span[text()='Delete'])")).click();
		WebElement sweet = driver.findElement(By.xpath("(//span[text()='Yes'])"));
		sweet.click();
		System.out.println(sweet.getText());
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		WebElement sd = driver.findElement(By.xpath("(//span[text()='Dismiss'])"));
		sd.click();
		System.out.println(sd.getText());
		
		
		driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-minus'])")).click();
		 driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]"));
		
		
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
