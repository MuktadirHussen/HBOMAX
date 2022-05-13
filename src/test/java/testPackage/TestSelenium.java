package testPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSelenium {

	public static void main(String [] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.hbomax.com/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element = driver.findElement(By.xpath("(//a[text()='Sign Up Now'])[1]"));
		element.click();
		element = driver.findElement(By.className("//div[@class='lZ^9Qz.%']"));
		element.click();
		element = driver.findElement(By.xpath("(//div[@class='exp-2688-mo'])[1]"));
		element.click();
	}
}