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

import de.cau.cs.kieler.simulation.core.Variable
import java.util.List
import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.GC
import org.eclipse.swt.graphics.Image
import org.eclipse.swt.graphics.Point
import org.eclipse.swt.widgets.Display

/**
 * @author aas
 *
 */
class HistoryColumnLabelProvider extends DataPoolColumnLabelProvider{
    protected var Image img
    
    override String getText(Object element) {
        if(element instanceof Variable) {
            return createHistoryText(element.history.map[it.value])
        }
        return ""
    }
    
    override Image getToolTipImage(Object element) {
        if(img != null) {
            img.dispose()
            img = null
        }
        if(element instanceof Variable) {
            img = createHistoryGraph(element.history.map[it.value])
        }
        return img
    }
    
    protected def String createHistoryText(List<Object> history) {
        var txt = ""
        val max = 6
        var size = history.size()
        val from = size - Math.min(size, max)
        val to = size
        val lastElements = history.subList(from, to)
        if(size > max) {
            txt += "..."
        }
        val historyText = lastElements.join(", ")
        txt += historyText
        return txt
    }
    
    protected static def Image createHistoryGraph(List<Object> history) {
        if(!history.isNullOrEmpty) {
            val firstValue = history.get(0)
            if(firstValue instanceof Double) {
                val List<Double> numbers = history.map[it as Double]
                return createNumberGraph(numbers)
            } else if(firstValue instanceof Boolean) {
                val List<Boolean> booleans = history.map[it as Boolean]
                return createBooleanGraph(booleans)
            }
        }
        
        return null
    }
    
    private static def Image createNumberGraph(List<Double> numbers) {
        // Min / max value from history        
        val min = numbers.min
        val max = numbers.max
        
        // Create image
        val w = 92
        val h = 48
        val display = Display.getCurrent()
        val img = new Image(display, w, h);
        
        val gc = new GC(img)
        // Draw scale
        gc.drawText(max.toString, 0, 0)
        gc.drawText(min.toString, 0, h-16)
        // Draw graph
        gc.foreground = display.getSystemColor(SWT.COLOR_RED)
        val int step = w/numbers.size
        var int x
        var int y
        var Point lastPos = null
        for(n : numbers) {
            val fraction = ((n-min) / (max-min))
            y = (h * fraction).intValue
            val pos = new Point(x, h-y-1)
            x += step
            
            if(lastPos != null) {
                gc.drawLine(lastPos.x, lastPos.y, pos.x, pos.y)
            }
            
            lastPos = pos
        }
        
        gc.dispose()
        
        return img
    }
    
    private static def Image createBooleanGraph(List<Boolean> booleans) {
        // Create image
        val w = 92
        val h = 48
        val display = Display.getCurrent()
        val img = new Image(display, w, h);
        
        val gc = new GC(img)
        // Draw graph
        gc.foreground = display.getSystemColor(SWT.COLOR_RED)
        val int spacing = 8
        val int step = w/booleans.size
        var int x
        var int y
        var Point lastPos = null
        for(b : booleans) {
            y = if(b) (h - spacing) else spacing
            val pos = new Point(x, h-y-1)
            x += step
            
            if(lastPos != null) {
                gc.drawLine(lastPos.x, lastPos.y, pos.x, pos.y)
            }
            
            lastPos = pos
        }
        
        gc.dispose()
        
        return img
    }
}