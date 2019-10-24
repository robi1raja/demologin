package com.d.mystepdef;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.d.common.Simple;
import com.d.common.loginmethod;
import com.d.elements.DElements;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddtoCartDef extends Simple {
	
	DElements Ele;
	
	
	
@Given("^user will be on the homepage$")
public void user_will_be_on_the_homepage() throws Throwable {
   
	
	getDriver();
	Ele=PageFactory.initElements(driver, DElements.class);
    
}

@When("^user will signin to account$")
public void user_will_signin_to_account() throws Throwable {
    Ele.login();
    
    
    Thread.sleep(2000);
}

@When("^user will click on Hardware button$")
public void user_will_click_on_Hardware_button() throws Throwable {
    Ele.HardwareButton.click();
	Thread.sleep(2000);
}

@When("^user will click on Printer$")
public void user_will_click_on_Printer() throws Throwable {
	Ele.PrinterButton.click();
	Thread.sleep(2000); 
}

@When("^user will select a product$")
public void user_will_select_a_product() throws Throwable {
	Ele.Hewlett.click();
	Thread.sleep(2000);
}

@When("^user will click on add to cart button$")
public void user_will_click_on_add_to_cart_button() throws Throwable {
	Ele.AddToCart.click();
	Thread.sleep(2000);
}

@When("^user will click on checkout button$")
public void user_will_click_on_checkout_button() throws Throwable {
	Ele.CheckoutButton.click();
	Thread.sleep(2000);   
}

@When("^user will varify$")
public void user_will_varify() throws Throwable {

	String proof=Ele.Cartcontent.getText();
	Assert.assertEquals(proof, "Cart Contents (1)", "Product is added to cart successfully");
	Thread.sleep(2000);
}

@Then("^user will close the browser$")
public void user_will_close_the_browser() throws Throwable {
    driver.manage().deleteAllCookies();
    driver.close();
}

}
