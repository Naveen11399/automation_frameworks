package seleniumPRACTICE;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
@Test
public class SpurtTab {
	@FindBy(xpath = "//input[@formcontrolname=\"userName\"]")
	public static WebElement userName;
	
	@FindBy(xpath = "//input[@formcontrolname=\"password\"]")
	public static WebElement password;
	
	@FindBy(xpath = "//button [@class=\"btn btn-log\"]")
	public static WebElement login;
	
	@FindBy(xpath = "//a[@href=\"#/vendors\"]")
	public static WebElement marketplace;
	
	@FindBy(xpath = "//button[@class=\"button-reg primary\"]")
	public static WebElement addVendor;
	
	@FindBy(xpath = "//input[@placeholder=\"Company Name\"]")
	public static WebElement companyName; 
	
	@FindBy(xpath = "//*[@aria-autocomplete=\"list\"]")
	public static WebElement vendorDrp;
	
	@FindBy(xpath = "//input[@formcontrolname=\"displayName\"]")
	public static WebElement dispName;
	
	@FindBy(xpath = "//input[@placeholder=\"First Name\"]")
	public static WebElement firstName;

	@FindBy(xpath = "//input[@placeholder=\"Last Name\"]")
	public static WebElement lastName;
	
	@FindBy(xpath = "//input[@placeholder=\"Email\"]")
	public static WebElement email;
	
	@FindBy(xpath = "//input[@placeholder=\"Mobile Number\"]")
	public static WebElement MobNumber;
	
	@FindBy(xpath = "//input[@placeholder=\"Address - 1\"]")
	public static WebElement address1;
	
	@FindBy(xpath = "//input[@placeholder=\"Address - 2\"]")
	public static WebElement address2;
	
	@FindBy(xpath = "//input[@placeholder=\"City\"]")
	public static WebElement city;
	
	@FindBy(xpath = "(//input[@aria-autocomplete=\"list\"])[2]")
	public static WebElement state;
	
	@FindBy(xpath = "(//input[@aria-autocomplete=\"list\"])[3]")
	public static WebElement country;
	
	@FindBy(xpath = "//input[@placeholder=\"postal code\"]")
	public static WebElement postalCode;
	
	@FindBy(xpath = "//input[@placeholder=\"Password\"]")
	public static WebElement pwd;
	
	@FindBy(xpath = "//input[@placeholder=\"Confirm Password\"]")
	public static WebElement cnfmPwd;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Provide bank details eg. Bank name, Account number, IFSC code, Branch\"]")
	public static WebElement bankDetails;
	
	@FindBy(xpath = "//div[@class=\"ap-upload-image\"]")
	public static WebElement uploadImg;
	//id="final"
	@FindBy(id ="final" )
	public static WebElement createBtn;
}

