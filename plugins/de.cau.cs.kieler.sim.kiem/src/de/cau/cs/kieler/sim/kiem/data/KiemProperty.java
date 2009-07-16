package de.cau.cs.kieler.sim.kiem.data;

public class KiemProperty {

	String key;
	String value;
	
	public KiemProperty(String key) {
		this.key = key;
		this.value = "";
	}
	public KiemProperty(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public String getKey() {
		return this.key;
	}
	public String getValue() {
		return this.value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}

}
