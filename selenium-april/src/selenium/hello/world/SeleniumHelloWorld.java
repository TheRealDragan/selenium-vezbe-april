package selenium.hello.world;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHelloWorld {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver browser = new ChromeDriver();		
         browser.get("http://www.google.com");
         Thread.sleep(5000);
         browser.quit();
         
	}

}
