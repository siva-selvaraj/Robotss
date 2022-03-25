package org.actionss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestingDay5 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dakshinamoorthy S\\eclipse-workspace\\actionss\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		Actions a= new Actions(driver);
		
		WebElement btn1 = driver.findElement(By.xpath("//span[text()='Prime']"));
		a.moveToElement(btn1).perform();
		
		WebElement btn2 = driver.findElement(By.id("multiasins-img-link"));
		a.doubleClick(btn2).perform();
		
		
		
		

	}

}
