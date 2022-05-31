package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SENTHIL\\eclipse-workspace\\Action\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Prime = driver.findElement(By.xpath("//a[@id='nav-link-prime']"));
		Actions a = new Actions(driver);
		a.moveToElement(Prime).perform();
		Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@id='multiasins-img-link']")).click();
		
	}

}
