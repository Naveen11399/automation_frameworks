package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
public LoginPage(WebDriver ldriver) {
	driver=ldriver;
	PageFactory.initElements(ldriver, this);
	
}
/*
 * locator for LoginPage 
 */

@FindBy(xpath ="//a[@class=\"mat-focus-indicator sign-btn mat-button mat-button-base ng-star-inserted\"]")
@CacheLookup
WebElement signIn;

@FindBy(xpath = "//input[@placeholder=\"Email\"]")
@CacheLookup
WebElement usm;

@FindBy(xpath ="//input[@placeholder=\"Password\"]")
@CacheLookup
WebElement pwd;

@FindBy(xpath ="//button[@class=\"submit cart-btn\"]")
@CacheLookup
WebElement logIn;

@FindBy(xpath ="//*[@class=\"mat-focus-indicator mat-menu-trigger blackStyle mat-button mat-button-base ng-star-inserted\"]")
@CacheLookup
WebElement account;


@FindBy(xpath ="//*[contains(text(),'Sign Out') ]")
@CacheLookup
WebElement signOut;

/*
 *  Method For LogIN page
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

public void accountBtn() {
	account.click();
}

public void signOutBtn() {
	signOut.click();
}







}
