package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ElectronicsOBJ {
	WebDriver driver;

	public ElectronicsOBJ(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);

	}

	/*
	 * locator for Electronics and LG smartTv
	 */

	@FindBy(xpath = "//button[contains(@class,'mat-focus-indicator mat-menu-trigger')]")
	@CacheLookup
	WebElement allCategories;

	@FindBy(xpath = "//*[contains(text(),'Electronics') and @role=\"menuitem\"]")
	@CacheLookup
	WebElement electronics;

	@FindBy(xpath = "//*[contains(text(),'Features Category') and @role=\"menuitem\"]")
	@CacheLookup
	WebElement featuresCategory;

	@FindBy(xpath = "//*[contains(text(),'Admin Sale Product') and @role=\"menuitem\"]")
	@CacheLookup
	WebElement adminSaleProduct;

	@FindBy(xpath = "//*[contains(text(),'Vendor Product') and @role=\"menuitem\"]")
	@CacheLookup
	WebElement vendorProduct;

	@FindBy(xpath = "//*[contains(text(),'Admin All Features Product') and @role=\"menuitem\"]")
	@CacheLookup
	WebElement AdminFeaturesProduct;

	@FindBy(xpath = "//*[contains(text(),'Vendor All Features Product') and @role=\"menuitem\"]")
	@CacheLookup
	WebElement vendorAllProduct;

	@FindBy(xpath = "//*[contains(text(),'Admin Product') and @role=\"menuitem\"]")
	@CacheLookup
	WebElement adminProduct;

	@FindBy(xpath = "(//button[@cdk-describedby-host=\"0\"])[3]")
	@CacheLookup
	WebElement favBtn;

	@FindBy(xpath = "(//button[@cdk-describedby-host=\"0\"])[4]")
	@CacheLookup
	WebElement quickView;

	@FindBy(xpath = "//button[@class=\"mat-focus-indicator mat-mini-fab mat-button-base mat-accent\"]")
	@CacheLookup
	WebElement qViewClsBtn;

	@FindBy(xpath = "(//a[@class=\"cart-btn\"])[2]")
	@CacheLookup
	WebElement addCartBtn;

	@FindBy(xpath = "//button[@mattooltip=\"Add\"]")
	@CacheLookup
	WebElement addQty;

	@FindBy(xpath = "//button[contains(text(),' Buy Now')]")
	@CacheLookup
	WebElement buynowBtn;

	@FindBy(xpath = "//h4[text()='Home']")
	@CacheLookup
	WebElement address;

	@FindBy(xpath = "(//span[@class=\"mat-radio-label-content\"])[6]")
	@CacheLookup
	WebElement cod;

	@FindBy(xpath = "//button[contains(text(), 'Place Order')]")
	@CacheLookup
	WebElement placeOrder;

	/*
	 * Method for Electronics and LG smartTv
	 * 
	 */

	public void allCategories() {

		allCategories.click();

	}

	public void electronics() {

		electronics.click();

	}

	public void featuresCategory() {

		featuresCategory.click();

	}

	public void adminSaleProduct() {

		adminSaleProduct.click();

	}

	public void addToFav() {
		favBtn.click();

	}

	public void removeToFav() {
		favBtn.click();

	}

	public void qView() {
		quickView.click();
	}

	public void qViewClose() {
		qViewClsBtn.click();
	}

	public void addToCart() {
		addCartBtn.click();
	}

	public void addQuantity() {
		addQty.click();
		addQty.click();
		addQty.click();
		addQty.click();

	}

	public void buyNow() {
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;

		executor1.executeScript("arguments[0].scrollIntoView(true);", buynowBtn);
		buynowBtn.click();
	
	}

	public void addAddress() {
		address.click();
	}

	public void payment() {
		cod.click();
		
	}

	public void placeOrd() {
		placeOrder.click();
	}

	/*
	 * locator for Mi SmartTv
	 * 
	 */

	@FindBy(xpath = "(//a[@class=\"cart-btn\"])[1]")
	@CacheLookup
	WebElement addMiTV;

	@FindBy(xpath = "//span[@class=\"mat-radio-label-content\" and contains(text(),' 2GB ')]")
	@CacheLookup
	WebElement gbVariant;

	@FindBy(xpath = "//button[contains(text(),'Add To Cart')]")
	@CacheLookup
	WebElement addCartButton;

	@FindBy(xpath = "//button[contains(text(),'Checkout')]")
	@CacheLookup
	WebElement checKOutButton;

	/*
	 * Method for Mi SmartTv
	 * 
	 */
	public void vendorPrdt() {
		vendorProduct.click();
	}

	public void addMi() throws InterruptedException {

 
		addMiTV.click();
	}

	public void addOneQnty() {
		addQty.click();
	}

	public void Slt2Gb() {
		gbVariant.click();
	}

	public void addcartMiTv() {
		addMiTV.click();
	}

	public void addCartBtn() {
		addCartButton.click();
	}

	public void checkOutBtn() {
		checKOutButton.click();
	}

	/*
	 * locator for Admin Varient
	 * 
	 */

	@FindBy(xpath = "(//span[@class=\"mat-tooltip-trigger compare-lk\"])[5]")
	@CacheLookup
	WebElement compareBtn;

	@FindBy(xpath = "(//a[@class=\"cart-btn\"])[5]")
	@CacheLookup
	WebElement addAV;

	@FindBy(xpath = "//span[@class=\"mat-radio-label-content\" and contains(text(),'red ')]")
	@CacheLookup
	WebElement redVarientCB;

	/*
	 * Method for Admin Varient
	 * 
	 */
	public void adminAllProduct() {
		AdminFeaturesProduct.click();
	}

	public void productCompare() {
		compareBtn.click();
	}

	public void addAdminVarient() {
		addAV.click();
	}

	public void addFourQty() {
		addQty.click();
		addQty.click();
		addQty.click();

	}

	public void redVarient() {
		redVarientCB.click();
	}

	/*
	 * locator for VendorQnA
	 * 
	 */

	@FindBy(xpath = "(//a[@class=\"cart-btn\"])[3]")
	@CacheLookup
	WebElement addVendorQnA;

	/*
	 * Method for VendorQnA
	 * 
	 */

	public void vendorAllProduct() {
		vendorAllProduct.click();
	}

	public void addCartVendorQnA() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;

		executor.executeScript("arguments[0].scrollIntoView(true);", addVendorQnA);
		addVendorQnA.click();

	
	}

	public void addEightQty() {
		addQty.click();
		addQty.click();
		addQty.click();
		addQty.click();
		addQty.click();
		addQty.click();
		addQty.click();

	}

	/*
	 * locator for VendorQnA
	 * 
	 */
	@FindBy(xpath = "(//mat-slider[@role=\"slider\"])[2]")
	@CacheLookup
	WebElement slider;
	
	@FindBy(xpath = "(//a[@class=\"cart-btn\"])[1]")
	@CacheLookup
	WebElement addCookWare;

	/*
	 * Method for VendorQnA 
	 * 
	 */

	public void adminProduct() {
		adminProduct.click();
	}

	public void priceSlider() {
		Actions act = new Actions(driver);
		act.dragAndDropBy(slider, 40, 40).build().perform();

	}
	
	public void addCartCookware() {
		
		addCookWare.click();
	}
	/*
	 * locator for Electronics
	 * 
	 */
	@FindBy(xpath = "//button[text()='Smart Wearables']")
	@CacheLookup
	WebElement SmartWearables;
	
	@FindBy(xpath = "//button[text()='Smart Watches']")
	@CacheLookup
	WebElement SmartWatches;
	@FindBy(xpath = "//button[text()='TVs Speaker']")
	@CacheLookup
	WebElement TVsSpeaker;
	
	@FindBy(xpath = "//button[text()='Sony Smart LED TV']")
	@CacheLookup
	WebElement SonySmartLedTV;
	
	@FindBy(xpath = "//button[text()='Mobile Accessories']")
	@CacheLookup
	WebElement MobileAccessories;
	
	@FindBy(xpath = "//button[text()='Mobile Cases']")
	@CacheLookup
	WebElement MobileCases;
	
	@FindBy(xpath = "//button[text()='Camera']")
	@CacheLookup
	WebElement Camera;
	
	@FindBy(xpath = "//button[text()='Sport action']")
	@CacheLookup
	WebElement SportAction;
	
	@FindBy(xpath = "//button[text()='Laptops']")
	@CacheLookup
	WebElement Laptops;
	
	@FindBy(xpath = "//button[text()='Gaming Laptop']")
	@CacheLookup
	WebElement GamingLaptop;
	
	@FindBy(xpath = "//button[text()='Mobiles']")
	@CacheLookup
	WebElement Mobiles;
	
	@FindBy(xpath = "//button[text()='I Phone']")
	@CacheLookup
	WebElement IPhone;
	
	@FindBy(xpath = "//button[text()=' Accessories']")
	@CacheLookup
	WebElement Accessories;
	
	@FindBy(xpath = "//button[text()='Hard Disk']")
	@CacheLookup
	WebElement HardDisk;
	
	@FindBy(xpath = "//button[text()='Speakers']")
	@CacheLookup
	WebElement Speakers;
	
	@FindBy(xpath = "//button[text()='Audio Speakers']")
	@CacheLookup
	WebElement AudioSpeakers;
	
	/*
	 * Methods fo electronics 
	 */
	public void SmartWearables() {

		SmartWearables.click();

	}

	public void SmartWatches() {

		SmartWatches.click();

	}
	

	/*
	 * Locators for Electronics smart wearable
	 */

	@FindBy(xpath = "//button[text()='Smart Wearables']")
	@CacheLookup
	WebElement smartwearablebtn;

	@FindBy(xpath = "//button[text()='Smart Watches']")
	@CacheLookup
	WebElement smartwatchesbtn;

	@FindBy(xpath = "//h2[text()='Seven Men Ultra  - Varient Product']")
	@CacheLookup
	WebElement smartwatchtxt;

	@FindBy(xpath = "//span[text()=' red ']")
	@CacheLookup
	WebElement redbtn;

	/*
	 * Methods for smart wearble
	 */

	public void SmartWearable() {
		smartwearablebtn.click();

	}

	public void SmartWatchBtn() {
		smartwatchesbtn.click();

	}

	public void SmartWatchtxt() {
		String wat = smartwatchtxt.getText();
		Assert.assertEquals(wat, "Seven Men Ultra - Varient Product");

	}

	public void RedVarient() {
		redbtn.click();

	}

	/*
	 * locators for tv speaker
	 */

	@FindBy(xpath = "//button[text()='TVs  Speaker']")
	@CacheLookup
	WebElement tvspeakerbtn;

	@FindBy(xpath = "//button[text()='Sony tv']")
	@CacheLookup
	WebElement sonytvbtn;

	@FindBy(xpath = "//p[text()='SKU:3426334623623-1']")
	@CacheLookup
	WebElement redmisku;

	/*
	 * Methods for tv speakers
	 */

	public void TvSpeakerBtn() {
		tvspeakerbtn.click();

	}

	public void SonytvBtn() {
		sonytvbtn.click();

	}

	public void RedmiSku() {
		String redm = redmisku.getText();
		Assert.assertEquals(redm, "SKU:3426334623623-1");

	}

	/*
	 * MobileAccessories locators
	 */

	@FindBy(xpath = "//button[text()='Mobile Accessories']")
	@CacheLookup
	WebElement mobileaccesorybtn;

	@FindBy(xpath = "//h2[text()='Flipkart SmartBuy Back Cover for Realme C25']")
	@CacheLookup
	WebElement covername;

	@FindBy(xpath = "//button[text()='Mobile Cases']")
	@CacheLookup
	WebElement mobilecasebtn;

	/*
	 * Methods for mobile accessories
	 */

	public void MobileAccessories() {
		mobileaccesorybtn.click();

	}

	public void Covername() {
		String cov = covername.getText();
		Assert.assertEquals(cov, "Flipkart SmartBuy Back Cover for Realme C25");

	}

	public void MobileCases() {
		mobilecasebtn.click();

	}

	/*
	 * Locators for camera
	 */

	@FindBy(xpath = "//button[text()='Camera']")
	@CacheLookup
	WebElement camerabtn;

	@FindBy(xpath = "//button[text()='DSLR  Mirrorless']")
	@CacheLookup
	WebElement dlsrmirrorbtn;

	@FindBy(xpath = "(//a[text()='Add to Cart '])[2]")
	@CacheLookup
	WebElement secondcartbtn;

	@FindBy(xpath = "//h2[text()='SJCAM SJ4000 WI-FI SJ4000 WIFI Sports and Action Camera (Black, 12 MP']")
	@CacheLookup
	WebElement cameranametxt;

	/*
	 * Methods for camera
	 */

	public void CameraOptn() {
		camerabtn.click();

	}

	public void DslrOption() {
		SportAction.click();

	}

	public void SecondCartBtn() {
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;

		executor1.executeScript("arguments[0].scrollIntoView(true);", secondcartbtn);
		secondcartbtn.click();
		//secondcartbtn.click();

	}

	public void CameraNametxt() {
		String came = cameranametxt.getText();
		Assert.assertEquals(came, "Fujifilm Instax Square SQ6 Instant Camera (Pearl White)");
	}

	/*
	 * Locators for Laptops/tablets
	 */

	@FindBy(xpath = "//button[text()='Laptops']")
	@CacheLookup
	WebElement laptopoptn;

	@FindBy(xpath = "//button[text()='Tablets']")
	@CacheLookup
	WebElement tabletsbtn;

	@FindBy(xpath = "//span[text()=' black ']")
	@CacheLookup
	WebElement blackradiobtn;

	@FindBy(xpath = "//h3[text()=' $ 1,650 ']")
	@CacheLookup
	WebElement tabletprice;

	/*
	 * Methods for laptops tablets
	 */

	public void LaptopOptn() {
		laptopoptn.click();

	}

	public void TabletsOptn() {
		tabletsbtn.click();

	}

	public void BlackRadioBtn() {
		blackradiobtn.click();

	}

	public void TabletPrice() {
		String tabp = tabletprice.getText();
		Assert.assertEquals(tabp, "$ 1,650");

	}

	/*
	 * Locators for mobiles samsung
	 */

	@FindBy(xpath = "//button[text()='Mobiles']")
	@CacheLookup
	WebElement mobileoptn;

	@FindBy(xpath = "//button[text()='Samsung']")
	@CacheLookup
	WebElement samsungoptn;

	@FindBy(xpath = "//h2[text()='Samsung Galaxy M32 5G ']")
	@CacheLookup
	WebElement samsungnametxt;

	/*
	 * Methods for mobiles/samsung
	 */

	public void MobileOption() {
		mobileoptn.click();

	}

	public void Samsungoptiopn() {
		samsungoptn.click();

	}

	public void SamsungNameTxt() {
		String samn = samsungnametxt.getText();
		Assert.assertEquals(samn, "Samsung Galaxy M32 5G");

	}

	/*
	 * locators for accessories
	 */

	@FindBy(xpath = "//button[text()=' Accessories']")
	@CacheLookup
	WebElement accessoriesopn;

	@FindBy(xpath = "//button[text()='Pendrives']")
	@CacheLookup
	WebElement pendrivebtn;

	@FindBy(xpath = "(//a[text()='Add to Cart '])[3]")
	@CacheLookup
	WebElement thirdelementcart;

	@FindBy(xpath = "//h2[text()='SanDisk Ultra Dual Drive Luxe Type C Flash Drive 128GB, 5Y - SDDDC4-128G-I35']")
	@CacheLookup
	WebElement pendrivetxt;

	/*
	 * Methods for Accessories/pendrive
	 */

	public void Accessoriesopn() {
		accessoriesopn.click();

	}

	public void PendriveOpn() {
		pendrivebtn.click();

	}

	public void ThirdElementCart() {
		thirdelementcart.click();

	}

	public void PendriveTxt() {
		String pend = pendrivetxt.getText();
		Assert.assertEquals(pend, "SanDisk Ultra Dual Drive Luxe Type C Flash Drive 128GB, 5Y - SDDDC4-128G-I35");

	}

	/*
	 * Locators for speakers/audiospeakers
	 */

	@FindBy(xpath = "//button[text()='Speakers']")
	@CacheLookup
	WebElement speakersoptn;

	@FindBy(xpath = "//button[text()='Audio Speakers']")
	@CacheLookup
	WebElement audiospeakeroptn;

	@FindBy(xpath = "//h3[text()=' $ 1,100 ']")
	@CacheLookup
	WebElement speakerprice;

	/*
	 * Methods for speakers/audio speakers
	 */

	public void SpeakersOpn() {
		speakersoptn.click();

	}

	public void AudioSpeakersOptn() {
		audiospeakeroptn.click();

	}

	public void SpeakerPrice() {
		String spe = speakerprice.getText();
		Assert.assertEquals(spe, "$ 1,100");

	}
	/*
	 * location for Smart Wearables
	 */
	@FindBy(xpath = "//button[text()='Smart Glasses']")
	@CacheLookup
	WebElement SmartGlasses;

	@FindBy(xpath = "//button[text()='Smart Band']")
	@CacheLookup
	WebElement SmartBand;

	@FindBy(xpath = "//button[text()='Sony Smart LED TV']")
	@CacheLookup
	WebElement SonySmartTV;

	@FindBy(xpath = "//button[text()='Home Theaters']")
	@CacheLookup
	WebElement HomeTheaters;

	@FindBy(xpath = "//button[text()='Television']")
	@CacheLookup
	WebElement Television;

	@FindBy(xpath = "//button[text()='Smart LED TV']")
	@CacheLookup
	WebElement SmartLEDTV;

	@FindBy(xpath = "//button[text()='TV wall Mount']")
	@CacheLookup
	WebElement TVwallMount;
	
	@FindBy(xpath = "//button[text()='Pluto Accessory']")
	@CacheLookup
	WebElement PlutoAccessory;

	@FindBy(xpath = "//button[text()='Speaker']")
	@CacheLookup
	WebElement SpeakerList;

	@FindBy(xpath = "//button[text()='Smart Headphone']")
	@CacheLookup
	WebElement SmartHeadphone;
	
	@FindBy(xpath = "//p[text()=' $ 700']")
	@CacheLookup
	WebElement SuroskiePrice;
	
	@FindBy(xpath = "(//a[@class='cart-btn'])[1]")
	@CacheLookup
	WebElement firstcartBtn;

	@FindBy(xpath = "//p[text()='SKU:ASG002']")
	@CacheLookup
	WebElement SuroskieSKU;

	@FindBy(xpath = "//button[text()=' Buy Now']")
	@CacheLookup
	WebElement primaryBuyNow;
	
	@FindBy(xpath = "//p[text()=' $ 2,500']")
	@CacheLookup
	WebElement onePlusBandPrice;
	
	@FindBy(xpath = "//p[text()='SKU:onpb001']")
	@CacheLookup
	WebElement oneplusSKU;
	
	@FindBy(xpath = "(//p[text()=' $ 500'])[1]")
	@CacheLookup
	WebElement motorolaTvPrice;
	
	@FindBy(xpath = "//p[text()='SKU:6434564634563-1']")
	@CacheLookup
	WebElement motorolaTvSKU;
	
	
	
	public void SmartGlasses() {
		SmartGlasses.click();

	}
	


	public void firstcartBtn() {
		firstcartBtn.click();

	}

	public void SuroskiePrice() {
		String spe = SuroskiePrice.getText();
		Assert.assertEquals(spe, "$ 700");

	}
	
	public void onePlusBandPrice() {
		String spe = onePlusBandPrice.getText();
		Assert.assertEquals(spe, "$ 2,500");

	}
	
	public void SuroskieSKU() {
		String spe = SuroskieSKU.getText();
		Assert.assertEquals(spe, "SKU:ASG002");

	}
	
	public void onePlusSKU() {
		String spe = oneplusSKU.getText();
		Assert.assertEquals(spe, "SKU:onpb001");

	}
	
	public void primaryBuyNow() {
		primaryBuyNow.click();

	}
	
	public void SmartBand() {
		SmartBand.click();

	}

	public void SonySmartLedTV() {
		SonySmartLedTV.click();

	}
	
	public void motorolaTvPrice() {
		String spe = motorolaTvPrice.getText();
		Assert.assertEquals(spe, "$ 500");

	}
	public void motorolaTvSKU() {
		String spe = motorolaTvSKU.getText();
		Assert.assertEquals(spe, "SKU:6434564634563-1");

	}
	
	/*
	 * locators for speaker
	 */
	@FindBy(xpath = "//h2[text()='Boat Speakers']")
	@CacheLookup
	WebElement speakerTit;
	
	@FindBy(xpath = "//p[text()=' $ 5,800']")
	@CacheLookup
	WebElement speakerPrice;
	
	@FindBy(xpath = "//p[text()='SKU:BOAT2020']")
	@CacheLookup
	WebElement speakerSKU;
	
	/*
	 * methods for speaker
	 */
	public void HomeTheaters() {
		HomeTheaters.click();

	}

	public void boatspeakerTit() {
		String spe = speakerTit.getText();
		Assert.assertEquals(spe, "Boat Speakers");

	}
	
	public void boatspeakerSKU() {
		String spe = speakerSKU.getText();
		Assert.assertEquals(spe, "SKU:BOAT2020");

	}
	public void boatSpeakerPrice() {
		String spe = speakerPrice.getText();
		Assert.assertEquals(spe, "$ 5,800");

	}
	
	/*
	 * locators for tv
	 */
	@FindBy(xpath = "//h2[text()='Sony Bravia 80 cm (32 inches) HD Ready Smart LED Google TV KD-32W820K (Black) (2022 Model) | with Alexa Compatibility']")
	@CacheLookup
	WebElement sonyTvTit;
	
	@FindBy(xpath = "//p[text()=' $ 15,999']")
	@CacheLookup
	WebElement sonyTvPrice;
	
	@FindBy(xpath = "//p[text()='SKU:sony1231']")
	@CacheLookup
	WebElement sonyTvSKU;
	
	/*
	 * methods for sonyTv
	 */
	public void TelevisionList() {
		Television.click();

	}

	public void sonyTvTit() {
		String spe = sonyTvTit.getText();
		Assert.assertEquals(spe, "Sony Bravia 80 cm (32 inches) HD Ready Smart LED Google TV KD-32W820K (Black) (2022 Model) | with Alexa Compatibility");

	}
	
	public void sonyTvSKU() {
		String spe = sonyTvSKU.getText();
		Assert.assertEquals(spe, "SKU:sony1231");

	}
	public void sonyTvPrice() {
		String spe = sonyTvPrice.getText();
		Assert.assertEquals(spe, "$ 15,999");

	}
	
	/*
	 * locators for amazon tv
	 */
	@FindBy(xpath = "//h2[text()='Amazon Basics 80cm (32 inch) HD Ready Smart LED Fire TV AB32E10SS (Black) (2020 Model)']")
	@CacheLookup
	WebElement amazonTvTit;
	
	@FindBy(xpath = "//p[text()=' $ 18,689']")
	@CacheLookup
	WebElement amazonTvPrice;
	
	@FindBy(xpath = "//p[text()='SKU:1122334455-1']")
	@CacheLookup
	WebElement amazonTvSKU;
	
	/*
	 * methods for amazonTv
	 */
	public void SmartLEDTVList() {
		SmartLEDTV.click();

	}

	public void amazonTvTit() {
		String spe = amazonTvTit.getText();
		Assert.assertEquals(spe, "Amazon Basics 80cm (32 inch) HD Ready Smart LED Fire TV AB32E10SS (Black) (2020 Model)");

	}
	
	public void amazonTvSKU() {
		String spe = amazonTvSKU.getText();
		Assert.assertEquals(spe, "SKU:1122334455-1");

	}
	public void amazonTvPrice() {
		String spe = amazonTvPrice.getText();
		Assert.assertEquals(spe, "$ 18,689");

	}
	
	/*
	 * locators for TvWallMount
	 */
	@FindBy(xpath = "//h2[text()='HOJI® Heavy Duty']")
	@CacheLookup
	WebElement HOJITit;
	
	@FindBy(xpath = "//p[text()=' $ 399']")
	@CacheLookup
	WebElement HOJIPrice;
	
	@FindBy(xpath = "//p[text()='SKU:SKU475678']")
	@CacheLookup
	WebElement HOJISKU;
	
	/*
	 * methods for amazonTv
	 */
	public void TVwallMountList() {
		TVwallMount.click();

	}

	public void HOJITit() {
		String spe = HOJITit.getText();
		Assert.assertEquals(spe, "HOJI® Heavy Duty");

	}
	
	public void HOJISKU() {
		String spe = HOJISKU.getText();
		Assert.assertEquals(spe, "SKU:SKU475678");

	}
	public void HOJIPrice() {
		String spe = HOJIPrice.getText();
		Assert.assertEquals(spe, "$ 399");

	}
	
	/*
	 * locators for pluto
	 */
	@FindBy(xpath = "//h2[text()='Pluto Accessories Pure Copper 3 RCA - 3 RCA Composite Audio Video AV Cable TV LCD LED DTH - 10m']")
	@CacheLookup
	WebElement plutoTit;
	
	@FindBy(xpath = "//p[text()=' $ 449']")
	@CacheLookup
	WebElement plutoPrice;
	
	@FindBy(xpath = "//p[text()='SKU:SKU67562']")
	@CacheLookup
	WebElement plutoSKU;
	
	/*
	 * methods for pluto
	 */
	public void PlutoAccessoryList() {
		PlutoAccessory.click();

	}

	public void plutoTit() {
		String spe = plutoTit.getText();
		Assert.assertEquals(spe, "Pluto Accessories Pure Copper 3 RCA - 3 RCA Composite Audio Video AV Cable TV LCD LED DTH - 10m");

	}
	
	public void plutoSKU() {
		String spe = plutoSKU.getText();
		Assert.assertEquals(spe, "SKU:SKU67562");

	}
	public void plutoPrice() {
		String spe = plutoPrice.getText();
		Assert.assertEquals(spe, "$ 449");

	}
	/*
	 * locators for speakerPrt
	 */
	@FindBy(xpath = "//h2[text()='SPEAKER']")
	@CacheLookup
	WebElement speakerPrtTit;
	
	@FindBy(xpath = "//p[text()=' $ 500']")
	@CacheLookup
	WebElement speakerPrtPrice;
	
	@FindBy(xpath = "//p[text()='SKU:SKU8457634896']")
	@CacheLookup
	WebElement speakerPrtSKU;
	
	/*
	 * methods for pluto
	 */
	public void SpeakerList() {
		SpeakerList.click();

	}

	public void speakerPrtTit() {
		String spe = speakerPrtTit.getText();
		Assert.assertEquals(spe, "SPEAKER");

	}
	
	public void speakerPrtSKU() {
		String spe = speakerPrtSKU.getText();
		Assert.assertEquals(spe, "SKU:SKU8457634896");

	}
	public void speakerPrtPrice() {
		String spe = speakerPrtPrice.getText();
		Assert.assertEquals(spe, "$ 500");

	}
	
	/*
	 * locators for Acid Eye
	 */
	@FindBy(xpath = "//h2[text()='Acid Eye Blue Bluetooth Headphone SH-12 Smart Headphones (Wireless)']")
	@CacheLookup
	WebElement AcidEyeTit;
	
	@FindBy(xpath = "//p[text()=' $ 800']")
	@CacheLookup
	WebElement AcidEyePrice;
	
	@FindBy(xpath = "//p[text()='SKU:EH001302']")
	@CacheLookup
	WebElement AcidEyetSKU;
	
	/*
	 * methods for AcidEye
	 */
	public void SmartHeadphoneList() {
		SmartHeadphone.click();

	}

	public void AcidEyeTit() {
		String spe = AcidEyeTit.getText();
		Assert.assertEquals(spe, "Acid Eye Blue Bluetooth Headphone SH-12 Smart Headphones (Wireless)");

	}
	
	public void AcidEyetSKU() {
		String spe = AcidEyetSKU.getText();
		Assert.assertEquals(spe, "SKU:EH001302");

	}
	public void AcidEyePrice() {
		String spe = AcidEyePrice.getText();
		Assert.assertEquals(spe, "$ 800");

	}
	@FindBy(xpath = "//span[text()='item is Out of stock']")
	@CacheLookup
	public
	static
	WebElement orderOutOfStock;
	
	@FindBy(xpath = "//span[text()='You have successfully placed order. order details sent to your mail']")
	@CacheLookup
	public
	static
	WebElement orderPlaced;
	
	
}


