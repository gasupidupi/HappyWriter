package your.app;

import com.webobjects.foundation.NSMutableArray;

import er.extensions.appserver.ERXApplication;

public class Application extends ERXApplication {
	public static void main(String[] argv) {
		ERXApplication.main(argv, Application.class);
	}

	private NSMutableArray<Artikel> artikel;
	
	public Application() {
		ERXApplication.log.info("Welcome to " + name() + " !");
		/* ** put your initialization code in here ** */
		setAllowsConcurrentRequestHandling(true);		
	}
	
	public NSMutableArray<Artikel> getArtikel() {
		return artikel;
	}
}
