package com.qa.factory;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

public WebDriver driver;
	
//	thread local is used in order to do parallel exceution in the feature files
	
	public static ThreadLocal<WebDriver>tlDriver=new ThreadLocal<>();
	
//	driver initialization
	
	public WebDriver init_driver(String browser) {
		
		System.out.println("The Browser value is"+browser);
		
		if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		
		tlDriver.set(new ChromeDriver());
		}
		else if( browser.equals("firefox")) {
 
			WebDriverManager.firefoxdriver().setup();
			
			tlDriver.set(new FirefoxDriver());
			}	
		else if( browser.equals("edge")) {
 
			WebDriverManager.edgedriver().setup();
			
			tlDriver.set(new EdgeDriver());
			}	
		else {
			System.out.println("please  add the correct browser");
		}
		
		getDriver().manage().deleteAllCookies();
		
		getDriver().manage().window().maximize();
		
 
		
		return getDriver();
	}
	public static  synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
	
}
