package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/mahesh/Downloads/selenium/chromedriver");
		WebDriver driver =new  ChromeDriver();
		driver.get("http://13.126.197.227/");
		//WebElement drop1 =driver.findElement(By.id("fruits"));
		//Select sel=new Select(drop1);
		//sel.selectByVisibleText("Pine Apple"); 
		//WebElement drop2=driver.findElement(By.xpath("//*[@id=\"lang\"]"));
		//Select sel1=new Select(drop2);
		//sel1.selectByIndex(4);
		//List<WebElement> val =sel1.getOptions();
		//WebElement drop4=driver.findElement(By.id("country"));
		//Select count=new Select(drop4);
	//	count.selectByValue("India");
		//WebElement cntry= count.getFirstSelectedOption();
		//System.out.println(cntry.getText());
		
		
	}



}