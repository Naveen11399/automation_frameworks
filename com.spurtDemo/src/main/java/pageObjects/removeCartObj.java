package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class removeCartObj {
	
	WebDriver driver;
	
	public removeCartObj(WebDriver ldriver) {
		driver=ldriver;
		PageFactory.initElements(ldriver, this);
		
	}

}
