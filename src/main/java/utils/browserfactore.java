package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserfactore {

	public readconfig config= new readconfig();
    public static WebDriver driver;
	public WebDriver getdriver() {
//		String browserpath =System.getProperty("user.dir")+"//src//test//resources//driver//chromedriver.exe";	
		try {
			switch(config.getbrowser()) {
			case "chrome":
			if(null==driver){
				WebDriverManager.chromedriver().setup(); 
				 driver = new ChromeDriver();
//				System.setProperty("webdriver.chromer.driver",browserpath );
//        		driver= new ChromeDriver();
			}
			break;
			
			case "firefox":
		   if (null==driver ) {
				WebDriverManager.firefoxdriver().setup();
				 driver = new FirefoxDriver();
			}
		   break;
			case "edge":
			if (null==driver ) {
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
			break;
			
			}
			} catch (Exception e) {
			System.out.println("unable to load browser"+e.getMessage());
			e.printStackTrace();
		}finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		}
		return driver;
	}
}