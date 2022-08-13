package stepdefinition;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.ProductListPage;
import page.SignRegisterpage;
import page.cartpage;
import page.homepage;

public class signinstep {
	homepage home = new homepage();
	SignRegisterpage signin = new SignRegisterpage();
	cartpage cart = new cartpage();
	ProductListPage productpg = new ProductListPage();

	@Given("user Nagivate to Sign page")
	public void user_Nagivate_to_Sign_page() {
		home.enterJpetshoptURL();
		home.isDisplayeJPetStoreTitile();
		home.clickEntertTheStore();
		home.isDisplayedSignHDR();
		home.clickOnSignIn();
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

	@Then("Click save account information Button")
	public void click_save_account_information_Button() {
		signin.clicksaveinformation();
	}

	@When("Enter username and password")
	public void enter_username_and_password() {
		signin.enterUsernameAndPassword();
	}

	@When("click login button")
	public void click_login_button() {
		signin.clickloginButton();
	}

	@Then("user landed on product page")
	public void user_landed_on_product_page() {
		productpg.isDisplayedproductpage();
	}

	@Given("Login page displayed")
	public void login_Page_Displayed() {

		signin.isDisplayedLoginPage();
	}

	@When("select product based on user requirement {string}")
	public void select_product_based_on_user_requirement(String producttype) {
	productpg.selectproducttypes(producttype);

	}

	@When("Select Product based on user required product Types  {string} and {string}")
	public void select_product_based_on_user_required_product_types_and(String product, String subproduct) {
		System.out.printf(product, subproduct);
		cart.selectproduct(product, subproduct);
	}

	@When("Select Product sub category   based on requirement {string} {string} and {string}")
	public void select_product_sub_category_based_on_requirement_and(String product,String subproduct, String sub_category) {
		cart.selectproductsubcategory(product,subproduct,sub_category);
	}

	@When("Add the item to cart")
	public void add_the_item_to_cart() {
		cart.addTocart();
	}
}
