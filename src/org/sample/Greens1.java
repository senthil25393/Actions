package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SENTHIL\\eclipse-workspace\\Action\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement Courses = driver.findElement(By.xpath("//div[@title='Courses']"));
		WebElement Testing = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
		WebElement Selinium = driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		Actions a = new Actions(driver);
	   a.moveToElement(Courses).perform();
	   a.moveToElement(Testing).perform();
	   a.click(Selinium).perform();
		

	}

}
