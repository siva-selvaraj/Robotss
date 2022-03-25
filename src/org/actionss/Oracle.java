package org.actionss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Oracle {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dakshinamoorthy S\\eclipse-workspace\\actionss\\browser\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		Actions a=new Actions(driver);
		
		WebElement course = driver.findElement(By.xpath("//div[text()='Courses ']"));
		a.moveToElement(course).perform();
		
		WebElement oracle = driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
		a.moveToElement(oracle).perform();
		
		WebElement sql = driver.findElement(By.xpath("//span[text()='SQL Certification Training']"));
		a.moveToElement(sql).perform();
		a.click().perform();
		
		
		
	}

}
