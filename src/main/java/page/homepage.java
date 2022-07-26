package page;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import utils.browserfactore;
import utils.readconfig;

public class homepage extends browserfactore {
	readconfig conf = new readconfig("src\\main\\java\\Config\\Config.properties");

	private By jstoreHomeTitle = By.xpath("//div[@id='Content']//h2");
	private By enterStore = By.linkText("Enter the Store");
	private By  signin = By.linkText("Sign In");
	private By copyRightTxt = By.xpath("//sub[contains(.,'Copyright www.mybatis.org')]");

	public homepage() {

			this.driver=getdriver();
	}
	
	public void isDisplayeJPetStoreTitile() {
		String titile = driver.findElement(jstoreHomeTitle).getText();
		String copyRighttext = driver.findElement(copyRightTxt).getText();
		assertTrue(titile.equals("Welcome to JPetStore 6"));
		assertTrue(copyRighttext.equals("Copyright www.mybatis.org"));
	}

	public void isDisplayedSignHDR() {
		assertTrue(driver.findElement(signin).isDisplayed());
	}

	public void clickEntertTheStore() {
		driver.findElement(enterStore).click();
	}
	public void clickOnSignIn() {
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.findElement(signin).click();
	}

	public void enterJpetshoptURL() {
		String URL = conf.getURL();
		String browser = conf.getbrowser();
		if (URL != null) {

			driver.get(URL);
			driver.manage().window().maximize();
		} else {
			System.out.println("URL not avaliable");
		}

	}
}
