package flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
@Test
public class demoGuruOBJ {
	@FindBy(xpath = "//input[@name='emailid']")
	public static WebElement customerId;
	@FindBy(name = "btnLogin")
	public static WebElement submit;
	@FindBy(xpath = "//a[text()='Bank Project']")
	public static WebElement bankProject;
}
