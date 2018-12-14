/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.preferences

import de.cau.cs.kieler.kicool.ui.deploy.DeployProjectCleanup
import org.eclipse.debug.internal.ui.SWTFactory
import org.eclipse.jface.preference.PreferencePage
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.IWorkbenchPreferencePage
import org.eclipse.ui.PlatformUI

/**
 * @author als
 *
 */
class KiCoolPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {
    
    val store = PlatformUI.preferenceStore
    
    var Button cleanup;
    
    /**
     * {@inheritDoc}
     */
    override protected createContents(Composite parent) {
        val comp = new Composite(parent, SWT.NONE)

        comp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL))
        comp.setLayout(new GridLayout())

        var group = SWTFactory.createGroup(parent, "Generated Code", 2, 1, GridData.FILL_HORIZONTAL)
        //SWTFactory.createLabel(group, "TEXT", 1)
        cleanup = SWTFactory.createCheckButton(group, "Delete all generated files in the temporary project", null, store.getBoolean(DeployProjectCleanup.DO_CLEANUP.id), 1)
        cleanup.addSelectionListener(new SelectionAdapter() {
            override widgetSelected(SelectionEvent e) {
                store.setValue(DeployProjectCleanup.DO_CLEANUP.id, cleanup.selection)
            }
        })

        return comp
    }
    
    /**
     * Restore the default values. 
     */
    override performDefaults() {
        store.setValue(DeployProjectCleanup.DO_CLEANUP.id, store.getDefaultBoolean(DeployProjectCleanup.DO_CLEANUP.id))
        cleanup.selection = store.getDefaultBoolean(DeployProjectCleanup.DO_CLEANUP.id)
        
        super.performDefaults
    }
    
    override init(IWorkbench workbench) {
    }

}
