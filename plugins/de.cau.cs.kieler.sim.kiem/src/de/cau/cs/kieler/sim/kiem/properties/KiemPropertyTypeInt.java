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

package de.cau.cs.kieler.sim.kiem.properties;

import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * This implements a sample KiemPropertyType for an integer type.
 * 
 * @author cmot
 * @kieler.design 2009-12-08
 * @kieler.rating 2010-01-15 yellow
 * 
 */
public class KiemPropertyTypeInt extends KiemPropertyType implements IKiemPropertyType {

    /** The Constant PROPERTY_INT. */
    private static final Image PROPERTY_INT = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/propertyIntIcon.png").createImage();

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KiemPropertyType int.
     */
    public KiemPropertyTypeInt() {
        super();
    }

    // -------------------------------------------------------------------------

    /**
     * This method bridges integer values (encoded as Strings in property) to Strings of the string
     * cell editor. It tries to encode the saved value as an Integer. If this fails, the default 0
     * value is taken.
     * 
     * {@inheritDoc}
     */
    public Object getValue(final KiemProperty property) {
        String value = (String) property.getValue();
        try {
            Integer.valueOf((String) value);
        } catch (Exception e) {
            // default 0 value
            property.setValue("0");
            value = "0";
        }
        return value;
    }

    // -------------------------------------------------------------------------

    /**
     * This method bridges integer values (encoded as Strings in property) to Strings of the string
     * cell editor. It tries to encode the saved value as an Integer. If this fails, the default 0
     * value is taken.
     * 
     * {@inheritDoc}
     */
    public void setValue(final KiemProperty property, final Object value) {
        try {
            property.setValue("" + Integer.valueOf((String) value));
        } catch (Exception e) {
            property.setValue("0");
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the value as int.
     * 
     * @param property
     *            the property
     * 
     * @return the value as int
     */
    public static int getValueAsInt(final KiemProperty property) {
        return property.getValueAsInt();
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the value.
     * 
     * @param property
     *            the property
     * @param value
     *            the value
     */
    public static void setValue(final KiemProperty property, final int value) {
        property.setValue("" + value);
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.data.KiemPropertyType#provideIcon()
     */
    @Override
    public Image provideIcon() {
        return PROPERTY_INT;
    }

}
