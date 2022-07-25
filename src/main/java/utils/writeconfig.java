package utils;

import java.io.FileOutputStream;
import java.util.Properties;

public class writeconfig {
	protected FileOutputStream fio = null;
	protected Properties prop = null;
	readconfig config = new readconfig();

	public writeconfig() {
		try {
			prop = new Properties();
			fio = new FileOutputStream("src\\main\\java\\Config\\userdetail.properties");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String username(String user) {

		if (config.username() == null) {
			prop.put("username:", user);
		}
		return null;

	}

	public String password(String pass) {

		if (config.password() == null) {
			prop.put("password:", pass);
		}
		return null;

	}

}
