/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
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
 * The Class KiemPropertyTypeString. This implements a sample KiemPropertyType for a String type.
 * 
 * @author cmot
 * @kieler.design 2009-12-08
 * @kieler.rating 2010-01-15 yellow
 * 
 */
public class KiemPropertyTypeString extends KiemPropertyType implements IKiemPropertyType {

    /** The Constant PROPERTY_STRING. */
    private static final Image PROPERTY_STRING = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/propertyStringIcon.png").createImage();

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KiemPropertyType string.
     */
    public KiemPropertyTypeString() {
        super();
    }

    // -------------------------------------------------------------------------

    /**
     * This method does not bridge anything because the string cell editor handles Strings directly.
     * 
     * {@inheritDoc}
     */
    public Object getValue(final KiemProperty property) {
        return property.getValue();
    }

    // -------------------------------------------------------------------------

    /**
     * This method does not bridge anything because the string cell editor handles Strings directly.
     * 
     * {@inheritDoc}
     */
    public void setValue(final KiemProperty property, final Object value) {
        property.setValue((String) value);
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.data.KiemPropertyType#provideIcon()
     */
    @Override
    public Image provideIcon() {
        return PROPERTY_STRING;
    }

}
