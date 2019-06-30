package your.app.components;

import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;

import er.extensions.components.ERXComponent;
import your.app.Application;
import your.app.Artikel;
import your.app.Inhalt;
import your.app.Kunde;

import java.math.BigDecimal;

import com.webobjects.appserver.WOComponent;

/**
 * Das ist die Controller Klasse der Best�tigungsseite. Auf dieser Seite sieht der Benutzer seine auf der Kundeninfoseite eingegebenen Daten wieder
 * und kann diese �berpr�fen.
 * 
 */
public class BestaetigungsSeite extends ERXComponent {
    private Kunde kunde;
    
    //Simpleton application
    Application application = (Application)Application.application();

	public BestaetigungsSeite(WOContext context) {
        super(context);
    }

	public void setkunde(Kunde kunde) {
		this.kunde = kunde;
	}
	
	
	
	/**
	 * Die Angbeloopvariable dient der WORepetition um die Angaben aufzulisten.
	 */
	private Angabe angabeloopvar;
	
	/**
	 * Die Angabenliste dient der WORepetition. Hier werden sp�ter alle Angaben des Kunden einzeln eingef�gt.
	 */
	private NSMutableArray<Angabe> angabenliste = new NSMutableArray<Angabe>();
	
	public NSArray<Angabe> angabenliste() {
		return fillangabenliste();
	}
	
	/**
	 * In dieser Methode werden jede einzelnen Angaben z.B Name oder Vorname in die Angabenliste eingef�gt.
	 */
	public NSArray<Angabe> fillangabenliste() {
		angabenliste.add(new Angabe("Name", kunde.name()));
		angabenliste.add(new Angabe("Vorname", kunde.vorname()));
		angabenliste.add(new Angabe("Strasse", kunde.strasse()));
		angabenliste.add(new Angabe("PLZ", kunde.plz()));
		angabenliste.add(new Angabe("Ort", kunde.ort()));
		angabenliste.add(new Angabe("Telefon", kunde.telefon()));
		angabenliste.add(new Angabe("Bemerkungen", kunde.bemerkungen()));
		return angabenliste;
	}
	
	public Angabe angabeloopvar() {
		return angabeloopvar;
	}
	
	public void setAngabeloopvar(Angabe angabeloopvar) {
		this.angabeloopvar = angabeloopvar;
	}
	
	/**
	 * Sobald der Backbutton auf der Seite bet�tigt wird, wird diese Methode augerufen. Die Kundeninformationen werden
	 * der Kundeninfoseite gegeben und die Kundeninfoseite wird aufgerufen.
	 * 
	 */
	public KundeninfoSeite backbuttonpressed() {
		KundeninfoSeite nextpage = pageWithName(KundeninfoSeite.class);
		nextpage.setkunde(kunde);
		return nextpage;
	}
	
	/**
	 * Wenn der Best�tigungstaster bet�tigt wird, wird anhand dieser Methode die Dankesseite aufgerufen.
	 */
	public DankesSeite bestaetigungsubmitted() {
		DankesSeite nextpage = pageWithName(DankesSeite.class);
		session().terminate();
		return nextpage;
	}
}