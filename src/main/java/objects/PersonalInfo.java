package objects;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.CommonActions;

public class PersonalInfo {
	
	public PersonalInfo(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "(//div[@class='input empty ce__Input__inputWrapper'])[1]")
	WebElement personalInfoElement;
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstNameElement;
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastNameElement;
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailElement;
	
	public void clickPersonalInfo(CommonActions commonActions) {
	commonActions.click(personalInfoElement);
	}
	public void inputFirstName(CommonActions commonActions, String value){
		commonActions.inputText(firstNameElement, value);
	}
	public void inputLastName(CommonActions commonActions, String value) {
		commonActions.inputText(lastNameElement, value);
	}
	public void inputEmail(CommonActions commonActions, String value) {
		commonActions.inputText(emailElement, value);
	}
}