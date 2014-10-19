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

import org.eclipse.jface.action.ControlContribution;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * @author cmot
 *
 */
public class CompileChainCombo extends ControlContribution {

    Combo combo;
    public CompileChainCombo(String str)
    {
            super(str);
    }

    @Override
    protected Control createControl(Composite parent)
    {
            combo = new Combo(parent, SWT.NONE | SWT.DROP_DOWN | SWT.READ_ONLY);

            combo.add("String 1");
            combo.add("String 2");
            combo.add("String 3");
            combo.add("String 4");
            combo.setTextLimit(10);
            combo.select(0);

            combo.addSelectionListener(
            new SelectionListener() {
                
                public void widgetSelected(SelectionEvent e) {
                    MessageDialog.openInformation(
                            null, "My App",
                            "Item at " + combo.getSelectionIndex() + " clicked.");
                    
                }
                
                public void widgetDefaultSelected(SelectionEvent e) {
                    MessageDialog.openInformation(
                            null, "My App",
                            "Item at " + combo.getSelectionIndex() + " clicked.");
                    
                }
            });

            return combo;
    }

    public void setValue(int index)
    {
            combo.select(index);
    }

}
