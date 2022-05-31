package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SENTHIL\\eclipse-workspace\\Action\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		WebElement Drag = driver.findElement(By.xpath("(//a[@style=\"color:#FFFFFF;\"])[2]"));
		WebElement Credit = driver.findElement(By.xpath("//ol[@id='amt8']"));
		
		WebElement Bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement Dep = driver.findElement(By.xpath("(//ol[@align=\"center\"])[1]"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.dragAndDrop(Drag, Credit).perform();
		a.dragAndDrop(Bank, Dep).perform();
		
		
		
		

	}

}
