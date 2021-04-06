package pages;

public class CreateAccountPage extends BasePage {
	private String _name = "Name";
	private String _mail = "Mail";
	private String _password = "Password";
	private String _createAccount = "Create account";

	public void getName() {
		printMessage(_name);
	}

	public void getMail() {
		printMessage(_mail);
	}

	public void getPassword() {
		printMessage(_password);
	}

	public void getCreateAccount() {
		printMessage(_createAccount);
	}
}
