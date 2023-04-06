package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
@Test
public class LoginAndUpdateObjects {
	@FindBy(name="email")
	public static WebElement username;
	@FindBy(name="password")
	public static WebElement password;
	@FindBy(xpath = "//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button")
	public static WebElement login;
	@FindBy(xpath = "//*[@id=\"fadein\"]/div[4]/div/div[3]/ul/li[4]/a")
	public static WebElement myProfile;
	@FindBy(name="city")
	public static WebElement city;
	@FindBy(name="state")
	public static WebElement state;
	@FindBy(xpath = "//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button")
	public static WebElement update;
	

}
