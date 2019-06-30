package your.app.components;

import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;

import er.extensions.components.ERXComponent;
import your.app.Application;
import your.app.Artikel;
import your.app.Inhalt;

import java.math.BigDecimal;

import com.webobjects.appserver.WOComponent;

/**
 * 
 * Diese Klasse dient als Controller der Artikelseite. 
 * Auf der Artikelseite können Inhalte des Artikels ausgewählt werden. 
 *
 */

//extends ERXComponent: Hilfe von Markus Ruggiero angefordert
public class ArtikelSeite extends ERXComponent  {
	
    public ArtikelSeite(WOContext context) {
        super(context);
    }
    
    /**
     * Das ist der simpleton application. Also das Objekt der Application Klasse.
     */
    Application application = (Application)Application.application();
	
	/**
	 * Die Loopvariable für den aktuellen Artikel. Der Name dient nur als wiedererkennungsgründen, weil
	 * nur auf der Main eine Liste mit entsprechender Aufzählung der Artikel existiert und die Main den ausgewählten
	 * Artikel der Artikelseite weitergibt.
	 */
	private Artikel artikelloopvar;
	
	/**
	 * In der inhaltliste werden alle möglichen Inhalte gespeichert.
	 * Leider wird diese Liste nicht funktional eingebaut, jedoch könnte man diese beispielsweise in die Application
	 * Klasse verschieben, damit die Administrationsseite darauf zugreiffen könnte.
	 */
	private NSMutableArray<Inhalt> inhaltliste;
	
	/**
	 * In der checkedinhalt Liste wird gespeichert welche Inhalte auf der Seite anhand von checkboxen ausgewählt wurden.
	 */
	private NSMutableArray<Inhalt> checkedinhalt = new NSMutableArray<Inhalt>();
	
	public NSArray<Inhalt> inhaltliste() {
		return inhaltliste;
	}

	//Hier sind die Variabeln der Inhalte angebracht damit ich sie für die Inhaltliste und den Checkboxen verwenden kann.
	Inhalt schere = new Inhalt("schere", "Schere", 5);
	Inhalt bleistift = new Inhalt("bleistift", "Bleistift", 5);
	Inhalt feder = new Inhalt("feder", "Feder", 5);
	Inhalt lineal = new Inhalt("lineal", "Lineal", 5);
	Inhalt marker = new Inhalt("marker", "Marker", 5);
	Inhalt radiergummi = new Inhalt("radiergummi", "Radiergummi", 5);
	Inhalt spitzer = new Inhalt("spitzer", "Spitzer", 5);
	Inhalt zirkel = new Inhalt("zirkel", "Zirkel", 5);
	
	/**
	 * Hier werden alle möglichen Inhalte in die inhaltliste beigefügt. Es dient der WORepetition um alle Inhalte auf der Seite anzuzeigen.
	 */
	public void setPossibleinhalt() {
		inhaltliste.add(schere);
		inhaltliste.add(bleistift);
		inhaltliste.add(feder);
		inhaltliste.add(lineal);
		inhaltliste.add(marker);
		inhaltliste.add(radiergummi);
		inhaltliste.add(spitzer);
		inhaltliste.add(zirkel);
	}
	
	/**
	 * Die Inhalt Loopvariable dient der WORepetition bzw. der Auflistung aller Inhalte.
	 */
	private Inhalt inhaltloopvar;
	
	public Inhalt inhaltloopvar() {
		return inhaltloopvar;
	}
	
	public void setInhaltloopvar(Inhalt inhaltloopvar) {
		this.inhaltloopvar = inhaltloopvar;
	}

	//Die Artikelloopvariable wird von der Main Seite übergeben. Deswegen wird es in dieser Klasse nicht initialisert.
	public Artikel artikelloopvar() {
		return artikelloopvar;
	}
    
    //Hilfe von Markus Ruggiero angefordert
    public void setartikelloopvar(Artikel artikelloopvar) {
    	this.artikelloopvar = artikelloopvar;
    }
    
