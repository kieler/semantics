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
import org.eclipse.swt.graphics.Image

/**
 * Displays the history of variables in the simulation.
 * As tooltip image a small diagram is shown, which displays the values in a graph. 
 * 
 * @author aas
 *
 */
class HistoryColumnLabelProvider extends DataPoolColumnLabelProvider{
    
    /**
     * The max number of history entries to be displayed. 
     */
    public static val MAX_HISTORY_LENGTH = 6
    
    /**
     * {@inheritDoc}
     */
    override String getText(Object element) {
        return getHistoryText(element)
    }
    
    /**
     * Returns the history text for the given variable.
     * If the element is not a variable, the empty string is returned.
     * 
     * @param element The element
     * @return The history text
     */
    public static def String getHistoryText(Object element) {
        if(element instanceof Variable) {
            // use +1 here to indicate when the history is actually longer than displayed
            val history = element.getHistory(MAX_HISTORY_LENGTH+1, false)
            return createHistoryText(history.map[it.value])
        }
        return ""
    }
    
    /**
     * Returns the text for the values in the list.
     * If there are to many values in the list, then the text is shortened.
     * 
     * @param history The list of values
     * @return the (possibly shortened) text for this history
     */
    protected static def String createHistoryText(List<Object> history) {
        var txt = ""
        var size = history.size()
        val from = size - Math.min(size, MAX_HISTORY_LENGTH)
        val to = size
        val lastElements = history.subList(from, to)
        if(size > MAX_HISTORY_LENGTH) {
            txt += "..."
        }
        val historyText = lastElements.join(", ")
        txt += historyText
        return txt
    }
}