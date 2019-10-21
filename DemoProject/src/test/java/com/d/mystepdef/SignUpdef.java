package com.d.mystepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.d.common.Simple;
import com.d.elements.DElements;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpdef extends Simple{

	DElements Ele;

@Given("^User will on the homepage$")
public void user_will_on_the_homepage() throws Throwable {
	getDriver();
	
    Ele=PageFactory.initElements(driver, DElements.class);
}

@When("^User will click on MyAccount button$")
public void user_will_click_on_MyAccount_button() throws Throwable {
    Ele.MyAccount.click();
    Thread.sleep(2000);
}

@When("^User will click Continue button$")
public void user_will_click_Continue_button() throws Throwable {
    
    Ele.CustomerSignup.click();
    
    Thread.sleep(2000);
}

@When("^User will select Male radio button$")
public void user_will_select_Male_radio_button() throws Throwable {
    Ele.GenderM.click();
    
    Thread.sleep(2000);   
}

@When("^User will enter \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"$")
public void user_will_enter(String FirstName, String LastName, String DateOfBirth) throws Throwable {
    Ele.FirstName.sendKeys(FirstName);
    Ele.LastName.sendKeys(LastName);
    Ele.DoB.sendKeys(DateOfBirth);
    
    Thread.sleep(2000);
}

@When("^User will put \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"$")
public void user_will_put(String EMail, String Street, String PostCode, String City) throws Throwable {
	Ele.Email.sendKeys(EMail);
	Ele.StreetAddress.sendKeys(Street);
	Ele.PostCode.sendKeys(PostCode);
	Ele.City.sendKeys(City);
	
	Thread.sleep(2000);
}

@When("^User will input \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"$")
public void user_will_input(String State, String CountryName, String Telephone) throws Throwable {
    Ele.State.sendKeys(State);

    Ele.TelePhone.sendKeys(Telephone);
    
    WebElement country=Ele.SelectCountry;
    
    Select country1 = new Select(country);
    country1.selectByVisibleText(CountryName);
    
    Thread.sleep(2000);
    
}

@When("^User will put \"([^\"]*)\"  \"([^\"]*)\"$")
public void user_will_put(String Password, String CPassword) throws Throwable {
	Ele.Password.sendKeys(Password);
	Ele.CSignupPassword.sendKeys(CPassword);
	
	Thread.sleep(2000);
	
    
}

@When("^User will click on continue$")
public void user_will_click_on_continue() throws Throwable {
    Ele.SignupContinue.click();
    
    Thread.sleep(2000);
    
}

@When("^User will varify the page$")
public void user_will_varify_the_page() throws Throwable {
    
    Ele.Proof.getText();
    Assert.assertEquals(Ele.Proof.getText(), "Your Account Has Been Created!");
    
    Thread.sleep(2000);
}

@Then("^User will close the Browser$")
public void user_will_close_the_Browser() throws Throwable {
    driver.close();
    
}

}
