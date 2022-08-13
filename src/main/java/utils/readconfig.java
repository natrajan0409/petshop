package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readconfig  {
	protected FileInputStream fis =null;
	protected Properties prop =null;
//	public String path ="src\\main\\java\\Config\\Config.properties";
	
	public readconfig(String path) {
	try {
// 		ReadConfirfile.class.getClassLoader().getSystemResourceAsStream("src\\main\\java\\Properties\\config.properties");
 		prop=new Properties();
// 		prop.load(input);
 		fis=new FileInputStream(path);
 		prop.load(fis);
 		
 	} catch(IOException e) {
 		e.printStackTrace();
 	}
}
	public String getbrowser() {
		if(prop.getProperty("browserName")==null)
		{
			return "";
			
		}
		return prop.getProperty("browserName");
	}

	public String username() {
		if(prop.getProperty("username")==null)
		{
			return "";
			
		}
		return prop.getProperty("username");
	}
	
	
	public String password() {
		if(prop.getProperty("password")==null)
		{
			return "";
			
		}
		return prop.getProperty("password");
	}
	
	
	
	public String getURL() {
		if(prop.getProperty("URL")==null)
		{
			return "";
			
		}
		return prop.getProperty("URL");
	}
	
	
	public String getLoginURL() {
		if(prop.getProperty("LoginURl")==null)
		{
			return "";
			
		}
		return prop.getProperty("LoginURl");
	}
	
	public String excelpath() {
		if(prop.getProperty("Excelpath")==null)
		{
			return "";
			
		}
		return System.getProperty("user.dir")+"/"+prop.getProperty("Excelpath");
	}
	
	public String getReportConfigPath(){
		String reportConfigPath = prop.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}


}
