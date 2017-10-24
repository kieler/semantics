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
import org.eclipse.swt.events.ModifyEvent
import org.eclipse.swt.events.ModifyListener
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Text

/**
 * The search field contribution in the data pool view.
 * It contains a text control.
 * 
 * @author aas
 *
 */
class SearchFieldContribution extends ControlContribution {
    
    /**
     * The text control
     */
    var Text text
    
    /**
     * Constructor
     * 
     * @param id The id of this contribution
     */
    new(String id) {
        super(id)
    }
    
    /**
     * {@inheritDoc}
     */
    override createControl(Composite parent) {
        text = new Text(parent, SWT.SINGLE.bitwiseOr(SWT.BORDER).bitwiseOr(SWT.SEARCH).bitwiseOr(SWT.ICON_SEARCH).bitwiseOr(SWT.ICON_CANCEL))
        text.toolTipText = "Filter for variable names"
        
        text.addModifyListener(new ModifyListener(){
            /**
             * Sets the search term for the data pool view filter. 
             */
            override modifyText(ModifyEvent e) {
                if(DataPoolView.instance != null) {
                    DataPoolView.instance.filterText = text.text
                }
            }
        })
        
        return text
    }
}