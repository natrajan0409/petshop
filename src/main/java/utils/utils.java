package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class utils  {
public WebDriver driver;
	
public void selectdropdownByValue(WebElement element,String value) {
	Select dropdown = new Select (element);  
	try {
		dropdown.selectByValue(value);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
