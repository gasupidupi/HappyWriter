package your.app;

import java.math.BigDecimal;

import com.webobjects.foundation.NSMutableArray;

/**
 * 
 * Diese Methode dient als Ersatz der Tabelle Artikel, falls die Datenbank nicht implementiert wurde.
 *
 */
public class Artikel {
	private String bezeichnung;
	private double preis;
	private NSMutableArray<Inhalt> inhalte;
	private String icon;
	
	public Artikel(String bezeichnung, double d, NSMutableArray<Inhalt> inhalte) {
		this.bezeichnung = bezeichnung;
		this.preis = d;
		this.inhalte = inhalte;
	}
	
	public Artikel(String bezeichnung, double d, String icon) {
		this.bezeichnung = bezeichnung;
		this.preis = d;
		this.icon = icon;
	}

	public String bezeichnung() {
		return bezeichnung;
	}
	
	public void setPreis(double total) {
		this.preis = total;
	}
	
	public double preis() {
		return preis;
	}
	
	public String icon() {
		return icon;
	}
	
	public void setInhalte(NSMutableArray<Inhalt> inhalte) {
		this.inhalte = inhalte;
	}
	
	public NSMutableArray<Inhalt> inhalte() {
		
		return inhalte;
	}
}
