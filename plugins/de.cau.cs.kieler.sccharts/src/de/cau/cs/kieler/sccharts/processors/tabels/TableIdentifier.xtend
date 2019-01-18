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
import java.util.ArrayList
import java.util.List

/**
 * @author stu114663
 * 
 */
class TableIdentifier {
    @Inject
    var de.cau.cs.kieler.sccharts.processors.tabels.StateTransitionTableInterpreter stti
    @Inject
    var de.cau.cs.kieler.sccharts.processors.tabels.StateEventTableInterpreter seti

    /** checks the first cell for the TableType */
    def TableInterpreter identify(List<List<String>> table) throws IllegalArgumentException {
        if (table.isNullOrEmpty) {
            throw new IllegalArgumentException("The given model is empty.")
        } else if (table.get(0).isEmpty) {
            throw new IllegalArgumentException("The first row does not contain the table type.")
        } else {
            return applySettings(
                switch (table.get(0).get(0)) {
                    case TableType.StateEvent.name:
                        seti
                    case TableType.StateTransition.name:
                        stti
                    default:
                        throw new IllegalArgumentException("The first cell does not contain the table type.")
                },
                table
            )
        }
    }

    /** Reads settings from the second cell and applies these to the TableInterpreter.
     * Also initializes the TableInterpreter with the best header found.
     */
    private def TableInterpreter applySettings(TableInterpreter ti, List<List<String>> table) {
        if (ti !== null) {
            val Pair<List<HeaderType>, Integer> bestHeader = identifyLongestHeader(table)
            switch (ti.class) {
                case StateTransitionTableInterpreter:
                    // the length of the header is one line longer than the position of the header line
                    ti.initialize(bestHeader.key, bestHeader.value+1, table)
                case StateEventTableInterpreter:
                    // StateEventTables have an additional line (for conditions) after the header line
                    ti.initialize(bestHeader.key, bestHeader.value+2, table)
                default: ti.initialize
            }
        }
        return ti
    }
    
    /** Returns a pair of: 
     * 1. the row of HeaderTypes with the most matches, which were not discardable
     * 2. the location of the row in the table
     */
    private def Pair<List<HeaderType>, Integer> identifyLongestHeader(List<List<String>> table) {
        var List<HeaderType> headerLine = new ArrayList
        var lineLength = 0
        var lineIndex = 0
        for (var int i = 1; i < table.size; i++) {
            val row = table.get(i)
        	val temporLine = identifyHeader(row)
        	val tmpSize = temporLine.reject[HeaderType hn | hn == HeaderType.DISCARDABLE].size
        	lineLength = headerLine.reject[HeaderType hn | hn == HeaderType.DISCARDABLE].size
        	if (tmpSize > lineLength) {
        		headerLine = temporLine
        		lineIndex = i
        	}
        }
        
        var Pair<List<HeaderType>, Integer> ret = null
        if (lineLength > 0) {
            ret = new Pair(headerLine, lineIndex)
        } else {
            ret = new Pair(null, Integer.MIN_VALUE)
        }
        return ret
    }
    
    /** Creates a list of headers */
    private def List<HeaderType> identifyHeader(List<String> row) {
        val headerLine = new ArrayList
        for (headerCell : row) {
            var identified = false
            // compare to header types
        	for (headerNumber : HeaderType.values) {
        	    if (!identified && headerCell == headerNumber.name) {
        	        headerLine.add(headerNumber)
        	        identified = true
        	    }
        	}
        	// mark unidentified header cell as discardable
        	if (!identified) {
        	    headerLine.add(HeaderType.DISCARDABLE)
        	}
        }
        return headerLine
    }
}
