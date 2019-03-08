package com.qait.Dropdownbox;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

/**
 * Unit test for simple App.
 */
public class DropdownboxTest extends BaseTest{
	
	@Test()
	public void LaunchTest01() {

		fun.launch();
	}

	@Test()
	public void mainTest02() {

		fun.dropdown();
	}
	
	@Test()
	public void mainTest03() {

		fun.dropdown1();
	}
	
	
	 
	 
}
