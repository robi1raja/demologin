package com.d.elements;

import org.openqa.selenium.By;
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
	
	
	
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	public WebElement MyAccount;
	
	@FindBy(xpath="//input[@name='email_address']")
	public WebElement Username;
	
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement Password;
	
	
	@FindBy(xpath="//span[contains(text(),'Sign In')]")
	public WebElement SigninButton;
	
	
	@FindBy(xpath="//span[contains(text(),'Log Off')]")
	public WebElement LogoffButton;
	
	
	
	
	// signup elements starts here
	//My account button on the top
    
    @FindBy(xpath="//a[@id='tdb2']")
    public WebElement CustomerSignup;
    
    @FindBy(xpath="//input[@value='m']")
    public WebElement GenderM ;
    
    @FindBy(xpath="//input[@name='firstname']")
    public WebElement FirstName ;
    
    @FindBy(xpath="//input[@name='lastname']")
    public WebElement LastName;
    
    @FindBy(xpath="//input[@name='email_address']")
    public WebElement Email ;
    
    
    @FindBy(xpath="//input[@name='street_address']")
    public WebElement StreetAddress ;
   
    @FindBy(xpath="//input[@name='postcode']")
    public WebElement PostCode ;
    
    @FindBy(xpath="//input[@name='city']")
    public WebElement City ;
    
    @FindBy(xpath="//input[@name='state']")
    public WebElement State ;
    
    //country name
    @FindBy(xpath="//select[@name='country']")
    public WebElement SelectCountry ;
    
    
  
    
    
    
    
    @FindBy(xpath="//input[@name='telephone']")
    public WebElement TelePhone ;
    
    
    @FindBy(xpath="(//input[@type='password'])[1]")
    public WebElement SignupPassword ;
    
    @FindBy(xpath="(//input[@type='password'])[2]")
    public WebElement CSignupPassword ;
    
    @FindBy(xpath="//span[contains(text(),'Continue')]")
    public WebElement SignupContinue ;
	
    
    
    @FindBy(xpath="//input[@id='dob']")
    public WebElement DoB ;
    
	@FindBy(xpath="//*[contains(text(),'Your Account Has Been Created!')]")
	public WebElement Proof;

	
	
	
	
	
	//  product purchese and add to cart and checkout functionality;
	/*
	@FindBy(xpath="//a[contains(text(),'Hardware->')]")
	public WebElement HardwareButton;
	
	
	@FindBy(xpath="//a[contains(text(),'Hardware->')]")
	public WebElement HardwareButton;
	
	
	@FindBy(xpath="//a[contains(text(),'Hardware->')]")
	public WebElement HardwareButton;
	
	
	@FindBy(xpath="//a[contains(text(),'Hardware->')]")
	public WebElement HardwareButton;
	*/
	

}
