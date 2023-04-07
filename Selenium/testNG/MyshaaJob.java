package testNG;

import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.google.j2objc.annotations.Weak;

public class MyshaaJob {

	WebDriver driver;
	long startTime;
	@BeforeSuite()
	public void launchTheBrowser() {
		startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "/home/mahesh/Downloads/selenium/chromedriver");
		driver =new  ChromeDriver();
		driver.get(");
		driver.manage().window().maximize();

	}
	@Test(priority=0)
	public void LoginPage() throws InterruptedException {

		//Thread.sleep(3000);

		WebElement userName=	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/input"));
		userName.sendKeys("admin@myshaa.com");
		WebElement password=	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/input"));
		password.sendKeys("Myshaa@123");
		WebElement logInButton= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/button"));
		logInButton.click();
	}
	@Test(priority=1)
	public void jobPage() {
		driver.navigate().to("http://13.126.197.227/jobs");
	}
	//createJob
	@Test(priority=2)
	public void createButton() {
		WebElement createButton=driver.findElement(By.xpath("//*[@id=\"Myformint\"]/div/a/button"));
		createButton.click();
	}

	//comapny
	@Test(priority=3)
	public void company() {
		WebElement company=driver.findElement(By.id("companyName"));
		company.sendKeys("techsoft");
		company.click();
		// WebElement jobTittle=driver.findElement(By.id(""));
		//jobTittle.sendKeys("Automation tester");

	}
	@Test(priority=4)
	public void jobTittle() {
		WebElement jobTittle=driver.findElement(By.xpath("//*[@id='createJob']/div/div[2]/div[1]/div[2]/div[2]/div/input"));
		jobTittle.sendKeys("Automation tester");
		//jobTittle.click();


	}
	@Test(priority=5)
	public void jobRole() throws InterruptedException {
		WebElement clickButton=driver.findElement(By.id("selectedJobRole"));
		clickButton.click();

		WebElement search=driver.findElement(By.xpath("//*[@id=\"createJob\"]/div/div[2]/div[1]/div[3]/div[2]/div/label/ul/li/div[1]/input"));
		search.sendKeys("test");
		Thread.sleep(3000);	
		List<WebElement>options=	driver.findElements(By.xpath("//*[@id=\"createJob\"]/div/div[2]/div[1]/div[3]/div[2]/div/label/ul/li"));
		for (WebElement webElement : options) {
			if(webElement.getText().equals("manual tester"));{
				webElement.click();
				break;
			}
		}
	}
	@Test(priority=6)
	public void jobDescription() throws InterruptedException {

		driver.switchTo().frame(0);
		WebElement jobDescription=driver.findElement(By.xpath("/html/body"));
		jobDescription.click();
		jobDescription.sendKeys("automation test enginner");
		driver.switchTo().defaultContent();
	}
	@Test(priority=7)
	public void primary() throws InterruptedException {
		WebElement clickButton=driver.findElement(By.xpath("//*[@id=\"createJob\"]/div/div[2]/div[1]/div[5]/div[2]/div[1]/input[1]"));
		clickButton.click();
		clickButton.sendKeys("Marke");
		Thread.sleep(3000);	
		List<WebElement>options=	driver.findElements(By.xpath("//*[@id=\"primarySkills\"]"));
		for (WebElement webElement : options) {
			if(webElement.getText().equals("Marketing"));{
				webElement.click();
				break;
			}
		}
		WebElement addSkill=driver.findElement(By.id("addSkill"));
		addSkill.click();
		
		//add another skill
		WebElement clickButton1=driver.findElement(By.xpath("//*[@id=\"createJob\"]/div/div[2]/div[1]/div[5]/div[2]/div[1]/input[1]"));
		clickButton1.click();
		clickButton1.sendKeys("Backend");
		Thread.sleep(3000);	
		List<WebElement>options1=	driver.findElements(By.xpath("//*[@id=\"primarySkills\"]"));
		for (WebElement webElement1 : options1) {
			if(webElement1.getText().equals(" Backend Developer "));{
				webElement1.click();
				break;
			}
		}
		WebElement addSkills=driver.findElement(By.id("addSkill"));
		addSkills.click();
	    }
	@Test(priority=8)
	public void secondarySkills() throws InterruptedException {
		WebElement clickButton=driver.findElement(By.xpath("//*[@id=\"createJob\"]/div/div[2]/div[1]/div[6]/div[2]/div[1]/input[1]"));
		clickButton.click();
		clickButton.sendKeys("sql");
		Thread.sleep(2000);	
		List<WebElement>skills=driver.findElements(By.xpath("//*[@id=\"secondarySkills\"]"));
		for (WebElement webElement : skills) {
			if (webElement.getText().equals(" MS SQL server databases ")); {
				webElement.click();
				break;
			}
			
		}
		WebElement addSecSkills=driver.findElement(By.id("addSecSkill"));
		addSecSkills.click();
		}
	@Test(priority=9)
	public void otherSkills() throws InterruptedException {
		WebElement otherSkills=driver.findElement(By.id("Technology"));
		otherSkills.click();
		otherSkills.sendKeys("de");
		Thread.sleep(3000);
		
		List<WebElement>options=driver.findElements(By.xpath("//*[@id=\"autoTech\"]"));
		for (WebElement webElement : options) {
			if(webElement.getText().equals(" DevSecOps "));{
				webElement.click();
				break;
			}
			}
		WebElement addSkill=driver.findElement(By.id("addTech"));
		addSkill.click();
		
		}
	@Test(priority=10)
	public void jobLocation() throws InterruptedException {
		WebElement jobLocation=driver.findElement(By.id("City"));
		jobLocation.click();
		jobLocation.sendKeys("Bang");
		Thread.sleep(3000);
		List<WebElement>cityList=driver.findElements(By.id("autoCity"));
		for (WebElement webElement : cityList) {
			if (webElement.getText().equals("Bangalore"));{
				webElement.click();
				break;
			}
		}
		WebElement addCity=driver.findElement(By.id("addCity"));
		addCity.click();
		
	}
	@Test(priority=11)
	public void calendar() {
		WebElement calendar=driver.findElement(By.xpath("//*[@id=\"createJob\"]/div/div[2]/div[1]/div[9]/div[1]/div/input"));
		calendar.click();
		
		WebElement calendarButton=driver.findElement(By.xpath("//a[@class=\"dtp-select-month-after\"]"));
		calendarButton.click();
		calendarButton.click();
		
		WebElement date=driver.findElement(By.xpath("//a[contains(text(),'11')]"));
		date.click();
		
		WebElement ok=driver.findElement(By.xpath("//button[@class=\"dtp-btn-ok btn btn-flat\"]"));
		ok.click();
	}
	@Test(priority=12)
	public void cadidatesReq() {
		WebElement candidatesReq=driver.findElement(By.xpath("//*[@id=\"createJob\"]/div/div[2]/div[1]/div[9]/div[2]/div/input"));
		candidatesReq.click();
		candidatesReq.sendKeys("7");
		
	}
	@Test(priority=13)
	public void workExprience() throws InterruptedException {
		//MinYr
		WebElement minYr=driver.findElement(By.xpath("//*[@id=\"createJob\"]/div/div[2]/div[1]/div[9]/div[4]/div/div/div[1]/div/div"));
		minYr.click();
		List<WebElement> opt=driver.findElements(By.xpath("//div//ul[@class=\"select-options\"]//li"));
		Actions action=new Actions(driver);
	    action.keyDown(Keys.CONTROL).click(opt.get(2)).build().perform();
	    //max
		WebElement maxYr=driver.findElement(By.xpath("//*[@id=\"createJob\"]/div/div[2]/div[1]/div[9]/div[4]/div/div/div[2]/div/div"));
		maxYr.click();
		List<WebElement> opt1=driver.findElements(By.xpath("//*[@id=\"createJob\"]/div/div[2]/div[1]/div[9]/div[4]/div/div/div[2]/div/ul/li"));
		Actions action1=new Actions(driver);
	    action1.keyDown(Keys.CONTROL).click(opt1.get(5)).build().perform();
	}
	@Test(priority=14)
	public void salaryRange() {
		// salary
		WebElement minSal=driver.findElement(By.xpath("//*[@id=\"createJob\"]/div/div[2]/div[1]/div[9]/div[5]/div/div/div[1]/div/div"));
		minSal.click();
		List<WebElement> opt=driver.findElements(By.xpath("//*[@id=\"createJob\"]/div/div[2]/div[1]/div[9]/div[5]/div/div/div[1]/div/ul/li"));
		Actions action=new Actions(driver);
	    action.keyDown(Keys.CONTROL).click(opt.get(2)).build().perform();
	    //max salary
		WebElement maxSal=driver.findElement(By.xpath("//*[@id=\"createJob\"]/div/div[2]/div[1]/div[9]/div[5]/div/div/div[2]/div/div"));
		maxSal.click();
		List<WebElement> opt1=driver.findElements(By.xpath("//*[@id=\"createJob\"]/div/div[2]/div[1]/div[9]/div[5]/div/div/div[2]/div/ul/li"));
		Actions action1=new Actions(driver);
	    action1.keyDown(Keys.CONTROL).click(opt1.get(5)).build().perform();
	}
		
	
	@Test(priority=15)
	public void industry() throws InterruptedException {
		
	WebElement industry=driver.findElement(By.id("selectedIndustry"));
		industry.click();
		//Thread.sleep(2000); //*[@id="createJob"]/div/div[2]/div[1]/div[9]/div[3]/div/label[1]/ul/li/div[2]/div[5] //input[@placeholder=\"Search Industry\"]
		WebElement search1=driver.findElement(By.xpath("//*[@id=\"createJob\"]/div/div[2]/div[1]/div[9]/div[3]/div/label[1]/ul/li/div[2]/div[5]"));
		search1.click();
		
		//Thread.sleep(2000);
		//search1.sendKeys("banking");
	//	search1.submit();
	}
	@Test(priority=15)
	public void save() {
		WebElement save=driver.findElement(By.xpath("//*[@id=\"createJob\"]/div/div[2]/div[3]/button"));
		save.click();
		
	}
}
		
		
	
		
	


















