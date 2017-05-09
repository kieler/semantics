/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.ui.views

import org.eclipse.jface.action.Action
import org.eclipse.jface.viewers.TableViewerColumn

/**
 * @author aas
 *
 */
class ToggleColumnVisibleAction extends Action {
    
    private var TableViewerColumn column
    private var int lastWidth
     
    new(TableViewerColumn column) {
        super("Show/Hide "+column.column.text)
        this.column = column
    }
    
    override run() {
        val col = column.column
        if(col.width > 0) {
            lastWidth = col.width
            col.width = 0
            col.resizable = false
        } else {
            if(lastWidth != 0) {
                col.width = lastWidth
            } else {
                col.width = 80
            }
            col.resizable = true
        }
    }
}