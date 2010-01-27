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

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * The Class KiemPropertyTypeChoice. This implements a sample KiemPropertyType for selecting a
 * String from a String[] array with a drop down list.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2009-01-15 yellow
 * 
 */
public class KiemPropertyTypeChoice extends KiemPropertyType implements IKiemPropertyType {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 922994563762566959L;

    /** The Constant PROPERTY_CHOICE. */
    private static final Image PROPERTY_CHOICE = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/propertyChoiceIcon.png").createImage();

    /** The items to display in the drop down list. */
    private String[] items;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KiemPropertyType choice.
     * 
     * @param itemsParam
     *            the items
     */
    public KiemPropertyTypeChoice(final String[] itemsParam) {
        super();
        this.items = itemsParam;
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
        return new ComboBoxCellEditor(parent, items, SWT.Deactivate);
    }

    // -------------------------------------------------------------------------

    /**
     * This method bridges String names values (encoded as Strings in property) to
     * int of the combobox cell editor. All items are searched, and the resulting
     * index is returned. If nothing is found, the first item with index 0
     * is the default selected one.
     * 
     * {@inheritDoc}
     */
    public Object getValue(final KiemProperty property) {
        for (int c = 0; c < items.length; c++) {
            if (property.getValue().equals(items[c])) {
                return c;
            }
        }
        return 0; // default is the first item
    }

    // -------------------------------------------------------------------------

    /**
     * This method bridges String names values (encoded as Strings in property) to
     * int of the combobox cell editor. The item text of the selected index
     * is saved as a String.
     *  
     * {@inheritDoc}
     */
    public void setValue(final KiemProperty element, final Object value) {
        KiemProperty property = (KiemProperty) element;
        property.setValue(items[Integer.parseInt((String) value)]);
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.data.KiemPropertyType#provideIcon()
     */
    @Override
    public Image provideIcon() {
        return PROPERTY_CHOICE;
    }

}
