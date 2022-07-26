package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class writeconfig {
	protected FileOutputStream fio = null;
	protected Properties prop = null;
	readconfig config = new readconfig("src\\main\\java\\Config\\Config.properties");

	String path = "src\\main\\java\\Config\\userdetail.properties";
	public  writeconfig() throws IOException {		
		File file = new File(path);
		try {
			file.createNewFile();
			prop = new Properties();
			 fio = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
}
	
	
	public void usernameAndPassword(String username, String password) throws IOException {
		if(prop.getProperty("username")==null) {
		prop.setProperty("username", username);
		 prop.setProperty("password", password);
		prop.store(fio, null);
		}
		else {
			System.out.println("same user name alreday present"+username);
		}
		
	}
}