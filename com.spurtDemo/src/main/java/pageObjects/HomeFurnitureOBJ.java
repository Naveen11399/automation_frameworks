package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomeFurnitureOBJ {



	WebDriver driver;

	public HomeFurnitureOBJ(WebDriver ldriver) {

		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}

	/*
	 * Locators for home lightning
	 */

	@FindBy(xpath = "//button[@class='mat-focus-indicator mat-menu-trigger all-catogories-menu mat-button mat-button-base']")
	@CacheLookup
	WebElement allcategorybtn;

	@FindBy(xpath = "//button[text()='Home & Furniture']")
	@CacheLookup
	WebElement Homefurniturebtn;

	@FindBy(xpath = "//button[text()='Home Lighting']")
	@CacheLookup
	WebElement Homelightingbtn;

	@FindBy(xpath = "//button[text()='Wall Lamp']")
	@CacheLookup
	WebElement Walllampbtn;

	@FindBy(xpath = "(//a[text()='Add to Cart '])[1]")
	@CacheLookup
	WebElement firstelecarttbtn;

	@FindBy(xpath = "//button[@mattooltip='Add']")
	@CacheLookup
	WebElement addquantity;

	@FindBy(xpath = "//h2[text()='EarthenMetal Pendant Wall Lamp']")
	@CacheLookup
	WebElement getlamptxt;

	@FindBy(xpath = "//button[@style='width: 200px;'][1]")
	@CacheLookup
	WebElement addtocartbtn;

	@FindBy(xpath = "//img[@alt='checkout']")
	@CacheLookup
	WebElement checkouttbtn;

	@FindBy(xpath = "(//h4[@class='ng-star-inserted'])[1]")
	@CacheLookup
	WebElement addressadd;

	@FindBy(xpath = "//img[@alt='CashOnDelivery']")
	@CacheLookup
	WebElement cashondelvrybtn;

	@FindBy(xpath = "//div[contains(@class,'place-order flex ng-star-inserted')]")
	@CacheLookup
	WebElement placeorderbtn;

	/*
	 * Locators for Home decor
	 */

	@FindBy(xpath = "//button[text()='Home Decor']")
	@CacheLookup
	WebElement Homedecorbtn;

	@FindBy(xpath = "//button[text()='Clocks']")
	@CacheLookup
	WebElement Clocksbtn;

	@FindBy(xpath = "(//a[@class='cart-btn'])[2]")
	@CacheLookup
    WebElement secondelecartbtn;

	@FindBy(xpath = "//h3[text()=' $ 897 ']")
	@CacheLookup
	WebElement Getclockprice;

	@FindBy(xpath = "(//button[@style='width: 200px;'])[2]")
	@CacheLookup
	WebElement buynowbtn;

	/*
	 * locators kitchen cook ware
	 */

	@FindBy(xpath = "//button[text()='Kitchen  Cookware']")
	@CacheLookup
	WebElement Kitchencookwarebtn;

	@FindBy(xpath = "//button[text()='Pans']")
	@CacheLookup
	WebElement pansbtn;

	@FindBy(xpath = "(//span[@cdk-describedby-host='0'])[2]")
	@CacheLookup
	WebElement comparebtn;

	@FindBy(xpath = "//p[text()='SKU:pan002-1']")
	@CacheLookup
	WebElement Skunumtxt;

	/*
	 * Kitchen storage
	 */

	@FindBy(xpath = "//button[text()='Kitchen Storage']")
	@CacheLookup
	WebElement Kitchenstoragebtn;

	@FindBy(xpath = "//button[text()='Lunch Box']")
	@CacheLookup
	WebElement lunchboxbtn;

	@FindBy(xpath = "//h2[text()='MILTON Premium DELICIOUS COMBO LUNCH BOX with One Year Warranty ']")
	@CacheLookup
	WebElement lunchboxtxt;

	
	
	/*
	 * Locators for table wear
	 */

	@FindBy(xpath = "//button[text()='Tableware']")
	@CacheLookup
	WebElement tabewarebtn;

	@FindBy(xpath = "//button[text()='Dinner Set']")
	@CacheLookup
	WebElement dinnersetbtn;

	@FindBy(xpath = "(//a[@class='cart-btn'])[3]")
	@CacheLookup
	WebElement thirdelementcartbtn;

	@FindBy(xpath = "//h3[text()=' $ 1,779 ']")
	@CacheLookup
	WebElement dinnersetprice;

	/*
	 * Locators for Living room
	 */

	@FindBy(xpath = "//button[text()='Living Room']")
	@CacheLookup
	WebElement livingroombtn;

	@FindBy(xpath = "//button[text()='Sofa']")
	@CacheLookup
	WebElement sofabtn;

	@FindBy(xpath = "//h2[text()='RoyalOak Fabric Manual Rocker Recliners ']")
	@CacheLookup
	WebElement sofatxt;

	/*
	 * Locators for Bedroom /beds
	 */

	@FindBy(xpath = "//button[text()='Bed Room']")
	@CacheLookup
	WebElement bedroomtn;

	@FindBy(xpath = "//button[text()='Beds']")
	@CacheLookup
	WebElement bedsbtn;

	@FindBy(xpath = "//h2[text()='Okra Sunflower Engineered Wood King Box Bed']")
	@CacheLookup
	WebElement bedtxt;

	/*
	 * Locators for Pet supplies /dogs
	 */

	@FindBy(xpath = "//button[text()='Pet Supplies']")
	@CacheLookup
	WebElement petsupplybtn;

	@FindBy(xpath = "//button[text()='Dogs']")
	@CacheLookup
	WebElement dogsbtn;

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
	
	@FindBy(xpath = "//p[text()='No Results Found ']")
	@CacheLookup
	WebElement NoResult;

	/*
	 * methods for home lighting
	 */

	public void Allcategory() {

		allcategorybtn.click();
	}

	public void HomeFurniture() {

		Homefurniturebtn.click();
	}

	public void HomeLight() {

		Homelightingbtn.click();
	}

	public void WallLamp() {

		Walllampbtn.click();
	}

	public void FirstProduct() {
		firstelecarttbtn.click();

	}

	public void Addquantity() {
		addquantity.click();

	}

	public void LampTxt() {
		String lam = getlamptxt.getText();
		Assert.assertEquals(lam, "EarthenMetal Pendant Wall Lamp");
	}

	public void AddtoCart() {
		addtocartbtn.click();
	}

	public void CheckOut() {
		checkouttbtn.click();
	}

	public void CashonDelivery() {
		cashondelvrybtn.click();
	}

	public void Addaddress() {
		addressadd.click();
	}

	public void PlaceOrder() {
		placeorderbtn.click();

	}

	/*
	 * methods for home decor
	 */

	
	public void HomeDecor() {
		Homedecorbtn.click();
	}

	public void Clocks() {
		Clocksbtn.click();
	}

	public void  Secondelmntcart() {
		
		secondelecartbtn.click();
		
	}
	public void  expWait() {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.navigate().to("http://3.6.249.0/products/productdetails/ivbox-25cm-nonstick-hammertone-coating-grill-pan-25-cm");
		//wait.until(ExpectedConditions.elementToBeClickable(secondelecartbtn)); secondelecartbtn.click();
		
		
	}

	public void ClockPrice() {
		Getclockprice.click();
	}

	public void BuyNow() {
		buynowbtn.click();

	}

	/*
	 * methods for kitchen cookware pans
	 */

	public void KitchenCookware() {
		Kitchencookwarebtn.click();

	}

	public void Pans() {
		pansbtn.click();

	}

	public void CompareBtn() {
		comparebtn.click();

	}

	public void PanSku() {
		String pan = Skunumtxt.getText();
		Assert.assertEquals(pan, "SKU:pan002-1");

	}

	/*
	 * Methods for Kitchen storage lunchbox
	 */

	public void KitchenStorage() {
		Kitchenstoragebtn.click();

	}

	public void LunchBox() {
		lunchboxbtn.click();

	}

	public void LunchBoxTxt() {
		String lun = lunchboxtxt.getText();
		Assert.assertEquals(lun, "MILTON Premium DELICIOUS COMBO LUNCH BOX with One Year Warranty");

	}

	/*
	 * Methods for Tableware dinner set
	 */

	public void Tableware() {
		tabewarebtn.click();

	}

	public void DinnerSet() {
		dinnersetbtn.click();

	}

	public void useExpWait() {
		driver.navigate().to("http://3.6.249.0/products/productdetails/cello-opalware-dazzle-series-lush-fiesta-dinner-set-35pcs-service-for-6-white");

	}

	public void ThirdelementCart() {
		thirdelementcartbtn.click();

	}

	public void DinnerSetPrice() {
		dinnersetprice.click();

	}

	/*
	 * Methods for livng room sofa
	 */

	public void LivingRoombtn() {
		livingroombtn.click();

	}

	public void SofaBtn() {
		sofabtn.click();

	}

	public void SofaText() {
		String sof = sofatxt.getText();
		Assert.assertEquals(sof, "RoyalOak Fabric Manual Rocker Recliners");
	}

	/*
	 * Methods for bed room
	 */

	public void BedRoom() {
		bedroomtn.click();

	}

	public void Beds() {
		bedsbtn.click();

	}

	public void BedText() {
		bedtxt.click();

	}

	/*
	 * Locators for pet supplies
	 */

	public void PetSupplies() {
		petsupplybtn.click();

	}

	public void Dogs() {
		dogsbtn.click();

	}

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

		nametxt.sendKeys("Tamil");

	}

	public void Email() {

		emailtxt.sendKeys("piccotalent170@gmail.com");

	}

	public void Phone() {

		phonetxt.sendKeys("5678545670");

	}

	public void Message() {

		messagetxt.sendKeys("Learning Automation");

	}
	public void NoResultMsg() {

		String actMsg=NoResult.getText();
		Assert.assertEquals(actMsg,"No Results Found");

	}


}
