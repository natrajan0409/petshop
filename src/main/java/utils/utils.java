package utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utils extends browserfactore  {
public WebDriver driver;
	

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


public void pageloadtimeout(int loadingtime) {
	driver.manage().timeouts().pageLoadTimeout(loadingtime, TimeUnit.SECONDS);
}
}
