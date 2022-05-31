package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SENTHIL\\eclipse-workspace\\Action\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	
	WebElement Courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
	
	Actions a = new Actions(driver);
	a.moveToElement(Courses).perform();
	
	WebElement SQL = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
	a.moveToElement(SQL).perform();
	
	driver.findElement(By.xpath("//span[text()='Performance Tuning']")).click();
	
	

	

	}

}
