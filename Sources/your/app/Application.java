package your.app;

import com.ibm.icu.math.BigDecimal;
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
		
		artikel = new NSMutableArray<Artikel>();
		artikel.add(new Artikel("Etui", new BigDecimal(6.95)));
		artikel.add(new Artikel("Holzschachtel", new BigDecimal(8.50)));
	}
	
	public NSMutableArray<Artikel> getArtikel() {
		return artikel;
	}
}
