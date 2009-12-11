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
package de.cau.cs.kieler.core.ui.util;

import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.widgets.Composite;

/**
 * Field editor for input of float values.
 * 
 * @kieler.rating 2009-12-11 proposed yellow msp
 * @author <a href="mailto:msp@informatik.uni-kiel.de">Miro Sp&ouml;nemann</a>
 */
public class FloatFieldEditor extends StringFieldEditor {

    /** lower bound for double values. */
    private float lowerBound = -Float.MAX_VALUE;
    /** upper bound for double values. */
    private float upperBound = Float.MAX_VALUE;

    /**
     * Creates a new float field editor.
     * 
     * @param name the name of the preference this field editor works on
     * @param labelText the label text of the field editor
     * @param parent the parent of the field editor's control
     */
    public FloatFieldEditor(final String name, final String labelText, final Composite parent) {
        super(name, labelText, parent);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean checkState() {
        try {
            float value = getFloatValue();
            return value >= lowerBound && value <= upperBound;
        } catch (NumberFormatException exception) {
            return false;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doLoad() {
        float value = getPreferenceStore().getFloat(getPreferenceName());
        setStringValue(Float.toString(value));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doLoadDefault() {
        float value = getPreferenceStore().getDefaultFloat(getPreferenceName());
        setStringValue(Float.toString(value));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doStore() {
        try {
            float value = getFloatValue();
            getPreferenceStore().setValue(getPreferenceName(), value);
        } catch (NumberFormatException exception) {
            // invalid textual input - ignore store command
        }
    }

    /**
     * Sets the range of valid float values for this field editor. The default
     * is to accept all float values except NaN and infinity.
     * 
     * @param min lower bound for float values
     * @param max upper bound for float values
     */
    public void setValidRange(final float min, final float max) {
        this.lowerBound = min;
        this.upperBound = max;
    }

    /**
     * Parses the input string as a float value.
     * 
     * @return float value
     */
    public float getFloatValue() {
        return Float.parseFloat(getStringValue());
    }

}
