package test;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import browser.Browser;
import imdb.Imdb;

public class BaseTest {

	protected static Imdb imdb;
	
	@BeforeClass
	public static void setup() {
		imdb = new Imdb();
	}
	
	@AfterClass
	public static void cleanup() {
		Browser.getBrowser().quit();
	}
	
	@Before
	public void testSetup() {
		Browser.getBrowser().get("https://www.imdb.com/");
	}
}
