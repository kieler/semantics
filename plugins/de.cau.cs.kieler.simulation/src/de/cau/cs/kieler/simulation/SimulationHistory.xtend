/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation

import java.util.ArrayDeque
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Delegate

/**
 * Histoy in reverse creation order, youngest pool first, oldest (limited) last.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SimulationHistory implements Iterable<DataPool> {

    @Accessors
    private var int maxLength = SimulationContext.MAX_HISTORY_LENGTH.^default
    
    @Delegate
    private val ArrayDeque<DataPool> history = new ArrayDeque<DataPool>(maxLength)
    
    def setMaxLength(int length) {
        this.maxLength = length
        while (history.size > length) {
            history.removeLast
        }
    }
    
    def void add(DataPool dp) {
        history.addFirst(dp)
        while (history.size > maxLength) {
            history.removeLast
        }
    }
    
    def clear() {
        history.clear
    }
    
    /**
     * Iterates over history in revese order.<br>
     * Oldest to youndgest pool.
     */
    def reverseIterator() {
        return history.descendingIterator
    }
}
