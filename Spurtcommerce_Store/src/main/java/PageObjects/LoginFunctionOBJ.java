package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFunctionOBJ {
	WebDriver driver;

	public LoginFunctionOBJ(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);

	}

	/*
	 * locator for LoginPage
	 */

	@FindBy(xpath = "//a[contains(.,'Sign in')]")
	@CacheLookup
	WebElement signIn;

	@FindBy(xpath = "//input[@placeholder='Email']")
	@CacheLookup
	WebElement usm;

	@FindBy(xpath = "//input[@placeholder='Password']")
	@CacheLookup
	WebElement pwd;

	@FindBy(xpath = "//button[@class='submit cart-btn']")
	@CacheLookup
	WebElement logIn;
	
	@FindBy(xpath = "//a[contains(text(),'Register Now')]")
	@CacheLookup
	WebElement RegisterNow;
	
	@FindBy(xpath = "//h3[text()=' Login']")
	@CacheLookup
	WebElement LoginTit;

	@FindBy(xpath = "//p[text()='E-mail']")
	@CacheLookup
	WebElement EmailTit;

	@FindBy(xpath = "//p[text()='Password']")
	@CacheLookup
	WebElement PasswordTit;

	@FindBy(xpath = "//button[text()=' Sign in with Google ']")
	@CacheLookup
	WebElement SignIn_Google;
	
	@FindBy(xpath = "//img[@alt='log-img']")
	@CacheLookup
	WebElement loginLogo;
	
	@FindBy(xpath = "//a[contains(text(),'Forgot Password?')]")
	@CacheLookup
	WebElement Forgot_Password;
	
	@FindBy(xpath = "//span[text()='Forgot Password']")
	@CacheLookup
	WebElement ForgotPasswordTit;
	
	@FindBy(xpath = "//span[text()='Enter your registered email id below. We will sent the link to']")
	@CacheLookup
	WebElement FP_Header1;

	@FindBy(xpath = "//span[text()='reset your password']")
	@CacheLookup
	WebElement FP_Header2;

	@FindBy(xpath = "//input[@placeholder='Your Email ID']")
	@CacheLookup
	WebElement YourEmail_ID;
	
	@FindBy(xpath = "//div[text()='Email id is required']")
	@CacheLookup
	WebElement EmailIdErr;
	
	@FindBy(xpath = "//button[@class='ripple cart-btn']")
	@CacheLookup
	WebElement submitBtn;
	
	@FindBy(xpath = "//p[text()='Go Back To Login']")
	@CacheLookup
	WebElement GoBack_Login;

	/*
	 * Method For LogIN page
	 */
	
	

	public void signInbtn() {
		signIn.click();
	}

	public void UName(String name) {
		usm.sendKeys(name);
	}

	public void pWord(String password) {
		pwd.sendKeys(password);
	}

	public void login() {
		logIn.click();
	}
	
	
}
