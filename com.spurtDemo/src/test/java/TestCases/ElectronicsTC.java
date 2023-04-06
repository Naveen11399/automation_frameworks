package TestCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.ElectronicsOBJ;
import pageObjects.LoginPage;

public class ElectronicsTC extends BaseClass {
//	@Test(priority = 0)
//	public void electronicsPage() throws InterruptedException  {
//		
//		et = er.createTest("Electronics");
//		et.pass("website launch");
//	
//		storeLogin();
//		loginSetUp();
//		ele = new ElectronicsOBJ(driver);
//		waitTime();
//		ele.allCategories();
//		et.pass("click the allCategories");
//		logger.info(" go the allCategories");
//		
//		ele.electronics();
//		et.pass("click the electronics");
//		logger.info(" go the electronics");
//		
//		ele.featuresCategory();
//		et.pass("click the featuresCategory");
//		logger.info(" go the featuresCategory");
//		
//		ele.adminSaleProduct();
//		et.pass("click the adminSaleProduct");
//		logger.info(" go the adminSaleProduc");
//		
//		ele.addToFav();
//		et.pass("product add to fav");
//		logger.info("product add to fav");
//		
//		ele.removeToFav();
//		et.pass("product remove to fav");
//		logger.info("product remove to fav");
//		
//
//		
//		ele.addToCart();
//		et.pass("addToCart is working");
//		logger.info("addToCart is working");
//		
//		
//		ele.addQuantity();
//		et.pass("quantity is adding");
//		logger.info("quantity is adding");
//		
//		ele.buyNow();
//		et.pass("product is buying");
//		logger.info("product is buying");
//		
//		ele.addAddress();
//		et.pass("address is selected");
//		logger.info("address is selected");
//		
//		ele.payment();
//		et.pass("cod is selected");
//		logger.info("cod is selected");
//		
//		ele.placeOrd();;
//		et.pass("order is placed");
//		logger.info("order is placed");
//
//		
//		
//	} 
//
//	
//	@Test(priority = 1,dependsOnMethods = "electronicsPage")
//	public void buyMiTV() throws InterruptedException {
//		et = er.createTest("MI TV ");
//		et.pass("url open");
//		
//	
//		ele = new ElectronicsOBJ(driver);
//		
//		waitTime();
//		ele.allCategories();
//		et.pass("click the allCategories");
//		logger.info(" go the allCategories");
//		
//		ele.electronics();
//		et.pass("click the electronics");
//		logger.info(" go the electronics");
//		
//		ele.featuresCategory();
//		et.pass("click the featuresCategory");
//		logger.info(" go the featuresCategory");
//		waitTimeMin();
//		ele.vendorPrdt();
//		et.pass("click the vendor product");
//		logger.info(" go the vendor product");
//		
//		Thread.sleep(6000);
//		ele.addMi();
//		et.pass("add Mi TV");
//		logger.info("add Mi TV");
//		
//		ele.addOneQnty();
//		et.pass("quanitity is added");
//		logger.info("quanitity is added");
//		
//		ele.Slt2Gb();
//		et.pass(" 2GB is selected");
//		logger.info(" 2GB is selected");
//		
//		ele.addCartBtn();
//		et.pass("product is addToCart");
//		logger.info("product is addToCart");
//		
//		ele.checkOutBtn();
//		et.pass("checkout button is clicked");
//		logger.info("checkout button is clicked");
//		
//		ele.addAddress();
//		et.pass("address is selected");
//		logger.info("address is selected");
//		
//		ele.payment();
//		et.pass("cod is selected");
//		logger.info("cod is selected");
//		
//		ele.placeOrd();
//		et.pass("order is placed");
//		logger.info("order is placed");
//		
//	}
//	
//	
//	
//	
//	@Test(priority = 2,dependsOnMethods = "electronicsPage")
//	public void buyAdminVarient() throws InterruptedException {
//		et = er.createTest("Admin Varient ");
//		et.pass("URL Launch");
//	
//		
//
//	
//		
//		ele = new ElectronicsOBJ(driver);
//		
//		waitTime();
//		ele.allCategories();
//		et.pass("click the allCategories");
//		logger.info(" go the allCategories");
//		
//		ele.electronics();
//		et.pass("click the electronics");
//		logger.info(" go the electronics");
//		
//		ele.featuresCategory();
//		et.pass("click the featuresCategory");
//		logger.info(" go the featuresCategory");
//		waitTimeMin();
//		ele.adminAllProduct();
//		et.pass("click the adminSaleProduct");
//		logger.info(" go the adminSaleProduct");
//		
//		scrollDown();
//		scrollDown();
//	
//		ele.addAdminVarient();
//		et.pass("Add the AdminVarient");
//		logger.info("Add the AdminVarient");
//		
//		ele.addFourQty();
//		et.pass("Add the Four quantity");
//		logger.info("Add the Four quantity");
//		
//		ele.redVarient();
//		et.pass("select redVarient");
//		logger.info("select redVarient");
//		
//	
//		ele.addCartBtn();
//		et.pass("product is addToCart");
//		logger.info("product is addToCart");
//		
//		ele.checkOutBtn();
//		et.pass("checkout button is clicked");
//		logger.info("checkout button is clicked");
//		
//		ele.addAddress();
//		et.pass("address is selected");
//		logger.info("address is selected");
//		
//		ele.payment();
//		et.pass("cod is selected");
//		logger.info("cod is selected");
//		
//		ele.placeOrd();
//		et.pass("order is placed");
//		logger.info("order is placed");
//		
//		
//		
//	}
//	
//	
//	@Test(priority = 3,dependsOnMethods = "electronicsPage")
//	public void buyVendorQnA() throws InterruptedException {
//		et = er.createTest("buyVendorQnA");
//		et.pass("URL Launch");
//		
//		ele = new ElectronicsOBJ(driver);
//		
//		waitTime();
//		ele.allCategories();
//		et.pass("click the allCategories");
//		logger.info(" go the allCategories");
//		
//		ele.electronics();
//		et.pass("click the electronics");
//		logger.info(" go the electronics");
//		
//		ele.featuresCategory();
//		et.pass("click the featuresCategory");
//		logger.info(" go the featuresCategory");
//		waitTimeMin();
//		ele.vendorAllProduct();
//		et.pass("click the vendorAllProduct");
//		logger.info(" go the vendorAllProduct");
//		
//		ele.addCartVendorQnA();
//		et.pass("addCart to VendorQnA");
//		logger.info("addCart to VendorQnA");
//		
//		ele.addEightQty();
//		et.pass("add the EightQty");
//		logger.info("add the EightQty");
//	
//		ele.addCartBtn();
//		et.pass("product is addToCart");
//		logger.info("product is addToCart");
//		
//		ele.checkOutBtn();
//		et.pass("checkout button is clicked");
//		logger.info("checkout button is clicked");
//		
//		ele.addAddress();
//		et.pass("address is selected");
//		logger.info("address is selected");
//		
//		ele.payment();
//		et.pass("cod is selected");
//		logger.info("cod is selected");
//		
//		ele.placeOrd();
//		et.pass("order is placed");
//		logger.info("order is placed");
//	
//		 
//	}
//	
//	
//	@Test(priority = 4,dependsOnMethods = "electronicsPage")
//	public void buyAdminProduct() throws InterruptedException {
//		et = er.createTest("buyAdminProduct");
//		et.pass("URL Launch");
//	
//		
//		
//	
//	
//		ele = new ElectronicsOBJ(driver);
//		
//		waitTime();
//		ele.allCategories();
//		et.pass("click the allCategories");
//		logger.info(" go the allCategories");
//		
//		ele.electronics();
//		et.pass("click the electronics");
//		logger.info(" go the electronics");
//		
//		ele.featuresCategory();
//		et.pass("click the featuresCategory");
//		logger.info(" go the featuresCategory");
//		waitTimeMin();
//		ele.adminProduct();
//		et.pass("click the adminProduct");
//		logger.info(" go the adminProduct");
//		
//		scrollDown();
//		
//		ele.priceSlider();
//		et.pass(" slider is working");
//		logger.info(" slider is working");
//		
//		ele.addCartCookware();
//		et.pass("Cookware is add to cart");
//		logger.info("Cookware is add to cart");
//		
//		ele.addCartBtn();
//		et.pass("product is addToCart");
//		logger.info("product is addToCart");
//		
//		ele.checkOutBtn();
//		et.pass("checkout button is clicked");
//		logger.info("checkout button is clicked");
//		
//		ele.addAddress();
//		et.pass("address is selected");
//		logger.info("address is selected");
//		
//		ele.payment();
//		et.pass("cod is selected");
//		logger.info("cod is selected");
//		
//		ele.placeOrd();
//		et.pass("order is placed");
//		logger.info("order is placed");
//	}
//	
//	@Test(priority = 5,dependsOnMethods = "electronicsPage")
//	public void signout() throws InterruptedException {
//		
//		et = er.createTest("SignOut Functionality ");
//		et.pass("URL Launch");
//	
//		
//
//		waitTime();
//		lp.accountBtn();
//		logger.info("account  btn clicked");
//		et.pass("account  btn clicked");
//		
//		lp.signOutBtn();
//		logger.info("signOut  btn clicked");
//		et.pass("signOut btn clicked");
		
