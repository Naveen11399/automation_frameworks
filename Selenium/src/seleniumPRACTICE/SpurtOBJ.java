package seleniumPRACTICE;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
@Test
public class SpurtOBJ {
	@FindBy(xpath = "//input[@formcontrolname=\"userName\"]")
	public static WebElement userName;
	@FindBy(xpath = "//input[@formcontrolname=\"password\"]")
	public static WebElement password;
	@FindBy(xpath = "//button [@class=\"btn btn-log\"]")
	public static WebElement login;
	@FindBy(xpath = "//a[@href=\"#/catalog\"]")
	public static WebElement catalog;
	
	@FindBy(xpath = "//button[@class=\"button-reg primary\"]")
	public static WebElement addProduct;
	
	@FindBy(xpath = "//input[@placeholder=\" Product Name\"]")
	public static WebElement productName;
	
	@FindBy(xpath = "//input[@placeholder=\"SKU Number\"]")
	public static WebElement skuNumber;
	
	@FindBy(xpath = "//body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]")
	public static WebElement description;
	
	@FindBy(id ="ngb-nav-1")
	public static WebElement data;
	
	@FindBy(xpath = "//input[@placeholder=\"Quantity\"]")
	public static WebElement quantity;
	
	@FindBy(xpath = "//div[@role=\"combobox\"]")
	public static WebElement status;
	
	@FindBy(xpath="//div[@class=\"ng-dropdown-panel-items scroll-host\"]" )
	public static WebElement enabled;
	
	@FindBy(xpath = "//*[@placeholder=\"dd/mm/yyyy\"]")
	public static WebElement calendar;
	
	@FindBy(xpath = "//*[@title=\"Next month\"]")
	public static WebElement nxtMonthBtn;
	
	
	@FindBy(xpath = "//div[contains(text(),'11')]")
	public static WebElement date;
	
	@FindBy(xpath = "//*[@placeholder=\" Sort Order\"]")
	public static WebElement sortOrder;
	
	@FindBy(xpath = "//a[contains(text(),'Images')]")
	public static WebElement images;
	
	@FindBy(xpath = "//div[@class=\"img-dflt\"]")
	public static WebElement addImage;
	
	@FindBy(xpath = "//*[@value=\"800px_COLOURBOX25368645_1651642232568.jpeg\"]")
	public static WebElement uploadImg;
	
	@FindBy(xpath = "//a[contains(text(),' Insert ')]")
	public static WebElement insertBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Price')]")
	public static WebElement price;
	
	@FindBy(xpath = "//*[contains(text(),' Default Price ')]")
	public static WebElement defalutPrice;
	
	@FindBy(xpath = "//input[@formcontrolname=\"productPrice\"]")
	public static WebElement productCost;
	
	@FindBy(xpath = "//input[@style=\"cursor: pointer;\"]/following::input[1]")
	public static WebElement value;
	
	@FindBy(xpath = "//li[@class=\"nav-item\"]")
	public static WebElement category;
	
	@FindBy(xpath = "//input[@aria-invalid=\"false\"]")
	public static WebElement searchCategory;
	
	@FindBy(xpath = "//li[@style=\"cursor: pointer;\"]")
	public static WebElement selectCategory;
	
	@FindBy(xpath ="//button[@class=\"button-reg primary\"]" )
	public static WebElement saveProduct;
}
