package com.d.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DElements {
	
	WebDriver driver;
    public DElements(WebDriver driver) {
  	  this.driver=driver;
  	  PageFactory.initElements(driver, this);
    }
	
	
	
	
	
	
	@FindBy(xpath="//input[@name='email_address']")
	public WebElement Username;
	
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement Password;
	
	
	@FindBy(xpath="//span[contains(text(),'Sign In')]")
	public WebElement SigninButton;
	
	
	@FindBy(xpath="//span[contains(text(),'Log Off')]")
	public WebElement LogoffButton;
	
	
	
	
	
	
	

}
