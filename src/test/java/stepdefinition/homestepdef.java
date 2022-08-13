package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.homepage;
import utils.browserfactore;

public class homestepdef extends browserfactore {

	public homepage home = new homepage();

	@Given("User landed on Jpetstore")
	public void user_landed_on_Jpetstore() {
		home.enterJpetshoptURL();

	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		home.isDisplayeJPetStoreTitile();

	}

	@When("click On Enter the store link")
	public void click_On_Enter_the_store_link() {
		home.clickEntertTheStore();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
		home.isDisplayedSignHDR();
	}

}
