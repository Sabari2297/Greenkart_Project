package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
    public static WebDriver driver;
	
         public static WebDriver initiateBrowser(String browser)  {
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			
			driver = new ChromeDriver();
			
			WebDriverManager.chromedriver().setup();
			
			driver.manage().window().maximize();
			
			
		}else if (browser.equalsIgnoreCase("gecko")) {
			
			driver = new FirefoxDriver();
			
			WebDriverManager.firefoxdriver().setup();
			
			driver.manage().window().maximize();
		}
		return driver;
	

	}
	
	public static void getUrl(String url) {
		
		driver.get(url);
	

	}
	
	public static void selection(WebElement element,String option,String value) {
		
		Select s = new Select(element);
		
		if (option.equalsIgnoreCase("byvalue")) {
			
			s.selectByValue(value);
			
		}
		else if (option.equalsIgnoreCase("byvisibletext")) {
			
			s.selectByVisibleText(value);
		}
		else if (option.equalsIgnoreCase("byindex")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
			
		}
	}
	
	public static void sendkeys(WebElement element,String value) {
		
		element.sendKeys(value);
	}
	
	public static void clickOnElement(WebElement element) {
		
		element.click();
	}
	
	
	public static void closeBrowser() {
		
		driver.quit();
	

	}
}
