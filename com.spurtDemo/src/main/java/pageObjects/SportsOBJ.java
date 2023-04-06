package pageObjects;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class SportsOBJ {
	WebDriver driver;

	public SportsOBJ(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);

	}
	
	/*
	 * locator for Sports Page
	 */

	@FindBy(xpath = "//*[contains(text(),'Sports, Books and More') and @role=\"menuitem\"]")
	@CacheLookup
	WebElement sports;

	@FindBy(xpath = "//*[contains(text(),'Musical Instruments') and @role=\"menuitem\"]")
	@CacheLookup
	WebElement musicInstrumets;
	
	@FindBy(xpath = "//*[contains(text(),'String  Wind Instruments') and @role=\"menuitem\"]")
	@CacheLookup
	WebElement StringInstrumets;
	
	@FindBy(xpath = "//*[contains(text(),'Tablas  Keyboard') and @role=\"menuitem\"]")
	@CacheLookup
	WebElement tablasKeyboard ;
	
	@FindBy(xpath = "//*[contains(text(),' Grand Piano ')]")
	@CacheLookup
	WebElement productTitle;
	
	@FindBy(xpath = "(//*[@class=\"cart-btn\"])[3]")
	@CacheLookup
	WebElement addCartPiano;
	

	@FindBy(xpath = "(//*[@class=\"cart-btn\"])[3]")
	@CacheLookup
	WebElement addCartKeyBoard;
	
	@FindBy(xpath = "(//p[@class=\"new-price\"])[3]")
	@CacheLookup
	WebElement pianoPrice;
	/*
	 * methods for Sports Page
	 */
	
	public void sports() {

		sports.click();

	}

	public void musicInstrumets() {

		musicInstrumets.click();

	}
	
	public void StringInstrumets() {

		StringInstrumets.click();

	}
	
	public void verifyTitle() {

	String actTit=	productTitle.getText();
	
	String expTit="Grand Piano";
	 
	Assert.assertEquals(actTit,expTit );
	
	}
	public void addCartPiano() {

		addCartPiano.click();
		 

		}
	
	
	
	//Methods for keyboard
	
	public void tabalaskB() {

	tablasKeyboard.click();
		
		}
	public void addKeyBoard() {

		addCartKeyBoard.click();
			 

			}
	
	/*
	 * locator for sports
	 * 
	 * 
	 */
	
	@FindBy(xpath = "//button[text()='Sports']")
	@CacheLookup
	WebElement spotrsMenu;
	
	@FindBy(xpath = "//*[contains(text(),'Cricket ') and @role=\"menuitem\"]")
	@CacheLookup
	WebElement cricket;
	
	@FindBy(xpath = "(//*[@class=\"cart-btn\"])[3]")
	@CacheLookup
	WebElement addcricketKit;
	
	
	/*
	 * method for cricket
	 * 
	 * 
	 */
	
	public void sportsMenu() {

	spotrsMenu.click();
		 

		}
	public void cricketMenu() {

		cricket.click();
			 

			}
	
	public void addCartCricketKit() {
		
		addcricketKit.click();
			}
		

	/*
	 * locator for football
	 * 
	 * 
	 */
	@FindBy(xpath = "//*[contains(text(),'Football ') and @role=\"menuitem\"]")
	@CacheLookup
	WebElement footBall;
	
	@FindBy(xpath = "(//*[@class=\"cart-btn\"])[2]")
	@CacheLookup
	WebElement addFootBall;
	
	@FindBy(xpath = "(//button[@cdk-describedby-host=\"0\"])[3]")
	@CacheLookup
	WebElement favButton;
	
	/*
	 * method for FOOTBALL
	 */
	
	public void favBtnClick() {

		favButton.click();
			 

			}
	
	public void footBallMenu() {

		footBall.click();
			 

			}
	
	public void addCartfootBALL() {

		addFootBall.click();
			 

			}
	
	/*
	 * method for badminton 
	 */
	@FindBy(xpath = "//*[contains(text(),'Badminton ') and @role=\"menuitem\"]")
	@CacheLookup
	WebElement badminton;
	
	@FindBy(xpath = "(//*[@class=\"cart-btn\"])[1]")
	@CacheLookup
	WebElement addBadminton;
	
	@FindBy(xpath = "(//button[@cdk-describedby-host=\"0\"])[1]")
	@CacheLookup
	WebElement addToFav;
	
	/*
	 * method for FOOTBALL
	 */
	
	public void favClick() {

		addToFav.click();
			 

			}
	
	public void badmintonMenu() {

		badminton.click();
			 

			}
	
	public void addCartBadminton() {

		addBadminton.click();
			 

			}
	
}
