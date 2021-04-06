package pages;

public class HomePage extends BasePage {
	private String _logo = "Logo";
	private String _searchBar = "Search bar";
	private String _menu = "Menu";
	private String _clearAll = "Clear all";

	public void getLogo() {
		printMessage(_logo);
	}

	public void getSearchBar() {
		printMessage(_searchBar);
	}

	public void getMenu() {
		printMessage(_menu);
	}

	public void getClearAll() {
		printMessage(_clearAll);
	}
}
