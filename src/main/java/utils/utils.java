package utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utils extends browserfactore  {
public WebDriver driver;
	
@FindBy(xpath = "//a[@class='Button' and text()='Add to Cart']")
public WebElement addTocart;

public utils(){
this.driver = getdriver();
}

public void selectdropdownByValue(WebElement element,String value) {
	Select dropdown = new Select (element);  
	try {
		dropdown.selectByValue(value);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public void explicitWait(List<WebElement> element,int value) {
	
	WebDriverWait wait = new WebDriverWait(driver,value);
	try {
		wait.until(ExpectedConditions.visibilityOfAllElements(element));;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public void click(By object) {
	driver.findElement(object).clear();
}


public void Action(WebElement element) {

	try {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void pageloadtimeout(int loadingtime) {
	driver.manage().timeouts().pageLoadTimeout(loadingtime, TimeUnit.SECONDS);
}
}
