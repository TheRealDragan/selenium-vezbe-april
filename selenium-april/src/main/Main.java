package main;

import imdb.Imdb;
import pages.HomePage;

public class Main {

	public static void main(String[] args) {
		
		Imdb imdb = new Imdb();
		imdb.getHomePage().getLogo();
		imdb.getHomePage().getSearchBar();
		imdb.getHomePage().getMenu();
		imdb.getHomePage().getClearAll();
		
		
	}

}
