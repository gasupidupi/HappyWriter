package your.app;

import java.math.BigDecimal;

import com.webobjects.foundation.NSMutableArray;

public class Inhalt {
	private String name;
	private BigDecimal preis;
	
	public String name() {
		return name;
	}
	
	public BigDecimal preis() {
		return preis();
	}
	
	public String icon() {
		return null;
	}
	
	public NSMutableArray<Artikel> artikel() {
		return null;
	}
}
