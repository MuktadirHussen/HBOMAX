package commons;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class CommonActions {
	
	public void click(WebElement element) {
		element.click();	
		Reporter.log("Element is clicking : " + element);
	}
	public void inputText(WebElement element, String text) {
		element.sendKeys(text);
		Reporter.log(text + " : value passed to the element : " + element);
	}
}