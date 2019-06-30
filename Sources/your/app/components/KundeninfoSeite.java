package your.app.components;

import com.webobjects.appserver.WOContext;

import er.extensions.components.ERXComponent;
import your.app.Application;
import your.app.Kunde;

import com.webobjects.appserver.WOComponent;

/**
 * Das ist der Controller der Kundeninfoseite.
 * Auf der Kundeninfoseite kann der Kunde seine Daten angeben.
 *
 */
public class KundeninfoSeite extends ERXComponent {
    public KundeninfoSeite(WOContext context) {
        super(context);
    }
    
    //simpleton application
    Application application = (Application)Application.application();
    
    /**
     * Der aktuelle Kunde, der die Daten angibt.
     */
    private Kunde kunde;
    
    
    //Angaben des Kunde bis zum Kommentarstrich
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
    
    public void setBemerkungen(String bemerkungen) {
    	this.bemerkungen = bemerkungen;
    }
    //------------------------------------------------------------------------------------
    
    /**
     * Diese Methode wird aufgerufen wenn der Submitbutton betätigt wird.
     * In dieser Methode wird die Bestätigunsseite initialisiert, der Kunde wird initialisiert und der Bestätigungsseite übergeben, 
     * die anschliessend aufgerufen wird.
     * 
     */
    public BestaetigungsSeite kundesubmitted() {
		BestaetigungsSeite nextpage = pageWithName(BestaetigungsSeite.class);
		kunde = new Kunde(name, vorname, strasse, plz, ort, telefon, bemerkungen);
		nextpage.setkunde(kunde);
		return nextpage;
    }
    
    /**
     * Diese Methode wird aufgerufen wenn der Backbutton betätigt wird.
     * Es wird die Main Seite aufgerufen.
     * 
     */
    public Main backbuttonpressed() {
    	Main nextpage = pageWithName(Main.class);
		return nextpage;	
    }

	public void setkunde(Kunde kunde) {
		// TODO Auto-generated method stub
		this.kunde = kunde;
	}
}