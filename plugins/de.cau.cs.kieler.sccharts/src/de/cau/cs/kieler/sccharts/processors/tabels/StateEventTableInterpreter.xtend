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
import java.util.ArrayList
import java.util.List

/**
 * @author stu114663
 *
 */
class StateEventTableInterpreter extends TableInterpreter {
    @Inject extension SCChartsTransitionExtensions
    
    static final String TRIGGER_EXPRESSION_CONNECTOR = " && "
    static final String CELL_DELIMITER = "\\"
    
    int headerLines = 2
    final HeaderNumbers[] HEADER_LINE = #[
        HeaderNumbers.STATE,
        HeaderNumbers.CONDITION
    ]
    
    /** Initializes the Interpreter.
     * When given null a default behaviour is used.
     */
    override initialize(HeaderNumbers[] headerLine, List<List<String>> table) {
        if (headerLine !== null) {
            this.headerLine = headerLine
        } else {
            this.headerLine = HEADER_LINE
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
            val condColsIndex = getAllHeaderColumns(HeaderNumbers.CONDITION)
            for (condi : condColsIndex) {
                createTransition(this.table.get(rowIndex), condi)
            }
        }
    }
    
    def createTransition(List<String> row, int condi) {
        val sourceState = this.stateMap.get(row.get(headerLine.indexOf(HeaderNumbers.STATE)))
        
        var targetState = this.stateMap.get(getTargetName(row.get(condi)))
        
        var Transition trans = createTransitionTo(sourceState, targetState)
        
        trans.trigger = conditions2TriggerExpression(getConditionRow().subList(condi, condi), TRIGGER_EXPRESSION_CONNECTOR)
        
        trans.trigger.matchAndMakeValuedObjects(sourceState)
        
        trans.effects.addAll(effectStrings2Expression(getEffectString(row.get(condi))))
        
        for (effect : trans.effects) {
        	effect.matchAndMakeValuedObjects(sourceState)
        }
    }
    
    def List<String> getConditionRow() {table.get(headerLines-1)}
    
    def List<String> getEffectString(String cell) {
        val effectTargetList = getEffectTargetList(cell)
        effectTargetList.subList(0, effectTargetList.length-2)
    }
    
    def String getTargetName(String cell) {
        val actionTargetList = getEffectTargetList(cell)
        actionTargetList.last
    }
    
    def String[] getEffectTargetList(String cell) {
        cell.split(CELL_DELIMITER)
    }
}









