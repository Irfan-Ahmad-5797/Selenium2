package com.java.browserLaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32.zip");
		WebDriver driver = new ChromeDriver();
		
	}

}
