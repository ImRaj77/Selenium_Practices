package com.raz.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		 String baseUrl = "http://demo.guru99.com/test/newtours/";
	     String expectedTitle = "Welcome: Mercury Tours";
	     String actualTitle = "";
	     
	     // Launch Chrome and direct it to the base url
	     driver.get(baseUrl);
	     // Get the actual value of the title
	     actualTitle = driver.getTitle();
	     
	     if(actualTitle.contentEquals(expectedTitle)) {
	    	 System.out.println("Test Passed !!");
	     } else {
	    	 System.out.println("Test Failed !!");
	     }
	     // Close Chrome driver
	    driver.close();
	    System.exit(0);
	}
}
