package page;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.browserfactore;
import utils.excelReader;
import utils.utils;

public class ProductListPage  extends browserfactore {
	public utils util= new utils();
	public excelReader excel = new excelReader();
	@FindBy(linkText="../images/fish_icon.gif")
	WebElement fish;
	@FindBy(linkText="../images/dogs_icon.gif")
	WebElement dogs;
	@FindBy(linkText="../images/cats_icon.gif")
	WebElement cats;
	@FindBy(linkText="../images/reptiles_icon.gif")
	WebElement reptiles;
	@FindBy(linkText="../images/birds_icon.gif")
	WebElement birds;	

	public ProductListPage() {
		this.driver=getdriver();
	}
	
	public void isDisplayedproductpage() {
		assertTrue(fish.isDisplayed());
	}
	
	public void selectproducttypes(String producttype)
	{
		if(producttype=="Fish") {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			fish.click();
		}else if(producttype=="Dogs") {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			dogs.click();
			}
		else if(producttype=="reptiles") {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			reptiles.click();
			}
		else if(producttype=="cats") {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			cats.click();
			}
		else if(producttype=="birds") {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			birds.click();
			}
	}
	
}
