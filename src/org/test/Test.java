package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		
		//setup the driver
		System.setProperty("webdriver.chrome.driver","F:\\Project14feb\\driver\\chromedriver.exe");
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//go to the url
		driver.get("https://www.facebook.com/login/");
		 
	
		//to find the WebElement
		WebElement txtUserName = driver.findElement(By.xpath("//input[@type='test']"));
		txtUserName.sendKeys("test");
		
		//maximize
	    driver.manage().window().maximize();
				
		
		//To find the WebElement
		WebElement txtPassword = driver.findElement(By.xpath("//input@placeholder='password"));
		txtPassword.sendKeys("test");
		
		//To find the WebElement
		WebElement btnLogin = driver.findElement(By.xpath("login"));
		btnLogin.click();
	

	}
	
}