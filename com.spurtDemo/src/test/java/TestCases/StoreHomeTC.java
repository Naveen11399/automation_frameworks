package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.StoreHomeOBJ;

public class StoreHomeTC extends BaseClass  {



	

	@Test(priority = 0)
	public void HeaderPage() throws InterruptedException {
		
		

		et = er.createTest("Header Page");
		et.pass("open");

		sh = new StoreHomeOBJ(driver);
		storeLogin();
		loginSetUp();
		
		sh.NextSlide1();
		logger.info("Clicked next slide option");
		et.pass("Clicked next slide option");

		sh.LAddCart();
		logger.info("lamp added to cart");
		et.pass("lamp added to cart");

		
	}

	@Test(dependsOnMethods ="HeaderPage",priority = 1)
	public void NewYearOfferdetails() throws InterruptedException {

		et = er.createTest("New Year Offer Details");
		et.pass("open");

		sh = new StoreHomeOBJ(driver);

		waitTime();
		sh.NewYearoffer();
		logger.info("New year offer option clicked");
		et.pass("New year offer option clicked");

		waitTime();
		sh.AppleFavourite();
		logger.info("Apple added to favourite");
		et.pass("Apple added to favourite");

//		sh.AppleQuickview();
//		logger.info("opened quickview");
//		et.pass("opened quickview");

		sh.AppleText();
		logger.info("Get apple text");
		et.pass("Get apple text");

		sh.AppleCart();
		logger.info("Added to cart");
		et.pass("Added to cart");

		sh.MediumSize();
		logger.info("Medium size option clicked");
		et.pass("Medium size option clicked");

		sh.LargeSize();
		logger.info("large size option clicked");
		et.pass("large size option clicked");

		sh.ExtraSize();
		logger.info("Extra large size option clicked");
		et.pass("Extra large size option clicked");

		sh.SmallSize();
		logger.info("Small size option clicked");
		et.pass("Small size option clicked");

		sh.BuyNow();
		logger.info("Clicked buynow option");
		et.pass("Clicked buynow option");

		waitTime();
		scrollDown();
		sh.CashonDelivery();
		logger.info("cashondelivery clicked");
		et.pass("cashondelivery clicked");

		sh.Addaddress();
		logger.info(" address added");
		et.pass(" address added");

		sh.PlaceOrder();
		logger.info(" Order placed");
		et.pass(" Order placed");

	}

	@Test(dependsOnMethods ="HeaderPage",priority = 2)
	public void AccountDetails() throws InterruptedException, IOException {

		et = er.createTest("Account Details");
		et.pass("open");

		sh = new StoreHomeOBJ(driver);
		
		waitTime();
		sh.AccountBtn();
		logger.info("Clicked Account button");
		et.pass("Clicked Account button");

		sh.MyOrderHistoryBtn();
		logger.info("Clicked My order history button");
		et.pass("Clicked My order history button");

		waitTime();
		sh.OrderInfoTxt();
		logger.info("Get order information text assertion passed");
		et.pass("Get order information text assertion passed");

		scrollBottom();
		caputureScreen(driver, "History Footer");
		waitTime();
		sh.ContactInfoTxt();
		logger.info("Get contact information text assertion passed");
		et.pass("Get contact information text assertion passed");

		sh.UpwardArrow();
		logger.info("Clicked upward arrow button");
		et.pass("Clicked upward arrow button");

		waitTime();
		sh.AccountBtn();
		sh.AccountSettingbtn();
		logger.info("Clicked account setting button");
		et.pass("Clicked account setting button");

		waitTime();
		sh.AccountInfoTxt();
		logger.info("Get Account information text assertion passed");
		et.pass("Get Account information text assertion passed");

		waitTime();
		sh.Addresstxt();
		logger.info("Get address text assertion passed");
		et.pass("Get address text assertion passed");

	

	}

	@Test(dependsOnMethods ="HeaderPage",priority = 3)
	public void KrshnaProductDetails() throws InterruptedException, IOException {
         
		
		et = er.createTest("Krshna Product Details");
		et.pass("open");

		sh = new StoreHomeOBJ(driver);

		sh.KrshnaImage();
		logger.info("Clicked krshna image");
		et.pass("Clicked krshna image");

		sh.KrshnaPrice();
		logger.info("Get kproduct price assertion done");
		et.pass("Get kproduct price assertion done");

		waitTime();
		sh.Addquantity();
		sh.AddCartKrshna();
		sh.Refesh();
		waitTime();
		caputureScreen(driver, "Cart view1");
		logger.info("Quantity 2 added");
		et.pass("Quantity 2 added");

	
		waitTime();
		sh.ModelNumber();
		logger.info("Model number is SA6137");
		et.pass("Model number is SA6137");

		sh.ModelName();
		logger.info("Model name is Radha Krishna UV");
		et.pass("Model name is Radha Krishna UV");

	}

