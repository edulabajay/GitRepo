package com.Testng;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {

	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://mail.google.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testmethod() {
		
		System.out.println("TestNG Framework");
	}
	
	
	@AfterMethod
	public void after() {
		driver.quit();
	}
	
	
}
