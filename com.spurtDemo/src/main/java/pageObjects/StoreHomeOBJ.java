package pageObjects;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class StoreHomeOBJ {
	

		WebDriver driver;

		public StoreHomeOBJ(WebDriver ldriver) {

			driver = ldriver;
			PageFactory.initElements(ldriver, this);

		}

		/*
		 * Locators for Top pages
		 */

		@FindBy(xpath = "(//button[@aria-label='Next slide'])[1]")
		@CacheLookup
		WebElement nextslidebtn;

		@FindBy(xpath = "//a[text()='Add to Cart '][1]")
		@CacheLookup
		WebElement topsaddcartbtn;

		/*
		 * Methods for top pages
		 */

		public void NextSlide1() {
			nextslidebtn.click();
			nextslidebtn.click();
			nextslidebtn.click();
			

		}

		public void NextSlide2() {
			nextslidebtn.click();
			nextslidebtn.click();
			nextslidebtn.click();
		}

		public void NextSlide3() {
			nextslidebtn.click();

		}

		public void NextSlide4() {
			nextslidebtn.click();

		}
		
		public void NextSlide5() {
			nextslidebtn.click();

		}

		public void LAddCart() {

			topsaddcartbtn.click();

		}

		/*
		 * Locators for new year offer details
		 */

		
		@FindBy(xpath = "//a[contains(.,'New Year offers')]")
		@CacheLookup
		WebElement newyearofferbtn;

		@FindBy(xpath = "(//div[@class='flex prod-icon'])/button[1]")
		@CacheLookup
		WebElement applefavouritebtn;

		@FindBy(xpath = "(//div[@class='flex prod-icon'])/button[2]")
		@CacheLookup
		WebElement applequickviewbtn;

		@FindBy(xpath = "//a[contains(text(),'Admin Quick View Category Product')]")
		@CacheLookup
		WebElement appletext;

		@FindBy(xpath = "(//a[@class='cart-btn'])[1]")
		@CacheLookup
		WebElement appleaddcartbtn;

		@FindBy(xpath = "(//span [@class='mat-radio-label-content'])[1]")
		@CacheLookup
		WebElement smallsizetbtn;

		@FindBy(xpath = "(//span [@class='mat-radio-label-content'])[2]")
		@CacheLookup
		WebElement medumsizebtn;

		@FindBy(xpath = "(//span [@class='mat-radio-label-content'])[3]")
		@CacheLookup
		WebElement largesizetbtn;

		@FindBy(xpath = "(//span [@class='mat-radio-label-content'])[4]")
		@CacheLookup
		WebElement extralargebtn;

		@FindBy(xpath = "(//button[@style='width: 200px;'])[2]")
		@CacheLookup
		WebElement buynowbtn;

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
		 * Methods for new year offers
		 */

		public void NewYearoffer() {
			newyearofferbtn.click();

		}

		public void AppleFavourite() {
			applefavouritebtn.click();

		}

		public void AppleQuickview() {
			applequickviewbtn.click();

		}

		public void AppleText() {
			String app = appletext.getText();
			Assert.assertEquals(app, "Admin Quick View Category Product");

		}

		public void AppleCart() {
			appleaddcartbtn.click();

		}

		public void SmallSize() {
			smallsizetbtn.click();

		}

		public void MediumSize() {
			medumsizebtn.click();

		}

		public void LargeSize() {
			largesizetbtn.click();

		}

		public void ExtraSize() {
			extralargebtn.click();

		}

		public void BuyNow() {
			buynowbtn.click();

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
		 * Locators for Account details
		 */

		@FindBy(xpath = "//a[.='personAccountarrow_drop_down']")
		@CacheLookup
		WebElement accountbtn;
		
		@FindBy(xpath = "//span[text()='My Order history']")
		@CacheLookup
		WebElement myorderhistorybtn;

		@FindBy(xpath = "(//h3[text()='Order History'])[2]")
		@CacheLookup
		WebElement orderhistorytxt;

		@FindBy(xpath = "//h3[text()='CONTACT INFORMATION']")
		@CacheLookup
		WebElement contactinformationtxt;

		@FindBy(xpath = "//mat-icon[text()='arrow_upward']")
		@CacheLookup
		WebElement upwardarrowbtn;

		@FindBy(xpath = "//span[text()='Account Settings']")
		@CacheLookup
		WebElement accountsettingsbtn;

		@FindBy(xpath = "//h3[text()='Account Information']")
		@CacheLookup
		WebElement accountinformationtxt;

		@FindBy(xpath = "//h3[text()='Address']")
		@CacheLookup
		WebElement addresstxt;

		@FindBy(xpath = "//span[text()='Sign Out']")
		@CacheLookup
		WebElement signoutbtn;

		/*
		 * Methods for account details
		 */

		public void AccountBtn() {
			accountbtn.click();

		}

		public void MyOrderHistoryBtn() {
			myorderhistorybtn.click();

		}

		public void OrderInfoTxt() {
			String ord = orderhistorytxt.getText();
			Assert.assertEquals(ord, "Order History");

		}

		public void ContactInfoTxt() {
			String contact = contactinformationtxt.getText();
			Assert.assertEquals(contact, "CONTACT INFORMATION");

		}

		public void UpwardArrow() {
			upwardarrowbtn.click();

		}

		public void AccountSettingbtn() {
			accountsettingsbtn.click();

		}

		public void AccountInfoTxt() {
			String acc = accountinformationtxt.getText();
			Assert.assertEquals(acc, "Account Information");
		}

		public void Addresstxt() {
			String add = addresstxt.getText();
			Assert.assertEquals(add, "Address");

		}

		public void SignOutAccount() {
			signoutbtn.click();

		}

		/*
		 * Locators for Krshna Product
		 */

		@FindBy(xpath = "//a[contains(text(),'SAF Radha Krishna UV Ink 12 inch x 12 inch Painting')]")
		@CacheLookup
		WebElement Krshnaimg;

		@FindBy(xpath = "//h3[text()=' $ 1,087 ']")
		@CacheLookup
		WebElement Krshnapricetxt;

		@FindBy(xpath = "//button[@mattooltip='Add']")
		@CacheLookup
		WebElement addquantity;

		@FindBy(xpath = "//p[contains(text(),' SA6137')]")
		@CacheLookup
		WebElement modelnumtxt;

		@FindBy(xpath = "//p[contains(text(),'Radha Krishna UV')]")
		@CacheLookup
		WebElement modelnametxt;

		@FindBy(xpath = "//button[@style='width: 200px;'][1]")
		@CacheLookup
		WebElement addcartkrshna;

		/*
		 * Methods for krshna product details
		 */

		public void KrshnaImage() {
			driver.navigate().to("http://3.6.249.0/products/productdetails/saf-radha-krishna-uv-ink-12-inch-x-12-inch-painting");
		//	Krshnaimg.click();

		}

		public void KrshnaPrice() {
			String priz = Krshnapricetxt.getText();
			Assert.assertEquals(priz, "$ 1,087");

		}

		public void Addquantity() {
			addquantity.click();

		}

		public void AddCartKrshna() {
			addcartkrshna.click();

		}

		public void Refesh() {

			driver.get(driver.getCurrentUrl());
		}

		public void ModelNumber() {
			String mnum = modelnumtxt.getText();
			Assert.assertEquals(mnum, "          SA6137");

		}

		public void ModelName() {
			String mnam = modelnametxt.getText();
			Assert.assertEquals(mnam, "           Radha Krishna UV");

		}

		/*
		 * Locators for AirConditional Image details
		 */

		@FindBy(xpath = "(//div[@class='mask']/following-sibling::div)[1]")
		@CacheLookup
		WebElement ACimage;

		@FindBy(xpath = "//span[text()='9500107163']")
		@CacheLookup
		WebElement phonenumbertxt;

		@FindBy(xpath = "//img[@alt='Spurtcommerce']")
		@CacheLookup
		WebElement spurtlogo;

		@FindBy(xpath = "//a[@href='/contact']")
		@CacheLookup
		WebElement contacttxt;

		/*
		 * Methods for AC details
		 */

		public void ACImage() {
			driver.navigate().to("http://3.6.249.0/products/productdetails/motorola-g60");
			//ACimage.click();

		}
		public void WindowsHandle() {
			
			Set<String> productpage = driver.getWindowHandles();

			for (String newwindow : productpage) {
				driver.switchTo().window(newwindow);

			}
		}
		
		public void PhoneNumFooter() {
			String pho=phonenumbertxt.getText();
			Assert.assertEquals(pho, "9500107163");
		}
		
		public void SpurtLogo() {
			spurtlogo.click();

		}
		
		public void HomepageContact() {
			String hom=contacttxt.getText();
			Assert.assertEquals(hom, "Contact");

		}
		
		
		/*
		 * Locators for Vendor Sign up
		 */
		
		@FindBy(xpath = "//a[@href='/vendor-register']")
		@CacheLookup
		WebElement vendorbtn;
		
		@FindBy(xpath = "//input[@formcontrolname='name']")
		@CacheLookup
		WebElement namefieldtxt;
		
		@FindBy(xpath = "//input[@placeholder='Last Name']")
		@CacheLookup
		WebElement lastnametxt;
		
		@FindBy(xpath = "//input[@placeholder='Contact Person Name']")
		@CacheLookup
		WebElement contactpersontxt;
		
		
		@FindBy(xpath = "//input[@placeholder='Email']")
		@CacheLookup
		WebElement emailfieldtxt;
		
		@FindBy(xpath = "//input[@placeholder='company name']")
		@CacheLookup
		WebElement companynametxt;
		
		@FindBy(xpath = "//input[@placeholder='display name']")
		@CacheLookup
		WebElement displaynametxt;
		
		@FindBy(xpath = "//input[@placeholder='Mobile Number']")
		@CacheLookup
		WebElement mobilenumbertxt;
		
		@FindBy(xpath = "//input[@placeholder='Password']")
		@CacheLookup
		WebElement passwordtxt;
		
		@FindBy(xpath = "//input[@placeholder='Confirm Password']")
		@CacheLookup
		WebElement confirmpasswordtxt;
		
		@FindBy(xpath = "//input[@type='checkbox']")
		@CacheLookup
		WebElement textboxbtn;
		
		@FindBy(xpath = "//button[@type='submit']")
		@CacheLookup
		WebElement vendorsubmitbtn;
		
		
		
		/*
		 * Methods for Vendor sign up
		 */
		
		public void VendorBtn() {
			vendorbtn.click();

		}
		
		public void NameField() {
			namefieldtxt.sendKeys("Tamil");

		}
		
		public void LastNameField() {
			lastnametxt.sendKeys("Sri");

		}
		
		public void ContactPersonField() {
			contactpersontxt.sendKeys("Velmurugan");

		}
		
		public void EmailField() {
		emailfieldtxt.sendKeys("piccotalent170@gmail.com");

		}
		
		public void CompanyNameField() {
			companynametxt.sendKeys("Tamil Solutions");

		}
		
		public void DisplayName() {
			displaynametxt.sendKeys("Vendor");

		}
		
		
		public void MobileNumberField() {
			mobilenumbertxt.sendKeys("8976546784");

		}
		
		
		public void PasswordField() {
			passwordtxt.sendKeys("Tamil123@");

		}
		
		
		public void ConfirmPassField() {
			confirmpasswordtxt.sendKeys("Tamil123@");

		}
		
		public void TextBox() {
			textboxbtn.click();

		}
		
		public void VendorSubmitBtn() {
			vendorsubmitbtn.click();

		}
		

		/*
		 * Locators for Product Search
		 */
		
		@FindBy(xpath = "(//input[@placeholder='Search for products'])[1]")
		@CacheLookup
		WebElement searchtextbox;
		
		@FindBy(xpath = "//img[@alt='piccosoft']")
		@CacheLookup
		WebElement piccoimage;
		
		@FindBy(xpath = "//p[text()='qa']")
		@CacheLookup
		WebElement descriptiontxt;
		
		@FindBy(xpath = "//button[text()='Post Your Question']")
		@CacheLookup
		WebElement postyourquestnbtn;
		
		@FindBy(xpath = "//textarea[@name='question']")
		@CacheLookup
		WebElement writequestiontxt;
		
		@FindBy(xpath = "(//button[@type='button'])[3]")
		@CacheLookup
		WebElement submittxtbtn;
		
		
		@FindBy(xpath = "//a[text()='Specifications']")
		@CacheLookup
		WebElement specificationbtn;
		
		@FindBy(xpath = "//div[text()=' No specifications found ']")
		@CacheLookup
		WebElement specificationtxt;
		
		@FindBy(xpath = "//textarea[@placeholder='Write your question here']")
		@CacheLookup
		WebElement specificationsubmitbtn;
		
		
		@FindBy(xpath = "//a[text()='Review']")
		@CacheLookup
		WebElement reviewbtn;
		
		@FindBy(xpath = "//h3[text()='customer']")
		@CacheLookup
		WebElement footercustomertxt;
		

		@FindBy(xpath = "//textarea[@class='ng-pristine ng-valid ng-touched']")
		@CacheLookup
		WebElement reviewwritetxt;
		
		
		
		
		@FindBy(xpath = "//a[contains(text(),'Customer questions & answers')]")
		@CacheLookup
		WebElement cusquestionansbtn;
		
		@FindBy(xpath = "//div[text()=' No related products found']")
		@CacheLookup
		WebElement questionanstxt;
		
		
		
		/*
		 * Methods for Product search
		 */
		
		
		public void SearchTxttBox() {
			searchtextbox.sendKeys("piccosoft");
			Actions variable = new Actions(driver);
			variable.sendKeys(Keys.ENTER).build().perform();

		}
		
		public void PiccoImage() {
			piccoimage.click();

		}
		
		public void DescriptionTxt() {
			String des=descriptiontxt.getText();
			Assert.assertEquals(des, "qa");

		}
		
		public void PostYourQues() {
			postyourquestnbtn.click();

		}
		
		
		public void WriteQuesTxtbox1() {
			writequestiontxt.click();
			writequestiontxt.sendKeys("Hi Im description");

		}
		
		public void QuesSubmitBtn() {
			submittxtbtn.click();

		}
		
		public void SpecificationBtn() {
			specificationbtn.click();

		}
		
		public void SpecificationTxt() {
			String spec=specificationtxt.getText();
			Assert.assertEquals(spec, "No specifications found");

		}
		
		
		
		public void WriteQuesTxtbox2() {
			//writequestiontxt.click();
			writequestiontxt.sendKeys("Hi Im specification");

		}
		
		public void SpecificationSubmitBtn() {
			specificationsubmitbtn.click();

		}
		
		
		
		public void ReviewBtn() {
			reviewbtn.click();

		}
		
		public void FooterCustomerTxt() {
			String foo=footercustomertxt.getText();
			Assert.assertEquals(foo, "customer");

		}
		public void ReviewWriteTxt() {
			reviewwritetxt.sendKeys("Hi Im Review section");

		}
		

		
		
		
		public void CusQuestionAnsBtn() {
			cusquestionansbtn.click();

		}
		
		public void CusQuestionAnsTxt() {
			String ques=questionanstxt.getText();
			Assert.assertEquals(ques, "No related products found");

		}
		

}
