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
    protected static val COORDINATE_TICKMARK_LENGTH = 2
    
    protected static val MAX_TICKWIDTH = 10

    protected val DataView dataView
    protected val DataObserver dataObserver
    
    protected val variableTextMap = <Variable, Label> newLinkedHashMap
    protected val textColorList = #[Display.getCurrent.getSystemColor(SWT.COLOR_RED),
                                    Display.getCurrent.getSystemColor(SWT.COLOR_BLUE),
                                    Display.getCurrent.getSystemColor(SWT.COLOR_GREEN),
                                    Display.getCurrent.getSystemColor(SWT.COLOR_MAGENTA) 
                                   ]

     protected var maxHeight = 0
     protected var maxWidth = 0
     protected var cHeight = 0
     protected var cWidth = 0
     protected var cellWidth = 0d
     protected var baseline = 0d
     protected var observerMinValue = 0d
     protected var observerMaxValue = 0d
    
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
                val v = if (dataObserver.liveVariables.empty) null else dataObserver.liveVariables.head
                calculateMeasures(e.gc, v)
                drawCoordinateSystem(e.gc, baseline, v)
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
    
    def calculateMeasures(GC gc, Variable anyVariable) {
        maxHeight = getSize.y
        maxWidth = getSize.x
        cHeight = maxHeight - COORDINATE_BORDERSPACING * 2 
        cWidth = maxWidth - COORDINATE_LEFTBORDERSPACING - COORDINATE_BORDERSPACING

        if (anyVariable !== null) {                
            val history = anyVariable.getHistory(-1, false, true)
            cellWidth = (cWidth as double) / (history.size + 1)
        } else {
            cellWidth = MAX_TICKWIDTH
        }
        if (cellWidth > MAX_TICKWIDTH) cellWidth = MAX_TICKWIDTH
        
        baseline = cHeight
        observerMinValue = dataObserver.minValue
        observerMaxValue = dataObserver.maxValue
        if (observerMinValue < 0) {
            val mMin = -observerMinValue
            var oMax = observerMaxValue + mMin
            if (mMin == observerMaxValue) {
                baseline = cHeight / 2
            } else {
                val p = mMin / oMax
                baseline = cHeight * (1 - p)
            }
        }        
    }
  
    def drawCoordinateSystem(GC gc, double baseline, Variable anyVariable) {
        gc.drawLine(COORDINATE_LEFTBORDERSPACING, COORDINATE_BORDERSPACING, 
            COORDINATE_LEFTBORDERSPACING, COORDINATE_BORDERSPACING + cHeight)
            
        gc.drawLine(COORDINATE_LEFTBORDERSPACING, COORDINATE_BORDERSPACING + baseline as int, 
            COORDINATE_LEFTBORDERSPACING + cWidth, COORDINATE_BORDERSPACING + baseline as int)
            
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
            
        if (anyVariable !== null) {
            val history = anyVariable.getHistory(-1, false, true)
            println(history.map[it.value])
            for (i : 0..history.size) {
                val ctl = if (i % 5 == 0) COORDINATE_TICKMARK_LENGTH * 2 else COORDINATE_TICKMARK_LENGTH
                val top = if (baseline != cHeight) COORDINATE_BORDERSPACING + baseline as int - ctl 
                else COORDINATE_BORDERSPACING + baseline as int
                val left = COORDINATE_LEFTBORDERSPACING + (i * cellWidth) as int 
                gc.drawLine(left, top, left, COORDINATE_BORDERSPACING + baseline as int + ctl)
            }
        }
    }
    
    def drawValues(GC gc) {
        for (variable : dataObserver.liveVariables) {
            drawValue(gc, variable)
        }
    }
    
    def drawValue(GC gc, Variable variable) {
        val history = variable.getHistory(-1, false, true)
        gc.foreground = variableTextMap.get(dataObserver.originMap.get(variable)).foreground
        
        val hIter = (history + newLinkedList(variable)).iterator.toIterable
        
        var lastX = 0.0
        var lastY = hIter.head.normalizedMorph(cHeight)   
        gc.drawLine(COORDINATE_LEFTBORDERSPACING, 
            (COORDINATE_BORDERSPACING + lastY) as int,
            (COORDINATE_LEFTBORDERSPACING + cellWidth) as int,
            (COORDINATE_BORDERSPACING + lastY) as int
        )
        lastX = lastX + cellWidth
        
        for (e : hIter.drop(1)) {
            var newY = e.normalizedMorph(cHeight) 
            if (e.type == VariableType.BOOL && newY != lastY) {
                gc.drawLine((COORDINATE_LEFTBORDERSPACING + lastX) as int, 
                    (COORDINATE_BORDERSPACING + lastY) as int,
                    (COORDINATE_LEFTBORDERSPACING + lastX) as int,
                    (COORDINATE_BORDERSPACING + newY) as int
                )
                lastY = newY
            }
            gc.drawLine((COORDINATE_LEFTBORDERSPACING + lastX) as int, 
                (COORDINATE_BORDERSPACING + lastY) as int,
                (COORDINATE_LEFTBORDERSPACING + lastX + cellWidth) as int,
                (COORDINATE_BORDERSPACING + newY) as int
            )
            lastX = lastX + cellWidth
            lastY = newY
        }
    }
    
    private def double normalizedMorph(Variable variable, int coordHeight) {
        val shift = -observerMinValue 
        val value = dataObserver.getVariableValue(variable) + shift 
        val max = observerMaxValue + shift
        val p = if (value == 0) 0 else value / (max as double)
        return coordHeight * (1 - p) 
    }
    
}