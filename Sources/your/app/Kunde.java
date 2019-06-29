/**
 * 
 */
package your.app;

/**
 * @author ADMIN
 *
 */
public class Kunde {

	public Kunde(String name, String vorname, String strasse, String plz, String ort, String telefon, String bemerkungen) {
		this.name = name;
		this.vorname = vorname;
		this.strasse = strasse;
		this.plz = plz;
		this.ort = ort;
		this.telefon = telefon;
		this.bemerkungen = bemerkungen;
	}
	
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
	
}
