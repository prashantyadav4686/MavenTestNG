package SeleniumAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
 

public class Searchbar {
    public static void main(String[] args){
    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
    	driver.get("http://www.google.com");
    	 WebElement searchText = driver.findElement(By.name("q"));
    }
}
