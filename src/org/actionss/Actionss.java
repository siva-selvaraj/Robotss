package org.actionss;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dakshinamoorthy S\\eclipse-workspace\\actionss\\browser\\chromedriver.exe" );
	    WebDriver driver = new ChromeDriver();
	    
	    
	    driver.get("http://www.greenstechnologys.com/");
	    //driver.get("http://demo.guru99.com/test/drag_drop.html");
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    
	    Actions a=new Actions(driver);
	    
	    WebElement move1 = driver.findElement(By.xpath("//a[text()='COURSES']"));
	    a.moveToElement(move1).perform();
	    
	    
	    
	    WebElement move2 = driver.findElement(By.xpath("(//span[text()='Software Testing Training'])[1]"));
	    a.moveToElement(move2).perform();
	    
	   // WebElement move3 = driver.findElement(By.xpath("(//span[text()='Selenium'])[3]"));
	  //  a.click(move3).perform();
	    
	   
	    
		
		
	}

}
