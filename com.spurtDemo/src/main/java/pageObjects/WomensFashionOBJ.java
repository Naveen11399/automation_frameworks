package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WomensFashionOBJ {

	WebDriver driver;

	public WomensFashionOBJ(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);

	}

	/*
	 * locator for womensFashion
	 */

	@FindBy(xpath = "//*[contains(text(),'Womens Fashion') and @role=\"menuitem\"]")
	@CacheLookup
	WebElement womensFashion;

	@FindBy(xpath = "//*[contains(text(),'Beauty & Grooming') and @role=\"menuitem\"]")
	@CacheLookup
	WebElement BeautyNGrooming;

	@FindBy(xpath = "//*[contains(text(),'SunScreenLotion') and @role=\"menuitem\"]")
	@CacheLookup
	WebElement SunScreenLotion;

	@FindBy(xpath = "(//button[@cdk-describedby-host])[3]")
	@CacheLookup
	WebElement favLakme;

	@FindBy(xpath = "(//a[@class=\"cart-btn\"])[2]")
	@CacheLookup
	WebElement addCartLakme;

	@FindBy(xpath = "//p[contains(text(),'SKU:SKU347623483489')]")
	@CacheLookup
	WebElement Sku;

	/*
	 * Method For WomanFashion
	 */

	public void womensFashion() {

		womensFashion.click();

	}

	public void BeautyNGrooming() {

		BeautyNGrooming.click();

	}

	public void SunScreenLotion() {

		SunScreenLotion.click();

	}

	public void verifySKU() {

		String actTit = Sku.getText();

		Assert.assertEquals(actTit, "SKU:SKU347623483489");

	}

	public void addTofavLakme() {

		favLakme.click();

	}

	public void addCartLakme() {

		addCartLakme.click();

	}

	/*
	 * locator for Hair
	 */
	@FindBy(xpath = "//*[contains(text(),'Hair Care') and @role=\"menuitem\"]")
	@CacheLookup
	WebElement hairCare;

	@FindBy(xpath = "//a[@class=\"title text-truncate\"]")
	@CacheLookup
	WebElement title;
	
	@FindBy(xpath = "//a[contains(text(),'Add to Cart ')]")
	@CacheLookup
	public
	WebElement cartBtn;
	
	@FindBy(xpath = "//*[contains(text(),'Post Your Question') ]")
	@CacheLookup
	WebElement askQnsBtn;
	
	@FindBy(xpath = "//*[@placeholder=\"Write your question here\"]")
	@CacheLookup
	WebElement askQnsBox;
	
	@FindBy(xpath = "(//button[@type=\"button\"])[3]")
	@CacheLookup
	WebElement askQnsSubmit;
	
	@FindBy(xpath = "//*[@class=\"mat-focus-indicator mat-icon-button mat-button-base\"]")
	@CacheLookup
	WebElement ask;

	/*
	 * Method for Hair
	 */
	public void hairCareList() {

		hairCare.click();

	}
	
	public void verifyTitle() {

		String actTitle = title.getText();

		System.out.println(actTitle);

		Assert.assertEquals(actTitle, "Dove Intense Repair Shampoo (180 ml)");

	}
	
	public void addCartShampoo() {

		
		cartBtn.click();

	}
	
public void askQnBtn() {

		
		askQnsBox.sendKeys("whats is the  price ?");;
          askQnsSubmit.click();;
	}
public void postQnsssBtn() {
askQnsBtn.click();
	}
public void griddu() {
ask.click();
}
/*
 * locator for skinCare
 */
@FindBy(xpath = "//*[contains(text(),'Skin Care') and @role=\"menuitem\"]")
@CacheLookup
WebElement skinCare;

@FindBy(xpath = "//*[contains(text(),'Body Lotion') and @role=\"menuitem\"]")
@CacheLookup
WebElement bodylotion;

@FindBy(xpath = "(//p[@class=\"new-price\"])[1]")
@CacheLookup
WebElement lotionPrice;


@FindBy(xpath = "(//a[@class=\"cart-btn\"])[1]")
@CacheLookup
WebElement addCartlotion;

/*
 *method  for skinCare
 */
public void skinCareList() {
skinCare.click();
}
public void bodyLotionList() {
	bodylotion.click();
	}
public void verifyPrice() {

	String actTitle1 = lotionPrice.getText();

	System.out.println(actTitle1);

	Assert.assertEquals(actTitle1, "$ 275");

}

public void bodyLotionCartBtn() {
	driver.navigate().to("http://3.6.249.0/products/productdetails/nivea-body-lotion-aloe-hydration-with-aloe-vera-for-men-women-400-ml");
	}