	//}
	
	@Test(priority = 0)
	public void buySuroskie() throws InterruptedException {
		et = er.createTest("buyAdminProduct");
		et.pass("URL Launch");
	
		
		
		storeLogin();
		loginSetUp();
	
		ele = new ElectronicsOBJ(driver);
		
		waitTime();
		ele.allCategories();
		et.pass("click the allCategories");
		logger.info(" go the allCategories");
		
		ele.electronics();
		et.pass("click the electronics");
		logger.info(" go the electronics");
		
		ele.SmartWearable();;
		et.pass("click the SmartWearable");
		logger.info(" go the SmartWearable");
		waitTimeMin();
		ele.SmartGlasses();
		et.pass("click the SmartGlasses");
		logger.info(" go the SmartGlasses");
		
		scrollDown();
		
		ele.SuroskiePrice();
		et.pass("SuroskiePrice Is Verified");
		logger.info(" SuroskiePrice is  Verified");
		
		ele.firstcartBtn();
		et.pass("add to cart is working");
		logger.info("add to cart is working");
		
		ele.SuroskieSKU();
		et.pass("SuroskieSKU Is Verified");
		logger.info("SuroskieSKU Is Verified");
		
		ele.primaryBuyNow();
		et.pass("BuyNow button is clicked");
		logger.info("BuyNow button is clicked");
		
		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");
		
		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");
		
		ele.placeOrd();
		et.pass("order is placed");
		logger.info("order is placed");
		
		VerifyOrder();
		et.pass("order is placed".concat(VerifyOrder()));
		logger.info("order is placed");
		
	}
	

