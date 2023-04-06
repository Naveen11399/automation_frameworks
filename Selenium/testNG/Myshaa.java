package testNG;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Myshaa {
	WebDriver driver;
	long startTime;
	@BeforeSuite()
	public void launchTheBrowser() {
		startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\seleniumJars//chromedriver.exe");
		driver =new  ChromeDriver();
		driver.get("http://13.126.197.227/");
		driver.manage().window().maximize();

	}
	@Test(priority=0)
	public void LoginPage() throws InterruptedException {

	Thread.sleep(3000);

		WebElement userName=	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/input"));
		userName.sendKeys("admin@myshaa.com");
		WebElement password=	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/input"));
		password.sendKeys("Myshaa@123");
		WebElement logInButton= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/button"));
		logInButton.click();


	}
	@Test(priority=1)
	public void companyPage() throws InterruptedException {
		driver.navigate().to("http://13.126.197.227/company/companies");
		}
	
	
/*	@Test(priority=1)
	public void createComapny() throws InterruptedException {
		Thread.sleep(2000);
	
		WebElement createButton=driver.findElement(By.xpath("//*[@id=\"myForm\"]/div/button"));
		createButton.click();
		}
		//Company Name
	@Test(priority=2)
	public void companyName() throws InterruptedException {
		Thread.sleep(2000);
		WebElement companyName=driver.findElement(By.xpath("//*[@id=\"companyname\"]"));

		companyName.sendKeys("tcs");
	}
	
		//Select the Industry
	@Test(priority=3)
	public void industryName() {
		WebElement selectTheIndustry=driver.findElement(By.id("selectedformIndustry"));
		selectTheIndustry.click();

		WebElement industryName=driver.findElement(By.xpath("//*[@id=\"addcompany\"]/div[1]/div/div[2]/label/ul/li/div[1]/input"));
		industryName.sendKeys("ban");

		WebElement sel=driver.findElement(By.xpath("//*[@id=\"addcompany\"]/div[1]/div/div[2]/label/ul/li/div[2]/div[7]/label"));
		sel.click();
		}
		//Contact Person
	@Test(priority=4)
	public void contactPerson() throws InterruptedException {
		Thread.sleep(2000);
		
		WebElement contactPerson=driver.findElement(By.xpath("//*[@id=\"contactperson\"]"));
		contactPerson.sendKeys("naveen");
		}
		//Email
	@Test(priority=5)
	public void email() throws InterruptedException {
		Thread.sleep(2000);
		WebElement Email=driver.findElement(By.xpath("//*[@id=\"emailid\"]"));
		Email.sendKeys("naveen1@gmail.com");
		}
		
		//Mobilenumber
	@Test(priority=6)
	public void mobileNumber() {
		WebElement mobilenumber=driver.findElement(By.id("mobilenumber"));
		mobilenumber.sendKeys("7890612890");}
		
		//phonenumber
	@Test(priority=7)
	public void phoneNumber() {
		WebElement Phonenumber =driver.findElement(By.id("phonenumber"));
		Phonenumber.sendKeys("9090898912");
		}
       //state 
	@Test(priority=8)
	public void state() {
		
		WebElement state=driver.findElement(By.xpath("//*[@id=\"sfSname\"]"));
		state.click();
		WebElement SearchState=driver.findElement(By.xpath("//*[@id=\"addcompany\"]/div[1]/div/div[6]/div[2]/label/ul/li/div[1]/input"));
		SearchState.sendKeys("Tamil");
		driver.findElement(By.xpath("//*[@id=\"addcompany\"]/div[1]/div/div[6]/div[2]/label/ul/li/div[2]/div[31]")).click();
		}
		//city
	@Test(priority=9)
	public void city() {
		WebElement city=driver.findElement(By.xpath("//*[@id=\"sfCname\"]"));
		city.click();
		WebElement SearchCity=driver.findElement(By.xpath("//*[@id=\"addcompany\"]/div[1]/div/div[6]/div[3]/label/ul/li/div[1]/input"));
		SearchCity.sendKeys("chidam");
		driver.findElement(By.xpath("//*[@id=\"sfClist\"]/div[2]/label")).click();
		}
		//password
	@Test(priority=10)
	public void password() {
		WebElement password=driver.findElement(By.xpath("//*[@id=\"passwords\"]"));
		password.sendKeys("Naveen113@");
		}
		//confirmPassword
	@Test(priority=11)
	public void confirmPassword() {
		WebElement confirmPassword=driver.findElement(By.xpath("//*[@id=\"confirmpassword\"]"));
		confirmPassword.sendKeys("Naveen113@");
	}
		//create 
	@Test(priority=12)
	public void create() {
		WebElement create=driver.findElement(By.xpath("//*[@id=\"Createcompany\"]"));
		create.click();
		}
	@Test(priority=13)
	public void search() throws InterruptedException {
		Thread.sleep(3000);
		WebElement search=driver.findElement(By.id("search"));
		search.click();
		search.sendKeys("techsoft");
		search.submit();
		WebElement closeSearch=driver.findElement(By.xpath("//*[@id=\"searchval\"]/a"));
		closeSearch.click();
		
	
		
	}*/
	@Test(priority=2)
	public void dynamic() {
		
		List <WebElement> coloumn=driver.findElements(By.tagName("th"));
		int coloumnSize =coloumn.size();
		System.out.println(coloumnSize);
		
		List <WebElement> row=driver.findElements(By.tagName("tr"));
		int rowSize =coloumn.size();
		System.out.println(rowSize);
		
		///
		WebElement getprice=driver.findElement(By.xpath("//td[@class=\"company-manage\"]//following::td[4]"));
		String price= getprice.getText();
		System.out.println(price);
		
		
		
	}
	
	

}







