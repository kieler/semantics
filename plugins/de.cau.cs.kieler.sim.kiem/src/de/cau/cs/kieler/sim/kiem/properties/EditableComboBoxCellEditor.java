/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.kiem.properties;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.widgets.Composite;

/**
 * An editable version of a combo box cell editor.
 * 
 * @author cmot
 * @kieler.design 2009-12-08
*/
public class EditableComboBoxCellEditor extends ComboBoxCellEditor {

    /**
     * Instantiates a new editable combo box cell editor.
     * 
     * @param parent
     *            the parent
     * @param items
     *            the items
     * @param style
     *            the style
     */
    public EditableComboBoxCellEditor(final Composite parent, final String[] items, final int style) {
        super(parent, items, style);
        ((CCombo) this.getControl()).setEditable(true);
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Object doGetValue() {
        return ((CCombo) this.getControl()).getText();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void doSetValue(final Object value) {
        Assert.isTrue(value instanceof String);
        int selection = -1;
        for (int i = 0; i < ((CCombo) this.getControl()).getItemCount(); i++) {
            final String currentItem = ((CCombo) this.getControl()).getItem(i);
            if (currentItem.equals(value.toString())) {
                ((CCombo) this.getControl()).select(selection);
                break;
            }
        }
        ((CCombo) this.getControl()).setText(value.toString());
    }

    // -------------------------------------------------------------------------

}
