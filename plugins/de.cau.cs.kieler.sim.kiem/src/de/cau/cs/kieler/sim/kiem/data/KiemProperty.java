package de.cau.cs.kieler.sim.kiem.data;

import java.io.Serializable;

public class KiemProperty implements Serializable {

	String key;
	String value;
	KiemPropertyType type;
	
	public KiemProperty() {
		this.key = "";
		this.value = "";
		this.type = new KiemPropertyTypeString(); 
	}
	public KiemProperty(String key, KiemPropertyType type, String value) {
		this.key = key;
		this.value = value;
		this.type = type; 
	}
	public KiemProperty(String key, KiemPropertyType type) {
		this.key = key;
		this.value = "";
		this.type = type; 
	}

	public KiemProperty(String key) {
		this.key = key;
		this.value = "";
		this.type = new KiemPropertyTypeString();  
	}
	public KiemProperty(String key, String value) {
		this.key = key;
		this.value = value;
		this.type = new KiemPropertyTypeString();  
	}
	public KiemProperty(String key, int value) {
		this.key = key;
		this.value = value+"";
		this.type = new KiemPropertyTypeInt(); 
	}
	public KiemProperty(String key, boolean value) {
		this.key = key;
		this.value = (value == true) ? "true" : "false";
		this.type = new KiemPropertyTypeBool(); 
	}
	
	public String getKey() {
		return this.key;
	}
	public String getValue() {
		return this.value;
	}
	public KiemPropertyType getType() {
		return this.type;
	}
	
	public void setValue(String value) {
		this.value = value;
	}

}
