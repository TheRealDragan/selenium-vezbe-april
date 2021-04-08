package pages;

import org.openqa.selenium.WebElement;

public class SignInPage extends BasePage {
	private String _signInWithImdb = "Sign in with Imdb ";
	private String _signInWithAmazon = "Sign in with Amazon";
	private String _signInWithFacebook = "Sign in with Facebook";
	private String _signInWithGoogle = "Sign in with Google";

	public WebElement getSignInWithImdb() {
		return findElement("//body/div[@id='wrapper']/div[@id='root']/div[@id='pagecontent']/div[@id='content-2-wide']/div[@id='signin-options']/div[1]/div[1]/a[1]");
	}

	public WebElement getSignInWithAmazon() {
		return findElement("//body/div[@id='wrapper']/div[@id='root']/div[@id='pagecontent']/div[@id='content-2-wide']/div[@id='signin-options']/div[1]/div[1]/a[2]");
	}
	

	public WebElement getSignInWithFacebook() {
		return findElement("//body/div[@id='wrapper']/div[@id='root']/div[@id='pagecontent']/div[@id='content-2-wide']/div[@id='signin-options']/div[1]/div[1]/a[3]");
	}

	public WebElement getSignInWithGoogle() {
		return findElement("//body/div[@id='wrapper']/div[@id='root']/div[@id='pagecontent']/div[@id='content-2-wide']/div[@id='signin-options']/div[1]/div[1]/a[4]");
	}
}
