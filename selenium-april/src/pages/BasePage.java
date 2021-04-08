package pages;

import org.openqa.selenium.WebElement;
import browser.Browser;

public class BasePage {
	
	public void printMessage(String printMessage) {
		System.out.println("Sada stampamo sledeci parametar: "+printMessage);
	}
	
	public WebElement findElement (String xpath) {
		return Browser.getBrowser().findElementByXPath(xpath);		
	}
	
	
}
