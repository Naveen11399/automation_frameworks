package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/mahesh/Downloads/selenium/chromedriver");
		WebDriver driver =new  ChromeDriver();
		driver.get("https://demoqa.com/broken");
		
		WebElement firstImage=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/img[1]"));
	if (	firstImage.getAttribute("naturalWidth").equals("0"))
	{
		System.out.println(" 1st image is ALREADY BROKEN da");
	}
	else {
		System.out.println("1st image is not broken da");
	}
	
	WebElement secImage=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/img[2]"));
	if (secImage.getAttribute("naturalWidth").equals("0")) {
		System.out.println("2nd image is ALREADY BROKEN da");
	}
	else {
		System.out.println(" 2nd image is not BROKEN da");
	}
	
	
	}

}
