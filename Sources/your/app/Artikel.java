package your.app;

import java.math.BigDecimal;

import com.webobjects.foundation.NSMutableArray;

public class Artikel {
	private String bezeichnung;
	private com.ibm.icu.math.BigDecimal preis;
	
	public Artikel(String bezeichnung, com.ibm.icu.math.BigDecimal bigDecimal) {
		this.bezeichnung = bezeichnung;
		this.preis = bigDecimal;
	}
	
	public String bezeichnung() {
		return bezeichnung;
	}
	
	public com.ibm.icu.math.BigDecimal preis() {
		return preis;
	}
	
	public String icon() {
		return null;
	}
	
	public NSMutableArray<Inhalt> inhalte() {
		
		return null;
	}
}
