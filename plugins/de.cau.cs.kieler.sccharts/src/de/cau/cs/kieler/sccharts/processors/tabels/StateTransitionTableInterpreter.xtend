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

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import java.util.List

/**
 * @author stu114663
 *
 */
class StateTransitionTableInterpreter extends TableInterpreter {
    @Inject extension SCChartsTransitionExtensions
    
    static final String TRIGGER_EXPRESSION_CONNECTOR = " && "
    
    int headerLines = 1
    HeaderNumbers[] headerLine = #[
        HeaderNumbers.STATE,
        HeaderNumbers.CONDITION,
        HeaderNumbers.EFFECT,
        HeaderNumbers.TARGET_STATE
    ]
    
    /**
     * create a transition for each line
     */
    override createTransitions() {
        for (var rowIndex = headerLines; rowIndex < table.size; rowIndex++) {
            createTransition(this.table.get(rowIndex))
        }
    }
    
    def createTransition(List<String> row) {
        val sourceState = this.stateMap.get(row.get(headerLine.indexOf(HeaderNumbers.STATE)))
        val targetState = this.stateMap.get(row.get(headerLine.indexOf(HeaderNumbers.TARGET_STATE)))
        var Transition trans = createTransitionTo(sourceState, targetState)
        
        trans.trigger = conditions2TriggerExpression(
            indicesToSublist(row, getAllHeaderColumns(HeaderNumbers.CONDITION)),
            TRIGGER_EXPRESSION_CONNECTOR
        )
        
        matchAndMakeValuedObjects(trans.trigger, sourceState)
        
        trans.effects.addAll(effectStrings2Expression(indicesToSublist(row, getAllHeaderColumns(HeaderNumbers.EFFECT))))
    }
}









