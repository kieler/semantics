/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.action.ControlContribution;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * This is a specialized combo box for selection of a compile chain (if there is more than one
 * registered for a certain editor).
 * 
 * @author cmot
 * 
 */
public class CompileChainCombo extends ControlContribution {

    Combo combo;
    Composite parent;
    
    //-------------------------------------------------------------------------

    public CompileChainCombo(String str) {
        super(str);
    }

    //-------------------------------------------------------------------------

    @Override
    protected Control createControl(Composite parent) {
        this.parent = parent;
        // per default the selected index is the first entry
        int defaultIndex = 0;
        update(new ArrayList<String>(), defaultIndex);
        return combo;
    }

    //-------------------------------------------------------------------------

    /**
     * Updates the combobox entries with a list given as arguments and selecting
     * the given defaultIndex entry. It adds selection listeners that call the
     * updateVisibleTransformation() method of KiCoSelectionView.
     *
     * @param items the items
     * @param defaultIndex the default index
     */
    public void update(List<String> items, int defaultIndex) {
        combo = new Combo(parent, SWT.NONE | SWT.DROP_DOWN | SWT.READ_ONLY);

        for (String item : items) {
            combo.add(item);
        }

        combo.setTextLimit(10);
        combo.select(defaultIndex);

        combo.addSelectionListener(new SelectionListener() {

            public void widgetSelected(SelectionEvent e) {
                KiCoSelectionView.getInstance().updateVisibleTransformations(
                        combo.getSelectionIndex());
            }

            public void widgetDefaultSelected(SelectionEvent e) {
                KiCoSelectionView.getInstance().updateVisibleTransformations(
                        combo.getSelectionIndex());
            }
        });
    }
    
    //-------------------------------------------------------------------------

    public void setValue(int index) {
        combo.select(index);
    }

}
