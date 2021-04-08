package test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import browser.Browser;
import imdb.Imdb;
import pages.BasePage;

public class SmokeTest extends BaseTest {
	
	
	
	@Test
	public void searchResultTest() throws InterruptedException {
		Thread.sleep(3000);
		imdb.getHomePage().getSearchBar().clear();
		imdb.getHomePage().getSearchBar().sendKeys("Godzilla");
		Thread.sleep(2000);
		WebElement result = BasePage.findElement("//body/div[@id='__next']/nav[@id='imdbHeader']/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[8]/a[1]/div[2]/div[1]");
		assertEquals ("Godzilla", result.getText());
	}
	
	@Test
	public void socialMediaTest() throws InterruptedException {
		
		Thread.sleep(3000);
		imdb.getHomePage().getSignInButton().click();
		Thread.sleep(2000);
		String imdbButtonText = imdb.getSignInPage().getSignInWithImdb().getText();
		assertEquals ("Sign in with IMDb", imdbButtonText);
		
	}
	
	
	
}
