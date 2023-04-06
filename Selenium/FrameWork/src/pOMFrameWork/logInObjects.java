package pOMFrameWork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
@Test
public class logInObjects {
	
	@FindBy(name ="username")
	public static WebElement userName;
		
	@FindBy(name = "password")
	public static WebElement passWord;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	public static WebElement login;
		
			
	


}
