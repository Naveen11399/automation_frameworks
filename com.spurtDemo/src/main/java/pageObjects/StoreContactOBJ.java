package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class StoreContactOBJ {
	WebDriver driver;

	public StoreContactOBJ(WebDriver ldriver) {

		driver = ldriver;
		PageFactory.initElements(ldriver, this);

	}
	/*
	 * Locator for Contact
	 */
	
	
	@FindBy(xpath = "(//a[@href='/contact'])")
	@CacheLookup
	WebElement contactbtn;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement submitbtn;

	@FindBy(xpath = "//mat-error[text()=' Name is required']")
	@CacheLookup
	WebElement nameasert;

	@FindBy(xpath = "//mat-error[text()=' Email is required']")
	@CacheLookup
	WebElement emailasert;

	@FindBy(xpath = "//mat-error[text()='Phone number is required']")
	@CacheLookup
	WebElement phoneasert;

	@FindBy(xpath = "//mat-error[text()=' Message is required']")
	@CacheLookup
	WebElement messagesasert;

	@FindBy(xpath = "//input[@placeholder='Name']")
	@CacheLookup
	WebElement nametxt;

	@FindBy(xpath = "//input[@placeholder='Email']")
	@CacheLookup
	WebElement emailtxt;

	@FindBy(xpath = "//input[@placeholder='Phone']")
	@CacheLookup
	WebElement phonetxt;

	@FindBy(xpath = "//textarea[@placeholder='Message']")
	@CacheLookup
	WebElement messagetxt;
	
	/*
	 * Method for contact
	 */
	
	public void Contact() {

		contactbtn.click();
	}

	public void Submit() {

		submitbtn.click();
	}
	
	public void NameAsrt() {
		String nam = nameasert.getText();
		Assert.assertEquals(nam, "Name is required");

	}

	public void EmailAsrt() {

		String email = emailasert.getText();
		Assert.assertEquals(email, "Email is required");
	}

	public void PhoneAsrt() {

		String ph = phoneasert.getText();
		Assert.assertEquals(ph, "Phone number is required");
	}

	public void MessageAsrt() {

		String mess = messagesasert.getText();
		Assert.assertEquals(mess, "Message is required");
	}

	public void Name() {

		nametxt.sendKeys("Naveen");

	}

	public void Email() {

		emailtxt.sendKeys("piccotalent169@gmail.com");

	}

	public void Phone() {

		phonetxt.sendKeys("777777");

	}

	public void Message() {

		messagetxt.sendKeys("Automation testing");

	}
	
	/*
	 * Locator for vendor
	 */
	@FindBy(xpath = "//a[@routerlink='/vendors']")
	@CacheLookup
	WebElement vendor;
	
	@FindBy(xpath = "//h5[text()='4 / 5']")
	@CacheLookup
	WebElement piccoRating;
	
	@FindBy(xpath = "(//img[@alt='piccosoft'])[2]")
	@CacheLookup
	WebElement piccoSoft;
	
	@FindBy(xpath = "//h3[text()='Reviews']")
	@CacheLookup
	WebElement Reviews;
	
	@FindBy(xpath = "//label[text()='About']")
	@CacheLookup
	WebElement About;
	
	@FindBy(xpath = "//label[text()='Products']")
	@CacheLookup
	WebElement Products;
	
	@FindBy(xpath = "//label[text()='Reviews']")
	@CacheLookup
	WebElement ReviewsPage;
	
	@FindBy(xpath = "//h3[text()='About piccosoft']")
	@CacheLookup
	WebElement Aboutpiccosoft;
	
	/*
	 * Method for vendor
	 */
	
	public void vendor() {

		vendor.click();
	}

	public void piccoSoft() {

		piccoSoft.click();
	}
	
	public void piccoRating() {

		String actRat= piccoRating.getText();
		Assert.assertEquals(actRat, "4 / 5");
	}

	public void Reviews() {

		String actVal = Reviews.getText();
		Assert.assertEquals(actVal, "Reviews");
	}
	public void About() {

		About.click();
	}

	public void Products() {

		Products.click();
	}
	public void ReviewsPage() {

		ReviewsPage.click();
	}
	public void Aboutpiccosoft() {

		String actVal1 = Aboutpiccosoft.getText();
		Assert.assertEquals(actVal1, "About piccosoft");
	}
	
	/*
	 * Locator for SmartWatch
	 */
	
	@FindBy(xpath = "(//input[@placeholder='Search for products'])[1]")
	@CacheLookup
	WebElement search;
	
	@FindBy(xpath = "//h3[text()='AQFIT W12 Smartwatch IP68 Water Resistant']")
	@CacheLookup
	WebElement AQFIT;
	
	@FindBy(xpath = "//p[@class='b-icon']//li[1]")
	@CacheLookup
	static
	WebElement Description;
	
	@FindBy(xpath = "//a[contains(text(),'Specifications')]")
	@CacheLookup
	WebElement Specifications;
	
	@FindBy(xpath = "//a[contains(text(),'Review')]")
	@CacheLookup
	WebElement Review;
	
	@FindBy(xpath = "//a[contains(text(),'Customer questions & answers')]")
	@CacheLookup
	WebElement CustomerQnA;
	
	@FindBy(xpath = "//button[text()='Post Your Question']")
	@CacheLookup
	WebElement PostQns;
	
	@FindBy(xpath = "//textarea[@placeholder='Write your question here']")
	@CacheLookup
	WebElement AskQns;
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	@CacheLookup
	WebElement submitBtn;
	
	/*
	 * Method for SmartWatch
	 */
	public void searchBar() {

		search.sendKeys("smartwatch");
	}

	public void AQFIT() {

		AQFIT.click();
	}
	public void Specifications() {

		Specifications.click();
	}
	public static String Description() {

		String actVal1 = Description.getText();
		Assert.assertEquals(actVal1, "DESIGN: Rooted in style‚ the watch reflects beauty on the outside too through the large 2.5D touch screen display‚ encased in an ultra-thin and light zinc magnesium alloy body with a bottom shell made with the IML process for durability. Offering a 1.69 HD IPS display with a resolution of up to 240*280 pixels‚ it looks just as classy as it feels comfortable.");
		return actVal1;
	
	}
	public void CustomerQnA() {

		CustomerQnA.click();
	}
	public void Review() {

		Review.click();
	}
	
	public void PostQns() {

		PostQns.click();
	}
	public void AskQns() {

		AskQns.sendKeys("no qns");
	}
	public void submitBtn() {

		submitBtn.click();
	}
	
	/*
	 * Locator for weekend collection
	 */
	
	@FindBy(xpath = "(//a[text()='Add to Cart '])[5]")
	@CacheLookup
	WebElement addCartLamp;
	
	@FindBy(xpath = "//a[contains(@class,'mat-focus-indicator mat-menu-trigger')]")
	@CacheLookup
	WebElement lang;
	
	@FindBy(xpath = "//span[text()='French']")
	@CacheLookup
	WebElement French;
	
	@FindBy(xpath = "//button[text()='AJOUTER AU CHARIOT']")
	@CacheLookup
	WebElement addFrench;
	
	@FindBy(xpath = "//button[text()=' Acheter maintenant']")
	@CacheLookup
	WebElement buyfrench;
	
	@FindBy(xpath = "//a[contains(text(),'Spurtcommerce stories')]")
	@CacheLookup
	WebElement SpurtStory;
	
	@FindBy(xpath = "//li[text()='Our Development team has been constantly working towards']")
	@CacheLookup
	static
	WebElement Story1;
	
	@FindBy(xpath = "//a[.='home']")
	@CacheLookup
	WebElement home;
	
	@FindBy(xpath = "(//p[@class='ng-star-inserted'])[1]")
	@CacheLookup
	WebElement like;
	
	@FindBy(xpath = "(//p[@class='ng-star-inserted']/following-sibling::p)[2]")
	@CacheLookup
	WebElement dislike;
	
	@FindBy(xpath = "//span[text()='Updated Your Question Status']")
	@CacheLookup
	WebElement likeToast;
	
	@FindBy(xpath = "//span[text()='Updated Your Question Status']")
	@CacheLookup
	WebElement dislikeToast;
	
	/*
	 * methods for smartwatch
	 */
	public void addCartLamp() {

		addCartLamp.click();
	}
	
	public void lang() {

		lang.click();
	}
	
	public void French() {

		French.click();
	}
	
	public void addFrench() {


		String actVal1 = addFrench.getText();
		Assert.assertEquals(actVal1, "AJOUTER AU CHARIOT");
	}
	public void buyfrench() {


		String actVal1 = buyfrench.getText();
		Assert.assertEquals(actVal1, "Acheter Maintenant");
	}
	public void like() {

		like.click();
	}
	public void toastMsg() {


		String actVal1 = likeToast.getText();
		Assert.assertEquals(actVal1, "Updated Your Question Status");
	}
	public void dislike() {

		dislike.click();
	}
	public void SpurtStory() {

		SpurtStory.click();
	}
	public  static String Story() {
		String actVal1 = Story1.getText();
		Assert.assertEquals(actVal1, "Our Development team has been constantly working towards");
		return actVal1;
	}
	public void home() {

		home.click();
	}
	public void homeUrl() {
		String actUrl=driver.getCurrentUrl();
		
		Assert.assertEquals(actUrl, "http://3.6.249.0/");
	}
	/*
	 * locator for colour Btn
	 */
	@FindBy(xpath = "//button[contains(@class,'mat-focus-indicator options-icon')]")
	@CacheLookup
	WebElement colourBtn;
	
	@FindBy(xpath = "//span[@class='skin-icon purple']")
	@CacheLookup
	WebElement purble;
	
	@FindBy(xpath = "//mat-toolbar[@color='primary']")
	@CacheLookup
	WebElement BGverify;
	
	@FindBy(xpath = "//span[@class='skin-icon blue']")
	@CacheLookup
	WebElement blue;
	
	/*
	 * method for colour Btn
	 */
	public void colourBtn() {

		colourBtn.click();
	}
	
	public void purble() {

		purble.click();
	}
	
	public void BGverify() {


		String actVal1 = BGverify.getCssValue("background");
		System.out.println(actVal1);
		Assert.assertEquals(actVal1, "rgb(123, 31, 162) none repeat scroll 0% 0% / auto padding-box border-box");
	}
	
	public void blue() {

		blue.click();
	}
	
}
