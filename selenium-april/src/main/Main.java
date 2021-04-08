package main;

import browser.Browser;
import imdb.Imdb;
import pages.HomePage;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Imdb imdb = new Imdb();
		
		Browser.getBrowser().get("https://www.imdb.com/");
		Thread.sleep(3000);
		imdb.getHomePage().getSearchBar().clear();
		imdb.getHomePage().getSearchBar().sendKeys("Godzilla");
		
		//Browser.getBrowser().quit();
	}

}
