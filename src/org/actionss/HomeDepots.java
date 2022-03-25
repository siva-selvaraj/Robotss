package org.actionss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepots {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dakshinamoorthy S\\eclipse-workspace\\actionss\\browser\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		Actions a=new Actions(driver);
		
		WebElement alldep = driver.findElement(By.xpath("//a[text()='All Departments']"));
		a.moveToElement(alldep).perform();
		
		Thread.sleep(3000);
		WebElement paint = driver.findElement(By.xpath("//a[text()='Paint']"));
		a.moveToElement(paint).perform();
		
		Thread.sleep(2000);
		WebElement intpaint = driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		a.moveToElement(intpaint).perform();
		
		Thread.sleep(3000);
		WebElement clpaint = driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		a.moveToElement(clpaint).perform();
		a.click().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
