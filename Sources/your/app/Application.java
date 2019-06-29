package your.app;

import com.ibm.icu.math.BigDecimal;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSMutableArray;

import er.extensions.appserver.ERXApplication;
import your.app.eo.Artikel;

public class Application extends ERXApplication {
	public static void main(String[] argv) {
		ERXApplication.main(argv, Application.class);
	}

	private NSMutableArray<Artikel> artikel;
	
	EOEditingContext editingContext = new EOEditingContext();
	
	public EOEditingContext getEditingContext() {
		return editingContext;
	}

	public Application() {
		ERXApplication.log.info("Welcome to " + name() + " !");
		/* ** put your initialization code in here ** */
		setAllowsConcurrentRequestHandling(true);
		
		addArtikel("Etui", BigDecimal.valueOf(5.95));
		addArtikel("Holzschachtel", BigDecimal.valueOf(7.45));
		
		artikel = new NSMutableArray<Artikel>();

	}
	
	public NSMutableArray<Artikel> getArtikel() {
		return artikel;
	}
	
    public void addArtikel(String bezeichnung, BigDecimal preis) {
    	Artikel artikel = new Artikel();
    	editingContext.insertObject(artikel);
    	artikel.setBezeichnung(bezeichnung);
    	artikel.setPreis(7);
    	
    }
}
