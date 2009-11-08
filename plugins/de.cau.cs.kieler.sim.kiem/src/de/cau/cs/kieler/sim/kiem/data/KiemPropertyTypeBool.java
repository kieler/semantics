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

package de.cau.cs.kieler.sim.kiem.data;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * The Class KiemPropertyTypeBool.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public class KiemPropertyTypeBool extends KiemPropertyType implements IKiemPropertyType {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5476290662796694133L;

    /** The Constant PROPERTY_BOOL. */
    private static final Image PROPERTY_BOOL = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/propertyBoolIcon.png").createImage();

    /** The Constant BOOL_ITEMS. */
    private static final String[] BOOL_ITEMS = {"false", "true"};

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KiemPropertyTypeBool.
     */
    public KiemPropertyTypeBool() {
        super();
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.cau.cs.kieler.sim.kiem.data.KiemPropertyType#provideCellEditor(org.eclipse.swt.widgets
     * .Composite)
     */
    @Override
    public CellEditor provideCellEditor(final Composite parent) {
        return new ComboBoxCellEditor(parent, BOOL_ITEMS, SWT.Deactivate);
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.cau.cs.kieler.sim.kiem.data.IKiemPropertyType#getValue(de.cau.cs.kieler.sim.kiem.data.
     * KiemProperty)
     */
    @Override
    public Object getValue(final KiemProperty property) {
        if (property.getValue().equals("true")) {
            return 1;
        } else {
            return 0;
        }
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.cau.cs.kieler.sim.kiem.data.IKiemPropertyType#setValue(de.cau.cs.kieler.sim.kiem.data.
     * KiemProperty, java.lang.Object)
     */
    @Override
    public void setValue(final KiemProperty property, final Object value) {
        if (Integer.parseInt((String) value) == 0) {
            property.setValue("false");
        } else {
            property.setValue("true");
        }
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.data.KiemPropertyType#provideIcon()
     */
    @Override
    public Image provideIcon() {
        return PROPERTY_BOOL;
    }

}
