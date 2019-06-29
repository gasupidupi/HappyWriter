package your.app;

import java.math.BigDecimal;

import com.webobjects.foundation.NSMutableArray;

public class Inhalt {
	private String name;
	private BigDecimal preis;
	private String id;
	
	public Inhalt(String id, String name, BigDecimal preis) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}

	public String name() {
		return name;
	}
	
	public String id() {
		return id;
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
