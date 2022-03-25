package org.actionss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot {
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
		WebElement heat = driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
		a.moveToElement(heat).perform();
		
		WebElement ac = driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
		a.moveToElement(ac).perform();
		
		Thread.sleep(2000);
		WebElement portable = driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
		a.moveToElement(portable).perform();
		a.click().perform();
		
		
		
		
	}

}
