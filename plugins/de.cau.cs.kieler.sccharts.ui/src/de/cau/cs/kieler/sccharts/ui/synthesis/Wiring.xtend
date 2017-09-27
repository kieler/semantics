/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.synthesis

import de.cau.cs.kieler.kexpressions.Expression

/**
 * @author ssm
 * @kieler.design 2017-09-26 proposed
 * @kieler.rating 2017-09-26 proposed yellow
 *
 */
class Wiring {
    
    val wires = <Wire, Wire> newHashMap
    
    def add(Wire wire) {
        wires.put(wire, wire)
    }
    
    def getWires() {
        wires.values
    }
    
    def getWire(Expression expression) {
        val key = new Wire(expression, null, null)
        if (wires.containsKey(key)) {
            val wire = wires.get(key)
            return wire
        } else {
            val wire = new Wire(expression, this, null)
            return wire
        }
    }
    
}