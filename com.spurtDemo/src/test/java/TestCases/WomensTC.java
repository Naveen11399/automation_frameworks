package TestCases;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.ElectronicsOBJ;
import pageObjects.KrishnaProductOBJ;
import pageObjects.WomensFashionOBJ;

public class WomensTC extends BaseClass {
	@Test(priority = 0)
	public void lakmeLotion() throws InterruptedException {

		et = er.createTest("Lakme Product");
		et.pass("website launch");
		storeLogin();
		loginSetUp();
		kp = new KrishnaProductOBJ(driver);
		ele = new ElectronicsOBJ(driver);
		wp = new WomensFashionOBJ(driver);

		waitTime();
		ele.allCategories();
		et.pass("Click the allCategories");
		logger.info(" Go the allCategories");
		wp.womensFashion();
		et.pass("Click the womensFashion");
		logger.info(" Go the womensFashion");
		waitTimeMin();
		wp.BeautyNGrooming();
		et.pass("Click the BeautyNGrooming");
		logger.info(" Go the BeautyNGrooming");

		wp.SunScreenLotion();
		et.pass("Click the SunScreenLotion Page");
		logger.info(" Go the SunScreenLotion Page");
		waitTime();
		wp.addCartLakme();
		et.pass("AddCart is clicked");
		logger.info("AddCart is clicked");

		wp.verifySKU();
		et.pass("SKU Is Verifying");
		logger.info("SKU Is Verifying");

		ele.buyNow();
		et.pass("BuyNow is clicked");
		logger.info("BuyNow is clicked");
		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");

		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");

		ele.placeOrd();
		et.pass("order is placed");
		logger.info("order is placed");
	}

	@Test(priority = 1, dependsOnMethods = "lakmeLotion")
	public void shampoo() throws InterruptedException {

		et = er.createTest("Shampoo Product");
		et.pass("website launch");

		kp = new KrishnaProductOBJ(driver);
		ele = new ElectronicsOBJ(driver);
		wp = new WomensFashionOBJ(driver);
		waitTime();
		ele.allCategories();
		et.pass("Click the allCategories");
		logger.info(" Go the allCategories");

		wp.womensFashion();
		et.pass("Click the womensFashion");
		logger.info(" Go the womensFashion");
		waitTimeMin();
		wp.hairCareList();
		et.pass("Click the hairCareList");
		logger.info(" Go the hairCareList");

		wp.verifyTitle();
		et.pass("Title is verifying");
		logger.info("Title is verifying");

		driver.get(driver.getCurrentUrl());
		waitTime();

		wp.addCartShampoo();
		et.pass("AddCart is clicked");
		logger.info("AddCart is clicked");

		scrollDown();

		wp.postQnsssBtn();
		et.pass("SKU Is Verifying");
		logger.info("SKU Is Verifying");

		wp.askQnBtn();
		et.pass("SKU Is Verifying");
		logger.info("SKU Is Verifying");

		ele.buyNow();
		et.pass("BuyNow is clicked");
		logger.info("BuyNow is clicked");
		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");

		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");

		ele.placeOrd();
		et.pass("order is placed");
		logger.info("order is placed");
	}

	@Test(priority = 2, dependsOnMethods = "lakmeLotion")
	public void skinCare() throws InterruptedException {

		et = er.createTest("skinCare Product");
		et.pass("website launch");

		kp = new KrishnaProductOBJ(driver);
		ele = new ElectronicsOBJ(driver);
		wp = new WomensFashionOBJ(driver);
		waitTime();
		ele.allCategories();
		et.pass("Click the allCategories");
		logger.info(" Go the allCategories");

		wp.womensFashion();
		et.pass("Click the womensFashion");
		logger.info(" Go the womensFashion");

		wp.skinCareList();
		et.pass("Click the skinCareList");
		logger.info(" Go the skinCareList");
		waitTimeMin();
		wp.bodyLotionList();
		et.pass("Click the bodyLotionLis");
		logger.info("Click the bodyLotionLis");

		wp.verifyPrice();
		et.pass("Price is Verified");
		logger.info("Price is Verified");

		waitTime();
		wp.bodyLotionCartBtn();
		et.pass(" clicked the cartBtn");
		logger.info(" clicked the cartBtn");

		ele.buyNow();
		et.pass("BuyNow is clicked");
		logger.info("BuyNow is clicked");
		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");

		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");

		ele.placeOrd();
		et.pass("order is placed");
		logger.info("order is placed");
	}

