package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/mahesh/Downloads/selenium/chromedriver");
		WebDriver driver =new  ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");

		//select radio
		WebElement chrome=driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]"));
		chrome.click();

		//unselectable
		WebElement chennai=driver.findElement(By.xpath("//*[@id=\"j_idt87:city2\"]"));
		boolean chennaiStatus=chennai.isSelected();
		WebElement bengaluru=driver.findElement(By.xpath("//*[@id=\"j_idt87:city2\"]/div/div[2]/label"));
		boolean bengaluruStatus=bengaluru.isSelected();
		WebElement hyderabad=driver.findElement(By.xpath("//*[@id=\"j_idt87:city2\"]/div/div[3]/div/div[2]"));
		boolean hydStatus=hyderabad.isSelected();
		System.out.println("chennai is selectable..?  "+ chennaiStatus);
		System.out.println("bengaluru is selectable..?  "+   bengaluruStatus);
		System.out.println("hyderabad is seletable..?  "+hydStatus);

		//find the select 

		WebElement safari =driver.findElement(By.id("j_idt87:console2:2"));
		boolean safriSts=safari.isSelected();
		if (safari.isSelected()) {
			System.out.println("SELECTED VALUE IS  safari");
		}
		WebElement chrome1=driver.findElement(By.id("j_idt87:console2:0"));
		boolean chromests=chrome1.isSelected();
		System.out.println("safari is selectable...?   "+safriSts);
		System.out.println("chrome is selectable...?   "+chromests);

		//age group
		WebElement above40=driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[1]/label"));
		above40.click();


	}

}