    /*Von hier bis zur kommentierten Linie wird geprüft ob die checkbox aktiviert wurde. Diese Art der Implementation hinderte auch die Umsetzung der Administrationsseite,
    weil man somit nicht einfach einen neuen Inhalt hinzufügen kann.*/
    private boolean checkedschere;
    
    public boolean checkedschere() {
    	return checkedschere;
    }
    
    public void setCheckedschere(boolean checkedschere) {
    	if(checkedschere) {
    		checkedinhalt.add(schere);
    	}
    	this.checkedschere = checkedschere;
    }
    
    private boolean checkedbleistift;
    
    public boolean checkedbleistift() {
    	return checkedschere;
    }
    
    public void setCheckedbleistift(boolean checkedbleistift) {
    	if(checkedbleistift) {
    		checkedinhalt.add(bleistift);
    	}
    	this.checkedbleistift = checkedbleistift;
    }
    
    private boolean checkedfeder;
    
    public boolean checkedfeder() {
    	return checkedschere;
    }
    
    public void setCheckedfeder(boolean checkedfeder) {
    	if(checkedfeder) {
    		checkedinhalt.add(feder);
    	}
    	this.checkedfeder = checkedfeder;
    }
    
    private boolean checkedlineal;
    
    public boolean checkedlineal() {
    	return checkedschere;
    }
    
    public void setCheckedlineal(boolean checkedlineal) {
    	if(checkedlineal) {
    		checkedinhalt.add(lineal);
    	}
    	this.checkedlineal = checkedlineal;
    }
    
    private boolean checkedmarker;
    
    public boolean checkedmarker() {
    	return checkedschere;
    }
    
    public void setCheckedmarker(boolean checkedmarker) {
    	if(checkedmarker) {
    		checkedinhalt.add(marker);
    	}
    	this.checkedmarker = checkedmarker;
    }
    
    private boolean checkedradiergummi;
    
    public boolean checkedradiergummi() {
    	return checkedradiergummi;
    }
    
    public void setCheckedradiergummi(boolean checkedradiergummi) {
    	if(checkedradiergummi) {
    		checkedinhalt.add(radiergummi);
    	}
    	this.checkedradiergummi = checkedradiergummi;
    }
    
    private boolean checkedspitzer;
    
    public boolean checkedspitzer() {
    	return checkedspitzer;
    }
    
    public void setCheckedspitzer(boolean checkedspitzer) {
    	if(checkedspitzer) {
    		checkedinhalt.add(spitzer);
    	}
    	this.checkedspitzer = checkedspitzer;
    }
    
    private boolean checkedzirkel;
    
    public boolean checkedzirkel() {
    	return checkedradiergummi;
    }
    
    public void setCheckedzirkel(boolean checkedzirkel) {
    	if(checkedzirkel) {
    		checkedinhalt.add(zirkel);
    	}
    }
    //---------------------------------------------------------------------------------------------------------
    
    /**
     * Sobald der Submitbutton betätigt wird, wird diese Methode aufgerufen. Sie fügt die angekreuzten Inhalte dem
     * Artikel hinzu und übergibt den Artikel der Main Seite. Anschliessend wird die Bestellungsliste, die in der Application zu finden ist,
     * um den Artikel erweitert. Schlussendlich wird die Main Seite aufgerufen.
     */
	public Main inhaltsubmitted() {
		Main nextpage = pageWithName(Main.class);
		artikelloopvar.setInhalte(checkedinhalt);
		Artikel newartikelloopvar = new Artikel(artikelloopvar.bezeichnung(), artikelloopvar.preis(), artikelloopvar.inhalte());
		nextpage.setArtikelloopvar(newartikelloopvar);
		application.setBestellung(newartikelloopvar);
		return nextpage;
	}
    
	/**
	 * Sobald der Backbutton auf der Artikelseite betätgit wird, navigiert die Applikation zu der Main Seite.
	 */
	public Main backbuttonpressed() {
		Main nextpage = pageWithName(Main.class);
		return nextpage;
	}
	
	public String icon() {
		return artikelloopvar.icon();
	}
}