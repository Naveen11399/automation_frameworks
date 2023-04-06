package dataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ApachePOI {
	
	static List<String> userName=new ArrayList<String>();
	static List<String> password=new ArrayList<String>();
	
	public void readExcel() throws IOException {
		FileInputStream excel= new FileInputStream("/home/mahesh/Downloads/myshaa.xlsx");
		Workbook workbook= new XSSFWorkbook(excel);
		Sheet sheet=workbook.getSheetAt(0);
		Iterator<Row>rowIterator=sheet.iterator();
		while (rowIterator.hasNext()) {
			Row rowValue =  rowIterator.next();
			Iterator<Cell> coloumnIterator=rowValue.cellIterator();
			int i=2;
			while (coloumnIterator.hasNext()) {
				Cell cell =  coloumnIterator.next();
				if(i%2==0) {
					userName.add(coloumnIterator.next().getStringCellValue());
					
				}
				else {
					password.add(coloumnIterator.next().getStringCellValue());
					
				}
				i++;
				
			}
			
		}
		
	}
	
	
	public void executeTest() {
		for (int i = 0; i < userName.size(); i++) {
			login(userName.get(i),password.get(i));
			
		}
	}

	public void login(String uName,String pWord) {
		System.setProperty("webdriver.chrome.driver", "/home/mahesh/Downloads/selenium/chromedriver");
		WebDriver	driver =new  ChromeDriver();


		driver.get("http://13.126.197.227/");

		WebElement userName=	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/input"));
		userName.sendKeys(uName);
		WebElement password=	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/input"));
		password.sendKeys(pWord);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ApachePOI usingPOI= new ApachePOI();
		usingPOI.readExcel();
		System.out.println("usernameList "+userName);
		System.out.println("passwordList "+password);
		usingPOI.executeTest();
	}

}

