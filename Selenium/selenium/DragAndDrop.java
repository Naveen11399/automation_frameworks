package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/mahesh/Downloads/selenium/chromedriver");
		WebDriver driver =new  ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		
		//drag and drop
		WebElement from=driver.findElement(By.id("form:drag_content"));
		WebElement To=driver.findElement(By.id("form:drop_content"));
		Actions actions=new Actions(driver);
		//actions.clickAndHold(from).moveToElement(To).release().build().perform();
		actions.dragAndDrop(from, To).build().perform();
		
        //
		WebElement drag=driver.findElement(By.id("form:conpnl_content"));
		Actions actions2=new Actions(driver);
		actions2.dragAndDropBy(drag, 60,60).build().perform();
	}

}
