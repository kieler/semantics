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

import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.Color
import org.eclipse.swt.widgets.Display
import org.eclipse.swt.widgets.Canvas
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.simulation.core.Variable
import org.eclipse.swt.layout.RowData
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.graphics.Rectangle
import org.eclipse.swt.events.SelectionListener
import org.eclipse.swt.events.SelectionEvent

/**
 * @author ssm
 * @kieler.design 2017-12-04 proposed
 * @kieler.rating 2017-12-04 proposed yellow  
 */
class DataObserver {

    @Accessors val variables = <Variable> newLinkedList
    
    @Accessors var DataCanvas canvas 
    
    protected var DataView dataView
    protected var Composite compositeParent
    protected val DataObserver instance
    
    new(Composite parent, DataView dataView) {
        this.compositeParent = parent
        this.dataView = dataView
        instance = this
    }
        
    def createCanvas() {
        canvas = new DataCanvas(compositeParent, SWT.NONE, dataView, this)
        
        compositeParent.layout(true)
        compositeParent.update        
    }
    
}