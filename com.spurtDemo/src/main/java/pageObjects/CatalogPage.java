package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class CatalogPage {
	WebDriver driver;

	public CatalogPage(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);

	}
	/*
	 * locator for catalog page
	 */

	@FindBy(xpath = "//a[@href=\"#/catalog\"]")
	@CacheLookup
	WebElement catalog;

	@FindBy(xpath = "//button[@class=\"button-reg primary\"]")
	@CacheLookup
	WebElement addProduct;

	@FindBy(xpath = "//input[@placeholder=\" Product Name\"]")
	@CacheLookup
	WebElement productName;

	@FindBy(xpath = "//input[@placeholder=\"SKU Number\"]")
	@CacheLookup
	WebElement skuNumber;

	@FindBy(xpath = "//body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]")
	@CacheLookup
	WebElement description;

	@FindBy(id = "ngb-nav-1")
	@CacheLookup
	WebElement data;

	@FindBy(xpath = "//input[@placeholder=\"Quantity\"]")
	@CacheLookup
	WebElement quantity;

	@FindBy(xpath = "//div[@role=\"combobox\"]")
	@CacheLookup
	WebElement status;

	@FindBy(xpath = "//div[@class=\"ng-dropdown-panel-items scroll-host\"]")
	@CacheLookup
    WebElement enabled;

	@FindBy(xpath = "//*[@placeholder=\"dd/mm/yyyy\"]")
	@CacheLookup
	WebElement calendar;

	@FindBy(xpath = "//*[@title=\"Next month\"]")
	@CacheLookup
	WebElement nxtMonthBtn;

	@FindBy(xpath = "//div[contains(text(),'27')]")
	@CacheLookup
	WebElement date;

	@FindBy(xpath = "//*[@placeholder=\" Sort Order\"]")
	@CacheLookup
	WebElement sortOrder;

	@FindBy(xpath = "//a[contains(text(),'Images')]")
	@CacheLookup
	WebElement images;

	@FindBy(xpath = "//div[@class=\"img-dflt\"]")
	@CacheLookup
	WebElement addImage;

	@FindBy(xpath = "//*[@value=\"800px_COLOURBOX25368645_1651642232568.jpeg\"]")
	@CacheLookup
	WebElement uploadImg;

	@FindBy(xpath = "//a[contains(text(),' Insert ')]")
	@CacheLookup
	WebElement insertBtn;

	@FindBy(xpath = "//a[contains(text(),'Price')]")
	@CacheLookup
	WebElement price;

	@FindBy(xpath = "//*[contains(text(),' Default Price ')]")
	@CacheLookup
	WebElement defalutPrice;

	@FindBy(xpath = "//input[@formcontrolname=\"productPrice\"]")
	@CacheLookup
	WebElement productCost;

	@FindBy(xpath = "//input[@style=\"cursor: pointer;\"]/following::input[1]")
	@CacheLookup
	WebElement value;

	@FindBy(xpath = "//li[@class=\"nav-item\"]")
	@CacheLookup
	WebElement category;

	@FindBy(xpath = "//input[@aria-invalid=\"false\"]")
	@CacheLookup
	WebElement searchCategory;

	@FindBy(xpath = "//li[@style=\"cursor: pointer;\"]")
	@CacheLookup
	WebElement selectCategory;

	@FindBy(xpath = "//button[@class=\"button-reg primary\"]")
	@CacheLookup
	WebElement saveProduct;
	
	@FindBy(xpath = "//span[contains(text(),'Enabled')]")
	@CacheLookup
	WebElement enbled;
	
	
	/*
	 * Methods for catalogPage
	 */
	public void catalogPage() {
		catalog.click();
	}
	public void addProduct() {
		addProduct.click();
	}
	public void ProductName() {
		productName.sendKeys("black tshirt");
	}
	public void skuNumber() {
		skuNumber.sendKeys("SKU12464758");
	}
	
	public void description() {
		driver.switchTo().frame(0);
		description.sendKeys("cotton cloth");
		driver.switchTo().defaultContent();
	}
	public void data() {
		data.click();
	}
	public void quantity() {
		quantity.sendKeys("500");
	}
	public void status() {
		status.click();
	}
	
	
	public void enabled() {
		enbled.click();
	}
	
	public void calendar() {
		calendar.click();
	}
	public void nxtMonthBtn() {
		nxtMonthBtn.click();
	}
	public void date() {
		date.click();
	}
	public void sortOrder() {
		sortOrder.sendKeys("1");
	}
	public void images() {
		images.click();
	}
	public void addImage() {
		addImage.click();
	}
	public void uploadImg() {
		uploadImg.click();
	}
	
	public void insertBtn() {
		insertBtn.click();
	}
	public void price() {
		price.click();
	}
	public void defalutPrice() {
		defalutPrice.click();
	}
	public void productCost() {
		productCost.sendKeys("700");
	}
	public void value() {
		value.click();
		value.sendKeys("50");
	}
	public void category() {
		category.click();
		searchCategory.click();
		List<WebElement>options=selectCategory.findElements(By.xpath("//li[@style=\"cursor: pointer;\"]"));
		options.get(2).click();
	}
	public void saveProduct() {
		saveProduct.click();
	}
	
	/*
	 * locator for sales page
	 */

	@FindBy(xpath = "//a[@href=\"#/sales\"]")
	@CacheLookup
	WebElement sales;

	@FindBy(xpath = "(//span[@class='id'])[1]")
	@CacheLookup
	WebElement blackTshirtMenu;

	@FindBy(xpath = "//h5[text()=' Order Status']/following-sibling::a")
	@CacheLookup
	WebElement OrderStatus;

	@FindBy(xpath = "(//ng-select[@placeholder='- -Select Customer Group- -']//div)[1]")
	@CacheLookup
	WebElement placeholder;
	
	@FindBy(xpath = "//span[text()='Shipped']")
	@CacheLookup
	WebElement orderConfirmed;
	
	public void sales() {
		sales.click();
	}
	public void blackTshirtMenu() {
		blackTshirtMenu.click();
	}
	public void OrderStatus() {
		OrderStatus.click();
	}
	
	public void placeholder() {
		placeholder.click();
	}
	public void orderConfirmed() {
		orderConfirmed.click();
	}
}
