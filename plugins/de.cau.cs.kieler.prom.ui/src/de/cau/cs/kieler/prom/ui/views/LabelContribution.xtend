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
package de.cau.cs.kieler.prom.ui.views

import org.eclipse.jface.action.ControlContribution
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Label

/**
 * Simple control that displays some text in a label.
 * 
 * @author aas
 *
 */
class LabelContribution extends ControlContribution {
    
    var Label label
    var String text
    var String toolTip
    
    new(String id) {
        super(id)
    }
    
    new(String id, String initialText) {
        super(id)
        this.text = initialText
    }
    
    new(String id, String initialText, String toolTip) {
        this(id, initialText)
        this.toolTip = toolTip
    }

    public def void setText(String value) {
        text = value
        if(label != null && !label.isDisposed) {
            label.text = value
            label.pack
            parent.update(true)
        }
    }
    
    public def void setTooltip(String value) {
        toolTip = value
        if(label != null && !label.isDisposed) {
            label.toolTipText = value
        }
    }
    
    override createControl(Composite parent) {
        label = new Label(parent, SWT.CENTER)
        label.text = text
        label.toolTipText = toolTip
        return label
    }
}