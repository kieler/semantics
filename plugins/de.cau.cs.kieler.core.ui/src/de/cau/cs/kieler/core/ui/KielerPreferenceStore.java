/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
 */
package de.cau.cs.kieler.core.ui;

import org.eclipse.jface.preference.IPreferenceStore;

import de.cau.cs.kieler.core.IKielerPreferenceStore;

/**
 * Wrapper class for Eclipse preference stores.
 * 
 * @author <a href="mailto:msp@informatik.uni-kiel.de">Miro Sp&ouml;nemann</a>
 */
public class KielerPreferenceStore implements IKielerPreferenceStore {

	/** the contained Eclipse preference store */
	private IPreferenceStore preferenceStore;
	
	/**
	 * Creates a preference store wrapper from a given
	 * <code>IPreferenceStore</code>.
	 * 
	 * @param preferenceStore
	 */
	public KielerPreferenceStore(IPreferenceStore preferenceStore) {
		this.preferenceStore = preferenceStore;
	}
	
	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#contains(java.lang.String)
	 */
	public boolean contains(String name) {
		return preferenceStore.contains(name);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getBoolean(java.lang.String)
	 */
	public boolean getBoolean(String name) {
		return preferenceStore.getBoolean(name);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getDefaultBoolean(java.lang.String)
	 */
	public boolean getDefaultBoolean(String name) {
		return preferenceStore.getDefaultBoolean(name);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getDefaultDouble(java.lang.String)
	 */
	public double getDefaultDouble(String name) {
		return preferenceStore.getDefaultDouble(name);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getDefaultFloat(java.lang.String)
	 */
	public float getDefaultFloat(String name) {
		return preferenceStore.getDefaultFloat(name);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getDefaultInt(java.lang.String)
	 */
	public int getDefaultInt(String name) {
		return preferenceStore.getDefaultInt(name);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getDefaultLong(java.lang.String)
	 */
	public long getDefaultLong(String name) {
		return preferenceStore.getDefaultLong(name);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getDefaultString(java.lang.String)
	 */
	public String getDefaultString(String name) {
		return preferenceStore.getDefaultString(name);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getDouble(java.lang.String)
	 */
	public double getDouble(String name) {
		return preferenceStore.getDouble(name);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getFloat(java.lang.String)
	 */
	public float getFloat(String name) {
		return preferenceStore.getFloat(name);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getInt(java.lang.String)
	 */
	public int getInt(String name) {
		return preferenceStore.getInt(name);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getLong(java.lang.String)
	 */
	public long getLong(String name) {
		return preferenceStore.getLong(name);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getString(java.lang.String)
	 */
	public String getString(String name) {
		return preferenceStore.getString(name);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#isDefault(java.lang.String)
	 */
	public boolean isDefault(String name) {
		return preferenceStore.isDefault(name);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setDefault(java.lang.String, double)
	 */
	public void setDefault(String name, double value) {
		preferenceStore.setDefault(name, value);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setDefault(java.lang.String, float)
	 */
	public void setDefault(String name, float value) {
		preferenceStore.setDefault(name, value);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setDefault(java.lang.String, int)
	 */
	public void setDefault(String name, int value) {
		preferenceStore.setDefault(name, value);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setDefault(java.lang.String, long)
	 */
	public void setDefault(String name, long value) {
		preferenceStore.setDefault(name, value);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setDefault(java.lang.String, java.lang.String)
	 */
	public void setDefault(String name, String value) {
		preferenceStore.setDefault(name, value);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setDefault(java.lang.String, boolean)
	 */
	public void setDefault(String name, boolean value) {
		preferenceStore.setDefault(name, value);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setToDefault(java.lang.String)
	 */
	public void setToDefault(String name) {
		preferenceStore.setToDefault(name);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setValue(java.lang.String, double)
	 */
	public void setValue(String name, double value) {
		preferenceStore.setValue(name, value);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setValue(java.lang.String, float)
	 */
	public void setValue(String name, float value) {
		preferenceStore.setValue(name, value);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setValue(java.lang.String, int)
	 */
	public void setValue(String name, int value) {
		preferenceStore.setValue(name, value);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setValue(java.lang.String, long)
	 */
	public void setValue(String name, long value) {
		preferenceStore.setValue(name, value);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setValue(java.lang.String, java.lang.String)
	 */
	public void setValue(String name, String value) {
		preferenceStore.setValue(name, value);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setValue(java.lang.String, boolean)
	 */
	public void setValue(String name, boolean value) {
		preferenceStore.setValue(name, value);
	}

}
