package your.app;


import com.webobjects.foundation.NSMutableArray;

import er.extensions.appserver.ERXApplication;

/**
 * 
 * Diese Klasse wird als erstes aufgerufen. Es ist in den Controller als Simpleton aufrufbar.
 *
 */
public class Application extends ERXApplication {
	public static void main(String[] argv) {
		ERXApplication.main(argv, Application.class);
	}

	/**
	 * Alle zu verkaufenden Artikel.
	 */
	private NSMutableArray<Artikel> artikel;
	
	public Application() {
		ERXApplication.log.info("Welcome to " + name() + " !");
		/* ** put your initialization code in here ** */
		setAllowsConcurrentRequestHandling(true);
		
		//Artikel in die Liste einfügen
		artikel = new NSMutableArray<Artikel>();
		artikel.add(new Artikel("Etui", (double) 6.95, "etui.png"));
		artikel.add(new Artikel("Holzschachtel", (double) 8.50, "holzschachtel.png"));
	}
	
	public NSMutableArray<Artikel> getArtikel() {
		return artikel;
	}
	
	/**
	 * Der Warenkorb. Hier werden ausgewählte Artikel gespeichert.
	 */
	NSMutableArray<Artikel> bestellung = new NSMutableArray<Artikel>();
	
	public void setBestellung(Artikel bestellungRaw) {
		Artikel calculatedBestellung = calculatePrice(bestellungRaw);
		bestellung.add(calculatedBestellung);
	}
	
	/**
	 * In dieser Methode wird der Preis berechnet.
	 */
	public Artikel calculatePrice(Artikel artikel2) {
		//Zuerst wird der Preis des angegebenen Artikel selbst zum Total hinzugefügt.
		long total = (long) artikel2.preis();
		//Es wird jeder Inhalt iteriert und der Preis davon zum Total addiert.
		for(int i = 0; artikel2.inhalte().count() > i; i++) {
			total = artikel2.inhalte().get(i).preis() + total;
		}
		//Das Total wird als neuer bzw. eigentliche Preis des Artikels eingefügt.
		artikel2.setPreis(total);
		return artikel2;
	}
	
	public NSMutableArray<Artikel> bestellung() {
		return bestellung;
	}

	public void setArtikel(Artikel artikel) {
		// TODO Auto-generated method stub
		this.artikel.add(artikel);
	}
	
}
