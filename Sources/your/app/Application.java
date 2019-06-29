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
		
		
		artikel = new NSMutableArray<Artikel>();
		artikel.add(new Artikel("Etui", 6.95));
		artikel.add(new Artikel("Holzschachtel", 8.50));
	}
	
	public NSMutableArray<Artikel> getArtikel() {
		return artikel;
	}
	
	NSMutableArray<Artikel> bestellung = new NSMutableArray<Artikel>();
	
	public void setBestellung(Artikel bestellungRaw) {
		Artikel calculatedBestellung = calculatePrice(bestellungRaw);
		bestellung.add(calculatedBestellung);
	}
	
	public Artikel calculatePrice(Artikel artikel2) {
		long total = (long) artikel2.preis();
		for(int i = 0; artikel2.inhalte().count() > i; i++) {
			total = artikel2.inhalte().get(i).preis() + total;
		}
		artikel2.setPreis(total);
		return artikel2;
	}
	
	public NSMutableArray<Artikel> bestellung() {
		return bestellung;
	}
	
}