	@Test(priority = 1,dependsOnMethods = "buySuroskie")
	public void buyOneplusBand () throws InterruptedException {
		et = er.createTest("buyOneplusBand ");
		et.pass("URL Launch");
	
		
		
		
	
		ele = new ElectronicsOBJ(driver);
		
		waitTime();
		ele.allCategories();
		et.pass("click the allCategories");
		logger.info(" go the allCategories");
		
		ele.electronics();
		et.pass("click the electronics");
		logger.info(" go the electronics");
		
		ele.SmartWearable();;
		et.pass("click the SmartWearable");
		logger.info(" go the SmartWearable");
		waitTimeMin();
		ele.SmartBand();
		et.pass("click the SmartGlasses");
		logger.info(" go the SmartGlasses");
		
		scrollDown();
		
		ele.onePlusBandPrice();
		et.pass("onePlusBandPrice is Verified");
		logger.info("onePlusBandPrice is Verified");
		
		ele.firstcartBtn();
		et.pass("add to cart is working");
		logger.info("add to cart is working");
		
		ele.onePlusSKU();
		et.pass("SuroskieSKU Is Verified");
		logger.info("SuroskieSKU Is Verified");
		
		ele.primaryBuyNow();
		et.pass("BuyNow button is clicked");
		logger.info("BuyNow button is clicked");
		
		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");
		
		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");
		
		ele.placeOrd();
		et.pass("order is placed");
		logger.info("order is placed");
		
		VerifyOrder();
		et.pass("order is placed".concat(VerifyOrder()));
		logger.info("order is placed");
	}
	@Test(priority = 2,dependsOnMethods = "buySuroskie")
	public void buyMotorola () throws InterruptedException {
		et = er.createTest("buyMotorola ");
		et.pass("URL Launch");
	
		
		
		
	
		ele = new ElectronicsOBJ(driver);
		
		waitTime();
		ele.allCategories();
		et.pass("click the allCategories");
		logger.info(" go the allCategories");
		
		ele.electronics();
		et.pass("click the electronics");
		logger.info(" go the electronics");
		
		ele.TvSpeakerBtn();
		et.pass("click the TvSpeakerBtn");
		logger.info(" go the TvSpeakerBtn");
		waitTimeMin();
		ele.SonySmartLedTV();
		et.pass("click the SonySmartLedTV");
		logger.info(" go the SonySmartLedTV");
		
		scrollDown();
		
		ele.motorolaTvPrice();
		et.pass("motorolaTvPrice is Verified");
		logger.info("motorolaTvPrice is Verified");
		
		ele.firstcartBtn();
		et.pass("add to cart is working");
		logger.info("add to cart is working");
		
		ele.motorolaTvSKU();
		et.pass("motorolaTvSKU Is Verified");
		logger.info("motorolaTvSKU Is Verified");
		
		ele.primaryBuyNow();
		et.pass("BuyNow button is clicked");
		logger.info("BuyNow button is clicked");
		
		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");
		
		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");
		
		ele.placeOrd();
		et.pass("order is placed");
		logger.info("order is placed");
		
		VerifyOrder();
		et.pass("order is placed".concat(VerifyOrder()));
		logger.info("order is placed");
	}
	@Test(priority = 3,dependsOnMethods = "buySuroskie")
	public void buyBoatSpeaker () throws InterruptedException {
		et = er.createTest("buy BoatSpeaker ");
		et.pass("URL Launch");
	
		
		
		
	
		ele = new ElectronicsOBJ(driver);
		
		waitTime();
		ele.allCategories();
		et.pass("click the allCategories");
		logger.info(" go the allCategories");
		
		ele.electronics();
		et.pass("click the electronics");
		logger.info(" go the electronics");
		
		ele.TvSpeakerBtn();
		et.pass("click the TvSpeakerBtn");
		logger.info(" go the TvSpeakerBtn");
		waitTimeMin();
		ele.HomeTheaters();
		et.pass("click the HomeTheaters");
		logger.info(" go the HomeTheaters");
		
		scrollDown();
		
		ele.boatSpeakerPrice();
		et.pass("boatSpeakerPrice is Verified");
		logger.info("boatSpeakerPrice is Verified");
		
		ele.firstcartBtn();
		et.pass("add to cart is working");
		logger.info("add to cart is working");
		
		ele.boatspeakerSKU();
		et.pass("boatspeakerSKU Is Verified");
		logger.info("boatspeakerSKU Is Verified");
		
		ele.boatspeakerTit();
		et.pass("boatspeakerTit Is Verified");
		logger.info("boatspeakerTit Is Verified");
		ele.primaryBuyNow();
		et.pass("BuyNow button is clicked");
		logger.info("BuyNow button is clicked");
		
		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");
		
		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");
		
		ele.placeOrd();
		et.pass("order is placed");
		logger.info("order is placed");
		
		VerifyOrder();
		et.pass("order is placed".concat(VerifyOrder()));
		logger.info("order is placed");
	}
	
