package your.app.components;

import com.webobjects.appserver.WOContext;

import er.extensions.components.ERXComponent;
import your.app.Application;

import com.webobjects.appserver.WOComponent;

/**
 * 
 * Das ist der Controller der Loginseite. Auf die Seite kommt man, wenn man auf die Administrationsseite zugreifen will.
 * 
 *
 */
public class LoginSeite extends ERXComponent {
    public LoginSeite(WOContext context) {
        super(context);
    }
    
    //simpleton application
    Application application = (Application)Application.application();


    private String username;
    private String password;
    /**
     * Text der auftaucht bei falscher Eingabe.
     */
    private String errorText;
    
    
    public String errorText() {
		return errorText;
	}

	public void setErrorText(String errorText) {
		this.errorText = errorText;
	}

	public String username() {
    	return username;
    }
    
    public void setUsername(String username) {
    	this.username = username;
    }
    
    public String password() {
    	return password;
    }
    
    public void setPassword(String password) {
    	this.password = password;
    }
    
    /**
     * Sobald der Submitbutton betätigt wird, wird geprüft ob die Angaben mit den vordefinierten Benutzername "admin"
     * und Passwort "klapp42stuhl" übereinstimmen. Wenn es stimmt wird die Administrationsseite aufgerufen. Wenn es
     * nicht stimmt wird der Errortext unter dem Login mit der Fehlermeldung angezeigt.
     * 
     */
    public AdministrationsSeite loginSubmitted() {
    	if(username.equals("admin") && password.equals("klapp42stuhl")) {
    		AdministrationsSeite nextpage = pageWithName(AdministrationsSeite.class);
    		return nextpage;
    		
    	} else {
    		this.setErrorText("Falscher Benutzername oder falsches Passwort!");
    	}
		return null;
    	
    }

    /**
     * Sobald der Backbutton betätigt wird, wird anhand dieser Methode die Main Seite aufgerufen.
     * 
     */
	public Main backbuttonpressed() {
		Main nextpage = pageWithName(Main.class);
		return nextpage;
	}
}