	@Test(priority = 3, dependsOnMethods = "lakmeLotion")
	public void sandals() throws InterruptedException {

		et = er.createTest("Sandals Product");
		et.pass("website launch");

		kp = new KrishnaProductOBJ(driver);
		ele = new ElectronicsOBJ(driver);
		wp = new WomensFashionOBJ(driver);
		waitTime();
		ele.allCategories();
		et.pass("Click the allCategories");
		logger.info(" Go the allCategories");

		wp.womensFashion();
		et.pass("Click the womensFashion");
		logger.info(" Go the womensFashion");

		wp.sandalsList();
		et.pass("Click the skinCareList");
		logger.info(" Go the skinCareList");
		waitTimeMin();
		wp.slippersList();
		et.pass("Click the bodyLotionLis");
		logger.info("Click the bodyLotionLis");

		wp.slipperPrice();
		et.pass("Price is Verified");
		logger.info("Price is Verified");

		waitTime();

		wp.slipperCartBtn();
		et.pass(" clicked the cartBtn");
		logger.info(" clicked the cartBtn");

		ele.buyNow();
		et.pass("BuyNow is clicked");
		logger.info("BuyNow is clicked");
		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");

		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");

		ele.placeOrd();
		et.pass("order is placed");
		logger.info("order is placed");
	}

	@Test(priority = 4, dependsOnMethods = "lakmeLotion")
	public void zAccessories() throws InterruptedException {

		et = er.createTest("Accessories Product");
		et.pass("website launch");

		kp = new KrishnaProductOBJ(driver);
		ele = new ElectronicsOBJ(driver);
		wp = new WomensFashionOBJ(driver);
		waitTime();
		ele.allCategories();
		et.pass("Click the allCategories");
		logger.info(" Go the allCategories");

		wp.womensFashion();
		et.pass("Click the womensFashion");
		logger.info(" Go the womensFashion");

		wp.AccessoriesList();
		et.pass("Click the skinCareList");
		logger.info(" Go the skinCareList");
		waitTimeMin();
		wp.kerchiefList();
		et.pass("Click the bodyLotionLis");
		logger.info("Click the bodyLotionLis");

		wp.kerchiefPrice();
		et.pass("Price is Verified");
		logger.info("Price is Verified");

		wp.kerchiefCartBtn();
		et.pass(" clicked the cartBtn");
		logger.info(" clicked the cartBtn");

		ele.buyNow();
		et.pass("BuyNow is clicked");
		logger.info("BuyNow is clicked");

		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");

		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");

		ele.placeOrd();
		et.pass("order is placed");
		logger.info("order is placed");
	}

	@Test(priority = 5, dependsOnMethods = "lakmeLotion")
	public void sarees() throws InterruptedException {

		et = er.createTest("WomanSarees Product");
		et.pass("website launch");

		kp = new KrishnaProductOBJ(driver);
		ele = new ElectronicsOBJ(driver);
		wp = new WomensFashionOBJ(driver);
		waitTime();
		ele.allCategories();
		et.pass("Click the allCategories");
		logger.info(" Go the allCategories");

		wp.womensFashion();
		et.pass("Click the womensFashion");
		logger.info(" Go the womensFashion");

		wp.WomenSarees();
		et.pass("Click the WomenSareesList");
		logger.info(" Go the WomenSareesList");
		waitTimeMin();
		wp.CottonSareesList();
		et.pass("Click the CottonSareesList");
		logger.info("Click the CottonSareesList");

		wp.BanarasiSareePrice();
		et.pass("Price is Verified");
		logger.info("Price is Verified");

		Thread.sleep(5000);

		wp.BanarasiSareeCartBtn1();
		et.pass(" clicked the cartBtn");
		logger.info(" clicked the cartBtn");

		ele.buyNow();
		et.pass("BuyNow is clicked");
		logger.info("BuyNow is clicked");

		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");

		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");

		ele.placeOrd();
		et.pass("order is placed");
		logger.info("order is placed");
	}

	@Test(priority = 6, dependsOnMethods = "lakmeLotion")
	public void EthnicWear() throws InterruptedException {

		et = er.createTest("EthnicWear Product");
		et.pass("website launch");

		kp = new KrishnaProductOBJ(driver);
		ele = new ElectronicsOBJ(driver);
		wp = new WomensFashionOBJ(driver);
		waitTime();
		ele.allCategories();
		et.pass("Click the allCategories");
		logger.info(" Go the allCategories");

		wp.womensFashion();
		et.pass("Click the womensFashion");
		logger.info(" Go the womensFashion");

		wp.EthnicWear();
		et.pass("Click the EthnicWearList");
		logger.info(" Go the EthnicWearList");
		waitTimeMin();
		wp.GhagraCholiList();
		et.pass("Click the GhagraCholiList");
		logger.info("Click the GhagraCholiList");

		wp.GhagraCholiPrice();
		et.pass("Price is Verified");
		logger.info("Price is Verified");

		waitTimeMax();

		wp.GhagraChoCartBtn();
		et.pass(" clicked the cartBtn");
		logger.info(" clicked the cartBtn");

		ele.buyNow();
		et.pass("BuyNow is clicked");
		logger.info("BuyNow is clicked");

		ele.addAddress();
		et.pass("address is selected");
		logger.info("address is selected");

		ele.payment();
		et.pass("cod is selected");
		logger.info("cod is selected");

		ele.placeOrd();
		et.pass("order is placed");
		logger.info("order is placed");
	}

}
