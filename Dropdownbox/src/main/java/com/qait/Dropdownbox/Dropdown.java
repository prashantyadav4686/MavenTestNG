package com.qait.Dropdownbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


/**
 * Hello world!
 *
 */

public class Dropdown 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "/home/qainfotech/eclipse-workspace/selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        Select dropdown = new Select(driver.findElement(By.name("country")));
        dropdown.selectByVisibleText("INDIA");

    }
}