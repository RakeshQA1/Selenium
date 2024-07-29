package org.dowell;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DifferentBrowserLaunch {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
		
			
		
		
		
	}
	

}
