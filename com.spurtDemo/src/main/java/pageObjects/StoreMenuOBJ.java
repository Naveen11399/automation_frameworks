package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class StoreMenuOBJ {
	WebDriver driver;

	public StoreMenuOBJ(WebDriver ldriver) {

		driver = ldriver;
		PageFactory.initElements(ldriver, this);

	}

	/*
	 * Locators for Top pages
	 */
	@FindBy(xpath = "//a[contains(.,'Diwali mega offer')]")
	@CacheLookup
	WebElement Diwalimegaoffer;

	@FindBy(xpath = "//a[contains(.,'Christmas festive')]")
	@CacheLookup
	WebElement Christmasfestive;
	
	@FindBy(xpath = "//a[.='Contact']")
	@CacheLookup
	WebElement Contact;

	@FindBy(xpath = "//a[contains(.,'Top Selling Laptops')]")
	@CacheLookup
	WebElement TopSellingLaptop;
	
	@FindBy(xpath = "//span[text()='Diwali mega offer ']")
	@CacheLookup
	WebElement diwaliText;
	
	@FindBy(xpath = "(//a[@class='cart-btn'])[2]")
	@CacheLookup
	WebElement secCart;
	
	@FindBy(xpath = "(//p[@class='new-price'])[2]")
	@CacheLookup
	WebElement secPrice;
	@FindBy(xpath = "//span[text()='Christmas festive ']")
	@CacheLookup
	WebElement ChristmasText;
	
	@FindBy(xpath = "//a[contains(text(),'Teiro t sirts')]")
	@CacheLookup
	WebElement tshirtName;
	
	/*
	 * Method for Top pages
	 */
	public void Diwalimegaoffer() {
		Diwalimegaoffer.click();

	}
	public void secCart() {
		secCart.click();

	}

	public void TopSellingLaptop() {
		TopSellingLaptop.click();

	}

	public void Christmasfestive() {
		Christmasfestive.click();

	}

	public void Christmastext() {
		String act1 = ChristmasText.getText();
		Assert.assertEquals(act1, "Christmas Festive");

	}
	public void tshirtName() {
		String act = tshirtName.getText();
		Assert.assertEquals(act, "Teiro t sirts");

	}
	
	public void Diwalitext() {
		String act = diwaliText.getText();
		Assert.assertEquals(act, "Diwali Mega Offer");

	}
	public void jeanPrice() {
		String act = secPrice.getText();
		Assert.assertEquals(act, "$ 601");

	}

}
