package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegisteration {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://en-gb.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
//new account button
		driver.findElement(By.linkText("Create new account")).click();
//first name
		driver.findElement(By.name("firstname")).sendKeys("Bala");
//surname
		driver.findElement(By.name("lastname")).sendKeys("D");
//mobile number or email address
		driver.findElement(By.name("reg_email__")).sendKeys("bm@gmail.co.in");
//create new password
		driver.findElement(By.name("reg_passwd__")).sendKeys("1234");
		
//handle drop downs
//select by value		
		WebElement day=driver.findElement(By.id("day"));
		Select dayDD=new Select(day);
		dayDD.selectByValue("6");
//select by text		
		WebElement month=driver.findElement(By.id("month"));
		Select monthDD=new Select(month);
		monthDD.selectByVisibleText("Jul");
//select by text		
		WebElement year=driver.findElement(By.id("year"));
		Select yearDD=new Select(year);
		yearDD.selectByVisibleText("2015");
		
//radio button in gender	
		WebElement radiobutton=driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		radiobutton.click();
		
		
	}

}
