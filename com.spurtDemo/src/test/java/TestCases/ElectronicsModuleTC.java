package TestCases;

import org.testng.annotations.Test;

import pageObjects.ElectronicsOBJ;
import pageObjects.LoginPage;

public class ElectronicsModuleTC extends BaseClass {
	@Test
	public void SmartWearableDetails() throws InterruptedException {
		storeLogin();
		loginSetUp();

		et = er.createTest("Smart Wearable Details");
		et.pass("open");

		ele = new ElectronicsOBJ(driver);
		waitTime();
		ele.allCategories();
		logger.info("Allcategory option");
		et.pass("All category option");

		ele.electronics();
		logger.info("electronics option");
		et.pass("  electronics option");

		ele.SmartWearable();
		logger.info("electronics option");
		et.pass("  electronics option");
		waitTimeMin();
		ele.SmartWatchBtn();
		logger.info("electronics option");
		et.pass("  electronics option");

		ele.addCartCookware();
		logger.info("clicked firstelement");
		et.pass("clicked firstelement");

		ele.SmartWatchtxt();
		logger.info("electronics option");
		et.pass("  electronics option");

		ele.RedVarient();
		logger.info("electronics option");
		et.pass("  electronics option");

		ele.addCartBtn();
		logger.info("clicked add to cart button");
		et.pass("clicked add to cart button");

		ele.checkOutBtn();
		logger.info("clicked checkout button");
		et.pass("clicked checkout button");

		ele.addAddress();
		logger.info("selected address");
		et.pass("selected address");

		ele.payment();
		logger.info("clicked cash on delivery button");
		et.pass("clicked cash on delivery button");

		ele.placeOrd();
		logger.info("clicked placeorder button");
		et.pass("clicked placeorder button");

	}

	@Test(priority = 1, dependsOnMethods = "SmartWearableDetails")
	public void TVSpeaker() throws InterruptedException {

		et = er.createTest("TV Speaker Details");
		et.pass("open");

		ele = new ElectronicsOBJ(driver);
		waitTime();
		ele.allCategories();
		logger.info("Allcategory option");
		et.pass("All category option");

		ele.electronics();
		logger.info("electronics option");
		et.pass("  electronics option");
		waitTimeMin();
		ele.TvSpeakerBtn();
		logger.info("Tv speaker option");
		et.pass("Tv speaker option");

		ele.SonytvBtn();
		logger.info("SonyTv option");
		et.pass("SonyTv option");
		Thread.sleep(10000);
		ele.addCartVendorQnA();
		logger.info("clicked firstelement");
		et.pass("clicked firstelement");

		waitTime();
		ele.RedmiSku();
		logger.info("Get redmi price assertion passed");
		et.pass("Get redmi price assertion passed");

		ele.addOneQnty();
		logger.info("quantity added");
		et.pass("quantity added");

		waitTime();
		ele.buyNow();
		logger.info("buynow clicked");
		et.pass("buynow clicked");

		ele.payment();
		logger.info("cashondelivery clicked");
		et.pass("cashondelivery clicked");

		ele.addAddress();
		logger.info(" address added");
		et.pass(" address added");

		ele.placeOrd();
		logger.info(" Order placed");
		et.pass(" Order placed");

	}

