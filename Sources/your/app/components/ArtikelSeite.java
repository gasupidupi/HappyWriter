package your.app.components;

import com.webobjects.appserver.WOContext;

import er.extensions.components.ERXComponent;
import your.app.Application;
import your.app.Artikel;

import com.webobjects.appserver.WOComponent;

//extends ERXComponent: Hilfe von Markus Ruggiero angefordert
public class ArtikelSeite extends ERXComponent  {
	
	private Artikel artikelloopvar;
	
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
    	this.checkedschere = checkedschere;
    }
    
    private boolean checkedbleistift;
    
    public boolean checkedbleistift() {
    	return checkedschere;
    }
    
    public void setCheckedbleistift(boolean checkedbleistift) {
    	this.checkedbleistift = checkedbleistift;
    }
    
    private boolean checkedfeder;
    
    public boolean checkedfeder() {
    	return checkedschere;
    }
    
    public void setCheckedfeder(boolean checkedfeder) {
    	this.checkedfeder = checkedfeder;
    }
    
    private boolean checkedlineal;
    
    public boolean checkedlineal() {
    	return checkedschere;
    }
    
    public void setCheckedlineal(boolean checkedlineal) {
    	this.checkedlineal = checkedlineal;
    }
    
    private boolean checkedmarker;
    
    public boolean checkedmarker() {
    	return checkedschere;
    }
    
    public void setCheckedmarker(boolean checkedmarker) {
    	this.checkedmarker = checkedmarker;
    }
    
    private boolean checkedradiergummi;
    
    public boolean checkedradiergummi() {
    	return checkedradiergummi;
    }
    
    public void setCheckedradiergummi(boolean checkedradiergummi) {
    	this.checkedradiergummi = checkedradiergummi;
    }
    
    private boolean checkedspitzer;
    
    public boolean checkedspitzer() {
    	return checkedspitzer;
    }
    
    public void setCheckedspitzer(boolean checkedspitzer) {
    	this.checkedspitzer = checkedspitzer;
    }
    
    private boolean checkedzirkel;
    
    public boolean checkedzirkel() {
    	return checkedradiergummi;
    }
    
    public void setCheckedzirkel(boolean checkedzirkel) {
    	this.checkedzirkel = checkedzirkel;
    }
    
	public Main inhaltsubmitted() {
		Main nextpage = pageWithName(Main.class);
		//fix this later
		//nextpage.setBestellung(artikelloopvar);
		return nextpage;
	}
    
}