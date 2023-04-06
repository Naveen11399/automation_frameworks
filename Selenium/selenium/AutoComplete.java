 package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/mahesh/Downloads/selenium/chromedriver");
		WebDriver driver =new  ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		//WebElement input=driver.findElement(By.id("lst-ib"));
		WebElement input=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		input.sendKeys("na");
		 
		Thread.sleep(4000);
		List<WebElement>listOfOption= driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div/ul/li"));
		int size=listOfOption.size();
		System.out.println(size);
		
		for (WebElement options : listOfOption) {
			if (options.getText().equals("naukri"))
			{
			options.click();
			System.out.println("naukri is selected");
			break;
			}
			
			
		}
		
	
	}

}
