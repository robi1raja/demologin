package com.d.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Simple {
	
	public WebDriver driver;
	public WebDriver getDriver() {
	WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver();
      driver.get("https://demo.oscommerce.com/login.php");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
      return driver;
     
    	  
      
	}

}
