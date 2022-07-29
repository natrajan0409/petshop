package page;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.browserfactore;
import utils.utils;

public class cartpage extends browserfactore {
	public Map<String, String> dogProduct = new LinkedHashMap<String, String>();
	public Map<String, String> fishProduct = new LinkedHashMap<String, String>();
	public Map<String, String> catsProduct = new LinkedHashMap<String, String>();
	public Map<String, String> reptilesProduct = new LinkedHashMap<String, String>();
	public Map<String, String> birdspProduct = new LinkedHashMap<String, String>();

	

	public utils util = new utils();

	public cartpage() {

		this.driver = getdriver();
	}

	private void dogscategory() {
		dogProduct.put("Bulldog", "K9-BD-01");
		dogProduct.put("Poodle", "K9-PO-02");
		dogProduct.put("Dalmation", "K9-DL-01");
		dogProduct.put("Golden Retriever", "K9-RT-01");
		dogProduct.put("Labrador Retriever", "K9-RT-02");
		dogProduct.put("Chihuahua", "K9-CW-01");
	}

	private void fishcategory() {
		fishProduct.put("Angelfish", "FI-SW-01");
		fishProduct.put("Tiger Shark", "FI-SW-02");
		fishProduct.put("Koi", "FI-FW-01");
		fishProduct.put("Goldfish", "FI-FW-02");
	}

	private void fishsubCategory(String subtype) {
		if (subtype.equals("Angelfish")) {
			fishProduct.put("Large Angelfish", "EST-1");
			fishProduct.put("Small Angelfish", "EST-2");
		} else if (subtype.equals("Tiger Shark")) {
			fishProduct.put("Toothless Tiger Shark", "EST-3");
		} else if (subtype.equals("Koi")) {
			fishProduct.put("Spotted Koi", "EST-4");
			fishProduct.put("Spotless Koi", "EST-5");
		} else if (subtype.equals("Goldfish")) {
			fishProduct.put("Adult Male Goldfish", "EST-20");
			fishProduct.put("Adult Female Goldfish", "EST-21");
		}
	}

	private void dogssubcategory(String subtype) {
		if (subtype.equals("Bulldog")) {
			dogProduct.put("Male Adult Bulldog", "EST-6");
			dogProduct.put("Female Puppy Bulldog", "EST-7");
		} else if (subtype.equals("Poodle")) {
			dogProduct.put("Male Puppy Poodle", "EST-8");
		} else if (subtype.equals("Dalmation")) {
			dogProduct.put("Spotless Male Puppy Dalmation", "EST-9");
			dogProduct.put("Spotted Adult Female Dalmation", "EST-10");
		} else if (subtype.equals("Golden Retriever")) {
			dogProduct.put("Adult Female Golden Retriever	", "EST-28");
		} else if (subtype.equals("Labrador Retriever")) {
			dogProduct.put("Adult Male Labrador Retriever", "EST-22");
			dogProduct.put("Adult Female Labrador Retriever", "EST-23");
			dogProduct.put("Adult Male Labrador Retriever", "EST-24");
			dogProduct.put("Adult Female Labrador Retriever", "EST-25");
		} else if (subtype.equals("Chihuahua")) {
			dogProduct.put("Adult Male Chihuahua", "EST-26");
			dogProduct.put("Adult Female Chihuahua", "EST-27");
		}
	}

	private void catssubCategory(String subtype) {
		if (subtype.equals("Manx")) {
			catsProduct.put("Tailless Manx", "EST-14");
			catsProduct.put("With tail Manx", "EST-15");
		} else if (subtype.equals("Persian")) {
			catsProduct.put("Adult Female Persian", "EST-16");
			catsProduct.put("Adult Male Persian", "EST-17");
		}
	}

	private void reptilessubCategory(String subtype) {
		if (subtype.equals("Rattlesnake")) {
			reptilesProduct.put("Venomless Rattlesnake", "EST-11");
			reptilesProduct.put("Rattleless Rattlesnake", "EST-12");
		} else if (subtype.equals("Iguana")) {
			reptilesProduct.put("Green Adult Iguana", "EST-13");

		}
	}

	private void birdssubCategory(String subtype) {
		if (subtype.equals("Amazon Parrot")) {
			birdspProduct.put("Adult Male Amazon Parrot", "EST-18");

		} else if (subtype.equals("Finch")) {
			birdspProduct.put("Adult Male Finch	", "EST-19");

		}
	}

	private void catsCategory() {
		catsProduct.put("Manx", "FL-DSH-01");
		catsProduct.put("Persian", "FL-DLH-02");
	}

	private void reptilescategory() {
		birdspProduct.put("Amazon Parrot", "AV-CB-01");
		birdspProduct.put("Finch", "AV-SB-02");
	}

	private void birdscategory() {
		reptilesProduct.put("Rattlesnake", "RP-SN-01");
		reptilesProduct.put("Iguana", "RP-LI-02");
	}

	public void selectproduct(String type, String subtype) {

		if (type.equals("fish")) {
			fishcategory();
			;
			fishProduct.get(subtype);
			System.out.println(fishProduct.get(subtype));
			util.Action(driver.findElement(By.linkText(fishProduct.get(subtype))));
			driver.findElement(By.linkText(fishProduct.get(subtype))).click();
		} else if (type.equals("dogs")) {
			dogscategory();
			util.Action(driver.findElement(By.linkText(dogProduct.get(subtype))));
			driver.findElement(By.linkText(dogProduct.get(subtype))).click();
		} else if (type.equals("cats")) {
			catsCategory();
			util.Action(driver.findElement(By.linkText(catsProduct.get(subtype))));
			driver.findElement(By.linkText(catsProduct.get(subtype))).click();
		} else if (type.equals("reptiles")) {
			reptilescategory();
			util.Action(driver.findElement(By.linkText(reptilesProduct.get(subtype))));
			driver.findElement(By.linkText(reptilesProduct.get(subtype))).click();
		} else if (type.equals("birds")) {
			birdscategory();
			util.Action(driver.findElement(By.linkText(birdspProduct.get(subtype))));
			driver.findElement(By.linkText(birdspProduct.get(subtype))).click();
		}

	}

	public void selectproductsubcategory(String type, String subcatagory) {

	}
}
