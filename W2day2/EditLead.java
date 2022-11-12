package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		
//		/*http://leaftaps.com/opentaps/control/main
//		
//		* 1	Launch the browser
//		* 2	Enter the username
//		* 3	Enter the password
//		* 4	Click Login
//		* 5	Click crm/sfa link
//		* 6	Click Leads link
//		* 7	Click Find leads
//		* 8	Enter first name
//		* 9	Click Find leads button
//		* 10 Click on first resulting lead
//		* 11 Verify title of the page
//		* 12 Click Edit
//		* 13 Change the company name
//		* 14 Click Update
//		* 15 Confirm the changed name appears
//		* 16 Close the browser (Do not log out)
//		/*

		
	  WebDriverManager.chromedriver().setup();
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://leaftaps.com/opentaps/control/main");
	  driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	  driver.findElement(By.id("password")).sendKeys("crmsfa");
	  driver.findElement(By.className("decorativeSubmit")).click();
      driver.findElement(By.linkText("CRM/SFA")).click();
      driver.findElement(By.linkText("Leads")).click();
      driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
      driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Roshan");
      driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
      driver.findElement(By.xpath("//a[text() ='11942']")).click();
      
      String title = driver.getTitle();
      if (title.contains("View Lead")) {
      System.out.println("Title is "+ title);
      }
      else {
    	  System.out.println("Title Mismatch");
      }
      
      driver.findElement(By.xpath("//a[text()='Edit']")).click();
      driver.findElement(By.id("updateLeadForm_companyName")).clear();
      driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("XYZ");
      driver.findElement(By.xpath("//input[@value='Update']")).click();
      String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
      System.out.println("Changed Company name is "+text);
      
      
      
      
      
         
	}

}
