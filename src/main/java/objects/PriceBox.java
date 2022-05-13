package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.CommonActions;

public class PriceBox {
	
	public PriceBox(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
    @FindBy(id="exp-2688-avod-mo")
    WebElement priceBoxElement;
    
    public void clickPriceBox(CommonActions commonActions) {
    	commonActions.click(priceBoxElement);
    }
}