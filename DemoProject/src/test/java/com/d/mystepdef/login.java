package com.d.mystepdef;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.d.common.Simple;
import com.d.elements.DElements;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login extends Simple{
	DElements Ele;
	
	
	@Given("^User will be in the login page$")
	public void user_will_be_in_the_login_page() throws Throwable {
		getDriver();
		Ele= PageFactory.initElements(driver, DElements.class);
	    
	}

	@When("^User will input \"([^\"]*)\"$")
	public void user_will_input(String Email) throws Throwable {
	    Ele.MyAccount.click();
		Ele.Username.sendKeys(Email);
	    
	}

	@When("^User will enter \"([^\"]*)\"$")
	public void user_will_enter(String Password) throws Throwable {
	    Ele.Password.sendKeys(Password);
	    
	}

	@When("^User will click on Signin button$")
	public void user_will_click_on_Signin_button() throws Throwable {
	    Ele.SigninButton.click();
	    
	}

	@When("^User will varify$")
	public void user_will_varify() throws Throwable {
	    Ele.LogoffButton.getText();
	    Assert.assertEquals(Ele.LogoffButton.getText(), "Log Off");
	    
	}

	@Then("^User will close the browser$")
	public void user_will_close_the_browser() throws Throwable {
	   driver.close(); 
	    
	}
	
	

}
