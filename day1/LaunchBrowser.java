package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
	    ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
		}
	
	}


