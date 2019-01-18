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
class StateTransitionTableInterpreter extends TableInterpreter {
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
        val sourceStateName = row.get(headerLine.indexOf(HeaderType.STATE))
        val targetStateName = row.get(headerLine.indexOf(HeaderType.TARGET_STATE))
        
        val trigger = conditions2TriggerExpression(
            indicesToSublist(row, getAllHeaderColumns(HeaderType.CONDITION)),
            TRIGGER_EXPRESSION_CONNECTOR
        )
        
        val effects = effectStrings2Expression(indicesToSublist(
            row,
            getAllHeaderColumns(HeaderType.EFFECT)
        ))

        createTransition(sourceStateName, targetStateName, trigger, effects)
    }
}
