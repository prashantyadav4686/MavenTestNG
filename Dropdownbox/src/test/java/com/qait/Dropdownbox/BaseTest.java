package com.qait.Dropdownbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	public WebDriver driver;
	public DropdownAction fun;
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/eclipse-workspace/selenium/chromedriver");
		driver = new ChromeDriver();
		fun = new DropdownAction(driver);
     

	}
	
/*
	@AfterClass

	public void afterClass() {
		driver.quit();

	}*/
}
