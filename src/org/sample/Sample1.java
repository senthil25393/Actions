package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SENTHIL\\eclipse-workspace\\Action\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement User = driver.findElement(By.xpath("//input[@name='email']"));
		User.sendKeys("senthil");
		Thread.sleep(3000);
		
		Actions a = new Actions(driver);
	
		a.doubleClick(User).contextClick(User).build().perform();
		
	}

}
