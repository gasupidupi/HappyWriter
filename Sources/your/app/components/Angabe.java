package your.app.components;

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
