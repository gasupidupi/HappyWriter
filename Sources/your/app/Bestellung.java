package your.app;

import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;

public class Bestellung {
	private Artikel artikel;
	private NSArray<Inhalt> inhalt;
	
	
	public Bestellung(Artikel artikel, NSArray<Inhalt> inhalt) {
		this.artikel = artikel;
		this.inhalt = inhalt;
	}


	
	
}
