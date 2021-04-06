package imdb;

import pages.CreateAccountPage;
import pages.FilmPage;
import pages.HomePage;
import pages.SignInPage;

public class Imdb {
	private HomePage homePage;
	private CreateAccountPage createAccountPage;
	private SignInPage signInPage;
	private FilmPage filmPage;
	
	public HomePage getHomePage() {
		if (homePage == null) {
			homePage = new HomePage();
		}
		return homePage;
	}
	
	public CreateAccountPage getCreateAccountPage() {
		if (createAccountPage == null) {
			createAccountPage = new CreateAccountPage();
		}
		return createAccountPage;
	}
	
	public SignInPage getSignInPage() {
		if (signInPage == null) {
			signInPage = new SignInPage();
		}
		return signInPage;
	}
	
	public FilmPage getFilmPage() {
		if (filmPage == null) {
			filmPage = new FilmPage();
		}
		return filmPage;
	}
}
