package page;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.browserfactore;
import utils.excelReader;

public class ProductListPage  extends browserfactore {
	public excelReader excel = new excelReader();
	@FindBy(linkText="../images/fish_icon.gif")
	WebElement fish;
	
	public ProductListPage() {
		this.driver=getdriver();
	}
	
	public void isDisplayedproductpage() {
		assertTrue(fish.isDisplayed());
	}
	
}
