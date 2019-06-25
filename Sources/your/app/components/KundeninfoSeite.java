package your.app.components;

import com.webobjects.appserver.WOContext;

import your.app.Application;

import com.webobjects.appserver.WOComponent;

public class KundeninfoSeite extends WOComponent {
    public KundeninfoSeite(WOContext context) {
        super(context);
    }
    
    Application application = (Application)Application.application();
    
    
    
    
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
    
    private Integer plz;
    
    public Integer plz() {
    	return plz;
    }

    public void setPlz(Integer plz) {
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

    private Integer bemerkungen;
    
    public Integer bemerkungen() {
    	return bemerkungen;
    }

    public void setBemerkungen(Integer bemerkungen) {
    	this.bemerkungen = bemerkungen;
    }
    
    public void kundesubmitted() {
    	
    }
    
    public void backbuttonpressed() {
    	
    }
}