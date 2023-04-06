package TestCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.HomeFurnitureOBJ;

public class HomeFurnitureTC extends BaseClass {

	@Test(priority = 0)
	public void HomeLightDetails() throws InterruptedException {

		et = er.createTest("Home Light");
		et.pass("open");

		hf = new HomeFurnitureOBJ(driver);
		storeLogin();
		loginSetUp();
		waitTime();
		hf.Allcategory();
		logger.info("Allcategory option");
		et.pass("Allcategory option");

		hf.HomeFurniture();

		logger.info("HomeFurniture option");
		et.pass("HomeFurniture option");

		hf.HomeLight();

		logger.info("HomeLight option");
		et.pass("HomeLight option");
		waitTimeMin();
		hf.WallLamp();

		logger.info("Wall lamp option");
		et.pass("Wall lamp option");

		hf.FirstProduct();
		logger.info("first product added to cart");
		et.pass("first product added to cart");

		hf.Addquantity();
		logger.info("quantity added");
		et.pass("quantity added");

		hf.LampTxt();

		logger.info("Get himalaya product text");
		et.pass("Get himalaya product text");

		hf.AddtoCart();
		logger.info("clicked add to cart");
		et.pass("clicked add to cart");

		hf.CheckOut();
		logger.info("clicked checkout option");
		et.pass("clicked checkout option");

		waitTime();
		scrollDown();
		hf.CashonDelivery();
		logger.info("cashondelivery clicked");
		et.pass("cashondelivery clicked");

		hf.Addaddress();
		logger.info(" address added");
		et.pass(" address added");

		hf.PlaceOrder();
		logger.info(" Order placed");
		et.pass(" Order placed");

	}

	@Test(dependsOnMethods = "HomeLightDetails", priority = 1)
	public void HomeDecordetails() throws InterruptedException {

		et = er.createTest("Home Decor");
		et.pass("open");

		hf = new HomeFurnitureOBJ(driver);
		waitTime();
		hf.Allcategory();
		logger.info("Allcategory option");
		et.pass("Allcategory option");

		hf.HomeFurniture();
		logger.info("HomeFurniture option");
		et.pass("HomeFurniture option");
		waitTimeMin();
		hf.HomeDecor();
		logger.info("Home decor option");
		et.pass("Home decor option");

		hf.Clocks();
		logger.info("clocks option");
		et.pass("clocks option");
		waitTimeMax();
		hf.Secondelmntcart();
		logger.info("second element added to cart");
		et.pass("second element added to cart");

		hf.ClockPrice();
		logger.info("Got clock price");
		et.pass("Got clock price");

		hf.BuyNow();
		logger.info("Buy now clicked");
		et.pass("Buy now clicked");

		waitTime();
		scrollDown();
		hf.CashonDelivery();
		logger.info("cashondelivery clicked");
		et.pass("cashondelivery clicked");

		hf.Addaddress();
		logger.info(" address added");
		et.pass(" address added");

		hf.PlaceOrder();
		logger.info(" Order placed");
		et.pass(" Order placed");

	}

	@Test(dependsOnMethods = "HomeLightDetails", priority = 2)
	public void KitchenCookware() throws InterruptedException {

		et = er.createTest("Kitchen Cookware");
		et.pass("open");

		hf = new HomeFurnitureOBJ(driver);
		waitTime();
		hf.Allcategory();
		logger.info("Allcategory option");
		et.pass("Allcategory option");

		hf.HomeFurniture();
		logger.info("HomeFurniture option");
		et.pass("HomeFurniture option");

		hf.KitchenCookware();
		logger.info("Kitchen cookware option");
		et.pass("Kitchen cookware option");

		hf.Pans();
		logger.info("Pans option");
		et.pass("Pans option");

		waitTime();
		// useEW(hf.Secondelmntcart());
		// waitTimeMax();
		hf.expWait();
		// hf.Secondelmntcart();
		// logger.info("second element added to cart");
		// et.pass("second element added to cart");

		hf.PanSku();
		logger.info("Got pan SKU number");
		et.pass("Got pan SKU number");

		hf.Addquantity();
		logger.info("quantity added");
		et.pass("quantity added");

		hf.AddtoCart();
		logger.info("clicked add to cart");
		et.pass("clicked add to cart");

		hf.CheckOut();
		logger.info("clicked checkout option");
		et.pass("clicked checkout option");

		waitTime();
		scrollDown();
		hf.CashonDelivery();
		logger.info("cashondelivery clicked");
		et.pass("cashondelivery clicked");

		hf.Addaddress();
		logger.info(" address added");
		et.pass(" address added");

		hf.PlaceOrder();
		logger.info(" Order placed");
		et.pass(" Order placed");

	}

