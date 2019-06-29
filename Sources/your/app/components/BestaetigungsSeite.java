package your.app.components;

import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSArray;

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
	
	
	
	
	private Artikel angabenloopvar;
	
	private NSArray<Inhalt> angabenliste;
	
	public NSArray<Inhalt> inhaltliste() {
		return inhaltliste;
	}
	
	private Inhalt inhaltloopvar;
	
	public Inhalt inhaltloopvar() {
		return inhaltloopvar;
	}
	
	public void setInhaltloopvar(Inhalt inhaltloopvar) {
		this.inhaltloopvar = inhaltloopvar;
	}
	
	public Artikel artikelloopvar() {
		return artikelloopvar;
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