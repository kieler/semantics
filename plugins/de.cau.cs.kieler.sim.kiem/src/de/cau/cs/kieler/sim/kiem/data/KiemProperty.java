package de.cau.cs.kieler.sim.kiem.data;

public class KiemProperty {

	String key;
	String value;
	KTYPE  type;
	
	public static enum KTYPE {
	    KSTRING, KINT, KBOOL, KFILE, KMODEL
	}
	
	public KiemProperty() {
		this.key = "";
		this.value = "";
		this.type = KTYPE.KSTRING; 
	}
	public KiemProperty(String key, KTYPE type, String value) {
		this.key = key;
		this.value = value;
		this.type = type; 
	}

	public KiemProperty(String key) {
		this.key = key;
		this.value = "";
		this.type = KTYPE.KSTRING; 
	}
	public KiemProperty(String key, String value) {
		this.key = key;
		this.value = value;
		this.type = KTYPE.KSTRING; 
	}
	public KiemProperty(String key, int value) {
		this.key = key;
		this.value = value+"";
		this.type = KTYPE.KINT; 
	}
	public KiemProperty(String key, boolean value) {
		this.key = key;
		this.value = (value == true) ? "true" : "false";
		this.type = KTYPE.KBOOL; 
	}
	
	public String getKey() {
		return this.key;
	}
	public String getValue() {
		return this.value;
	}
	public KTYPE getType() {
		return this.type;
	}
	
	public void setValue(String value) {
		this.value = value;
	}

}
