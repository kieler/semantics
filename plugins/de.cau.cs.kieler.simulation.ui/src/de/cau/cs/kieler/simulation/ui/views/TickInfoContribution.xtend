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
package de.cau.cs.kieler.simulation.ui.views

import org.eclipse.jface.action.ControlContribution
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Text
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
class TickInfoContribution extends ControlContribution {
    
    @Accessors(PUBLIC_GETTER)
    var Text label    
    
    protected new(String id) {
        super(id)
    }
    
    override protected createControl(Composite parent) {
        label = new Text(parent, SWT.READ_ONLY)
        // Provide some text so the text field has some space in the toolbar
        label.text = "Tick #0000 (-000)"
        return label
    }
}