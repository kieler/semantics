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

import org.eclipse.swt.widgets.Canvas
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.layout.RowData
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.Rectangle
import org.eclipse.swt.events.SelectionListener
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.graphics.Color
import org.eclipse.swt.widgets.Display

/**
 * @author ssm
 *
 */
class DataCanvas extends Canvas {
    
    private static val HEIGHT = 75
    private static val BUTTON_SIZE = 16

    protected val DataView dataView
    protected val DataObserver dataObserver
    
    new(Composite parent, int style, DataView dataView, DataObserver observer) {
        super(parent, style)
        
        this.dataView = dataView
        dataObserver = observer
        
        val layoutData = new RowData => [
            width = parent.bounds.width - DataView.BORDER_MARGIN * 2
            height = HEIGHT
        ]
        setLayoutData(layoutData)
//        parent.layout(true)
        
        new Button(this, SWT.PUSH) => [
            it.bounds = new Rectangle(parent.bounds.width - DataView.BORDER_MARGIN * 2 - BUTTON_SIZE, 0, BUTTON_SIZE, BUTTON_SIZE)
            println(bounds)
            text = "X"
            addSelectionListener(new SelectionListener() {
                override widgetDefaultSelected(SelectionEvent e) {
                }
                
                override widgetSelected(SelectionEvent e) {
                    println("GONE")
                    dataView.deleteDataObserver(dataObserver)
                }
                
                })
        ]
        
        background = new Color(Display.getCurrent, 180, 0, 180)

    }
}
