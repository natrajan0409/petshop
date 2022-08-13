package page;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import utils.browserfactore;
import utils.utils;

public class checkoutpage extends browserfactore {
	public utils util= new utils();
	
	private By proceedtochekout = By.xpath("//*[@class='Button'and text()='Proceed to Checkout']");
	private By continueBtn=By.xpath("//*[@name='newOrder']");
	private By ShiptoDifAdd = By.xpath("//*[contains(.,'Ship to different address...')]//following::input[@name='shippingAddressRequired']");
	private By orderConfirmBtn=By.xpath("//*[@class='Button'and text()='Confirm']");
	private By signout =By.xpath("//*[text()='Sign Out']");
	private By paymentHdr =By.xpath("//*[text()='Payment Details']");
	private By orderConfirmedHDr= By.xpath("//*[text()='Billing Address']");
	private By OrderSubmittedHdr=By.xpath("//*[text()='Thank you, your order has been submitted.']");
	

	public checkoutpage() {

			this.driver=getdriver();
	}
	
	public void isDisplayedPaymentHdr() {
      assertTrue(driver.findElement(paymentHdr).isDisplayed());
	}
	
	public void isDisplayedOrderSubmittedHdr() {
	      assertTrue(driver.findElement(OrderSubmittedHdr).isDisplayed());
		}
	
	public void isDisplayedorderConfirmedHDr() {
	      assertTrue(driver.findElement(orderConfirmedHDr).isDisplayed());
		}
	
	public void clickoncontinueBtn() {
		util.pageloadtimeout(30);
		driver.findElement(continueBtn).click();
	}
	public void clickonProceedToCheckoutBtn() {
		util.pageloadtimeout(30);
		driver.findElement(proceedtochekout).click();
	}
	
	public void clickonShiptoDifAddBtn() {
		util.pageloadtimeout(30);
		driver.findElement(ShiptoDifAdd).click();
	}
	
	public void clickonorderConfirmBtn() {
		util.pageloadtimeout(30);
		driver.findElement(orderConfirmBtn).click();
	}
	
	public void signout() {
		util.pageloadtimeout(30);
		driver.findElement(signout).click();
	}
}
