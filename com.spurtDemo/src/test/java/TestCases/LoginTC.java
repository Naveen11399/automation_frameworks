package TestCases;



import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.ElectronicsOBJ;
import pageObjects.LoginPage;



public class LoginTC  extends BaseClass{
	
	@Test
	public void verifyLogIn() throws IOException {
		
		et=er.createTest("login");
		et.pass("url open");
		

		lp=new LoginPage(driver);
		et.pass("login open");
		
		lp.signInbtn();;
		logger.info(" go the signIn page");
		
		et.pass("signin  btn click");
		lp.UName(uName);
		logger.info("username is enterting");
		
		
		et.pass("url open");
		lp.pWord(pwd);
		logger.info("password is enterting");
		
		
		et.pass("login page");
		lp.login();
		logger.info("login ");
		
	}
	
	

}