	@Test(priority = 4,dependsOnMethods = "buySuroskie")
	public void buySonyTv () throws InterruptedException {
		et = er.createTest("buy SonyTv ");
		et.pass("URL Launch");
	
		
		
		
	
		ele = new ElectronicsOBJ(driver);
		
		waitTime();
		ele.allCategories();
		et.pass("click the allCategories");
		logger.info(" go the allCategories");
		
		ele.electronics();
		et.pass("click the electronics");
		logger.info(" go the electronics");
		
		ele.TvSpeakerBtn();
		et.pass("click the TvSpeakerBtn");
		logger.info(" go the TvSpeakerBtn");
		waitTimeMin();
		ele.TelevisionList();
		et.pass("click the TelevisionList");
		logger.info(" go the TelevisionList");
		
		scrollDown();
		
		ele.sonyTvPrice();
		et.pass("sonyTvPrice is Verified");
		logger.info("sonyTvPrice is Verified");
		
		ele.firstcartBtn();
		et.pass("add to cart is working");
		logger.info("add to cart is working");
		
		ele.sonyTvSKU();
		et.pass("sonyTvSKU Is Verified");
		logger.info("sonyTvSKU Is Verified");
		
		ele.sonyTvTit();
		et.pass("sonyTvTit Is Verified");
		logger.info("sonyTvTit Is Verified");
		ele.primaryBuyNow();
		et.pass("BuyNow button is clicked");
		logger.info("BuyNow button is clicked");
		
		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");
		
		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");
		
		ele.placeOrd();
		et.pass("order is placed");
		logger.info("order is placed");
		
		VerifyOrder();
		et.pass("order is placed".concat(VerifyOrder()));
		logger.info("order is placed");
	}
	
