package org.actionss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dakshinamoorthy S\\eclipse-workspace\\actionss\\browser\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("http://demo.guru99.com/test/drag_drop.html");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	 Actions a = new Actions(driver);
	 
	 WebElement move1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	 WebElement move2 = driver.findElement(By.id("bank"));
	 
	 a.dragAndDrop(move1, move2).perform();
	 
	 
	 WebElement move3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
	 WebElement move4 = driver.findElement(By.id("loan"));
	 
	 a.dragAndDrop(move3, move4).perform();
	 
	 WebElement move5 = driver.findElement(By.xpath("//a[text()=' 5000']"));
	 WebElement move6 = driver.findElement(By.className("placeholder"));
	 
	 a.dragAndDrop(move5, move6).perform();
	 
	 WebElement move7 = driver.findElement(By.xpath("//a[text()=' 5000']"));
	 WebElement move8 = driver.findElement(By.className("placeholder"));
	
	 
	  a.dragAndDrop(move7, move8).perform();
	//a.clickAndHold(move7).release(move8).perform();
	  
	  WebElement po = driver.findElement(By.xpath("//a[text()='Bank Project']"));
	  a.click().perform();
	
	}

}
