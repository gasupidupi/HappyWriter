package your.app;

import java.math.BigDecimal;

import com.webobjects.foundation.NSMutableArray;

public class Artikel {
	private String bezeichnung;
	private com.ibm.icu.math.BigDecimal preis;
	private NSMutableArray<Inhalt> inhalte;
	
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
	
	public void setInhalte(NSMutableArray<Inhalt> inhalte) {
		this.inhalte = inhalte;
	}
	
	public NSMutableArray<Inhalt> inhalte() {
		
		return null;
	}
}
