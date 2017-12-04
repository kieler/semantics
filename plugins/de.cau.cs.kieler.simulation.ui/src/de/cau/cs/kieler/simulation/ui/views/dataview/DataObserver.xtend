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
import org.eclipse.swt.graphics.Rectangle

/**
 * @author ssm
 * @kieler.design 2017-12-04 proposed
 * @kieler.rating 2017-12-04 proposed yellow  
 */
class DataObserver extends Canvas {

    private static val MARGIN = 5
    private static val HEIGHT = 50

    @Accessors val variables = <Variable> newLinkedList 
    
    new(Composite parent) {
        super(parent, SWT.BORDER)
        
        bounds = new Rectangle(MARGIN, MARGIN, parent.bounds.width - MARGIN * 2, HEIGHT)
        background = new Color(Display.getCurrent, 160, 160, 160)
    }
    
}