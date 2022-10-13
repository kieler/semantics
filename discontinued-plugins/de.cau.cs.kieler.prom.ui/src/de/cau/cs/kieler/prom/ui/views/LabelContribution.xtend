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

import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Label
import org.eclipse.ui.menus.WorkbenchWindowControlContribution

/**
 * Simple control that displays some text in a label.
 * 
 * @author aas
 *
 */
class LabelContribution extends WorkbenchWindowControlContribution {
    
    /**
     * The label
     */
    var Label label
    /**
     * The text for the label
     */
    var String text
    /**
     * The tooltip for the label
     */
    var String toolTip
    
    /**
     * Constructor
     * 
     * @param id The id for the contribution
     */
    new(String id) {
        super(id)
    }
    
    /**
     * Constructor
     * 
     * @param id The id for the contribution
     * @param initialText The initial text for the label
     */
    new(String id, String initialText) {
        super(id)
        this.text = initialText
    }
    
    /**
     * Constructor
     * 
     * @param id The id for the contribution
     * @param initialText The initial text for the label
     * @param toolTip The tooltip for the label
     */
    new(String id, String initialText, String toolTip) {
        this(id, initialText)
        this.toolTip = toolTip
    }

    /**
     * Sets the text of the label
     * 
     * @param value The text
     */
    public def void setText(String value) {
        text = value
        if(label != null && !label.isDisposed) {
            label.text = value
            label.pack
            parent.update(true)
        }
    }
    
    /**
     * Sets the tooltip of the label
     * 
     * @param value The tooltip
     */
    public def void setTooltip(String value) {
        toolTip = value
        if(label != null && !label.isDisposed) {
            label.toolTipText = value
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override createControl(Composite parent) {
        label = new Label(parent, SWT.CENTER)
        label.text = text
        label.toolTipText = toolTip
        return label
    }
}