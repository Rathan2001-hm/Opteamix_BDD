package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Loginpage {

	protected static WebDriver driver;
	
	//locators
	private By usernm=By.xpath("//input[@name='username']");
	private By password=By.xpath("//input[@name='password']");
	private By login=By.xpath("//button[@type='submit']");
	private By forgotpasswd=By.xpath("//div[@class='orangehrm-login-forgot']");
	private By logo=By.xpath("//div[@class='orangehrm-login-logo']");
	
	
	//constructors
		public Loginpage(WebDriver driver) {
			Loginpage.driver=driver;
		}
		
		// 3. page actions: features(behavior) of the page the form of methods:

		public String getLoginPageTitle() {

		return driver.getTitle();

		}

		public boolean isForgotPwdLinkExist() throws InterruptedException {

		Thread.sleep(4000);

		return driver.findElement(forgotpasswd).isDisplayed();

		}

		public void enterUserName(String username) throws InterruptedException {

		Thread.sleep(4000);

		driver.findElement(usernm).sendKeys(username);

		}

		public void enterPassword(String pwd) throws InterruptedException {

		Thread.sleep(4000);

		driver.findElement(password).sendKeys(pwd);

		}

		public void clickOnLogin() {

		driver.findElement(login).click();

		}

}