	@Test(priority = 5,dependsOnMethods = "buySuroskie")
	public void buyAmazonTv () throws InterruptedException {
		et = er.createTest("buy AmazonTv ");
		et.pass("URL Launch");
	
		
		
		
	
		ele = new ElectronicsOBJ(driver);
		
		waitTime();
		ele.allCategories();
		et.pass("click the allCategories");
		logger.info(" go the allCategories");
		
		ele.electronics();
		et.pass("click the electronics");
		logger.info(" go the electronics");
		
		ele.TvSpeakerBtn();
		et.pass("click the TvSpeakerBtn");
		logger.info(" go the TvSpeakerBtn");
		waitTimeMin();
		ele.SmartLEDTVList();
		et.pass("click the SmartLEDTVList");
		logger.info(" go the SmartLEDTVList");
		
		scrollDown();
		
		ele.amazonTvPrice();
		et.pass("amazonTvPrice is Verified");
		logger.info("amazonTvPrice is Verified");
		
		ele.firstcartBtn();
		et.pass("add to cart is working");
		logger.info("add to cart is working");
		
		ele.amazonTvSKU();
		et.pass("amazonTvSKU Is Verified");
		logger.info("amazonTvSKU Is Verified");
		
		ele.amazonTvTit();
		et.pass("amazonTvTit Is Verified");
		logger.info("amazonTvTit Is Verified");
		ele.primaryBuyNow();
		et.pass("BuyNow button is clicked");
		logger.info("BuyNow button is clicked");
		
		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");
		
		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");
		
		ele.placeOrd();
		et.pass("order is placed");
		logger.info("order is placed");
		
		VerifyOrder();
		et.pass("order is placed".concat(VerifyOrder()));
		logger.info("order is placed");
	}
	
	@Test(priority = 6,dependsOnMethods = "buySuroskie")
	public void buyTvWallMount () throws InterruptedException {
		et = er.createTest("buy TvWallMount ");
		et.pass("URL Launch");
	
		
		
	
		ele = new ElectronicsOBJ(driver);
		
		waitTime();
		ele.allCategories();
		et.pass("click the allCategories");
		logger.info(" go the allCategories");
		
		ele.electronics();
		et.pass("click the electronics");
		logger.info(" go the electronics");
		
		ele.TvSpeakerBtn();
		et.pass("click the TvSpeakerBtn");
		logger.info(" go the TvSpeakerBtn");
		waitTimeMin();
		ele.TVwallMountList();
		et.pass("click the TVwallMountList");
		logger.info(" go the TVwallMountList");
		
		scrollDown();
		
		ele.HOJIPrice();
		et.pass("HOJIPrice is Verified");
		logger.info("HOJIPrice is Verified");
		
		ele.firstcartBtn();
		et.pass("add to cart is working");
		logger.info("add to cart is working");
		
		ele.HOJISKU();
		et.pass("HOJISKU Is Verified");
		logger.info("HOJISKU Is Verified");
		
		ele.HOJITit();
		et.pass("HOJITit Is Verified");
		logger.info("HOJITit Is Verified");
		ele.primaryBuyNow();
		et.pass("BuyNow button is clicked");
		logger.info("BuyNow button is clicked");
		
		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");
		
		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");
		
		ele.placeOrd();
		et.pass("order is placed");
		logger.info("order is placed");
		
		VerifyOrder();
		et.pass("order is placed".concat(VerifyOrder()));
		logger.info("order is placed");
	}
	
