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

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class KiemProperty.
 *
 * @author Christian Motika <cmot@informatik.uni-kiel.de>
 * 
 */
public class KiemProperty implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6897758298476417410L;
	
	/** The key. */
	String key;
	
	/** The value. */
	String value;
	
	/** The type. */
	KiemPropertyType type;
	
	/**
	 * Instantiates a new kiem property.
	 */
	public KiemProperty() {
		this.key = "";
		this.value = "";
		this.type = new KiemPropertyTypeString(); 
	}
	
	/**
	 * Instantiates a new kiem property.
	 * 
	 * @param key the key
	 * @param type the type
	 * @param value the value
	 */
	public KiemProperty(String key, KiemPropertyType type, String value) {
		this.key = key;
		this.value = value;
		this.type = type; 
	}
	
	/**
	 * Instantiates a new kiem property.
	 * 
	 * @param key the key
	 * @param type the type
	 * @param value the value
	 */
	public KiemProperty(String key, KiemPropertyType type, int value) {
		this.key = key;
		this.value = ""+value;
		this.type = type; 
	}
	
	/**
	 * Instantiates a new kiem property.
	 * 
	 * @param key the key
	 * @param type the type
	 */
	public KiemProperty(String key, KiemPropertyType type) {
		this.key = key;
		this.value = "";
		this.type = type; 
	}

	/**
	 * Instantiates a new kiem property.
	 * 
	 * @param key the key
	 */
	public KiemProperty(String key) {
		this.key = key;
		this.value = "";
		this.type = new KiemPropertyTypeString();  
	}
	
	/**
	 * Instantiates a new kiem property.
	 * 
	 * @param key the key
	 * @param value the value
	 */
	public KiemProperty(String key, String value) {
		this.key = key;
		this.value = value;
		this.type = new KiemPropertyTypeString();  
	}
	
	/**
	 * Instantiates a new kiem property.
	 * 
	 * @param key the key
	 * @param value the value
	 */
	public KiemProperty(String key, int value) {
		this.key = key;
		this.value = value+"";
		this.type = new KiemPropertyTypeInt(); 
	}
	
	/**
	 * Instantiates a new kiem property.
	 * 
	 * @param key the key
	 * @param value the value
	 */
	public KiemProperty(String key, boolean value) {
		this.key = key;
		this.value = (value == true) ? "true" : "false";
		this.type = new KiemPropertyTypeBool(); 
	}
	
	/**
	 * Gets the key.
	 * 
	 * @return the key
	 */
	public String getKey() {
		return this.key;
	}
	
	/**
	 * Gets the value.
	 * 
	 * @return the value
	 */
	public String getValue() {
		return this.value;
	}
	
	/**
	 * Gets the type.
	 * 
	 * @return the type
	 */
	public KiemPropertyType getType() {
		return this.type;
	}
	
	/**
	 * Sets the value.
	 * 
	 * @param value the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}

	
	/**
	 * Gets the file path.
	 * 
	 * @return the file path
	 */
	public String getFilePath() {
		return this.value.replace("\\", "/");
	}
	
	/**
	 * Gets the directory.
	 * 
	 * @return the directory
	 */
	public String getDirectory() {
		String backDir = this.value;
		backDir = backDir.replace("\\", "/");
		int i = backDir.lastIndexOf("/");
		if (i > -1)
			backDir = backDir.substring(0,i+1);
		return backDir;
	}


}
