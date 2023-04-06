package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\seleniumJars//chromedriver");
		WebDriver driver =new  ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		//driver.manage().window().maximize();
		//Thread.sleep(3000);
		
		WebElement downloadLink=driver.findElement(By.id("downloadButton"));
		downloadLink.click();
		Thread.sleep(5000);
		//veriffy downloads
		File fileLoaction=new File("/home/mahesh/Downloads");
		File[] file= fileLoaction.listFiles();
		for (File down : file) {
			if (down.getName().equals("sampleFile.jpeg")){
				System.out.println("FILE IS DOWNLOADED");
				break;
			}
			
		}
		
	}

}
