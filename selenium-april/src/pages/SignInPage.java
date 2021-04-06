package pages;

public class SignInPage extends BasePage {
	private String _signInWithImdb = "Sign in with Imdb ";
	private String _signInWithAmazon = "Sign in with Amazon";
	private String _signInWithFacebook = "Sign in with Facebook";
	private String _signInWithGoogle = "Sign in with Google";

	public void getSignInWithImdb() {
		printMessage(_signInWithImdb);
	}

	public void getSignInWithAmazon() {
		printMessage(_signInWithAmazon);
	}

	public void getSignInWithFacebook() {
		printMessage(_signInWithFacebook);
	}

	public void getSignInWithGoogle() {
		printMessage(_signInWithGoogle);
	}
}
