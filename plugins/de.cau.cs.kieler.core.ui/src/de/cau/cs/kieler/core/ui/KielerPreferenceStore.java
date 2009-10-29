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

    /** the contained Eclipse preference store. */
    private IPreferenceStore preferenceStore;

    /**
     * Creates a preference store wrapper from a given
     * <code>IPreferenceStore</code>.
     * 
     * @param thepreferenceStore the wrapped preference store
     */
    public KielerPreferenceStore(final IPreferenceStore thepreferenceStore) {
        this.preferenceStore = thepreferenceStore;
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#contains(java.lang.String)
     */
    /** {@inheritDoc} */
    public boolean contains(final String name) {
        return preferenceStore.contains(name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getBoolean(java.lang.String)
     */
    /** {@inheritDoc} */
    public boolean getBoolean(final String name) {
        return preferenceStore.getBoolean(name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getDefaultBoolean(java.lang.String)
     */
    /** {@inheritDoc} */
    public boolean getDefaultBoolean(final String name) {
        return preferenceStore.getDefaultBoolean(name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getDefaultDouble(java.lang.String)
     */
    /** {@inheritDoc} */
    public double getDefaultDouble(final String name) {
        return preferenceStore.getDefaultDouble(name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getDefaultFloat(java.lang.String)
     */
    /** {@inheritDoc} */
    public float getDefaultFloat(final String name) {
        return preferenceStore.getDefaultFloat(name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getDefaultInt(java.lang.String)
     */
    /** {@inheritDoc} */
    public int getDefaultInt(final String name) {
        return preferenceStore.getDefaultInt(name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getDefaultLong(java.lang.String)
     */
    /** {@inheritDoc} */
    public long getDefaultLong(final String name) {
        return preferenceStore.getDefaultLong(name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getDefaultString(java.lang.String)
     */
    /** {@inheritDoc} */
    public String getDefaultString(final String name) {
        return preferenceStore.getDefaultString(name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getDouble(java.lang.String)
     */
    /** {@inheritDoc} */
    public double getDouble(final String name) {
        return preferenceStore.getDouble(name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getFloat(java.lang.String)
     */
    /** {@inheritDoc} */
    public float getFloat(final String name) {
        return preferenceStore.getFloat(name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getInt(java.lang.String)
     */
    /** {@inheritDoc} */
    public int getInt(final String name) {
        return preferenceStore.getInt(name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getLong(java.lang.String)
     */
    /** {@inheritDoc} */
    public long getLong(final String name) {
        return preferenceStore.getLong(name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#getString(java.lang.String)
     */
    /** {@inheritDoc} */
    public String getString(final String name) {
        return preferenceStore.getString(name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#isDefault(java.lang.String)
     */
    /** {@inheritDoc} */
    public boolean isDefault(final String name) {
        return preferenceStore.isDefault(name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setDefault(java.lang.String, double)
     */
    /** {@inheritDoc} */
    public void setDefault(final String name, final double value) {
        preferenceStore.setDefault(name, value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setDefault(java.lang.String, float)
     */
    /** {@inheritDoc} */
    public void setDefault(final String name, final float value) {
        preferenceStore.setDefault(name, value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setDefault(java.lang.String, int)
     */
    /** {@inheritDoc} */
    public void setDefault(final String name, final int value) {
        preferenceStore.setDefault(name, value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setDefault(java.lang.String, long)
     */
    /** {@inheritDoc} */
    public void setDefault(final String name, final long value) {
        preferenceStore.setDefault(name, value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setDefault(java.lang.String,
     *     java.lang.String)
     */
    /** {@inheritDoc} */
    public void setDefault(final String name, final String value) {
        preferenceStore.setDefault(name, value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setDefault(java.lang.String, boolean)
     */
    /** {@inheritDoc} */
    public void setDefault(final String name, final boolean value) {
        preferenceStore.setDefault(name, value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setToDefault(java.lang.String)
     */
    /** {@inheritDoc} */
    public void setToDefault(final String name) {
        preferenceStore.setToDefault(name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setValue(java.lang.String, double)
     */
    /** {@inheritDoc} */
    public void setValue(final String name, final double value) {
        preferenceStore.setValue(name, value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setValue(java.lang.String, float)
     */
    /** {@inheritDoc} */
    public void setValue(final String name, final float value) {
        preferenceStore.setValue(name, value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setValue(java.lang.String, int)
     */
    /** {@inheritDoc} */
    public void setValue(final String name, final int value) {
        preferenceStore.setValue(name, value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setValue(java.lang.String, long)
     */
    /** {@inheritDoc} */
    public void setValue(final String name, final long value) {
        preferenceStore.setValue(name, value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setValue(java.lang.String,
     *     java.lang.String)
     */
    /** {@inheritDoc} */
    public void setValue(final String name, final String value) {
        preferenceStore.setValue(name, value);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.core.IKielerPreferenceStore#setValue(java.lang.String, boolean)
     */
    /** {@inheritDoc} */
    public void setValue(final String name, final boolean value) {
        preferenceStore.setValue(name, value);
    }

}
