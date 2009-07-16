package de.cau.cs.kieler.sim.kiem.data;

import java.util.LinkedList;
import java.util.List;

public class KiemPropertyList {

	List<KiemProperty> propertyList;
	
	public KiemPropertyList() {
		this.propertyList = new LinkedList<KiemProperty>();
	}
	public KiemPropertyList(String[] propertyKeys) {
		if (propertyKeys != null) {
			this.propertyList = new LinkedList<KiemProperty>();
			for (int c = 0; c < propertyKeys.length; c++) {
				//add new property with null value and according key
				this.propertyList.add(new KiemProperty(propertyKeys[c]));
			}
		}
	}
	
	public String[] getKeys() {
		String[] tmp = new String[this.propertyList.size()];
		for (int c = 0; c < this.propertyList.size(); c++) {
			tmp[c] = this.propertyList.get(c).key;
		}
		return tmp;
	}
	
	public String[] getValues() {
		String[] tmp = new String[this.propertyList.size()];
		for (int c = 0; c < this.propertyList.size(); c++) {
			tmp[c] = this.propertyList.get(c).value;
		}
		return tmp;
	}
	
	public String getProperty(String key) {
		for (int c = 0; c < this.propertyList.size(); c++) {
			KiemProperty tmp = this.propertyList.get(c);
			if (tmp.key.equals(key)) 
				return tmp.value;
		}
		return null;
	}
	
	public void removeProperty(String key) {
		for (int c = 0; c < this.propertyList.size(); c++) {
			KiemProperty tmp = this.propertyList.get(c);
			if (tmp.key.equals(key)) {
				this.propertyList.remove(c);
				break;
			}
		}
	}
	
	public boolean updateProperty(String key, String value) {
		for (int c = 0; c < this.propertyList.size(); c++) {
			KiemProperty tmp = this.propertyList.get(c);
			if (tmp.key.equals(key)) {
				tmp.value = value;
				return true;
			}
		}
		return false;
	}
	
	public boolean existsProperty(String key) {
		for (int c = 0; c < this.propertyList.size(); c++) {
			KiemProperty tmp = this.propertyList.get(c);
			if (tmp.key.equals(key)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean addProperty(String key, String value) {
		if (this.existsProperty(key)) return false;
		this.propertyList.add(new KiemProperty(key,value));
		return true;
	}
}
