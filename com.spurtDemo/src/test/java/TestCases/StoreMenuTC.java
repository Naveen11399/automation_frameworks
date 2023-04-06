package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.StoreMenuOBJ;

public class StoreMenuTC extends BaseClass {
	@Test
	public void verifyDiwaliMenu() throws InterruptedException  {
		
		et=er.createTest("verifyMenu");
		et.pass("url open");
	

		sm=new StoreMenuOBJ(driver);
		et.pass("login open");
		
		storeLogin();
		loginSetUp();
		waitTime();
		
		sm.Diwalitext();
		logger.info("username is enterting");
		et.pass("signin  btn click");
		
		sm.Diwalimegaoffer();
		logger.info("username is enterting");
		et.pass("signin  btn click");
		waitTimeMin();
		sm.jeanPrice();
		logger.info("username is enterting");
		et.pass("signin  btn click");
		sm.secCart();
		logger.info("username is enterting");
		et.pass("signin  btn click");
	
	}
	
	@Test(priority = 1,dependsOnMethods = "verifyDiwaliMenu")
	public void verifyChristmasMenu() throws InterruptedException  {
		
		et=er.createTest("verifyMenu");
		et.pass("url open");
	

		sm=new StoreMenuOBJ(driver);
		et.pass("login open");
		waitTime();
		sm.Christmastext();
		logger.info("username is enterting");
		et.pass("signin  btn click");
		
		sm.Christmasfestive();
		logger.info("username is enterting");
		et.pass("signin  btn click");
		waitTimeMin();
		sm.tshirtName();
		logger.info("username is enterting");
		et.pass("signin  btn click");
	
	}	
}
