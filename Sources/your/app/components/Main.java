package your.app.components;

import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSMutableArray;

import your.app.Application;
import your.app.Artikel;
import your.app.Inhalt;

/**
 * Das ist der Controller der Main Seite.
 * Auf der Seite erreicht man als erstes. Hier kann man einen Artikel ausw�hlen und den Warenkorb betrachten.
 * Anhand eines Hyperlinks gel�ngt man zu der Loginseite oder zum checkout.
 *
 */
public class Main extends BaseComponent {
	public Main(WOContext context) {
		super(context);
	}
	
	//simpleton application
	Application application = (Application)Application.application();
	
	/**
	 * Hier sind alle ausw�hlbaren Artikel gespeichert.
	 */
	NSMutableArray<Artikel> artikel = application.getArtikel();
	
	/**
	 * Die Bestellungsloopvariable dient der WORepetition.
	 */
	private Artikel bestellungloopvar;
	
	public Artikel bestellungloopvar() {
		return bestellungloopvar;
	}
	
	public void setBestellungloopvar(Artikel bestellungloopvar) {
		this.bestellungloopvar = bestellungloopvar;
	}
	
	/**
	 * Der Name des Objektes im Warenkorb.
	 */
	private String bestellungartikelname;
	
	public void setBestellungartikelname(String bestellungartikelname) {
		this.bestellungartikelname = bestellungartikelname;
	}
	
	public String bestellungartikelname() {
		return bestellungloopvar.bezeichnung();
	}
	
	/**
	 * Der Preis des Objektes im Warenkorb.
	 */
	private String bestellungartikelpreis;
	
	public void setBestellungartikelpreis(String bestellungartikelpreis) {
		this.bestellungartikelpreis = bestellungartikelpreis;
	}
	
	public String bestellungartikelpreis() {
		return String.valueOf(bestellungloopvar.preis());
	}
	
	/**
	 * Die Artikelloopvariable dient der WORepetition.
	 */
	private Artikel artikelloopvar;
	
	public Artikel artikelloopvar() {
		return artikelloopvar;
	}
	
	public void setArtikelloopvar(Artikel artikelloopvar) {
		this.artikelloopvar = artikelloopvar;
	}
	
	/**
	 * Sobald ein Artikel ausgew�hlt wurde, wird der Artikel der Artikelseite �bergeben, die anschliessend aufgerufen wird.
	 * 
	 */
	public ArtikelSeite showdetail() {
		ArtikelSeite nextpage = pageWithName(ArtikelSeite.class);
		nextpage.setartikelloopvar(artikelloopvar);
		return nextpage;
	}
	
	/**
	 * Wenn man den Hyperlink checkout bet�tigt wird die Kundeninfoseite aufgerufen.
	 */
	public KundeninfoSeite checkout() {
		KundeninfoSeite nextpage = pageWithName(KundeninfoSeite.class);
		return nextpage;
	}
	
	/**
	 * Wenn man den Hyperlink login bet�tigt wird die Loginseite aufgerufen.
	 */
	public LoginSeite login() {
		LoginSeite nextpage = pageWithName(LoginSeite.class);
		return nextpage;
	}
}
