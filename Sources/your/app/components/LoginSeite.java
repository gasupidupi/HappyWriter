package your.app.components;

import com.webobjects.appserver.WOContext;

import your.app.Application;

import com.webobjects.appserver.WOComponent;

public class LoginSeite extends WOComponent {
    public LoginSeite(WOContext context) {
        super(context);
    }
    
    Application application = (Application)Application.application();
}