package pages;

public class FilmPage extends BasePage {
	private String _rate = "Rate";
	private String _year = "Year";
	private String _photos = "Photos";
	private String _cast = "Cast";

	public void getRate() {
		printMessage(_rate);
	}

	public void getYear() {
		printMessage(_year);
	}

	public void getPhotos() {
		printMessage(_photos);
	}

	public void getCast() {
		printMessage(_cast);
	}
}
