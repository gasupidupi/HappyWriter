package your.app.components;

import com.webobjects.appserver.WOContext;

import er.extensions.components.ERXComponent;
import your.app.Application;

import com.webobjects.appserver.WOComponent;

/**
 * Das ist der Controller f�r die Administrationsseite.
 * Die Administrationsseite dient dazu Inhalte hinzuzuf�gen oder zu l�schen und die Zuordnung zu �ndern. Diese Funktionalit�t wurde nicht implementiert.
 * Die Administrationsseite ist anhand der Loginseite aufrufbar, wenn man sich als admin anmeldet.
 * 
 */

public class AdministrationsSeite extends ERXComponent {
    public AdministrationsSeite(WOContext context) {
        super(context);
    }
    
    /**
     * Hier wird der simpleton application eingebunden.
     * 
     */
    Application application = (Application)Application.application();
    
    /**
     * Um von der Administrationsseite zur�ck zu der Mainseite zu springen bet�tigt
     *  man den backbutton auf der Seite was dazu f�hrt, dass diese Methode aufgerufen wird.
     * 
     */
	public Main backbuttonpressed() {
		//nextpage ist hiermit eine Main Seite
		Main nextpage = pageWithName(Main.class);
		return nextpage;
	}
    
}