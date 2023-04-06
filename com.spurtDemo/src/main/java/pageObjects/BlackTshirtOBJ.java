package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlackTshirtOBJ {

	WebDriver driver;
	
	public BlackTshirtOBJ(WebDriver ldriver) {
		driver=ldriver;
		PageFactory.initElements(ldriver, this);
		
	}
	/*
	 * locator for BlackTshirt 
	 */

	@FindBy(xpath ="//input[@placeholder=\"Search for products\"]")
	@CacheLookup
	WebElement search;
	
	@FindBy(xpath ="//a[contains(text(),'Add to Cart')]")
	@CacheLookup
	WebElement addToCart;
	
	@FindBy(xpath ="//button[text()=' Buy Now']")
	@CacheLookup
	WebElement BuyNow;
	
	@FindBy(xpath ="//h4[text()='Home']")
	@CacheLookup
	WebElement address;
	
	@FindBy(xpath = "(//span[@class=\"mat-radio-label-content\"])[2]")
	@CacheLookup
	WebElement cod;

	@FindBy(xpath = "//button[contains(text(), 'Place Order')]")
	@CacheLookup
	WebElement placeOrder;
	/*
	 *  Method For BlackTshirt page
	 */


	public void searchDress() {
		search.click();
		search.sendKeys("black tshirt"+Keys.ENTER);
	}
	
	public void selectDress() throws InterruptedException {
		Thread.sleep(2000);
		search.sendKeys("black tshirt"+Keys.ENTER);
	}
	

	public void addToCart() {
		addToCart.click();
		
	}
	
	public void BuyNow() {
		BuyNow.click();
		
	}
	

	public void addAddress() {
		address.click();
	}

	public void payment() {
		cod.click();
		
	}

	public void placeOrd() {
		placeOrder.click();
	}
	/*
	 * locator for order status
	 */

	@FindBy(xpath ="//*[@class=\"mat-focus-indicator mat-menu-trigger blackStyle mat-button mat-button-base ng-star-inserted\"]")
	@CacheLookup
	WebElement Account;
	
	@FindBy(xpath ="(//a[@role='menuitem'])[1]")
	@CacheLookup
	WebElement OrderHistory;
	
	@FindBy(xpath ="(//button[contains(text(),'Track Order ')])[6]")
	@CacheLookup
	WebElement TrackOrder;
	

	public void Account() {
		Account.click();
	}

	public void OrderHistory() {
		OrderHistory.click();
		
	}

	public void TrackOrder() {
		TrackOrder.click();
	}
}
