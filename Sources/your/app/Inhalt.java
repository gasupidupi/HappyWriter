package your.app;



import com.webobjects.foundation.NSMutableArray;

public class Inhalt {
	private String name;
	private long preis;
	private String id;
	
	public Inhalt(String id, String name, long preis) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.preis = preis;
	}
	
	public Inhalt(String id, String name) {
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
	
	public long preis() {
		return preis;
	}
	
	public String icon() {
		return null;
	}
	
	public NSMutableArray<Artikel> artikel() {
		return null;
	}
}
