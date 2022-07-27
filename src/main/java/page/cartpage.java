package page;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;

public class cartpage {
public  Map<String,String>dogProduct= new HashMap<String,String>();
public  Map<String,String>fishProduct= new HashMap<String,String>();
//public  Map<String,String>product= new HashMap<String,String>();
//public  Map<String,String>product= new HashMap<String,String>();


//	private By productcatgeory = By.xpath("//div[@id='Catalog']//a");
	
	
	
	public void dogscategory() {
		dogProduct.put("Bulldog", "K9-BD-01");
		dogProduct.put("Poodle", "K9-PO-02");
		dogProduct.put("Dalmation", "K9-DL-01");
		dogProduct.put( "Golden Retriever","K9-RT-01");
		dogProduct.put("Labrador Retriever","K9-RT-02");
		dogProduct.put("Chihuahua","K9-CW-01");
	}
	
	public void fishcategory() {
		fishProduct.put("Angelfish", "FI-SW-01");
		fishProduct.put("Tiger Shark", "FI-SW-02");
		fishProduct.put("Koi", "FI-FW-01");
		fishProduct.put("Goldfish", "FI-FW-02");
	}
	
	public void selectproduct(String type,String subtype) {
		 
//		if (type=="fish") {
//		   for (String stype:fishProduct.get(subtype));
//		}
//		
//	}
}
}