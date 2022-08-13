package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.ProductListPage;
import page.SignRegisterpage;
import page.cartpage;
import page.checkoutpage;
import page.homepage;

public class addtocartStepdef {

	homepage home = new homepage();
	SignRegisterpage signin = new SignRegisterpage();
	cartpage cart = new cartpage();
	checkoutpage checkout= new checkoutpage();
	ProductListPage productpg = new ProductListPage();

	@When("click on Proceed to checkout btn")
	public void click_on_proceed_to_checkout_btn() {
		checkout.clickonProceedToCheckoutBtn();
	}
	@Then("Payment page Displayed")
	public void payment_page_displayed() {
		checkout.isDisplayedPaymentHdr();
	}
	@When("Click on contiune btn")
	public void click_on_contiune_btn() {
	    // Write code here that turns the phrase above into concrete actions
		checkout.clickoncontinueBtn();
	}
	@When("Click on confirm")
	public void click_on_confirm() {
	    // Write code here that turns the phrase above into concrete actions
		checkout.isDisplayedorderConfirmedHDr();
		checkout.clickonorderConfirmBtn();
	}
	@Then("they can see order submitted msg")
	public void they_can_see_order_submitted_msg() {
	    // Write code here that turns the phrase above into concrete actions
		checkout.isDisplayedOrderSubmittedHdr();
	}
	@When("Click on Signout btn")
	public void click_on_signout_btn() {
	    // Write code here that turns the phrase above into concrete actions
		checkout.signout();
	}



}
