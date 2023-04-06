package TestCases;

import org.testng.annotations.Test;

import pageObjects.HomeFurnitureOBJ;
import pageObjects.StoreContactOBJ;

public class StoreContactTC extends BaseClass {
	@Test(priority = 0)
	public void contact() throws InterruptedException {

		et = er.createTest("contact");
		et.pass("open");

		sc = new StoreContactOBJ(driver);

		storeLogin();
		loginSetUp();
		waitTime();

		sc.Contact();
		logger.info("contact option");
		et.pass("contact option");

		sc.Submit();
		logger.info("Submit button clicked");
		et.pass("Submit button clicked");

		sc.NameAsrt();

		logger.info("Passed Name Assert");
		et.pass("Passed Name Assert");

		sc.EmailAsrt();

		logger.info("Get emailerror assertion passed");
		et.pass("Get emailerror assertion passed");

		sc.PhoneAsrt();

		logger.info("Get phone error assertion passed");
		et.pass("Get phone error assertion passed");

		sc.MessageAsrt();

		logger.info("Get Message error assertion passed");
		et.pass("Get Message error assertion passed");

		sc.Name();
		logger.info("Name option");
		et.pass("Name option");

		sc.Email();
		logger.info("Email option");
		et.pass("Email option");

		sc.Phone();
		logger.info("phone option");
		et.pass("phone option");

		sc.Message();
		logger.info("Message option");
		et.pass("Message option");
	}

	@Test(priority = 1, dependsOnMethods = "contact")
	public void vendor() throws InterruptedException {

		et = er.createTest("vendor");
		et.pass("open");

		sc = new StoreContactOBJ(driver);
		waitTime();
		sc.vendor();
		logger.info("vendor option");
		et.pass("vendor option");

		scrollBottom();
		waitTimeMin();

		sc.piccoRating();
		logger.info("piccoRating assertion passed");
		et.pass("piccoRating assertion passed");

		sc.piccoSoft();
		logger.info("piccoSoft is clicked");
		et.pass("piccoSoft is clicked");
		scrollDown();
		sc.Reviews();
		logger.info("Reviews assertion passed");
		et.pass("Reviews assertion passed");

		sc.About();
		logger.info("About is clicked");
		et.pass("About is clicked");

		sc.Aboutpiccosoft();
		logger.info("Aboutpiccosoft assertion passed");
		et.pass("Aboutpiccosoft assertion passed");

		sc.Products();
		logger.info("Products is clicked");
		et.pass("Products is clicked");

		sc.ReviewsPage();
		logger.info("ReviewsPage is clicked");
		et.pass("ReviewsPage is clicked");
	}

	@Test(priority = 2, dependsOnMethods = "contact")
	public void smartWatch() throws InterruptedException {

		et = er.createTest("smartWatch");
		et.pass("open");

		sc = new StoreContactOBJ(driver);
		waitTime();
		sc.searchBar();
		logger.info("SmartWatch is Typing");
		et.pass("SmartWatch is Typing");

		sc.AQFIT();
		logger.info("AQFIT is clicked");
		et.pass("AQFIT is clicked");
		scrollDown();
		sc.Description();
		logger.info("Description assertion passed");
		et.pass("Description assertion passed  ".concat(sc.Description()));

		sc.Specifications();
		logger.info("Specifications is clicked");
		et.pass("Specifications is clicked");

		sc.Review();
		logger.info("Review assertion passed");
		et.pass("Review assertion passed");

		sc.CustomerQnA();
		logger.info("CustomerQnA is clicked");
		et.pass("CustomerQnA is clicked");

		sc.PostQns();
		logger.info("PostQns is clicked");
		et.pass("PostQns is clicked");

		sc.AskQns();
		logger.info("AskQns is clicked");
		et.pass("AskQns is clicked");

		sc.submitBtn();
		logger.info("submitBtn is clicked");
		et.pass("submitBtn is clicked");
	}

	@Test(priority = 3, dependsOnMethods = "contact")
	public void weekEndCollection() throws InterruptedException {

		et = er.createTest("weekEndCollection");
		et.pass("open");

		sc = new StoreContactOBJ(driver);
		storeLogin();
		waitTime();

		scrollDownMin();
		
		sc.addCartLamp();
		logger.info("addCartLamp is clicked");
		et.pass("addCartLamp is clicked");
		waitTimeMin();
		sc.lang();
		logger.info("language is clicked");
		et.pass("language is clicked");

		sc.French();
		logger.info("language is clicked");
		et.pass("language is clicked");

		sc.addFrench();
		logger.info("addFrench assertion passed");
		et.pass("addFrench assertion passed");

		sc.buyfrench();
		logger.info("buyfrench assertion passed");
		et.pass("buyfrench assertion passed");

		sc.like();
		logger.info("like is clicked");
		et.pass("like is clicked");

		sc.toastMsg();
		logger.info("toastMsg assertion passed");
		et.pass("toastMsg assertion passed");

		sc.dislike();
		logger.info("dislike is clicked");
		et.pass("dislike is clicked");

		sc.toastMsg();
		logger.info("toastMsg assertion passed");
		et.pass("toastMsg assertion passed");

		scrollBottom();
		sc.SpurtStory();
		logger.info("SpurtStory is clicked");
		et.pass("SpurtStory is clicked");

		sc.Story();
		logger.info("Story assertion passed");
		et.pass("Story assertion passed  ".concat(sc.Story()));

		sc.home();
		logger.info("home is clicked");
		et.pass("home is clicked");

		waitTime();
		sc.homeUrl();
		logger.info("homeBtn assertion passed");
		et.pass("homeBtn is clicked");
	}

	@Test(priority = 4, dependsOnMethods = "contact")
	public void colourIcon() throws InterruptedException {

		et = er.createTest("colourIcon");
		et.pass("open");

		sc = new StoreContactOBJ(driver);

		storeLogin();
		
		waitTime();

		sc.colourBtn();
		logger.info("colourBtn is clicked");
		et.pass("colourBtn is clicked");

		sc.purble();
		logger.info("purble is clicked");
		et.pass("purble is clicked");
		waitTime();
		sc.BGverify();
		logger.info("BackGround colour is Verified");
		et.pass("BackGround colour is Verified");
		sc.colourBtn();
		logger.info("colourBtn is clicked");
		et.pass("colourBtn is clicked");

		sc.blue();
		logger.info("purble is clicked");
		et.pass("purble is clicked");
	}
}
