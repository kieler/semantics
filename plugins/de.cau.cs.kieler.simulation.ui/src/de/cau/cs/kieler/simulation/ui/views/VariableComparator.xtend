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

import java.util.Comparator
import de.cau.cs.kieler.simulation.core.Variable

/**
 * Comparator for variables.
 * 
 * @author aas
 *
 */
class VariableComparator implements Comparator<Variable>{
    /**
     * Compares two variables and orders them first by isInput, then by isOutput, then by name.
     */
    override compare(Variable o1, Variable o2) {
        // inputs before outputs
        if(o1.isInput && !o2.isInput) {
            return -1
        } else if(!o1.isInput && o2.isInput) {
            return 1
        }
        // outputs for other variables
        if(o1.isOutput && !o2.isOutput) {
            return -1
        } else if(!o1.isOutput && o2.isOutput) {
            return 1
        }
        
        // order by name
        return o1.name.compareTo(o2.name)
    }
}