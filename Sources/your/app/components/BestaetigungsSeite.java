package your.app.components;

import your.app.eo.*;
import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSArray;

import er.extensions.components.ERXComponent;
import your.app.Application;
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
	
	
	
	
	private Kunde kundeloopvar;
	
	private NSArray<String> angabenliste;
	
	public NSArray<String> angabenliste() {
		return fillangabenliste();
	}
	
	public NSArray<String> fillangabenliste() {
		angabenliste.add("");
		return angabenliste;
	}
	
	public Kunde kundeloopvar() {
		return kundeloopvar;
	}
	
	public void setKundeloopvar(Kunde kundeloopvar) {
		this.kundeloopvar = kundeloopvar;
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