	@Test(priority = 7,dependsOnMethods = "buySuroskie")
	public void buyPluto () throws InterruptedException {
		et = er.createTest("buy Pluto ");
		et.pass("URL Launch");
	
		ele = new ElectronicsOBJ(driver);
		
		waitTime();
		ele.allCategories();
		et.pass("click the allCategories");
		logger.info(" go the allCategories");
		
		ele.electronics();
		et.pass("click the electronics");
		logger.info(" go the electronics");
		
		ele.TvSpeakerBtn();
		et.pass("click the TvSpeakerBtn");
		logger.info(" go the TvSpeakerBtn");
		waitTimeMin();
		ele.PlutoAccessoryList();
		et.pass("click the PlutoAccessoryList");
		logger.info(" go the PlutoAccessoryList");
		
		scrollDown();
		
		ele.plutoPrice();
		et.pass("plutoPrice is Verified");
		logger.info("plutoPrice is Verified");
		
		ele.firstcartBtn();
		et.pass("add to cart is working");
		logger.info("add to cart is working");
		
		ele.plutoSKU();
		et.pass("plutoSKU Is Verified");
		logger.info("plutoSKU Is Verified");
		
		ele.plutoTit();
		et.pass("plutoTit Is Verified");
		logger.info("plutoTit Is Verified");
		ele.primaryBuyNow();
		et.pass("BuyNow button is clicked");
		logger.info("BuyNow button is clicked");
		
		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");
		
		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");
		
		ele.placeOrd();
		et.pass("order is placed");
		logger.info("order is placed");
		
		VerifyOrder();
		et.pass("order is placed".concat(VerifyOrder()));
		logger.info("order is placed");
	}
	
	@Test(priority = 8,dependsOnMethods = "buySuroskie")
	public void buySpeakerPrdt () throws InterruptedException {
		et = er.createTest("buy ySpeakerPrdt ");
		et.pass("URL Launch");
	
		
		
		
	
		ele = new ElectronicsOBJ(driver);
		
		waitTime();
		ele.allCategories();
		et.pass("click the allCategories");
		logger.info(" go the allCategories");
		
		ele.electronics();
		et.pass("click the electronics");
		logger.info(" go the electronics");
		
		ele.TvSpeakerBtn();
		et.pass("click the TvSpeakerBtn");
		logger.info(" go the TvSpeakerBtn");
		waitTimeMin();
		ele.SpeakerList();
		et.pass("click the SpeakerList");
		logger.info(" go the SpeakerList");
		
		scrollDown();
		
		ele.speakerPrtPrice();
		et.pass("speakerPrtPrice is Verified");
		logger.info("speakerPrtPrice is Verified");
		
		ele.firstcartBtn();
		et.pass("add to cart is working");
		logger.info("add to cart is working");
		
		ele.speakerPrtSKU();
		et.pass("speakerPrtSKU Is Verified");
		logger.info("speakerPrtSKU Is Verified");
		
		ele.speakerPrtTit();
		et.pass("speakerPrtTit Is Verified");
		logger.info("speakerPrtTit Is Verified");
		ele.primaryBuyNow();
		et.pass("BuyNow button is clicked");
		logger.info("BuyNow button is clicked");
		
		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");
		
		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");
		
		ele.placeOrd();
		et.pass("order is placed");
		logger.info("order is placed");
		
		VerifyOrder();
		et.pass("order is placed".concat(VerifyOrder()));
		logger.info("order is placed");
	}
	@Test(priority = 9,dependsOnMethods = "buySuroskie")
	public void buyAcidEye () throws InterruptedException {
		et = er.createTest("buy AcidEye ");
		et.pass("URL Launch");
		ele = new ElectronicsOBJ(driver);
		
		waitTime();
		ele.allCategories();
		et.pass("click the allCategories");
		logger.info(" go the allCategories");
		
		ele.electronics();
		et.pass("click the electronics");
		logger.info(" go the electronics");
		
		ele.MobileAccessories();
		et.pass("click the MobileAccessories");
		logger.info(" go the MobileAccessories");
		waitTimeMin();
		ele.SmartHeadphoneList();
		et.pass("click the SmartHeadphoneList");
		logger.info(" go the SmartHeadphoneList");
		
		scrollDown();
		
		ele.AcidEyePrice();
		et.pass("AcidEyePrice is Verified");
		logger.info("AcidEyePrice is Verified");
		
		ele.firstcartBtn();
		et.pass("add to cart is working");
		logger.info("add to cart is working");
		
		
		ele.AcidEyetSKU();
		et.pass("AcidEyetSKU Is Verified");
		logger.info("AcidEyetSKU Is Verified");
		
		
		ele.primaryBuyNow();
		et.pass("BuyNow button is clicked");
		logger.info("BuyNow button is clicked");
		
		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");
		
		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");
		
		ele.placeOrd();
		et.pass("order is placed");
		logger.info("order is placed");
		
		VerifyOrder();
		et.pass("order is placed".concat(VerifyOrder()));
		logger.info("order is placed");
	}
}
