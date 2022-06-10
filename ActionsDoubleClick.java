package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//driver//chromedriver.exe" );  
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Automation/html/doubleClick.html");
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		//actions.contextClick(driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"))).perform();
	    actions.doubleClick(driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"))).perform();
		
	}

}
