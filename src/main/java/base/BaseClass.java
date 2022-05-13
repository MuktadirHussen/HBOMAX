package base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import commons.CommonActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import objects.LandingPage;
import objects.PersonalInfo;
import objects.PriceBox;

public class BaseClass {
	public static WebDriver driver;
    public LandingPage landingPage;
    public CommonActions commonActions;
    public PriceBox priceBox;
    public PersonalInfo personalInfo;
    
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.hbomax.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		initClasses();
	}
	@AfterMethod
	public void cleaningUp() {
		driver.quit();
	}
	private void initClasses() {
		landingPage = new LandingPage(driver);
		commonActions = new CommonActions();
		priceBox = new PriceBox(driver);
		personalInfo = new PersonalInfo(driver);
	}
}