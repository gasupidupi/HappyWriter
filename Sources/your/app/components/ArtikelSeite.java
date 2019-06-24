package your.app.components;

import com.webobjects.appserver.WOContext;

import your.app.Application;
import your.app.Artikel;

import com.webobjects.appserver.WOComponent;

public class ArtikelSeite extends WOComponent {
	
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
}