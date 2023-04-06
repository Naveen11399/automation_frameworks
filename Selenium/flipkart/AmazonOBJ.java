package flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class AmazonOBJ {
	@FindBy(name = "q")
	public static WebElement searchAmazon;
	@FindBy(xpath = "//a[@class='sVXRqc']")
	public static WebElement amazonHome;
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	public static WebElement searchBox;
	@FindBy(xpath = "//img[@data-image-index='8']")
	public static WebElement selectFlask;
	@FindBy(xpath = "//span[@id='productTitle']")
	public static WebElement tittle;

}
