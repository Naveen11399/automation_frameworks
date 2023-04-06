package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/home/mahesh/Downloads/selenium/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.get("\"https://www.google.com\"");
		
		//System.setProperty("webdriver.chrome.driver", "/home/mahesh/Downloads/selenium/chromedriver");
		//WebDriver driver =new  ChromeDriver();
		//driver.get("https://www.leafground.com/select.xhtml");
        WebElement drop=driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
        Select value= new Select(drop);
        value.selectByIndex(3);
        
        WebElement drop2=driver.findElement(By.id("j_idt87:country_input"));
        Select val2= new Select(drop2);
        List<WebElement> opt= val2.getOptions();
       int len= opt.size();
       System.out.println(len);
      //  Select value1= new Select(drop2);
        //value1.selectByIndex(2);
        //WebElement Dropdown2 = driver.findElement(By.id("j_idt87:country_items"));
        //Select select =new Select(Dropdown2);
        //select.selectByIndex(2);
	}

}
