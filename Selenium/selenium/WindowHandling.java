package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/mahesh/Downloads/selenium/chromedriver");
		WebDriver driver =new  ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();

		//work with new window
		String oldWindow= driver.getWindowHandle();
		WebElement openMulti=driver.findElement(By.id("j_idt88:new"));
		openMulti.click();
		Set <String>windows= driver.getWindowHandles();
		for (String newWindow : windows) {
			driver.switchTo().window(newWindow);

		}
		WebElement email=driver.findElement(By.id("email"));
		email.click();
		email.sendKeys("naveen");
		driver.close();

		//no of window
		/*driver.switchTo().window(oldWindow);
		WebElement noOfWindow=driver.findElement(By.id("j_idt88:j_idt91"));

		noOfWindow.click();
		int totWindow= driver.getWindowHandles().size();
		System.out.println("number of window  "+totWindow);


		//dont close the parentWindow
		WebElement dontclose=driver.findElement(By.id("j_idt88:j_idt93"));
		dontclose.click();
		Set<String>totalWindow =driver.getWindowHandles();
		for (String newWindow: totalWindow) {
			if(!newWindow.equals(oldWindow)) {
				driver.switchTo().window(newWindow);
				driver.close();


			}

		}
		driver.quit();



	}*/

}
}