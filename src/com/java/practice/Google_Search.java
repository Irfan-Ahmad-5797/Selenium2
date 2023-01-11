package com.java.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrom.driver";
		String value="C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32.zip";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).click();
		
		Thread.sleep(10000);
		driver.close();
	}

}
