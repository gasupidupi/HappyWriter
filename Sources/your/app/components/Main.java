package your.app.components;

import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSMutableArray;

import your.app.Application;
import your.app.Artikel;
import your.app.Inhalt;


public class Main extends BaseComponent {
	public Main(WOContext context) {
		super(context);
	}
	
	Application application = (Application)Application.application();
	
	NSMutableArray<Artikel> artikel = application.getArtikel();
	
	NSMutableArray<Artikel> bestellung;
	
	private Artikel artikelloopvar;
	
	public Artikel artikelloopvar() {
		return artikelloopvar;
	}
	
	public void setArtikelloopvar(Artikel artikelloopvar) {
		this.artikelloopvar = artikelloopvar;
	}
	
	public void setBestellung(Artikel artikel) {
		bestellung.add(artikel);
	}
	
	public ArtikelSeite showdetail() {
		ArtikelSeite nextpage = pageWithName(ArtikelSeite.class);
		nextpage.setartikelloopvar(artikelloopvar);
		return nextpage;
	}
	
	public KundeninfoSeite checkout() {
		KundeninfoSeite nextpage = pageWithName(KundeninfoSeite.class);
		return nextpage;
	}
}
