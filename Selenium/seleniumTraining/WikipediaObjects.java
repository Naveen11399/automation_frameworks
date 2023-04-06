package seleniumTraining;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

@Test
public class WikipediaObjects {
	
	@FindBy(id = "sb_form_q")
	public static WebElement search_Wikipedia;
	
	@FindBy(xpath = "//*[@id=\"b_results\"]/li[1]/div[1]/h2/a")
	public static WebElement go_To_The_WikipediaPage;
	
	@FindBy(id = "searchInput")
	public static WebElement search_The_HealthCare;
	
	@FindBy(xpath = "//*[@id=\"toc-Secondary_care\"]/a")
	public static WebElement go_TO_SecondaryCare;
	
}
