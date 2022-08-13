package page;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.browserfactore;
import utils.excelReader;
import utils.utils;

public class ProductListPage  extends browserfactore {
	public utils util= new utils();
	public excelReader excel = new excelReader();
	private By  fish=By.xpath("//img[@src='../images/fish_icon.gif']");
	private By  dogs=By.xpath("//img[@src='../images/dogs_icon.gif']");
	private By cats=By.xpath("//img[@src='../images/cats_icon.gif']");
	private By reptiles =By.xpath("//img[@src='../images/reptiles_icon.gif']");
	private By birds =By.xpath("//img[@src='../images/birds_icon.gif']");
	

	public ProductListPage() {
		this.driver=getdriver();
	}
	
	public void isDisplayedproductpage() {
		boolean result =driver.findElement(fish).isDisplayed();
		assertTrue(result);
	}
	
	public void selectproducttypes(String producttype)
	{
		if(producttype.equals("FISH")) {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.findElement(fish).click();
			
		}else if(producttype.equals("Dogs")) {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.findElement(dogs).click();
		
			}
		else if(producttype.equals("reptiles")) {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.findElement(reptiles).click();
			
			}
		else if(producttype.equals("cats")) {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.findElement(cats).click();
			}
		else if(producttype.equals("birds")) {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.findElement(birds).click();
			}
	}
	
}
