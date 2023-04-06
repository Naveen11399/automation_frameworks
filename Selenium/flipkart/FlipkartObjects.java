package flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
@Test
public class FlipkartObjects {
	@FindBy(name =  "q")
	public static WebElement searchFlipkart;
	@FindBy(xpath = "//h3[@class='LC20lb MBeuO DKV0Md']")
	public static WebElement flipkartHome;
	@FindBy(name="q")
	public static WebElement flipkartSearch;
	@FindBy(xpath = "/html/body/div[2]/div/div/button")
	public static WebElement closeBtn;
	@FindBy(xpath = "//a[@class='_1fQZEK']//following::a")
	public static WebElement selectPhone;
	@FindBy(xpath =  "//div[@class='_30jeq3 _16Jk6d']")
	public static WebElement getPrice;

}