	@Test(dependsOnMethods = "HomeLightDetails", priority = 3)
	public void KitchenStorage() throws InterruptedException {

		et = er.createTest("Kitchen Storage");
		et.pass("open");

		hf = new HomeFurnitureOBJ(driver);
		waitTime();
		hf.Allcategory();
		logger.info("Allcategory option");
		et.pass("Allcategory option");

		hf.HomeFurniture();
		logger.info("HomeFurniture option");
		et.pass("HomeFurniture option");

		hf.KitchenStorage();
		logger.info("Clcked Kitchen storage option");
		et.pass("Clcked Kitchen storage option");

		hf.LunchBox();
		logger.info("Clicked lunch box Option option");
		et.pass("Clicked lunch box Option option");

		// useEW(hf.Secondelmntcart());
		waitTime();
		hf.Secondelmntcart();
		logger.info("second  product added to cart");
		et.pass("second product added to cart");

		hf.LunchBoxTxt();
		logger.info("Get lunchbox text");
		et.pass("Get lunchbox text");

		hf.Addquantity();
		logger.info("quantity added");
		et.pass("quantity added");

		hf.AddtoCart();
		logger.info("clicked add to cart");
		et.pass("clicked add to cart");

		hf.CheckOut();
		logger.info("clicked checkout option");
		et.pass("clicked checkout option");

		waitTime();
		scrollDown();
		hf.CashonDelivery();
		logger.info("cashondelivery clicked");
		et.pass("cashondelivery clicked");

		hf.Addaddress();
		logger.info(" address added");
		et.pass(" address added");

		hf.PlaceOrder();
		logger.info(" Order placed");
		et.pass(" Order placed");

	}

	@Test(dependsOnMethods = "HomeLightDetails", priority = 4)
	public void Tableware() throws InterruptedException {

		et = er.createTest("Table Ware");
		et.pass("open");

		hf = new HomeFurnitureOBJ(driver);
		waitTime();
		hf.Allcategory();
		logger.info("Allcategory option");
		et.pass("Allcategory option");

		hf.HomeFurniture();
		logger.info("HomeFurniture option");
		et.pass("HomeFurniture option");

		hf.Tableware();
		logger.info("Table ware option");
		et.pass("Table ware option");

		hf.DinnerSet();
		logger.info("Dinner Set option");
		et.pass("Dinner Set option");
		waitTime();
		waitTime();

		hf.useExpWait();

		hf.DinnerSetPrice();
		logger.info("Got dinnerset price");
		et.pass("Got dinnerset price");

		hf.BuyNow();
		logger.info("Buy now clicked");
		et.pass("Buy now clicked");

		waitTime();
		scrollDown();
		hf.CashonDelivery();
		logger.info("cashondelivery clicked");
		et.pass("cashondelivery clicked");

		hf.Addaddress();
		logger.info(" address added");
		et.pass(" address added");

		hf.PlaceOrder();
		logger.info(" Order placed");
		et.pass(" Order placed");
	}

