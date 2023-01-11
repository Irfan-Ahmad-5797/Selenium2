package com.java.WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrom.driver";
		String value="C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32.zip";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		
		//get method--->lauchUrl
		//navigate --->same as get() additionally forward,backward and refresh
		driver.get("https://paytm.com/");
		
		//get title
		String title = driver.getTitle();
		System.out.println(title);
		
		//get currenturl
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		//manage---> Browser manage
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		// get pagesource
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
		// Close-----> 1 tab close and quit--->All tab close
			driver.quit();
		
	}

}
