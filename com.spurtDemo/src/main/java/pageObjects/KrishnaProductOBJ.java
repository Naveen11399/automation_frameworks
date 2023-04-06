package pageObjects;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class KrishnaProductOBJ {
	WebDriver driver;

	public KrishnaProductOBJ(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);

	}
	
	/*
	 * locator for Krishna Product
	 */
	
	@FindBy(xpath = "(//a[@href=\"javascript:void(0)\" and @style=\"margin-right: 10px;\" ])[2]")
	@CacheLookup
	WebElement twitter;
	
	@FindBy(xpath = "(//a[@href=\"javascript:void(0)\"])[5]")
	@CacheLookup
	WebElement diwaliOfferPage;
	
	@FindBy(xpath = "(//*[@class=\"cart-btn\"])[1]")
	@CacheLookup
	WebElement krishnaProduct;
	
	@FindBy(xpath = "(//img[@class=\"ng-star-inserted\"])[2]")
	@CacheLookup
	WebElement krishnaImg;
	
	@FindBy(xpath = "//button[@aria-label=\"Next slide\"]")
	@CacheLookup
	WebElement nxtImg;
	
	@FindBy(xpath = "//img[@alt=\"close\"]")
	@CacheLookup
	WebElement closeBtn;
	
	@FindBy(xpath = "//*[contains(text(),' SA6137')]")
	@CacheLookup
	WebElement modelNum;
	
	@FindBy(xpath = "//*[contains(text(),' Buy Now')]")
	@CacheLookup
	WebElement buyNOW;
	
	@FindBy(xpath = "//mat-error[contains(text(),' Select one of these address. ')]")
	@CacheLookup
	WebElement address;
	
	@FindBy(xpath = "//mat-error[contains(text(),' Select one of these payment method. ')]")
	@CacheLookup
	WebElement payment;
	
	@FindBy(xpath = "//button[contains(text(),'Apply')]")
	@CacheLookup
	WebElement aplyCoupon;
	
	@FindBy(xpath = "//div[contains(text(),'Please enter the coupon code')]")
	@CacheLookup
	WebElement couponError;
	
	
	/*
	 * method for Krishna Product
	 */
	public void currentUrl() {
		String actUrl=driver.getCurrentUrl();
		Assert.assertEquals(actUrl,"http://3.6.249.0/");
	}
	

	

	public void twitterPage() {
	twitter.click();
	}
	
	public void windowHandling() throws InterruptedException{
		String ow=driver.getWindowHandle();
	Set<String>	windows=driver.getWindowHandles();
	for (String newWindow : windows) {
		
		
		driver.switchTo().window(newWindow);
	}
	Thread.sleep(5000);
	String twitterURL=	driver.getCurrentUrl();
	System.out.println(twitterURL);
	Assert.assertEquals(twitterURL,"https://twitter.com/Spurtcommerce");
	driver.close();
	driver.switchTo().window(ow);
	}

	public void diwaliOffer() {
		diwaliOfferPage.click();
		}
	
	public void productKrishna() {
		krishnaProduct.click();
		}
	
	public void krishnaPic() {
		krishnaImg.click();
		}
	
	public void secKrishnaPic() {
		nxtImg.click();
		}
	
	public void thirdKrishnaPic() {
		nxtImg.click();
		}
	public void fourthKishnaPic() {
		nxtImg.click();
		}
	public void fifthKrishnaPic() {
		nxtImg.click();
		}
	
	public void closeBtn() {
		closeBtn.click();
		}
	
	public void modelNumber() {
		String mNum=modelNum.getText();
		System.out.println(mNum);
		Assert.assertEquals(mNum,"          SA6137");
		}
	
	public void buyButton() {
		buyNOW.click();
		}
	
	public void addressError() {
		String actTxt=address.getText();
		
		Assert.assertEquals(actTxt,"Select one of these address.");
		System.out.println(actTxt);
		}
	  
	public void paymentError() {
		String actTxt1=payment.getText();
		
		Assert.assertEquals(actTxt1,"Select one of these payment method.");
		System.out.println(actTxt1);
		}
	public void applyBtn() {
		aplyCoupon.click();
		}
	
	public void couponError() {
		String actTxt1=couponError.getText();
		
		Assert.assertEquals(actTxt1,"Please enter the coupon code");
		System.out.println(actTxt1);
		}
	
	/*
	 * locator for BabyKids
	 */
	@FindBy(xpath = "//*[contains(text(),'Baby  Kids') and @role=\"menuitem\"]")
	@CacheLookup
	WebElement babyKids;
	
	@FindBy(xpath = "//*[contains(text(),'Baby Boys ') and @role=\"menuitem\"]")
	@CacheLookup
	WebElement babyBoys;
	
	@FindBy(xpath = "//*[contains(text(),'T-Shirts') and @role=\"menuitem\"]")
	@CacheLookup
	WebElement babyTShirts;
	
	@FindBy(xpath = "(//button[@cdk-describedby-host=\"0\"])[3]")
	@CacheLookup
	WebElement addFavJugular;
	
	@FindBy(xpath = "(//button[@cdk-describedby-host=\"0\"])[17]")
	@CacheLookup
	WebElement addFavShark;
	
	@FindBy(xpath = "(//button[@class=\"mat-focus-indicator mat-icon-button mat-button-base\"])[1]")
	@CacheLookup
	WebElement listView;
	
	@FindBy(xpath = "(//button[@class=\"mat-focus-indicator mat-icon-button mat-button-base\"])[2]")
	@CacheLookup
	WebElement gridView;
	
	@FindBy(xpath = "//a[contains(text(),'Price High To Low')]")
	@CacheLookup
	WebElement highToLow;
	
	@FindBy(xpath = "//a[contains(text(),'Price Low To High')]")
	@CacheLookup
	WebElement lowToHigh;
	
	@FindBy(xpath = "//a[@href=\"/vendors\"]")
	@CacheLookup
	WebElement vendors;
	
	@FindBy(xpath = "(//img[@alt=\"possible works\"])[2]")
	@CacheLookup
	WebElement possibleWorks;
	
	@FindBy(xpath = "//*[@for=\"tab2\"]")
	@CacheLookup
	WebElement about;
	
	@FindBy(xpath = "//*[contains(text(),'About possible works')]")
	@CacheLookup
	WebElement aboutTxt;
	
	@FindBy(xpath = "//*[contains(text(),'9500107163')]")
	@CacheLookup
	WebElement phoneNum;
	
	@FindBy(xpath = "(//a[contains(text(),'Contact Us')])[1]")
	@CacheLookup
	WebElement contactUs;
	
	@FindBy(xpath = "//input[@formcontrolname=\"name\"]")
	@CacheLookup
	WebElement name;
	
	@FindBy(xpath = "//input[@formcontrolname=\"email\"]")
	@CacheLookup
	WebElement email;
	
	@FindBy(xpath = "//input[@formcontrolname=\"phone\"]")
	@CacheLookup
	WebElement phone;
	
	@FindBy(xpath = "//*[@formcontrolname=\"country\"]")
	@CacheLookup
	WebElement country;
	
	@FindBy(xpath = "//*[contains(text(),' Albania ')]")
	@CacheLookup
	WebElement albania;
	
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	@CacheLookup
	WebElement submitBtn;
	/*
	 * method for BabyKids
	 */
	
	
	public void babyKids() {
		babyKids.click();
		}
	
	public void babyBoys() {
		babyBoys.click();
		}
	
	public void babyTshirt() {
		babyTShirts.click();
		}
	
	public void addFavJugular () {
		addFavJugular.click();
		}
	
	public void addFavShark () {
		addFavShark.click();
		}
	
	public void listView() {
		listView.click();
		}
	public void gridView() {
		gridView.click();
		}
	public void highToLoW() {
		highToLow.click();
		}
	public void lowToHigh() {
		lowToHigh.click();
		}
	
	public void vendors() {
		vendors.click();
		}
	
	public void possibleWorks() {
		possibleWorks.click();
		}
	
	
	public void about() {
		about.click();
		}
	public void aboutPossibleWorks() {
		String actText=aboutTxt.getText();
		Assert.assertEquals(actText,"About possible works");
		System.out.println(actText);
		
		}
	
	public void phoneNumberVerify() {
		String actNum=phoneNum.getText();
		Assert.assertEquals(actNum,"9500107163");
		System.out.println(actNum);
		
		}

	public void contactUs() {
		contactUs.click();
		}
	
	public void nameBox() {
		name.sendKeys("naveenuu");
		}
	
	public void emailBox() {
		email.sendKeys("naveen11@gmail.com");
		}
	
	public void phoneBox() {
		phone.sendKeys("1223345");
		}
	public void countryBox() {
		country.click();
		albania.click();
		}
	public void submitForm() {
		submitBtn.click();
	}
}
