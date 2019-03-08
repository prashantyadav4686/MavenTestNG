package com.qait.Dropdownbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.qait.Dropdownbox.DropdownboxTest;

public class DropdownAction extends BaseTest{
   public WebDriver driver;
	public  DropdownAction(WebDriver driver){
		this.driver= driver;
}
	
 public void dropdown() {
	 Select dropdown = new Select(driver.findElement(By.name("country")));
     dropdown.selectByVisibleText("INDIA");
     String st1= dropdown.getFirstSelectedOption().getText();
      System.out.println(st1);
 }
 
 public void dropdown1() {
	 Select dropdown = new Select(driver.findElement(By.name("country")));
     dropdown.selectByVisibleText("BANGLADESH");
	String st= dropdown.getFirstSelectedOption().getText();
	System.out.println(st);
 }
 
 public void launch() {
		driver.get("https://demo.guru99.com/test/newtours/register.php");
 }
 
}