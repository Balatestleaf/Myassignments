package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountDay2 {

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
//account tab
		driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();
	
	driver.findElement(By.id("accountName")).sendKeys("Selenium Test case");
	
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	
	//select by index for industry
	   WebElement industry=driver.findElement(By.name("industryEnumId"));
	   Select industryDD=new Select (industry);
	   industryDD.selectByIndex(3);
	
	//select by text for ownership
	   WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
	   Select ownershipDD=new Select (ownership);
	   ownershipDD.selectByVisibleText("S-Corporation");
	
	//select by value
	   WebElement employee=driver.findElement(By.name("dataSourceId"));
	   Select employeeDD=new Select (employee);
	   employeeDD.selectByValue("LEAD_EMPLOYEE");
	
	//select by index
		WebElement MarketingCampaign=driver.findElement(By.name("marketingCampaignId"));
		Select marketingCampaignIdDD=new Select (MarketingCampaign);
		marketingCampaignIdDD.selectByIndex(6);
		
	//select by value
		WebElement StateorProvince=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select StateorProvinceDD=new Select (StateorProvince);
		StateorProvinceDD.selectByValue("TX");
		
		driver.findElement(By.id("ext-gen609")).click();
		driver.close();		
	}

}
