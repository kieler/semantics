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
package de.cau.cs.kieler.simulation.ui.views.dataview

import org.eclipse.ui.part.ViewPart
import org.eclipse.swt.widgets.Composite

/**
 * Displays the data of a running simulation in graphical canvas panels.
 * 
 * @author ssm
 * @kieler.design 2017-12-04 proposed
 * @kieler.rating 2017-12-04 proposed yellow  
 */
class DataView extends ViewPart {
    
    override createPartControl(Composite parent) {
        createMenu
        createToolbar        
    }
    
    override setFocus() {
    }
    
    protected def void createMenu() {
        val mgr = getViewSite.getActionBars.getMenuManager
    }    
    
    protected def void createToolbar() {
        val mgr = getViewSite.getActionBars.getToolBarManager
    }    
}