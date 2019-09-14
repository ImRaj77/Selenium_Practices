package com.raz.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.popuptest.com/popuptest2.html");
	driver.close(); // Close single window 
    driver.quit();  // Close all windows or tabs
	}
}
