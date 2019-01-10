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
package de.cau.cs.kieler.sccharts.processors.csv

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import java.util.ArrayList
import java.util.List

/**
 * @author stu114663
 *
 */
class StateEventTableInterpreter extends TableInterpreter implements ICSVInterpreter {
    @Inject extension SCChartsTransitionExtensions
    
    static final String CELL_DELIMITER = "\\"
    
    int headerLines = 2
    HeaderNumbers[] headerLine = #[
        HeaderNumbers.STATE,
        HeaderNumbers.CONDITION
    ]
    
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
    
    def createTransition(ArrayList<String> row, int condi) {
        val sourceState = this.stateMap.get(row.get(headerLine.indexOf(HeaderNumbers.STATE)))
        
        var targetState = this.stateMap.get(getTargetName(row.get(condi)))
        
        var Transition trans = createTransitionTo(sourceState, targetState)
        
        trans.trigger = conditions2TriggerExpression(getCondRow.subList(condi, condi), CELL_DELIMITER)
        
        matchAndMakeValuedObjects(trans.trigger, sourceState)
        
        trans.effects.addAll(effectStrings2Expression(indicesToSublist(row, getAllHeaderColumns(HeaderNumbers.EFFECT))))
    }
    
    def ArrayList<String> getCondRow() {table.get(headerLines-1)}
    
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









