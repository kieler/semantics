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
import java.util.ArrayList
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author stu114663
 *
 */
class StateTransitionTableInterpreter extends TableInterpreter {
    @Inject extension SCChartsTransitionExtensions
    
    static final String TRIGGER_EXPRESSION_CONNECTOR = " && "
    
    @Accessors
    final TableType tableType = TableType.StateTransition
    
    final int HEADERLINES = 2
    final HeaderType[] HEADER_LINE = #[
        HeaderType.STATE,
        HeaderType.CONDITION,
        HeaderType.EFFECT,
        HeaderType.TARGET_STATE
    ]
    
    /** Initializes the Interpreter.
     * When given null a default behaviour is used.
     */
    override initialize(HeaderType[] headerLine, int headerlines, List<List<String>> table) {
        if (headerLine !== null) {
            this.headerLine = headerLine
        } else {
            this.headerLine = HEADER_LINE
        }
        if (headerlines < HEADERLINES) {
            this.headerLines = HEADERLINES
        } else {
            this.headerLines = headerlines
        }
        if (table !== null) {
            this.table = table
        } else {
            this.table = new ArrayList<List<String>>
        }
        this.initialized = true
    }
    
    /**
     * create a transition for each line
     */
    override createTransitions() {
        for (var rowIndex = headerLines; rowIndex < table.size; rowIndex++) {
            createTransition(this.table.get(rowIndex))
        }
    }
    
    def createTransition(List<String> row) {
        val sourceState = this.stateMap.get(row.get(headerLine.indexOf(HeaderType.STATE)))
        val targetState = this.stateMap.get(row.get(headerLine.indexOf(HeaderType.TARGET_STATE)))
        var Transition trans = createTransitionTo(sourceState, targetState)
        
        trans.trigger = conditions2TriggerExpression(
            indicesToSublist(row, getAllHeaderColumns(HeaderType.CONDITION)),
            TRIGGER_EXPRESSION_CONNECTOR
        )
        
        trans.trigger.matchAndMakeValuedObjects(sourceState)
        
        trans.effects.addAll(effectStrings2Expression(indicesToSublist(row, getAllHeaderColumns(HeaderType.EFFECT))))
        
        for (effect : trans.effects) {
        	effect.matchAndMakeValuedObjects(sourceState)
        }
    }
}









