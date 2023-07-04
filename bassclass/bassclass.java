package com.cucumber.bassclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bassclass {

	public static WebDriver driver;
	
	public static void getbrowser(String browser) {
		
		try {
			if(browser.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver =new ChromeDriver();
				
		}else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();		
			driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	}
		catch (Exception e) {
		
		e.printStackTrace();
		throw new RuntimeException();
		}
	}
}
