package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SENTHIL\\eclipse-workspace\\Action\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement Courses = driver.findElement(By.xpath("//div[@title='Courses']"));
		WebElement Datawarehouse = driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
		WebElement Informatica = driver.findElement(By.xpath("//span[text()='Informatica Certification Training']"));
		Actions a =new Actions(driver);
		a.moveToElement(Courses).moveToElement(Datawarehouse).build().perform();
		Thread.sleep(2000);		a.click(Informatica).perform();
		
	}

}
