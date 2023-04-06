package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/mahesh/Downloads/selenium/chromedriver");
		WebDriver driver =new  ChromeDriver();
		driver.get("https://demoqa.com/selectable");
		driver.manage().window().maximize();
		
		//size
		List<WebElement> selectable= driver.findElements(By.xpath("//*[@id=\"verticalListContainer\"]/li"));
		int size= selectable.size();
		System.out.println("size of list:  "+size);
		
		//Selectable
		 //Actions actions=new Actions(driver);
		 //actions.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build().perform();
		 
		 //another model
		 Actions actions=new Actions(driver);
		 actions.keyDown(Keys.CONTROL).click(selectable.get(3)).build().perform();
		 
		
		 
		
		

	}

}
