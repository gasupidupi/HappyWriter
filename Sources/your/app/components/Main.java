package your.app.components;

import com.webobjects.appserver.WOContext;

import your.app.Application;

public class Main extends BaseComponent {
	public Main(WOContext context) {
		super(context);
	}
	
	Application application = (Application)Application.application();
	
	NSMutableArray<Artikel> artikel = application.getArtikel();
}
