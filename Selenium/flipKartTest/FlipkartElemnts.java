package flipKartTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

@Test
public class FlipkartElemnts {

	@FindBy(name = "q")
	public static WebElement searchFlipkart;
	@FindBy(xpath = "//h3[@class='LC20lb MBeuO DKV0Md']")
	public static WebElement flipkartHome;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	public static WebElement closeBtn;
	@FindBy(xpath = "//a[@class='_3SkBxJ']")
	public static WebElement viewCart;

	@FindBy(xpath = "//div[contains(text(),'Grocery')]")
	public static WebElement groceryBtn;
	@FindBy(xpath = "//div[starts-with(text(),'Your')]")
	public static WebElement groceryList;
	@FindBy(xpath = "//span[contains(text(),'Shop now')]")
	public static WebElement shopNow;
	@FindBy(xpath = "//input[@name='pincode']")
	public static WebElement allow;
	@FindBy(xpath = "//button[@type='button']")
	public static WebElement location;
	@FindBy(xpath = "//a[contains(text(),'044-45614700')]")
	public static WebElement telephone;
}
