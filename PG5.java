package com.raz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Switching between Pop up windows
public class PG5 {
static BaseClass base;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    base = new BaseClass();
		WebDriver driver = new ChromeDriver();	
		
		String alertMessage = "";
        driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
       
        System.out.println(alertMessage);
        driver.quit();
	}

}
