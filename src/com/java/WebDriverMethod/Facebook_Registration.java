package com.java.WebDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Registration 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrom.driver";
		String value="C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32.zip";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/");
	    Thread.sleep(3000);
	    
		driver.findElement(By.id("email")).sendKeys("xyz@12345");
	    Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("acd@1234");
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(10000);
		driver.close();
	}

}
