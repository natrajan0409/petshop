package page;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.browserfactore;
import utils.excelReader;
import utils.readconfig;
import utils.utils;
import utils.writeconfig;

public class SignRegisterpage extends browserfactore {

	public excelReader excel = new excelReader();
	public readconfig config = new readconfig("src\\main\\java\\Config\\Config.properties");
	public String path = config.excelpath();
	public utils util= new utils();

	private By uName = By.xpath("//input[@name='username']");
	private By uPass = By.xpath("//input[@name='password']");
	private By rePass = By.xpath("//input[@name='repeatedPassword']");
	private By loginBtn = By.xpath("//input[@type='submit' and @value='Login']");

	private By registorlink = By.linkText("Register Now!");

	private By signInTitle = By.xpath("//p[text()='Please enter your username and password.']");
	private By userInfoRegTitle = By.xpath("//h3[text()='User Information']");
	private By accountInfoRegTitle = By.xpath("//h3[text()='Account Information']");
	private By profileInfoRegTitle = By.xpath("//h3[text()='Profile Information']");
	private By acc_name = By.xpath("//input[@name='account.firstName']");
	private By acc_LName = By.xpath("//input[@name='account.lastName']");
	private By acc_Email = By.xpath("//input[@name='account.email']");
	private By acc_Phone = By.xpath("//input[@name='account.phone']");
	private By acc_Address1 = By.xpath("//input[@name='account.address1']");
	private By acc_Address2 = By.xpath("//input[@name='account.address2']");
	private By acc_city = By.xpath("//input[@name='account.city']");
	private By acc_State = By.xpath("//input[@name='account.state']");
	private By acc_country = By.xpath("//input[@name='account.country']");
	private By acc_Zip = By.xpath("//input[@name='account.zip']");
	private By enableMyLst = By.xpath("//*[@name='account.listOption']");
	private By enableMyBanner = By.xpath("//*[@name='account.bannerOption']");
	private By saveAccinfo = By.xpath("//*[@name='newAccount'and @type='submit']");

	// dropdown handles
	String langPrefer = "//*[@name='account.languagePreference']";
	String favCatg = "//*[@name='account.favouriteCategoryId']";


	public SignRegisterpage() {
		this.driver = getdriver();
	}

	public void isDisplayedRegistrationpage() {
		assertTrue(driver.findElement(userInfoRegTitle).isDisplayed());
		assertTrue(driver.findElement(accountInfoRegTitle).isDisplayed());
		assertTrue(driver.findElement(profileInfoRegTitle).isDisplayed());
	}

	public void isDisplayedLoginPage(){
		util.pageloadtimeout(50);
//		util.explicitWait(driver.findElements(signInTitle), 60);
//		assertTrue(driver.findElement(signInTitle).isDisplayed());
	}

	public void enterusername(String username) {
		driver.findElement(uName).sendKeys(username);

	}

	public void enterpassword(String password) {
		driver.findElement(uPass).sendKeys(password);

	}

	public void enterRePass(String password) {
		driver.findElement(rePass).sendKeys(password);

	}

	public void clickloginButton() {
		driver.findElement(loginBtn).click();
	}
	
	public void isDisplayedLoginButton() {
		assertTrue(driver.findElement(loginBtn).isDisplayed());
	}

	public void clickRegisterNowlink() {
		driver.findElement(registorlink).click();
	}

	public void enterAccoutFname(String fname) {
		driver.findElement(acc_name).sendKeys(fname);
	}

	public void enterAccoutLName(String lName) {
		driver.findElement(acc_LName).sendKeys(lName);
	}

	public void enterAccoutEmail(String email) {
		driver.findElement(acc_Email).sendKeys(email);
	}

	public void enterphone(String phone) {
		driver.findElement(acc_Phone).sendKeys(phone);
	}

	public void enteraddress(String address1, String address2) {
		driver.findElement(acc_Address1).sendKeys(address1);
		driver.findElement(acc_Address2).sendKeys(address2);
	}

	public void enterCity(String city) {
		driver.findElement(acc_city).sendKeys(city);
	}

	public void enterState(String state) {
		driver.findElement(acc_State).sendKeys(state);
	}

	public void entercountry(String country) {
		driver.findElement(acc_country).sendKeys(country);
	}

	public void enterzipCode(String zip) {
		driver.findElement(acc_Zip).sendKeys(zip);
	}

	public void enterAccountInformation(String sheetname) throws InvalidFormatException, IOException {
		writeconfig wrconfig = new writeconfig();
		List<Map<String, String>> getdata = excel.getData(path, sheetname);
		int row = excel.getrowcount(path, sheetname) - 1;
		String username = getdata.get(row).get("username");
		String newpass = getdata.get(row).get("newpassword");
		String rePassword = getdata.get(row).get("Repeatpassword");
		String fName = getdata.get(row).get("Fname");
		String lName = getdata.get(row).get("Lname");
		String eMail = getdata.get(row).get("Email");
		String phone = getdata.get(row).get("Phone");
		String add1 = getdata.get(row).get("Address1");
		String add2 = getdata.get(row).get("Address2");
		String city = getdata.get(row).get("city");
		String state = getdata.get(row).get("state");
		String zip = getdata.get(row).get("Zip");
		String country = getdata.get(row).get("country");

		enterusername(username);
		enterpassword(newpass);
		enterRePass(rePassword);
		enterAccoutFname(fName);
		enterAccoutLName(lName);
		enterAccoutEmail(eMail);
		enterphone(phone);
		enteraddress(add1, add2);
		enterCity(city);
		enterState(state);
		enterzipCode(zip);
		entercountry(country);
		util.selectdropdownByValue(driver.findElement(By.xpath(langPrefer)), "english");
		util.selectdropdownByValue(driver.findElement(By.xpath(favCatg)), "DOGS");
		driver.findElement(enableMyLst).click();
		driver.findElement(enableMyBanner).click();
		wrconfig.usernameAndPassword(username, newpass);

	}

	public void clicksaveinformation() {
		driver.findElement(saveAccinfo).click();
	}
	
	public void enterUsernameAndPassword() {
		readconfig config2 = new readconfig("src\\main\\java\\config\\userdetail.properties");
		enterusername(config2.username());
		enterpassword(config2.password());
	}
	
	public void enterJpetshopLogintURL() {
		String URL = config.getLoginURL();
		String browser = config.getbrowser();
		if (URL != null) {

			driver.get(URL);
			driver.manage().window().maximize();
		} else {
			System.out.println("URL not avaliable");
		}

	}

}
