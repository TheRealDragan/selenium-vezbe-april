package pages;

import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	private String _logo = "Logo";
	private String _searchBar = "Search bar";
	private String _menu = "Menu";
	private String _clearAll = "Clear all";

	public WebElement getLogo() {
		return findElement("//*[@id='home_img']");
	}

	public WebElement getSearchBar() {
		return findElement("//input[@id='suggestion-search']");
	}

	public WebElement getMenu() {
		return findElement("//body/div[@id='__next']/nav[@id='imdbHeader']/div[2]/label[1]/*[1]");
	}

	public void getClearAll() {
		printMessage(_clearAll);
	}
}
