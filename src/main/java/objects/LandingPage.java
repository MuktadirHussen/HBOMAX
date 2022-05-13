package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import commons.CommonActions;

public class LandingPage {
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath ="(//a[text()='Sign Up Now'])[1]")
	WebElement signUpElement;
	@FindBy(id="exp-2688-avod-mo")
    WebElement priceBoxElement;
	
	public void clickSignUp(CommonActions commonActions) {
		commonActions.click(signUpElement);
	}
	}