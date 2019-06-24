package your.app;

import java.math.BigDecimal;

import com.webobjects.foundation.NSMutableArray;

public class Artikel {
	private String bezeichnung;
	private BigDecimal preis;
	
	public String bezeichnung() {
		return bezeichnung;
	}
	
	public BigDecimal preis() {
		return preis;
	}
	
	public String icon() {
		return null;
	}
	
	public NSMutableArray<Inhalt> inhalte() {
		
		return null;
	}
}
