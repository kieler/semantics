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

import java.util.ArrayList
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author stu114663
 *
 */
class StateEventTableInterpreter extends TableInterpreter {
    static final String TRIGGER_EXPRESSION_CONNECTOR = " && "
    static final String CELL_DELIMITER = " GO TO "
    
    @Accessors
    final TableType tableType = TableType.StateTransition
    
    final int HEADERLINES = 3
    final HeaderType[] HEADER_LINE = #[
        HeaderType.STATE,
        HeaderType.CONDITION
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
            val condColsIndex = getAllHeaderColumns(HeaderType.CONDITION)
            for (condi : condColsIndex) {
                createTransition(this.table.get(rowIndex), condi)
            }
        }
    }
    
    def createTransition(List<String> row, int condi) {
        val sourceStateName = row.get(headerLine.indexOf(HeaderType.STATE))
        val targetStateName = getTargetName(row.get(condi))
        
        val trigger = conditions2TriggerExpression(
            getConditionRow().subList(condi, condi),
            TRIGGER_EXPRESSION_CONNECTOR
        )
        
        val effects = effectStrings2Expression(getEffectString(row.get(condi)))
        
        createTransition(sourceStateName, targetStateName, trigger, effects)
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









