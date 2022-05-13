package hbo.qa.test.auto;

import org.testng.annotations.Test;

import base.BaseClass;
import objects.PersonalInfo;

public class HboTest extends BaseClass{
	
	@Test
	public void hboTest() {	
		landingPage.clickSignUp(commonActions);
		priceBox.clickPriceBox(commonActions);
		personalInfo.clickPersonalInfo(commonActions);
		personalInfo.inputFirstName(commonActions, "Muktadir");
		personalInfo.inputLastName(commonActions, "Hussen");
		personalInfo.inputEmail(commonActions, "mhussen10@yahoo.com");
	}
}