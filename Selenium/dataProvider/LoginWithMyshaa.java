package dataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Range;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.read.biff.PasswordException;

public class LoginWithMyshaa {

	WebDriver driver;
	String[][]data=null;


	@DataProvider(name="loginData")
	public String[][] loginCred() throws BiffException, IOException
	{
		data=loginData();

		return data;

	}

	public String[][] loginData() throws BiffException, IOException {
		FileInputStream excel=new FileInputStream("/home/mahesh/myshaa.xls");
		Workbook workbook=Workbook.getWorkbook(excel);
		Sheet sheet=workbook.getSheet(0);
		int columnCount=sheet.getColumns();
		int rowCount=sheet.getRows();
		String testData[][]=new String [rowCount-1] [columnCount];
		for (int i=1;i<rowCount;i++) {
			for (int j=0;j<columnCount;j++) {
				testData[i-1][j]=sheet.getCell(j, i).getContents();
			}
		}
		return testData;

	}

	@BeforeTest
	public void launchTheBrowser() {
		System.setProperty("webdriver.chrome.driver", "/home/mahesh/Downloads/selenium/chromedriver");
		driver =new  ChromeDriver();

	}

	@Test(dataProvider="loginData")
	public void loginWithValiData(String uName,String pWord) {

		driver.get("http://13.126.197.227/");

		WebElement userName=	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/input"));
		userName.sendKeys(uName);
		WebElement password=	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/input"));
		password.sendKeys(pWord);


	}
	@AfterTest
	public void afterTest() {

		driver.quit();
	}


}
