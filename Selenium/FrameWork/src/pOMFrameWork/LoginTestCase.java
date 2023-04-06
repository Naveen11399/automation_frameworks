package pOMFrameWork;

import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTestCase extends CommonObjects{
@Test
	public void login() {
		PageFactory.initElements(driver, logInObjects.class);
		logInObjects.userName.sendKeys(properties.getProperty("username"));
		logInObjects.passWord.sendKeys(properties.getProperty("Password"));
     	logInObjects.login.click();
     	
	}
}
