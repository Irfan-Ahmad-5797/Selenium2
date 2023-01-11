package com.java.WebDriverMethod;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Position_Size 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key = "webdriver.chrom.driver";
		String value = "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32.zip";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
	
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(3000);
        Dimension d=new Dimension(600,150);	//516,135
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		
		System.out.println(driver.manage().window().getPosition());
		Thread.sleep(3000);
		Point p=new Point(300,300);
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition());
		
		Thread.sleep(10000);
		driver.close();
		
	}

}
