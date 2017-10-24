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

import org.eclipse.jface.action.Action
import org.eclipse.jface.viewers.TableViewerColumn

/**
 * Base class to toggle the visibility of a column in the data pool view.
 * Hiding a column is done by setting the column's width to 0. To show a column, its width is restored.
 * 
 * @author aas
 *
 */
class ToggleColumnVisibleAction extends Action {
    
    /**
     * The column
     */
    private var TableViewerColumn column
    /**
     * The with of the column before it was hidden.
     */
    private var int lastWidth
     
    /**
     * Constructor
     * 
     * @param column The column 
     */
    new(TableViewerColumn column) {
        super("Show/Hide "+column.column.text)
        this.column = column
    }
    
    /**
     * Toggles the visibility of the column by settings its width.
     */
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