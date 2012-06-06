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

import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;

/**
 * The Class KiemPropertyTypeEditor. This implements a sample KiemPropertyType that uses a displays
 * a list of all open editors to choose from.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2009-01-15 yellow
 * 
 */
public class KiemPropertyTypeModel extends KiemPropertyType implements IKiemPropertyType {

    /** The Constant PROPERTY_CHOICE. */
    private static final Image PROPERTY_CHOICE = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.kiem", "icons/propertyEditorIcon.png").createImage();
    
    /** The String constant indicating the selection of the active editor. */
    public static final String ACTIVE_EDITOR = "[ACTIVE EDITOR]";

    /** The editor items. */
    private String[] items;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KiemPropertyType editor.
     */
    public KiemPropertyTypeModel() {
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
        refreshItems();
        EditableComboBoxCellEditor cellEditor =
                (new EditableComboBoxCellEditor(parent, items, SWT.Activate));
        //cellEditor.s
        return cellEditor;
    }

    // -------------------------------------------------------------------------

    /**
     * Refresh editor items. Goes thru the list of all opened Eclipse editors and adds them to the
     * items list for the drop down list.
     */
    public void refreshItems() {
        this.items = new String[KiemPlugin.getOpenedModelFiles().size() + 1];
        int c = 0;
        this.items[c++] = ACTIVE_EDITOR;
        for (IPath modelFilePath : KiemPlugin.getOpenedModelFiles()) {
            this.items[c++] = modelFilePath.toString();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * This method bridges String names values (encoded as Strings in property) to int of the
     * combobox cell editor. All items are searched, and the resulting index is returned. If nothing
     * is found, the first item with index 0 is the default selected one.
     * 
     * {@inheritDoc}
     */
    public Object getValue(final KiemProperty property) {
        return property.getValue();
    }

     // -------------------------------------------------------------------------

    /**
     * This method bridges String names values (encoded as Strings in property) to int of the
     * combobox cell editor. The item text of the selected index is saved as a String.
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
        return PROPERTY_CHOICE;
    }

}
