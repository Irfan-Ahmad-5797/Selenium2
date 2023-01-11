package com.java.WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
 public static void main(String[] args) throws InterruptedException {
	 String key="webdriver.chrom.driver";
	 String value="C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32.zip";
	 System.setProperty(key, value);
	 WebDriver driver=new ChromeDriver();
	// driver.get("https://paytm.com/");
	// Thread.sleep(5000);
	// driver.get("https://www.amazon.in/");
	// Thread.sleep(5000);
	// driver.get("https://www.flipkart.com/");
	   driver.navigate().to("https://paytm.com/");
	   Thread.sleep(3000);
	   driver.navigate().to("https://www.amazon.in/");
	   Thread.sleep(3000);
	   driver.navigate().back();
	   Thread.sleep(3000);
	   driver.navigate().refresh();
	   Thread.sleep(3000);
	   driver.navigate().forward();
	   Thread.sleep(3000);
	   String currentUrl = driver.getCurrentUrl();
	   System.out.println(currentUrl);
	   driver.navigate().to("https://www.flipkart.com/");
	   
	 
	   
}
}
