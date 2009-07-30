/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/

package de.cau.cs.kieler.sim.kiem.data;

import java.util.LinkedList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class KiemPropertyList.
 *
 * @author Christian Motika <cmot@informatik.uni-kiel.de>
 * 
 */
public class KiemPropertyList {

	/** The property list. */
	List<KiemProperty> propertyList;
	
	/**
	 * Instantiates a new kiem property list.
	 */
	public KiemPropertyList() {
		this.propertyList = new LinkedList<KiemProperty>();
	}
	
	/**
	 * Instantiates a new kiem property list.
	 * 
	 * @param properties the properties
	 */
	public KiemPropertyList(KiemProperty[] properties) {
		if (properties != null) {
			this.propertyList = new LinkedList<KiemProperty>();
			for (int c = 0; c < properties.length; c++) {
				//add new property with null value and according key
				this.propertyList.add(properties[c]);
			}
		}
		else {
			this.propertyList = new LinkedList<KiemProperty>();
		}
	}
	
	/**
	 * Gets the keys.
	 * 
	 * @return the keys
	 */
	public String[] getKeys() {
		String[] tmp = new String[this.propertyList.size()];
		for (int c = 0; c < this.propertyList.size(); c++) {
			tmp[c] = this.propertyList.get(c).key;
		}
		return tmp;
	}
	
	/**
	 * Gets the values.
	 * 
	 * @return the values
	 */
	public String[] getValues() {
		String[] tmp = new String[this.propertyList.size()];
		for (int c = 0; c < this.propertyList.size(); c++) {
			tmp[c] = this.propertyList.get(c).value;
		}
		return tmp;
	}
	
	/**
	 * Gets the property.
	 * 
	 * @param key the key
	 * 
	 * @return the property
	 */
	public String getProperty(String key) {
		for (int c = 0; c < this.propertyList.size(); c++) {
			KiemProperty tmp = this.propertyList.get(c);
			if (tmp.key.equals(key)) 
				return tmp.value;
		}
		return null;
	}
	
	/**
	 * Removes the property.
	 * 
	 * @param key the key
	 */
	public void removeProperty(String key) {
		for (int c = 0; c < this.propertyList.size(); c++) {
			KiemProperty tmp = this.propertyList.get(c);
			if (tmp.key.equals(key)) {
				this.propertyList.remove(c);
				break;
			}
		}
	}
	
	/**
	 * Update property.
	 * 
	 * @param key the key
	 * @param value the value
	 * 
	 * @return true, if successful
	 */
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
	
	/**
	 * Exists property.
	 * 
	 * @param key the key
	 * 
	 * @return true, if successful
	 */
	public boolean existsProperty(String key) {
		for (int c = 0; c < this.propertyList.size(); c++) {
			KiemProperty tmp = this.propertyList.get(c);
			if (tmp.key.equals(key)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Adds the property.
	 * 
	 * @param key the key
	 * @param value the value
	 * 
	 * @return true, if successful
	 */
	public boolean addProperty(String key, String value) {
		if (this.existsProperty(key)) return false;
		this.propertyList.add(new KiemProperty(key,value));
		return true;
	}
	
	
	/**
	 * Size.
	 * 
	 * @return the int
	 */
	public int size() {
		return this.propertyList.size();	
	}
	
	/**
	 * Checks for elements.
	 * 
	 * @return true, if successful
	 */
	public boolean hasElements() {
		return (size() > 0);
	}

	
	/**
	 * To array.
	 * 
	 * @return the kiem property[]
	 */
	public KiemProperty[] toArray() {
		KiemProperty[] returnArray = new KiemProperty[this.propertyList.size()];
		for (int c = 0; c < this.propertyList.size(); c ++){
			returnArray[c] = this.propertyList.get(c);
		}
		return returnArray;
	}
	
	/**
	 * Gets the elements.
	 * 
	 * @return the elements
	 */
	public Object[] getElements() {
		return this.propertyList.toArray();
	}
}
