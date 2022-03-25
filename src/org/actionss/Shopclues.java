package org.actionss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopclues {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dakshinamoorthy S\\eclipse-workspace\\actionss\\browser\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		
		driver.get(" https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions a= new Actions(driver);
		WebElement spr = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		a.moveToElement(spr).perform();
		
		WebElement waga = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		a.moveToElement(waga).perform();
		a.click().perform();
	}

}
