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
package de.cau.cs.kieler.sccharts.ui.complexity

import de.cau.cs.kieler.sccharts.ui.complexity.SCTXComplexityCalculationHandler

/**
 * @author lgr
 *
 */
class ExpressionComplexityHandler extends SCTXComplexityCalculationHandler {
    
    override getCompilationSystemID() {
        return "de.cau.cs.kieler.sccharts.netlist.complexity.expression"
    }
    
    override getIdentifier() {
        return "ExpressionCount"
    }
    
}