package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriveTheCar {
WebDriver driver;
	@Test
	public void startTheCar() {
		
     driver =new ChromeDriver();
     driver.manage().window().maximize();
     driver.navigate().to("https://open.spotify.com");

}
	
}
