package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {
			
			ChromeOptions options=new ChromeOptions();
			options.addArguments("guest");    
			ChromeDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get(" http://leaftaps.com/opentaps");
		
	//Username and password
			driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
			driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	//login
			driver.findElement(By.className("decorativeSubmit")).click();
	//create crmsfa link
			driver.findElement(By.partialLinkText("CRM")).click();
    //create lead
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
	//create first last company name
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bala");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");
	//enter a title
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Sample case");
	//click create lead 
			driver.findElement(By.id("ext-gen619")).click();
	//close browser 		
			driver.close();

			
	}

}
