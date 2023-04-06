package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.ElectronicsOBJ;
import pageObjects.KrishnaProductOBJ;

public class KrishnaProductTC extends BaseClass {
	@Test(priority = 0)
	public void radhaKrishna() throws InterruptedException, IOException {

		et = er.createTest("RadhaKrishna Product");
		et.pass("website launch");
		storeLogin();
		loginSetUp();
		kp = new KrishnaProductOBJ(driver);

		waitTime();

		kp.currentUrl();
		et.pass("URL Is Verifying");
		logger.info("URL Is Verifying");

		scrollBottom();
		waitTime();

		kp.twitterPage();
		et.pass("GoTO TwitterPage");
		logger.info("GoTO TwitterPage");

		kp.windowHandling();
		et.pass("URL Is Verifying");
		logger.info("URL Is Verifying");

		scrollUp();
		waitTime();
		kp.diwaliOffer();
		et.pass("GoTo DiwaliOffers");
		logger.info("GoTo DiwaliOffers");
		waitTimeMin();
		kp.productKrishna();
		et.pass("addCart Krishana");
		logger.info("addCart Krishana");
		waitTime();
		kp.krishnaPic();
		et.pass("View Krishana Photo");
		logger.info("View Krishana Photo");
		waitTime();
		caputureScreen(driver, "krishna");

		kp.secKrishnaPic();
		et.pass("View Krishana Photo");
		logger.info("View Krishana Photo");

		kp.thirdKrishnaPic();
		et.pass("View Krishana Photo");
		logger.info("View Krishana Photo");

		kp.fourthKishnaPic();
		et.pass("View Krishana Photo");
		logger.info("View Krishana Photo");

		kp.fifthKrishnaPic();
		et.pass("View Krishana Photo");
		logger.info("View Krishana Photo");

		kp.closeBtn();
		et.pass("Close Btn Working");
		logger.info("Close Btn Working");

		kp.modelNumber();
		et.pass("Verify Model Number");
		logger.info("Verify Model Number");

		waitTime();

		kp.buyButton();
		et.pass("Buying Product");
		logger.info("Buying Product");

		ele = new ElectronicsOBJ(driver);

		ele.placeOrd();
		et.pass("Placing Product");
		logger.info("Placing Product");

		kp.addressError();
		et.pass("AddressErro");
		logger.info("AddressError");

		kp.paymentError();
		et.pass("PaymentError");
		logger.info("PaymentError");

		kp.applyBtn();
		et.pass("Apply Btn Clicking");
		logger.info("Apply Btn Clicking");

		kp.couponError();
		et.pass("CouponError Is Verifying");
		logger.info("CouponError Is Verifying");

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

	@Test(priority = 1, dependsOnMethods = "radhaKrishna")
	public void babyKids() throws InterruptedException {

		et = er.createTest("Baby Product");
		et.pass("website launch");

		kp = new KrishnaProductOBJ(driver);
		ele = new ElectronicsOBJ(driver);
		waitTime();
		ele.allCategories();
		et.pass("Click the allCategories");
		logger.info(" Go the allCategories");

		kp.babyKids();
		et.pass("Click the BabyKids");
		logger.info(" Go the BabyKids");

		kp.babyBoys();
		et.pass("Click the BabyBoys");
		logger.info(" Go the BabyBoys");
		waitTimeMin();
		kp.babyTshirt();
		et.pass("Click the BabyTshirt");
		logger.info(" Go the BabyTshirt");

		kp.addFavJugular();
		et.pass("addFav To Jugular");
		logger.info("addFav To Jugular");

		scrollDown();

		kp.addFavShark();
		et.pass("addFav To Shark");
		logger.info("addFav To Sharkar");

		scrollUp();
		waitTime();
		kp.listView();
		et.pass("ListView Is Working");
		logger.info("ListView Is Working");

		kp.highToLoW();
		et.pass("HighToLoW Is Working");
		logger.info("HighToLoW Is Working");

		kp.lowToHigh();
		et.pass("LowToHigh Is Working");
		logger.info("LowToHigh Is Working");

		kp.vendors();
		et.pass("LowToHigh Is Working");
		logger.info("LowToHigh Is Working");

		kp.possibleWorks();
		et.pass("Click the possibleWorks");
		logger.info("Click the possibleWorks");

		kp.about();
		et.pass("Click the about");
		logger.info("Click the about");

		kp.aboutPossibleWorks();
		et.pass("Click the aboutPossibleWorks");
		logger.info("Click the aboutPossibleWorks");
		scrollBottom();

		kp.phoneNumberVerify();
		et.pass("PhoneNumber is Verify");
		logger.info("PhoneNumber is Verify");

		kp.contactUs();
		et.pass("Click the ContactUs");
		logger.info("Click the ContactUs");

		kp.nameBox();
		et.pass("Name is Entering");
		logger.info("Name is Entering");

		kp.emailBox();
		et.pass("Email is Entering");
		logger.info("Email is Entering");

		kp.phoneBox();
		et.pass("PhoneNum is Entering");
		logger.info("PhoneNum is Entering");
		kp.countryBox();
		et.pass("Country is Selected");
		logger.info("Country is Selected");
		kp.submitForm();
		et.pass("Form is submited");
		logger.info("Form is submited");

	}
}
