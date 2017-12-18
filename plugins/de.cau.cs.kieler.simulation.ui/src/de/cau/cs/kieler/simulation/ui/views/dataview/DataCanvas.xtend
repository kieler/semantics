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
import de.cau.cs.kieler.simulation.core.Variable
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.events.PaintListener
import org.eclipse.swt.events.PaintEvent
import org.eclipse.swt.graphics.GC
import org.eclipse.swt.graphics.Font
import de.cau.cs.kieler.simulation.core.VariableType

/**
 * @author ssm
 * @kieler.design 2017-12-04 proposed
 * @kieler.rating 2017-12-04 proposed yellow  
 */
class DataCanvas extends Canvas {
    
    private static val HEIGHT = 75
    private static val HEIGHT_BOOLDOMAIN = 50
    private static val BUTTON_SIZE = 16
    
    protected static val COORDINATE_LEFTBORDERSPACING = 24 
    protected static val COORDINATE_BORDERSPACING = 12
    protected static val COORDINATE_PADDING = 5
    
    protected static val MAX_TICKWIDTH = 10

    protected val DataView dataView
    protected val DataObserver dataObserver
    
    protected val variableTextMap = <Variable, Label> newLinkedHashMap
    protected val textColorList = #[Display.getCurrent.getSystemColor(SWT.COLOR_RED),
                                    Display.getCurrent.getSystemColor(SWT.COLOR_BLUE),
                                    Display.getCurrent.getSystemColor(SWT.COLOR_GREEN),
                                    Display.getCurrent.getSystemColor(SWT.COLOR_MAGENTA) 
                                   ]
    
    new(Composite parent, int style, DataView dataView, DataObserver observer) {
        super(parent, style)
        
        this.dataView = dataView
        dataObserver = observer
        
        val layoutData = new RowData => [
            width = parent.bounds.width - DataView.BORDER_MARGIN * 2
            height = if (dataObserver.domain == VariableType.BOOL) HEIGHT_BOOLDOMAIN else HEIGHT
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
        
        background = new Color(Display.getCurrent, 240, 240, 240)
        addPaintListener(new PaintListener() {
            
            override paintControl(PaintEvent e) {
                drawCoordinateSystem(e.gc, 0)
                drawValues(e.gc)
            }
            
        })
    }
    
    def addVariable(Variable variable) {
        var text = new Label(this, SWT.NONE)
        text.setText(variable.name)
        text.foreground = textColorList.get(variableTextMap.keySet.size)
        val x = variableTextMap.values.map[ size ].map[ x ] .reduce[ sum, size | sum + size + 2]
        text.setLocation(if (x !== null) x else 0, 0)
        text.setSize(24, BUTTON_SIZE)
        
        variableTextMap.put(variable, text)    
    }
  
    def drawCoordinateSystem(GC gc, double baseline) {
        val maxHeight = getSize.y
        val maxWidth = getSize.x
        val cHeight = maxHeight - COORDINATE_BORDERSPACING * 2
        val cWidth = maxWidth - COORDINATE_LEFTBORDERSPACING - COORDINATE_BORDERSPACING
        
        gc.drawLine(COORDINATE_LEFTBORDERSPACING, COORDINATE_BORDERSPACING, 
            COORDINATE_LEFTBORDERSPACING, COORDINATE_BORDERSPACING + cHeight)
            
        gc.drawLine(COORDINATE_LEFTBORDERSPACING, COORDINATE_BORDERSPACING + cHeight + baseline as int, 
            COORDINATE_LEFTBORDERSPACING + cWidth, COORDINATE_BORDERSPACING + cHeight + baseline as int)
            
        val font = new Font(display, "Arial", 9, SWT.NONE);
        gc.setFont(font)            
            
        var maxText = "" + dataObserver.maxValue
        val maxTextExtent = gc.textExtent(maxText)
        gc.drawString(maxText, COORDINATE_LEFTBORDERSPACING - 2 - maxTextExtent.x, COORDINATE_BORDERSPACING)

        gc.setFont(font)            
        var minText = "" + dataObserver.minValue
        val minTextExtent = gc.textExtent(minText)
        gc.drawString(minText, 
            COORDINATE_LEFTBORDERSPACING - 2 - minTextExtent.x, COORDINATE_BORDERSPACING + cHeight - minTextExtent.y)
    }
    
    def drawValues(GC gc) {
        for (variable : dataObserver.liveVariables) {
            drawValue(gc, variable)
        }
    }
    
    def drawValue(GC gc, Variable variable) {
        val maxHeight = getSize.y
        val maxWidth = getSize.x
        val cHeight = maxHeight - COORDINATE_BORDERSPACING * 2 - COORDINATE_PADDING
        val cWidth = maxWidth - COORDINATE_LEFTBORDERSPACING - COORDINATE_BORDERSPACING
                
        val history = variable.history
        
        var cellWidth = (cWidth as double) / (history.size + 1)
        if (cellWidth > MAX_TICKWIDTH) cellWidth = MAX_TICKWIDTH
        
        var baseline = 0d
        val min = dataObserver.minValue
        val max = dataObserver.maxValue
        val med = (-min + max) as float
        var scale = 1.0f
        if (min < 0) {
            scale = min / med
            baseline = (min / med * cHeight) + (max / med * cHeight)
            scale = -min / med
        }

        gc.foreground = variableTextMap.get(dataObserver.originMap.get(variable)).foreground
        
        val hIter = (history + newLinkedList(variable)).iterator.toIterable
        
        var lastX = 0.0
        var lastY = hIter.head.morph(cHeight) * scale  
        gc.drawLine(COORDINATE_LEFTBORDERSPACING, 
            (COORDINATE_BORDERSPACING + COORDINATE_PADDING + lastY + baseline) as int,
            (COORDINATE_LEFTBORDERSPACING + cellWidth) as int,
            (COORDINATE_BORDERSPACING + COORDINATE_PADDING + lastY + baseline) as int
        )
        lastX = lastX + cellWidth
        
        for (e : hIter.drop(1)) {
            var newY = e.morph(cHeight) * scale
            if (e.type == VariableType.BOOL && newY != lastY) {
                gc.drawLine((COORDINATE_LEFTBORDERSPACING + lastX) as int, 
                    (COORDINATE_BORDERSPACING + COORDINATE_PADDING + lastY + baseline) as int,
                    (COORDINATE_LEFTBORDERSPACING + lastX) as int,
                    (COORDINATE_BORDERSPACING + COORDINATE_PADDING + newY + baseline) as int
                )
                lastY = newY
            }
            gc.drawLine((COORDINATE_LEFTBORDERSPACING + lastX) as int, 
                (COORDINATE_BORDERSPACING + COORDINATE_PADDING + lastY + baseline) as int,
                (COORDINATE_LEFTBORDERSPACING + lastX + cellWidth) as int,
                (COORDINATE_BORDERSPACING + COORDINATE_PADDING + newY + baseline) as int
            )
            lastX = lastX + cellWidth
            lastY = newY
        }
    }
    
    private def double morph(Variable variable, int coordHeight) {
        val value = dataObserver.getVariableValue(variable)
        val max = if (dataObserver.maxValue > -dataObserver.minValue) dataObserver.maxValue else -dataObserver.minValue
        
        val p = if (value == 0) 0 else value / (max as double)
        
        return coordHeight * (1 - p)
    }
    
    private def float max(float a, float b) {
        if (a > b) a else b
    }
    
    private def float calculateBaseline() {
        val maxHeight = getSize.y
        val cHeight = maxHeight - COORDINATE_BORDERSPACING * 2 - COORDINATE_PADDING
        var baseline = 0f
        val min = dataObserver.minValue
        val max = dataObserver.maxValue
        val med = (-min + max) as float
        var scale = 1.0f
        if (min < 0) {
            scale = min / med
            baseline = (min / med * cHeight) + (max / med * cHeight)
            scale = -min / med
        }
        return baseline        
    }
}