	@Test(dependsOnMethods = "HomeLightDetails", priority = 5)
	public void LivngRoomDetails() throws InterruptedException {

		et = er.createTest("Living Room Details");
		et.pass("open");

		hf = new HomeFurnitureOBJ(driver);
		waitTime();
		hf.Allcategory();
		logger.info("Allcategory option");
		et.pass("Allcategory option");

		hf.HomeFurniture();
		logger.info("HomeFurniture option");
		et.pass("HomeFurniture option");
		waitTimeMin();
		hf.LivingRoombtn();
		logger.info("Livingroom  option");
		et.pass("Livingroom  option");

		hf.SofaBtn();
		logger.info("Sofa option");
		et.pass("Sofa option");
		waitTime();
		hf.Secondelmntcart();
		logger.info("second  product added to cart");
		et.pass("second product added to cart");

		hf.SofaText();
		logger.info("Get sofa text");
		et.pass("Get sofa text");

		hf.BuyNow();
		logger.info("Buy now clicked");
		et.pass("Buy now clicked");

		waitTime();
		scrollDown();
		hf.CashonDelivery();
		logger.info("cashondelivery clicked");
		et.pass("cashondelivery clicked");

		hf.Addaddress();
		logger.info(" address added");
		et.pass(" address added");

		hf.PlaceOrder();
		logger.info(" Order placed");
		et.pass(" Order placed");

	}

	@Test(dependsOnMethods = "HomeLightDetails", priority = 6)
	public void BedRoomFun() throws InterruptedException {

		et = er.createTest("Bed Room");
		et.pass("open");

		hf = new HomeFurnitureOBJ(driver);
		waitTime();
		hf.Allcategory();
		logger.info("Allcategory option");
		et.pass("Allcategory option");

		hf.HomeFurniture();
		logger.info("HomeFurniture option");
		et.pass("HomeFurniture option");

		hf.BedRoom();
		logger.info("HomeFurniture option");
		et.pass("HomeFurniture option");
		waitTimeMin();
		hf.Beds();
		logger.info("HomeFurniture option");
		et.pass("HomeFurniture option");

		hf.FirstProduct();
		logger.info("first product added to cart");
		et.pass("first product added to cart");

		hf.BedText();
		logger.info("HomeFurniture option");
		et.pass("HomeFurniture option");

		hf.BuyNow();
		logger.info("Buy now clicked");
		et.pass("Buy now clicked");

		waitTime();
		scrollDown();
		hf.CashonDelivery();
		logger.info("cashondelivery clicked");
		et.pass("cashondelivery clicked");

		hf.Addaddress();
		logger.info(" address added");
		et.pass(" address added");

		hf.PlaceOrder();
		logger.info(" Order placed");
		et.pass(" Order placed");

	}

	@Test(dependsOnMethods = "HomeLightDetails", priority = 7)
	public void PetSupplyFun() throws InterruptedException {

		et = er.createTest("Pet Supply");
		et.pass("open");

		hf = new HomeFurnitureOBJ(driver);
		waitTime();
		hf.Allcategory();
		logger.info("Allcategory option");
		et.pass("Allcategory option");

		hf.HomeFurniture();
		logger.info("HomeFurniture option");
		et.pass("HomeFurniture option");

		hf.PetSupplies();
		logger.info("HomeFurniture option");
		et.pass("HomeFurniture option");

		hf.Dogs();
		logger.info("HomeFurniture option");
		et.pass("HomeFurniture option");
		waitTime();
		hf.NoResultMsg();
		logger.info("contact option");
		et.pass("contact option");
//				hf.Contact();
//				logger.info("contact option");
//				et.pass("contact option");
//
//				hf.Submit();
//				logger.info("Submit button clicked");
//				et.pass("Submit button clicked");
//
//				hf.NameAsrt();
//				
//				logger.info("Passed Name Assert");
//				et.pass("Passed Name Assert");
//
//				hf.EmailAsrt();
//				
//				logger.info("Get emailerror assertion passed");
//				et.pass("Get emailerror assertion passed");
//
//				hf.PhoneAsrt();
//				
//				logger.info("Get phone error assertion passed");
//				et.pass("Get phone error assertion passed");
//
//				hf.MessageAsrt();
//				
//				logger.info("Get Message error assertion passed");
//				et.pass("Get Message error assertion passed");
//
//				hf.Name();
//				logger.info("Name option");
//				et.pass("Name option");
//
//				hf.Email();
//				logger.info("Email option");
//				et.pass("Email option");
//
//				hf.Phone();
//				logger.info("phone option");
//				et.pass("phone option");
//
//				hf.Message();
//				logger.info("Message option");
//				et.pass("Message option");
//
//				
//				

	}

}
