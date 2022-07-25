package stepdefinition;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.SignRegisterpage;
import page.homepage;

public class signinstep {
	homepage home = new homepage();
	SignRegisterpage signin = new SignRegisterpage();
	@Given("user Nagivate to Sign page")
	public void user_Nagivate_to_Sign_page() {
		home.enterJpetshoptURL();
		home.isDisplayeJPetStoreTitile();
		home.clickEntertTheStore();
		home.isDisplayedSignHDR();
		home.clickOnSignIn();
//		signin.isDisplayedLoginPage();
	}


	@When("Click on Register NOw button")
	public void click_on_Register_NOw_button() {
		signin.clickRegisterNowlink();
	}
	@Then("User information page displayed")
	public void user_information_page_displayed() {
		signin.isDisplayedRegistrationpage();
	}
	@Then("Enter Required information {string}")
	public void enter_Required_information(String sheetName) throws InvalidFormatException, IOException {
		signin.enterAccountInformation(sheetName);
	}
	@Then("Click save  account information Button")
	public void click_save_account_information_Button() {
		signin.clicksaveinformation();
	}

}
