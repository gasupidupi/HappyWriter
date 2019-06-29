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

public class BestaetigungsSeite extends ERXComponent {
    private Kunde kunde;
    
    Application application = (Application)Application.application();

	public BestaetigungsSeite(WOContext context) {
        super(context);
    }

	public void setkunde(Kunde kunde) {
		this.kunde = kunde;
	}
	
	
	
	
	private Angabe angabeloopvar;
	
	private NSMutableArray<Angabe> angabenliste = new NSMutableArray<Angabe>();
	
	public NSArray<Angabe> angabenliste() {
		return fillangabenliste();
	}
	
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
	
	
	
	
	
	
	public KundeninfoSeite backbuttonpressed() {
		KundeninfoSeite nextpage = pageWithName(KundeninfoSeite.class);
		nextpage.setkunde(kunde);
		return nextpage;
	}
	
	public DankesSeite bestaetigungsubmitted() {
		DankesSeite nextpage = pageWithName(DankesSeite.class);
		return nextpage;
	}
}