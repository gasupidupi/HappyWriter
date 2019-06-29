package your.app;

import java.math.BigDecimal;

import com.webobjects.foundation.NSMutableArray;

public class Artikel {
	private String bezeichnung;
	private java.math.BigDecimal preis;
	private NSMutableArray<Inhalt> inhalte;
	
	public Artikel(String bezeichnung, java.math.BigDecimal bigDecimal) {
		this.bezeichnung = bezeichnung;
		this.preis = bigDecimal;
	}
	
	public String bezeichnung() {
		return bezeichnung;
	}
	
	public void setPreis(java.math.BigDecimal total) {
		this.preis = total;
	}
	
	public java.math.BigDecimal preis() {
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
