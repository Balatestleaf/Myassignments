package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

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
		//create account tab
driver.findElement(By.linkText("Accounts")).click();
driver.findElement(By.linkText("Create Account")).click();
//create account name
driver.findElement(By.id("accountName")).sendKeys("Test Account");
//give description
driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
//create number of employees
driver.findElement(By.name("numberEmployees")).sendKeys("4");
//give site name
driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
// create account
driver.findElement(By.id("ext-gen612")).click();

}
}