/*
 * locator for Sandals
 */

@FindBy(xpath = "//*[contains(text(),'Sandals') and @role=\"menuitem\"]")
@CacheLookup
WebElement sandals;

@FindBy(xpath = "//*[contains(text(),'Flats') and @role=\"menuitem\"]")
@CacheLookup
WebElement slippers;

@FindBy(xpath = "(//p[@class=\"new-price\"])[2]")
@CacheLookup
WebElement sandalPrice;

@FindBy(xpath = "//a[text()='Add to Cart ']")
@CacheLookup
WebElement sandalCart;
/*
 * Method for Sandals
 */

public void sandalsList() {
sandals.click();
}
public void slippersList() {
	slippers.click();
	}
public void slipperPrice() {

	String actprice = sandalPrice.getText();

	System.out.println(actprice);

	Assert.assertEquals(actprice, "$ 432");

}

public void slipperCartBtn() {
	driver.navigate().to("http://3.6.249.0/products/productdetails/women-black-flats");
  //sandalCart.click();
	}


/*
* locator for Accessories
*/

@FindBy(xpath = "//*[contains(text(),'Accessories') and @role=\"menuitem\"]")
@CacheLookup
WebElement Accessories;

@FindBy(xpath = "//*[contains(text(),'Handkerchief') and @role=\"menuitem\"]")
@CacheLookup
WebElement kerchief;

@FindBy(xpath = "(//p[@class=\"new-price\"])[2]")
@CacheLookup
WebElement kerchiefPrice;

@FindBy(xpath = "(//a[text()='Add to Cart '])[2]")
@CacheLookup
WebElement kerchiefCart;
/*
* Method for Accessories
*/

public void AccessoriesList() {
Accessories.click();
}
public void kerchiefList() {
	kerchief.click();
	}
public void kerchiefPrice() {

	String actprice = kerchiefPrice.getText();

	System.out.println(actprice);

	Assert.assertEquals(actprice, "$ 595");

}

public void kerchiefCartBtn() {
  driver.navigate().to("http://3.6.249.0/products/productdetails/uber-world-handkerchiefs-for-women-girls-and-kids-cotton-double-layered-25x25-cms-multicolour?categorySlug=handkerchief1");
	}

/*
* locator for Ethnic Wear

*/

@FindBy(xpath = "//*[contains(text(),'Ethnic Wear') and @role=\"menuitem\"]")
@CacheLookup
WebElement EthnicWear;

@FindBy(xpath = "//*[contains(text(),'Ghagra Choli') and @role=\"menuitem\"]")
@CacheLookup
WebElement GhagraCholi;

@FindBy(xpath = "(//p[@class=\"new-price\"])[2]")
@CacheLookup
WebElement GhagraCholiPrice;

@FindBy(xpath = "(//a[text()='Add to Cart '])[2]")
@CacheLookup
WebElement GhagraCholiCart;
/*
* Method for EthnicWea
*/

public void EthnicWear() {
EthnicWear.click();
}
public void GhagraCholiList() {
	GhagraCholi.click();
	}
public void GhagraCholiPrice() {

	String actprice = GhagraCholiPrice.getText();

	System.out.println(actprice);

	Assert.assertEquals(actprice, "$ 730");

}

public void GhagraChoCartBtn() {
  GhagraCholiCart.click();
	}


/*
* locator for Women Sarees

*/

@FindBy(xpath = "//*[contains(text(),'Women Sarees') and @role=\"menuitem\"]")
@CacheLookup
WebElement WomenSarees;

@FindBy(xpath = "//*[contains(text(),'Silk Sarees') and @role=\"menuitem\"]")
@CacheLookup
WebElement CottonSarees;

@FindBy(xpath = "(//p[@class=\"new-price\"])[2]")
@CacheLookup
WebElement BanarasiSareePrice;

@FindBy(xpath = "//a[text()='Add to Cart '])[2]")
@CacheLookup
public
WebElement BanarasiSareeCart;
/*
* Method for EthnicWea
*/

public void WomenSarees() {
WomenSarees.click();
}
public void CottonSareesList() {
	CottonSarees.click();
	}
public void BanarasiSareePrice() {

	String actprice = BanarasiSareePrice.getText();

	System.out.println(actprice);

	Assert.assertEquals(actprice, "$ 100");

}

public void BanarasiSareeCartBtn1() {
	driver.navigate().to("http://3.6.249.0/products/productdetails/kanchipuram-saree");
 // BanarasiSareeCart.click();
	}




}