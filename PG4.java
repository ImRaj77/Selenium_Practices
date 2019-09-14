package com.raz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Switching between frames
public class PG4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		Thread.sleep(2000);
        driver.switchTo().frame("classFrame");
		Thread.sleep(2000);
        driver.findElement(By.linkText("Deprecated")).click();
		Thread.sleep(2000);
        driver.close();
	}

}
