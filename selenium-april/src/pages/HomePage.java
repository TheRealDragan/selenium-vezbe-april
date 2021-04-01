package pages;

public class HomePage {
	private String _logo = "Logo";
	private String _searchBar = "Search bar";
	private String _menu = "Menu";
	private String _clearAll = "Clear all";
 
	
	public void getLogo () {
	System.out.println(_logo);
	}
	
	public void getSearchBar () {
		System.out.println(_searchBar);
	}
	
	public void getMenu () {
		System.out.println(_menu);
	}
	
	public void getClearAll () {
		System.out.println(_clearAll);
	}
}
