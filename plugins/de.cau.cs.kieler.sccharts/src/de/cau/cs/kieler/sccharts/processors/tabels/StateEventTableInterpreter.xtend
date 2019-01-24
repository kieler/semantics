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
import java.util.HashMap
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author stu114663
 * 
 */
class StateEventTableInterpreter extends TableInterpreter {
    static final String TRIGGER_EXPRESSION_CONNECTOR = " && "
    static final String CELL_DELIMITER_DO = "DO"
    static final String CELL_DELIMITER_DO_PATTERN = " ?" + CELL_DELIMITER_DO + " +"
    static final String CELL_DELIMITER_TARGET = "GO TO"
    static final String CELL_DELIMITER_TARGET_PATTERN = " ?" + CELL_DELIMITER_TARGET + " +"
    static final String CELL_DELIMITER_PRIO = ":"
    static final String CELL_DELIMITER_PRIO_PATTERN = " ?" + CELL_DELIMITER_PRIO + " *"

    static val map_condition = "condition"
    static val map_effect = "effect"
    static val map_target_state = "target_state"
    static val map_prio = "prio"

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

    private def createTransition(List<String> row, int condi) {
        val String cell = row.get(condi)

        val sourceStateName = row.get(headerLine.indexOf(HeaderType.STATE))
        val targetStateName = getTargetName(cell)

        val conditionStrs = new ArrayList<String>
        conditionStrs.addAll(getConditionStrings(cell))
        conditionStrs.add(getConditionRow().get(condi))
        val trigger = conditions2TriggerExpression(
            conditionStrs,
            TRIGGER_EXPRESSION_CONNECTOR
        )

        val effects = getEffectStrings(cell)?.effectStrings2Expression()
        val prio = getPrioInteger(cell)

        createTransitionWithPrio(sourceStateName, targetStateName, trigger, effects, prio)
    }

    private def List<String> getConditionRow() {
        table.get(headerLines - 1)
    }

    private def <T> Iterable<T> dropLast(Iterable<T> iter) {
        iter.take(iter.size - 1)
    }

    private def String concatenate(Iterable<String> iter) {
        iter.fold("", [String l, String s|return l + s])
    }

    private def Iterable<String> getConditionStrings(String cell) {
        getCEStrings(cell, map_condition)
    }

    private def Iterable<String> getEffectStrings(String cell) {
        getCEStrings(cell, map_effect)
    }

    private def Iterable<String> getCEStrings(String cell, String item) {
        val tmp = new ArrayList<String>
        val map = splitCellString(cell)
        if (map !== null) {
            tmp.add(map.getOrDefault(item,""))
        }
        return tmp
    }

    private def String getTargetName(String cell) {
        splitCellString(cell)?.get(map_target_state)
    }

    private def Integer getPrioInteger(String cell) {
        return try {
            Integer.valueOf(splitCellString(cell)?.get(map_prio))
        } catch (NumberFormatException exception) {
            null
        }
    }

    private def HashMap<String, String> splitCellString(String cell) {
        if (cell.isNullOrEmpty) {
            return null
        }

        val map = new HashMap<String, String>

        if (cell.contains(CELL_DELIMITER_PRIO)) {
            if (cell.contains(CELL_DELIMITER_TARGET) && cell.contains(CELL_DELIMITER_DO)) {
                // PRIO DO TARGET
                var tmp = cell.split(CELL_DELIMITER_PRIO_PATTERN)
                map.put(map_prio, tmp.head)
                tmp = tmp.tail.concatenate.split(CELL_DELIMITER_DO_PATTERN)
                map.put(map_condition, tmp.head)
                tmp = tmp.tail.concatenate.split(CELL_DELIMITER_TARGET_PATTERN)
                map.put(map_effect, tmp.dropLast.concatenate)
                map.put(map_target_state, tmp.last)
            } else if (cell.contains(CELL_DELIMITER_TARGET)) {
                // PRIO TARGET
                var tmp = cell.split(CELL_DELIMITER_PRIO_PATTERN)
                map.put(map_prio, tmp.head)
                tmp = tmp.tail.concatenate.split(CELL_DELIMITER_TARGET_PATTERN)
                map.put(map_effect, tmp.dropLast.concatenate)
                map.put(map_target_state, tmp.last)
            } else if (cell.contains(CELL_DELIMITER_DO)) {
                // PRIO DO
                var tmp = cell.split(CELL_DELIMITER_PRIO_PATTERN)
                map.put(map_prio, tmp.head)
                tmp = tmp.tail.concatenate.split(CELL_DELIMITER_DO_PATTERN)
                map.put(map_condition, tmp.head)
                map.put(map_effect, tmp.tail.concatenate)
            } else {
                // PRIO
                var tmp = cell.split(CELL_DELIMITER_PRIO_PATTERN)
                map.put(map_prio, tmp.head)
                map.put(map_target_state, tmp.tail.concatenate)
            }
        } else {
            if (cell.contains(CELL_DELIMITER_TARGET) && cell.contains(CELL_DELIMITER_DO)) {
                // DO TARGET
                var tmp = cell.split(CELL_DELIMITER_DO_PATTERN)
                map.put(map_condition, tmp.head)
                tmp = tmp.tail.concatenate.split(CELL_DELIMITER_TARGET_PATTERN)
                map.put(map_effect, tmp.dropLast.concatenate)
                map.put(map_target_state, tmp.last)
            } else if (cell.contains(CELL_DELIMITER_TARGET)) {
                // TARGET
                var tmp = cell.split(CELL_DELIMITER_TARGET_PATTERN)
                map.put(map_effect, tmp.dropLast.concatenate)
                map.put(map_target_state, tmp.last)
            } else if (cell.contains(CELL_DELIMITER_DO)) {
                // DO
                var String[] tmp = cell.split(CELL_DELIMITER_DO_PATTERN)
                map.put(map_condition, tmp.head)
                map.put(map_effect, tmp.tail.concatenate)
            } else {
                map.put(map_target_state, cell.trim)
            }
        }

        return map
    }
}
