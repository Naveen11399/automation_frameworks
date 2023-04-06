package TestCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.ElectronicsOBJ;
import pageObjects.SportsOBJ;

public class SportsTC extends BaseClass {

	@Test(priority = 0)
	public void grandPiano() throws InterruptedException {
		et = er.createTest(" Buy grandPiano");
		et.pass("website launch");

		storeLogin();
		loginSetUp();
		ele = new ElectronicsOBJ(driver);
		waitTime();
		ele.allCategories();
		et.pass("click the allCategories");
		logger.info(" go the allCategories");

		sp = new SportsOBJ(driver);

		sp.sports();
		et.pass("click the sport");
		logger.info("click the sport");

		sp.musicInstrumets();
		et.pass(" go the musicInstrumets");
		logger.info(" go the musicInstrumets");

		sp.StringInstrumets();
		et.pass("click the StringInstrumets");
		logger.info(" go the StringInstrumets");

		sp.verifyTitle();
		et.pass("Title is verifying");
		logger.info("Title is verifying");

		sp.addCartPiano();
		et.pass("click the addTo Cart");
		logger.info(" go the addTo Cart");

		ele.addOneQnty();
		et.pass("quanitity is added");
		logger.info("quanitity is added");

		ele.addCartBtn();
		et.pass("buying piano");
		logger.info("buying piano");

		ele.checkOutBtn();
		et.pass("buying piano");
		logger.info("buying piano");

		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");

		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");

		ele.placeOrd();
		;
		et.pass("order is placed");
		logger.info("order is placed");

	}

	@Test(priority = 1, dependsOnMethods = "grandPiano")
	public void keyBoard() throws InterruptedException {
		et = er.createTest(" Buy keyBoard");
		et.pass("website launch");

		ele = new ElectronicsOBJ(driver);
		sp = new SportsOBJ(driver);
		waitTime();
		ele.allCategories();
		et.pass("click the allCategories");
		logger.info(" go the allCategories");

		sp.sports();
		et.pass("click the sport");
		logger.info("click the sport");

		sp.musicInstrumets();
		et.pass("click the musicInstrumets");
		logger.info(" go the musicInstrumets");
		waitTime();
		sp.tabalaskB();
		et.pass("click the tabalas keyboard");
		logger.info("click the tabalas keyboard");

		sp.addKeyBoard();
		et.pass("click the addTo Cart");
		logger.info("click the addTo Cart");

		ele.addQuantity();
		et.pass("quanitity is added");
		logger.info("quanitity is added");

		ele.addCartBtn();
		et.pass("addcart  is working");
		logger.info("addcart  is working");

		ele.checkOutBtn();
		et.pass("buying KeyBoard");
		logger.info("buying KeyBoard");

		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");

		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");

		ele.placeOrd();
		;
		et.pass("order is placed");
		logger.info("order is placed");

	}

	@Test(priority = 2, dependsOnMethods = "grandPiano")
	public void cricketKit() throws InterruptedException {
		et = er.createTest(" Buy cricketKit");
		et.pass("website launch");

		ele = new ElectronicsOBJ(driver);
		waitTime();
		ele.allCategories();
		et.pass("click the allCategories");
		logger.info(" go the allCategories");

		sp = new SportsOBJ(driver);

		sp.sports();
		et.pass("click the sport");
		logger.info("click the sport");

		sp.sportsMenu();
		et.pass("click the sport Menu");
		logger.info("click the sport Menu");
		waitTime();
		sp.cricketMenu();
		et.pass("click the cricket Menu");
		logger.info("click the cricket Menu");

		sp.addCartCricketKit();
		et.pass("click the add To Cart");
		logger.info("click the add To Cart");

		ele.addCartBtn();
		et.pass("addcart  is working");
		logger.info("addcart  is working");

		ele.checkOutBtn();
		et.pass("buying CricketKit");
		logger.info("buying CricketKit");
		waitTime();
		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");

		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");

		ele.placeOrd();
		;
		et.pass("order is placed");
		logger.info("order is placed");

	}

	@Test(priority = 3, dependsOnMethods = "grandPiano")
	public void footBall() throws InterruptedException {
		et = er.createTest(" Buy footBall");
		et.pass("website launch");

		ele = new ElectronicsOBJ(driver);
		waitTime();
		ele.allCategories();
		et.pass("click the allCategories");
		logger.info(" go the allCategories");

		sp = new SportsOBJ(driver);
		waitTime();
		sp.sports();
		et.pass("click the sport");
		logger.info("click the sport");

		sp.sportsMenu();
		et.pass("click the sport Menu");
		logger.info("click the sport Menu");
		waitTime();
		sp.footBallMenu();
		et.pass("click the footBall Menu");
		logger.info("click the footBall Menu");

		sp.addCartfootBALL();
		et.pass("click the add To Cart");
		logger.info("click the add To Cart");

		ele.addCartBtn();
		et.pass("addcart  is working");
		logger.info("addcart  is working");

		ele.checkOutBtn();
		et.pass("buying CricketKit");
		logger.info("buying CricketKit");

		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");

		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");

		ele.placeOrd();
		;
		et.pass("order is placed");
		logger.info("order is placed");

	}

	@Test(priority = 4, dependsOnMethods = "grandPiano")
	public void badminton() throws InterruptedException {
		et = er.createTest(" Buy badminton");
		et.pass("website launch");
		
		ele = new ElectronicsOBJ(driver);
		sp = new SportsOBJ(driver);
		waitTimeMin();
		ele.allCategories();
		et.pass("click the allCategories");
		logger.info(" go the allCategories");

		sp.sports();
		et.pass("click the sport");
		logger.info("click the sport");

		sp.sportsMenu();
		et.pass("click the sport Menu");
		logger.info("click the sport Menu");
		waitTime();
		sp.badmintonMenu();
		et.pass("click the badminton Menu");
		logger.info("click the badminton Menu");

		sp.addCartBadminton();
		et.pass("click the add To Cart");
		logger.info("click the add To Cart");

		ele.addFourQty();
		et.pass("quanitity is added");
		logger.info("quanitity is added");
		ele.addCartBtn();
		et.pass("addcart  is working");
		logger.info("addcart  is working");

		ele.checkOutBtn();
		et.pass("buying CricketKit");
		logger.info("buying CricketKit");

		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");

		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");

		ele.placeOrd();
		;
		et.pass("order is placed");
		logger.info("order is placed");

	}

}
