package your.app.components;

import com.webobjects.appserver.WOContext;
import your.app.eo.*;

import er.extensions.components.ERXComponent;
import your.app.Application;
import com.webobjects.appserver.WOComponent;

public class KundeninfoSeite extends ERXComponent {
    public KundeninfoSeite(WOContext context) {
        super(context);
    }
    
    Application application = (Application)Application.application();
    
    private Kunde kunde;
    
 private String name;
    
    public String name() {
    	return name;
    }

    public void setName(String name) {
    	this.name = name;
    }
    
    private String vorname;
    
    public String vorname() {
    	return vorname;
    }

    public void setVorname(String vorname) {
    	this.vorname = vorname;
    }
    
    private String strasse;
    
    public String strasse() {
    	return strasse;
    }

    public void setStrasse(String strasse) {
    	this.strasse = strasse;
    }
    
    private String plz;
    
    public String plz() {
    	return plz;
    }

    public void setPlz(String plz) {
    	this.plz = plz;
    }
    
    private String ort;
    
    public String ort() {
    	return ort;
    }

    public void setOrt(String ort) {
    	this.ort = ort;
    }
    
    private String telefon;
    
    public String telefon() {
    	return telefon;
    }

    public void setTelefon(String telefon) {
    	this.telefon = telefon;
    }

    private String bemerkungen;
    
    public String bemerkungen() {
    	return bemerkungen;
    }
    
    public BestaetigungsSeite kundesubmitted() {
		BestaetigungsSeite nextpage = pageWithName(BestaetigungsSeite.class);
		
		nextpage.setkunde(kunde);
		return nextpage;
    }
    
    public Main backbuttonpressed() {
    	Main nextpage = pageWithName(Main.class);
		return nextpage;	
    }

	public void setkunde(Kunde kunde) {
		// TODO Auto-generated method stub
		this.kunde = kunde;
	}
}