	@Test(dependsOnMethods ="HeaderPage",priority = 4)
	public void AirConditionorDetails() throws InterruptedException {

		et = er.createTest("AirConditionor Details");
		et.pass("open");

		sh = new StoreHomeOBJ(driver);

		sh.ACImage();
		sh.WindowsHandle();
		waitTime();
		logger.info("clicked on AC image");
		et.pass("clicked on AC image");

		scrollBottom();
		waitTime();
		sh.PhoneNumFooter();
		logger.info("Phone number is visible at footer");
		et.pass("Phone number is visible at footer");
		
		sh.UpwardArrow();
		logger.info("clicked upward arrow");
		et.pass("clicked upward arrow");
		
		waitTime();
		sh.SpurtLogo();
		logger.info("Clicked on SpurtLogo");
		et.pass("Clicked on SpurtLogo");

		sh.HomepageContact();
		logger.info("Launched home page");
		et.pass("Launched home page");

	}
	
	
	@Test(dependsOnMethods ="HeaderPage",priority = 5)
	public void VendorSignUp() throws InterruptedException {
		
		
		et = er.createTest("Vendor Sign Up details");
		et.pass("open");

		sh = new StoreHomeOBJ(driver);
		
		waitTime();
		sh.VendorBtn();
		logger.info("Launched vendor sign up page");
		et.pass("Launched vendor sign up page");
		
		sh.NameField();
		logger.info("Enterd name");
		et.pass("Enterd name");
		
		sh.LastNameField();
		logger.info("Updated Last name field");
		et.pass("Updated Last name field");
		
		sh.ContactPersonField();
		logger.info("Updated contact person field");
		et.pass("Updated contact person field");
		
		sh.EmailField();
		logger.info("Updated Email field");
		et.pass("Updated Email field");
		
		sh.CompanyNameField();
		logger.info("Updated company name");
		et.pass("Updated company name");
		
		sh.DisplayName();
		logger.info("Updated display name");
		et.pass("Updated display name");
		
		sh.MobileNumberField();
		logger.info("Updated Mobile number");
		et.pass("Updated Mobile number");
		
		sh.PasswordField();
		logger.info("Given password");
		et.pass("Given password");
		
		sh.ConfirmPassField();
		logger.info("Given confirm password");
		et.pass("Given confirm password");
		
		sh.TextBox();
		logger.info("Text box selected");
		et.pass("Text box selected");
		
		sh.VendorSubmitBtn();
		logger.info("Vendor form submitted");
		et.pass("Vendor form submitted");
		
		
	}
	
	
	@Test(dependsOnMethods ="HeaderPage",priority = 6)
	public void ProductSearchDetails() throws InterruptedException {
		

		et = er.createTest("Product Serach details");
		et.pass("open");

		sh = new StoreHomeOBJ(driver);
		
		sh.SearchTxttBox();
		logger.info("Enterd piccosoft");
		et.pass("Enterd piccosoft");	
		
		
		sh.PiccoImage();
		logger.info("Clicked on piccosoft image");
		et.pass("Clicked on piccosoft image");
		
		
	
		
		waitTime();
		sh.SpecificationBtn();
		logger.info("Clicked on specifcation button");
		et.pass("Clicked on specifcation button");
		
		waitTime();
		sh.SpecificationTxt();
		logger.info("Get no specification found assertion passed");
		et.pass("Get no specification found assertion passed");
		
		waitTime();
		sh.PostYourQues();
		logger.info("Clicked on Post your question button");
		et.pass("Clicked on Post your question button");
		
		waitTime();
		sh.WriteQuesTxtbox2();
		logger.info("Entered hii im specification page");
		et.pass("Entered hii im specification page");
		
		waitTime();
		sh.QuesSubmitBtn();
	    logger.info("Clicked on submit button");
	    et.pass("Clicked on submit button");
		
	    waitTime();
		sh.ReviewBtn();
		logger.info("Cliked on review button");
		et.pass("Cliked on review button");
		
		waitTime();
		sh.FooterCustomerTxt();
		logger.info("Get customer text from footer information");
		et.pass("Get customer text from footer information");
		
		
		
		
		waitTime();
		sh.CusQuestionAnsBtn();
		logger.info("Clicked Customer question answer button");
		et.pass("Clicked Customer question answer button");
		
		sh.CusQuestionAnsTxt();
		logger.info("Get no results found ");
		et.pass("Get no results found ");
		
		
	}
	
	
	
	
	

}


