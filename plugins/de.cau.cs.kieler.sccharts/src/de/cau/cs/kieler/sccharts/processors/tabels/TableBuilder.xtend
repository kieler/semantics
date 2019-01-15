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
package de.cau.cs.kieler.sccharts.processors.tabels

import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.sccharts.SCCharts
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kexpressions.keffects.Effect

/**
 * @author stu114663
 *
 */
abstract class TableBuilder implements ITableBuilder {
    @Accessors
    SCCharts model
    @Accessors
    List<List<String>> table
    
    
    def String trigger2String(Expression trigger) {
        if (trigger !== null) {
            // TODO turn Expression to String
            return ""
        } else {
            return ""
        }
    }
    
    def String effects2String(List<Effect> effects) {
        if (effects !== null) {
        	for (effect : effects) {
                // TODO turn Effect into String 
        	}
        	return ""
        } else {
        	return ""
        }
    }
}