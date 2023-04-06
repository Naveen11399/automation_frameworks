package Utils;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	
	public static String  getTime() {
		DateFormat df=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date dt=new Date();
		return df.format(dt);
		
		
	}
	
	public static String screenShot(WebDriver driver) {
		TakesScreenshot ss=(TakesScreenshot)driver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		String sr=System.getProperty("user.dir")+"/screenshots/store"+getTime()+".png";
		try {

              FileUtils.copyFile(source,new File(sr));
              System.out.println("screenshot taken");
		} catch (Exception e) {
			
			System.out.println("unable to take screenshot"+e.getMessage());
		}
		return sr;
		
	}

}
