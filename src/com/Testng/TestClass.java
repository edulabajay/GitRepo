package com.Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestClass {

	@Test
	public void fun() {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

	        // Initialize the Chrome driver
	        WebDriver driver = new ChromeDriver();

	        // Use the driver to interact with the web application
	        driver.get("https://www.example.com");
	        System.out.println(driver.getTitle());

	        // Close the browser and quit the driver
	    }
	   

}
