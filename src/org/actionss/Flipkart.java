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

public class Flipkart {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dakshinamoorthy S\\eclipse-workspace\\actionss\\browser\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    
	    driver.get("http://www.flipkart.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    
	    WebElement c = driver.findElement(By.xpath("//button[text()='✕']"));
	    c.click();
	    
	    
	    Actions a=new Actions(driver);
	    WebElement  d= driver.findElement(By.xpath("//div[text()='Home']"));
	    a.moveToElement(d).perform();
	    
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    
	    Thread.sleep(2000);
	    r.keyPress(KeyEvent.VK_ENTER);
	    a.doubleClick().perform();
	    
	    
	    WebElement f = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
	    f.click();
	    
	
	
	
	
	
	
	}

}
