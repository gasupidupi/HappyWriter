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

//extends ERXComponent: Hilfe von Markus Ruggiero angefordert
public class ArtikelSeite extends ERXComponent  {
	
	private Artikel artikelloopvar;
	
	private NSMutableArray<Inhalt> inhaltliste;
	
	private NSMutableArray<Inhalt> checkedinhalt = new NSMutableArray<Inhalt>();
	
	public NSArray<Inhalt> inhaltliste() {
		return inhaltliste;
	}
	
	public void setPossibleinhalt() {
		inhaltliste.add(new Inhalt("schere", "Schere", 5));
		inhaltliste.add(new Inhalt("bleistift", "Bleistift", 5));
		inhaltliste.add(new Inhalt("feder", "Feder", 5));
		inhaltliste.add(new Inhalt("lineal", "Lineal", 5));
		inhaltliste.add(new Inhalt("marker", "Marker", 5));
		inhaltliste.add(new Inhalt("radiergummi", "Radiergummi", 5));
		inhaltliste.add(new Inhalt("spitzer", "Spitzer", 5));
		inhaltliste.add(new Inhalt("zirkel", "Zirkel", 5));
	}
	
	private Inhalt inhaltloopvar;
	
	public Inhalt inhaltloopvar() {
		return inhaltloopvar;
	}
	
	public void setInhaltloopvar(Inhalt inhaltloopvar) {
		this.inhaltloopvar = inhaltloopvar;
	}
	
    public ArtikelSeite(WOContext context) {
        super(context);
    }
    
    Application application = (Application)Application.application();
    
	public Artikel artikelloopvar() {
		return artikelloopvar;
	}
    
    //Hilfe von Markus Ruggiero angefordert
    public void setartikelloopvar(Artikel artikelloopvar) {
    	this.artikelloopvar = artikelloopvar;
    }
    
    private boolean checkedschere;
    
    public boolean checkedschere() {
    	return checkedschere;
    }
    
    public void setCheckedschere(boolean checkedschere) {
    	if(checkedschere) {
    		checkedinhalt.add(new Inhalt("schere", "Schere", 5));
    	}
    	this.checkedschere = checkedschere;
    }
    
    private boolean checkedbleistift;
    
    public boolean checkedbleistift() {
    	return checkedschere;
    }
    
    public void setCheckedbleistift(boolean checkedbleistift) {
    	if(checkedbleistift) {
    		checkedinhalt.add(new Inhalt("bleistift", "Bleistift", 5));
    	}
    	this.checkedbleistift = checkedbleistift;
    }
    
    private boolean checkedfeder;
    
    public boolean checkedfeder() {
    	return checkedschere;
    }
    
    public void setCheckedfeder(boolean checkedfeder) {
    	if(checkedfeder) {
    		checkedinhalt.add(new Inhalt("feder", "Feder", 5));
    	}
    	this.checkedfeder = checkedfeder;
    }
    
    private boolean checkedlineal;
    
    public boolean checkedlineal() {
    	return checkedschere;
    }
    
    public void setCheckedlineal(boolean checkedlineal) {
    	if(checkedlineal) {
    		checkedinhalt.add(new Inhalt("lineal", "Lineal", 5));
    	}
    	this.checkedlineal = checkedlineal;
    }
    
    private boolean checkedmarker;
    
    public boolean checkedmarker() {
    	return checkedschere;
    }
    
    public void setCheckedmarker(boolean checkedmarker) {
    	if(checkedmarker) {
    		checkedinhalt.add(new Inhalt("marker", "Marker", 5));
    	}
    	this.checkedmarker = checkedmarker;
    }
    
    private boolean checkedradiergummi;
    
    public boolean checkedradiergummi() {
    	return checkedradiergummi;
    }
    
    public void setCheckedradiergummi(boolean checkedradiergummi) {
    	if(checkedradiergummi) {
    		checkedinhalt.add(new Inhalt("radiergummi", "Radiergummi", 5));
    	}
    	this.checkedradiergummi = checkedradiergummi;
    }
    
    private boolean checkedspitzer;
    
    public boolean checkedspitzer() {
    	return checkedspitzer;
    }
    
    public void setCheckedspitzer(boolean checkedspitzer) {
    	if(checkedspitzer) {
    		checkedinhalt.add(new Inhalt("spitzer", "Spitzer", 5));
    	}
    	this.checkedspitzer = checkedspitzer;
    }
    
    private boolean checkedzirkel;
    
    public boolean checkedzirkel() {
    	return checkedradiergummi;
    }
    
    public void setCheckedzirkel(boolean checkedzirkel) {
    	if(checkedzirkel) {
    		checkedinhalt.add(new Inhalt("zirkel", "Zirkel", 5));
    	}
    }
    
	public Main inhaltsubmitted() {
		Main nextpage = pageWithName(Main.class);
		//fix this later
		//nextpage.setBestellung(artikelloopvar);
		artikelloopvar.setInhalte(checkedinhalt);
		Artikel newartikelloopvar = new Artikel(artikelloopvar.bezeichnung(), artikelloopvar.preis(), artikelloopvar.inhalte());
		//application.setArtikel(newartikelloopvar);
		nextpage.setArtikelloopvar(newartikelloopvar);
		application.setBestellung(newartikelloopvar);
		return nextpage;
	}
    
	public Main backbuttonpressed() {
		Main nextpage = pageWithName(Main.class);
		return nextpage;
	}
}