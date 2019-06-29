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
	
	private Artikel bestellungloopvar;
	
	public Artikel bestellungloopvar() {
		return bestellungloopvar;
	}
	
	public void setBestellungloopvar(Artikel bestellungloopvar) {
		this.bestellungloopvar = bestellungloopvar;
	}
	
	private String bestellungartikelname;
	
	public void setBestellungartikelname(String bestellungartikelname) {
		this.bestellungartikelname = bestellungartikelname;
	}
	
	public String bestellungartikelname() {
		return bestellungloopvar.bezeichnung();
	}
	
	private String bestellungartikelpreis;
	
	public void setBestellungartikelpreis(String bestellungartikelpreis) {
		this.bestellungartikelpreis = bestellungartikelpreis;
	}
	
	public String bestellungartikelpreis() {
		return bestellungloopvar.preis().toString();
	}
	
	private Artikel artikelloopvar;
	
	public Artikel artikelloopvar() {
		return artikelloopvar;
	}
	
	public void setArtikelloopvar(Artikel artikelloopvar) {
		this.artikelloopvar = artikelloopvar;
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
