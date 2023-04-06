package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "D:\\seleniumJars//msedgedriver");
		WebDriver driver =new  EdgeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		//*WebElement clickButton = driver.findElement(By.id("j_idt88:j_idt90"));
		//*clickButton.click();
		WebElement disable =driver.findElement(By.id("j_idt88:j_idt92"));
		boolean enable= disable.isEnabled();
		System.out.println(enable);
		WebElement position = driver.findElement(By.id("j_idt88:j_idt94"));
	    Point XYposition=	position.getLocation();
		int xposition =XYposition.getX();
		int yposition =XYposition.getY();
		System.out.println("X position is "+xposition+" Y position is "+yposition);
		WebElement colour =driver.findElement(By.id("j_idt88:j_idt96"));
		String buttonColour=colour.getCssValue("background");
		System.out.println("BUTTON COLOUR IS "+buttonColour);
		WebElement heightWidth=driver.findElement(By.id("j_idt88:j_idt98"));
		int  height = heightWidth.getSize().getHeight();
		int width =heightWidth.getSize().getWidth();
		System.out.println("height of the button is "+height+" width of the button is "+width);
		WebElement changes=driver.findElement(By.id("j_idt88:j_idt100"));
		
	

	}

}
