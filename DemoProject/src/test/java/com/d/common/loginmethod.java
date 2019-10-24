package com.d.common;

import org.openqa.selenium.WebDriver;

import com.d.elements.DElements;

public class loginmethod {
	
	DElements elem;
	WebDriver driver;
	
	public  void login() {
		elem.MyAccount.click();
		elem.Email.sendKeys("test1@gmail.com");
		elem.Password.sendKeys("test123");
		elem.SigninButton.click();
				
	}
	
	

}
