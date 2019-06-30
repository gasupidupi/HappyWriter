package your.app.components;

import com.webobjects.appserver.WOContext;

import er.extensions.components.ERXComponent;
import your.app.Application;

import com.webobjects.appserver.WOComponent;

/**
 * Das ist der Controller für die Administrationsseite.
 * Die Administrationsseite dient dazu Inhalte hinzuzufügen oder zu löschen und die Zuordnung zu ändern. Diese Funktionalität wurde nicht implementiert.
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
     * Um von der Administrationsseite zurück zu der Mainseite zu springen betätigt
     *  man den backbutton auf der Seite was dazu führt, dass diese Methode aufgerufen wird.
     * 
     */
	public Main backbuttonpressed() {
		//nextpage ist hiermit eine Main Seite
		Main nextpage = pageWithName(Main.class);
		return nextpage;
	}
    
}