	@Test(priority = 2, dependsOnMethods = "SmartWearableDetails")
	public void MobileAccessories() throws InterruptedException {
		// StoreUrl();
		// loginfunction();
		et = er.createTest("Mobile Accessories Details");
		et.pass("open");

		ele = new ElectronicsOBJ(driver);
		waitTime();
		ele.allCategories();
		logger.info("Allcategory option");
		et.pass("All category option");

		ele.electronics();
		logger.info("electronics option");
		et.pass("  electronics option");

		ele.MobileAccessories();
		logger.info("Mobile Accessories option");
		et.pass("Mobile Accessories option");
		waitTimeMin();
		ele.MobileCases();
		logger.info("Mobile cases option");
		et.pass("Mobile cases option");

		Thread.sleep(6000);
		ele.addCartCookware();
		logger.info("clicked firstelement");
		et.pass("clicked firstelement");

		ele.Covername();
		logger.info("Got cover name Assertion passed");
		et.pass("Got cover name Assertion passed");

		ele.addOneQnty();
		logger.info("quantity added");
		et.pass("quantity added");

		ele.buyNow();
		logger.info("buynow clicked");
		et.pass("buynow clicked");

		ele.payment();
		logger.info("cashondelivery clicked");
		et.pass("cashondelivery clicked");

		ele.addAddress();
		logger.info(" address added");
		et.pass(" address added");

		ele.placeOrd();
		logger.info(" Order placed");
		et.pass(" Order placed");

	}

//		@Test(priority=3,dependsOnMethods = "SmartWearableDetails")
	@Test(priority = 3, dependsOnMethods = "SmartWearableDetails")
	public void CameraDetails() throws InterruptedException {

		et = er.createTest("Camera Details");
		et.pass("open");

		ele = new ElectronicsOBJ(driver);
		waitTime();
		ele.allCategories();
		logger.info("Allcategory option");
		et.pass("All category option");

		ele.electronics();
		logger.info("electronics option");
		et.pass("  electronics option");

		ele.CameraOptn();
		logger.info("Camera option clicked");
		et.pass("Camera option clicked");
		waitTimeMin();
		ele.DslrOption();
		logger.info("Dlsr option clicked");
		et.pass("Dlsr option clicked");

		Thread.sleep(5000);
		ele.SecondCartBtn();

		logger.info("Second element added to cart");
		et.pass("Second element added to cart");

		ele.addQuantity();
		logger.info("quantity added");
		et.pass("quantity added");
		waitTime();
		ele.buyNow();
		logger.info("clicked add to cart button");
		et.pass("clicked add to cart button");

		ele.addAddress();
		logger.info("selected address");
		et.pass("selected address");

		ele.payment();
		logger.info("clicked cash on delivery button");
		et.pass("clicked cash on delivery button");

		ele.placeOrd();
		logger.info("clicked placeorder button");
		et.pass("clicked placeorder button");

	}

	@Test(priority = 4, dependsOnMethods = "SmartWearableDetails")
	public void Laptops() throws InterruptedException {

		// StoreUrl(); (priority=1,dependsOnMethods = "SmartWearableDetails")

		et = er.createTest("Laptop Details");
		et.pass("open");

		ele = new ElectronicsOBJ(driver);
		waitTime();
		ele.allCategories();
		logger.info("Allcategory option");
		et.pass("All category option");

		ele.electronics();
		logger.info("electronics option");
		et.pass("  electronics option");

		ele.LaptopOptn();
		logger.info("Laptops option cliked");
		et.pass("Laptops option cliked");
		waitTimeMin();
		ele.TabletsOptn();
		logger.info("Tablets option cliked");
		et.pass("Tablets option cliked");
		Thread.sleep(5000);
		ele.SecondCartBtn();

		logger.info("Second element added to cart");
		et.pass("Second element added to cart");

		ele.TabletPrice();
		logger.info("Get tablet price assertion passed");
		et.pass("Get tablet price assertion passed");

		ele.BlackRadioBtn();
		logger.info("Black color selected");
		et.pass("Black color selected");

		ele.buyNow();
		logger.info("buynow clicked");
		et.pass("buynow clicked");
		waitTime();
		ele.payment();
		logger.info("cashondelivery clicked");
		et.pass("cashondelivery clicked");

		ele.addAddress();
		logger.info(" address added");
		et.pass(" address added");

		ele.placeOrd();
		logger.info(" Order placed");
		et.pass(" Order placed");

	}

