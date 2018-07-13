/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.product

import org.eclipse.jface.preference.PreferencePage
import org.eclipse.swt.SWT
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Label
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.IWorkbenchPreferencePage

/** 
 * Main preference page for all KIELER semantics related preferences.
 * 
 * @author aas
 */
class KielerSemanticsPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {
    IWorkbench workbench
    
    /**
     * {@inheritDoc}
     */
    override void init(IWorkbench workbench) {
        this.workbench = workbench
    }
    
    /**
     * {@inheritDoc}
     */
    override protected createContents(Composite parent) {
        val comp = new Composite(parent, SWT.NONE)

        comp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL))
        comp.setLayout(new GridLayout())

        val label = new Label(comp, SWT.NONE)
        label.text = "Select one of the KIELER preference categories to customize."

        return comp
    }
}
