package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/mahesh/Downloads/selenium/chromedriver");
		WebDriver driver =new  ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		
		//workWithFrame
		driver.switchTo().frame(0);
		WebElement button1=driver.findElement(By.id("Click"));
		button1.click();
		String text= button1.getText();
		System.out.println(text);
		
		//Work with NestFrame
		driver.switchTo().defaultContent();
		//driver.switchTo().frame(0);List<WebElement> org.openqa.selenium.WebDriver.findElements(By by)

		//driver.switchTo().frame(1);
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement button2=driver.findElement(By.xpath("//*[@id=\"Click\"]"));
		button2.click();
		
		//count the frames
		driver.switchTo().defaultContent();
		List<WebElement> frames= driver.findElements(By.tagName("iframe"));
		int noOfFrames=frames.size();
		System.out.println(noOfFrames);
	

	}

}