	@Test(priority = 5, dependsOnMethods = "SmartWearableDetails")
	public void MobileDetails() throws InterruptedException {

		et = er.createTest("Mobile Details");
		et.pass("open");

		ele = new ElectronicsOBJ(driver);
		waitTime();
		ele.allCategories();
		logger.info("Allcategory option");
		et.pass("All category option");

		ele.electronics();
		logger.info("electronics option");
		et.pass("  electronics option");

		ele.MobileOption();
		logger.info("electronics option");
		et.pass("  electronics option");
		waitTimeMin();
		ele.Samsungoptiopn();
		logger.info("samsung option clicked");
		et.pass("samsung option clicked");

		ele.SecondCartBtn();
		logger.info("Second element added to cart");
		et.pass("Second element added to cart");

		ele.SamsungNameTxt();
		logger.info("Get samsung text assertion passed");
		et.pass("Get samsung text assertion passed");

		ele.addOneQnty();
		logger.info("quantity added");
		et.pass("quantity added");

		ele.buyNow();
		logger.info("clicked checkout button");
		et.pass("clicked checkout button");
		waitTimeMin();
		ele.addAddress();
		logger.info("selected address");
		et.pass("selected address");

		ele.payment();
		logger.info("clicked cash on delivery button");
		et.pass("clicked cash on delivery button");

		ele.placeOrd();
		logger.info("clicked placeorder button");
		et.pass("clicked placeorder button");

	}

//		
	@Test(priority = 6, dependsOnMethods = "SmartWearableDetails")
	public void AccessoriesOption() throws InterruptedException {

		// StoreUrl(); (priority=11,dependsOnMethods = "Adminsaleproduct")
		// loginfunction();

		et = er.createTest("Accessories Details");
		et.pass("open");

		ele = new ElectronicsOBJ(driver);
		waitTime();
		ele.allCategories();
		logger.info("Allcategory option");
		et.pass("All category option");

		ele.electronics();
		logger.info("electronics option");
		et.pass("  electronics option");

		ele.Accessoriesopn();
		logger.info("Acessories option");
		et.pass("Acessories option");
		waitTimeMin();
		ele.PendriveOpn();
		logger.info("Pendrives option");
		et.pass("Pendrives option");

		ele.ThirdElementCart();
		logger.info("Third element added to cart");
		et.pass("Third element added to cart");

		ele.PendriveTxt();
		logger.info("Get pendrive text assertion passed");
		et.pass("Get pendrive text assertion passed");

		ele.addOneQnty();
		logger.info("quantity added");
		et.pass("quantity added");

		ele.buyNow();
		logger.info("clicked add to cart button");
		et.pass("clicked add to cart button");

		ele.addAddress();
		logger.info("selected address");
		et.pass("selected address");

		ele.payment();
		logger.info("clicked cash on delivery button");
		et.pass("clicked cash on delivery button");

		ele.placeOrd();
		logger.info("clicked placeorder button");
		et.pass("clicked placeorder button");

	}

	@Test(priority = 7, dependsOnMethods = "SmartWearableDetails")
	public void SpeakersDetails() throws InterruptedException {

		// StoreUrl();
		// loginfunction();

		et = er.createTest("Speaker Details");
		et.pass("open");

		ele = new ElectronicsOBJ(driver);
		waitTime();

		ele.allCategories();
		logger.info("Allcategory option");
		et.pass("All category option");

		ele.electronics();
		logger.info("electronics option");
		et.pass("  electronics option");

		ele.SpeakersOpn();
		logger.info("clicked speakers option");
		et.pass("clicked speakers option");
		waitTimeMin();
		ele.AudioSpeakersOptn();
		logger.info("clicked audiospeakers option");
		et.pass("clicked audiospeakers option");

		ele.addCartCookware();
		logger.info("clicked firstelement");
		et.pass("clicked firstelement");

		ele.SpeakerPrice();
		logger.info("Get speaker price assertion passed");
		et.pass("Get speaker price assertion passed");

		ele.addOneQnty();
		logger.info("quantity added");
		et.pass("quantity added");

		ele.buyNow();
		logger.info("clicked checkout button");
		et.pass("clicked checkout button");

		ele.addAddress();
		logger.info("selected address");
		et.pass("selected address");

		ele.payment();
		logger.info("clicked cash on delivery button");
		et.pass("clicked cash on delivery button");

		ele.placeOrd();
		logger.info("clicked placeorder button");
		et.pass("clicked placeorder button");

	}

	@Test(priority = 8, dependsOnMethods = "SmartWearableDetails")
	public void Signoutfun() throws InterruptedException {

		et = er.createTest("Signout Function");
		et.pass("url open");

		lp = new LoginPage(driver);
		waitTimeMin();
		lp.accountBtn();
		logger.info("clicked account button");
		et.pass("clicked  button");

		lp.signOutBtn();
		logger.info("clicked signout button");
		et.pass("clicked signout button");

	}

}
