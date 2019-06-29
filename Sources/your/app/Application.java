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
		artikel.add(new Artikel("Etui", new java.math.BigDecimal(6.95)));
		artikel.add(new Artikel("Holzschachtel", new java.math.BigDecimal(8.50)));
	}
	
	public NSMutableArray<Artikel> getArtikel() {
		return artikel;
	}
	
	NSMutableArray<Artikel> bestellung = new NSMutableArray<Artikel>();
	
	public void setBestellung(Artikel bestellungRaw) {
		Artikel calculatedBestellung = calculatePrice(bestellungRaw);
		bestellung.add(calculatedBestellung);
	}
	
	public Artikel calculatePrice(Artikel artikel) {
		java.math.BigDecimal total = java.math.BigDecimal.valueOf(0);
		for(int i = 0; artikel.inhalte().size() < i; i++) {
			total = artikel.inhalte().get(i).preis().add(total);
		}
		artikel.setPreis(total);
		return artikel;
	}
	
	public NSMutableArray<Artikel> bestellung() {
		return bestellung;
	}
	
}
