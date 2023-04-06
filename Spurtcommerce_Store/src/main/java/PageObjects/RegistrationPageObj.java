package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegistrationPageObj {
	WebDriver driver;

	public RegistrationPageObj(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);

	}

	/*
	 * locator for Registration Page
	 */

	@FindBy(xpath = "//a[contains(.,'Sign in')]")
	@CacheLookup
	WebElement signIn;

	@FindBy(xpath = "//a[contains(text(),'Register Now')]")
	@CacheLookup
	WebElement RegisterNow;

	@FindBy(xpath = "//input[@placeholder='Full Name']")
	@CacheLookup
	WebElement FullName;

	@FindBy(xpath = "//input[@placeholder='Email']")
	@CacheLookup
	WebElement Email;

	@FindBy(xpath = "//input[@placeholder='Password']")
	@CacheLookup
	WebElement Password;

	@FindBy(xpath = "//input[@placeholder='Confirm Password']")
	@CacheLookup
	WebElement ConfirmPassword;

	@FindBy(xpath = "//input[@placeholder='Phone Number']")
	@CacheLookup
	WebElement PhoneNumber;
	
	@FindBy(xpath = "//button[contains(@class,'mat-elevation-z6 signin')]")
	@CacheLookup
	WebElement Register;

	@FindBy(xpath = "//p[@class='alread-acc']//a[1]")
	@CacheLookup
	WebElement SigninLink;

	@FindBy(xpath = "//img[@alt='red-img']")
	@CacheLookup
	WebElement RegPageImg;

	@FindBy(xpath = "//h3[text()='Registration']")
	@CacheLookup
	WebElement Registration_Tit;

	@FindBy(xpath = "//p[text()='Full Name']")
	@CacheLookup
	WebElement FullNameTit;

	@FindBy(xpath = "//p[text()='E-mail']")
	@CacheLookup
	WebElement EmailTit;

	@FindBy(xpath = "//p[text()='Password']")
	@CacheLookup
	WebElement Password_Tit;

	@FindBy(xpath = "//p[text()='Confirm Password']")
	@CacheLookup
	WebElement ConfirmPassword_Tit;

	@FindBy(xpath = "//p[text()='Phone Number']")
	@CacheLookup
	WebElement PhoneNumber_Tit;

	@FindBy(xpath = "//mat-error[text()='Full name is required']")
	@CacheLookup
	WebElement FullName_Error;

	@FindBy(xpath = "//mat-error[text()=' Email is required']")
	@CacheLookup
	WebElement Email_Error;

	@FindBy(xpath = "//mat-error[text()='Password is required']")
	@CacheLookup
	WebElement Password_Error;

	@FindBy(xpath = "//span[text()='The registration has been completed successfully, We have sent you an confirmation email. Please check your registered email for more details ']")
	@CacheLookup
	WebElement Reg_Success;

	/*
	 * Method for Registration Page
	 */

	public void signInbtn() {
		signIn.click();
	}

	public void RegisterNow() {
		RegisterNow.click();
	}

	public void VerifyRegPage() throws InterruptedException {
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "http://43.204.203.77/auth/sign-up");
	}
	public void FullName() {
		FullName.sendKeys("naemyeuhhh");
	}

	public void Email() {
		Email.sendKeys("emaiel12465@gmail.com");
	}

	public void Password() {
		Password.sendKeys("Naeveen12@");
	}

	public void ConfirmPassword() {
		ConfirmPassword.sendKeys("Naeveen12@");
	}
	public void PhoneNumber() {
		PhoneNumber.sendKeys("9032296490");
	}

	public void REGISTER() {
		Register.click();
	}

	public void VerifyRegister() {
		try {
			String act = Reg_Success.getText();
			String exp = "The registration has been completed successfully, We have sent you an confirmation email. Please check your registered email for more details ";
			Assert.assertEquals(act, exp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	
	public void VerifyRegTitle() {
		String actTit=Registration_Tit.getText();
		
		Assert.assertEquals(actTit, "Registration");
	}
	public void FullNameTitle() {
		String actTit=FullNameTit.getText();
		
		Assert.assertEquals(actTit, "Full Name*");
	}
	
	public void EmailTitle() {
		String actTit=EmailTit.getText();
		
		Assert.assertEquals(actTit, "E-mail*");
	}
	
	public void PasswordTitle() {
		String actTit=Password_Tit.getText();
		
		Assert.assertEquals(actTit, "Password*");
	}
	public void ConfirmPassword_Title() {
		String actTit=ConfirmPassword_Tit.getText();
		
		Assert.assertEquals(actTit, "Confirm Password*");
	}
	public void PhoneNumber_Title() {
		String actTit=PhoneNumber_Tit.getText();
		
		Assert.assertEquals(actTit, "Phone Number");
	}
	
	public void FullName_Error() {
		String actTit=FullName_Error.getText();
		
		Assert.assertEquals(actTit, "Full name is required");
	}
	
	public void Email_Error() {
		String actTit=Email_Error.getText();
		
		Assert.assertEquals(actTit, "Email is required");
	}
	public void Password_Error() {
		String actTit=Password_Error.getText();
		
		Assert.assertEquals(actTit, "Password is required");
	}
	
	public void FullNamePH() {
		String actTit=FullName.getAttribute("placeholder");
		
		Assert.assertEquals(actTit, "Full Name");
	}
	
	public void EmailPH() {
		String actTit=Email.getAttribute("placeholder");
		
		Assert.assertEquals(actTit, "Email");
	}
	
	public void PasswordPH() {
		String actTit=Password.getAttribute("placeholder");
		
		Assert.assertEquals(actTit, "Password");
	}
	
	public void ConfirmPasswordPH() {
		String actTit=ConfirmPassword.getAttribute("placeholder");
		
		Assert.assertEquals(actTit, "Confirm Password");
	}
	
	public void PhoneNumberPH() {
		String actTit=PhoneNumber.getAttribute("placeholder");
		
		Assert.assertEquals(actTit, "Phone Number");
	}
	
public void verifyLogo() {
	boolean logoPresent =RegPageImg.isDisplayed();
	Assert.assertTrue(logoPresent);
}
	
}
