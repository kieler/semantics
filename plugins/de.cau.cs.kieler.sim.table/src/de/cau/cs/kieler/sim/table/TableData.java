package de.cau.cs.kieler.sim.table;

public class TableData {

	private boolean present;
	private String  key;
	private String 	value;
	
	public TableData(String key) {
		this.present = true;
		this.key = key;
		this.value = "";
	}
	public TableData(String key, String value) {
		this.present = true;
		this.key = key;
		this.value = value;
	}
	public TableData(boolean present, String key, String value) {
		this.present = present;
		this.key = key;
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	public String getKey() {
		return this.key;
	}
	public boolean isPresent() {
		return this.present;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public void setPresent(boolean present) {
		this.present = present;
	}
	
}
