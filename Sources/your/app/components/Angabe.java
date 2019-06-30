package your.app.components;

/**
 * Das ist die Angabe Klasse. Sie dient dazu eine Art dictionary zu simulieren, 
 * damit die Best�tigungsseite je die Werte des Kunden und den Namen des Wertes angeben kann.
 * z.B. Name : J�rgen
 * Weil diese Klasse tats�chlich nichts anderes tut ist der Name leicht verwirrend, jedoch hat
 * es auch einen �sthetischen Wert im Kontext der spezifischen Verwendungsart dieser Klasse.
 * z.B. angabenliste.add(new Angabe("Name", kunde.name()));
 * 
 */

public class Angabe {
	
	private String key;
	private String value;
	
	public Angabe(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public String key() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String value() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
