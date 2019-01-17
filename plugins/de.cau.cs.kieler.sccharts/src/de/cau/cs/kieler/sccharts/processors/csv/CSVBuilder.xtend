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

import java.util.List

/**
 * @author stu114663
 *
 */
class CSVBuilder {
    String csvString
    String delim
    String escape
    List<List<String>> table
    boolean built = false
    
    new(List<List<String>> table, String delimiter, String escapeCharacter) {
        this.table  = table
        this.delim  = delimiter
        this.escape = escapeCharacter
    }
    
    private def build() {
        if(table === null) {
            csvString = ""
        } else {
            val StringBuilder sb = new StringBuilder
            
            val lineLength = unifyLineLengths()
            
            for (var i = 0; i<table.size; i++) {
                val line = table.get(i)
                
                sb.append(escapeDelimAndEscape(line.get(0)))
            	for (var j = 1 ; j<lineLength; j++) {
            		sb.append(delim)
                    sb.append(escapeDelimAndEscape(line.get(j)))
            	}
            	sb.append("\n")
            }
            
            csvString = sb.toString
        }
        this.built = true
    }
    
    private def String escapeDelimAndEscape(String cell) {
        val StringBuilder sb0 = new StringBuilder
        var escapees = cell.split(escape)
        sb0.append(escapees.get(0))
        for (var i = 1; i < escapees.size; i++) {
            sb0.append(escape + escape + escapees.get(i))
        }
        val StringBuilder sb1 = new StringBuilder
        escapees = sb0.toString.split(delim)
        sb1.append(escapees.get(0))
        for (var i = 1; i < escapees.size; i++) {
            sb1.append(escape + delim + escapees.get(i))
        }
        return sb1.toString
    }
    
    /** Unifies the line lengths in the table and returns that length. */
    private def int unifyLineLengths() {
        var longest = 0
        
        for (var i = 0; i < table.size; i++) {
            val List<String> line = table.get(i)
            val lineLength = line.length
        	if (lineLength > longest) {
        	    for (var j = 0; j < i; j++) {
        	        val tmpLine = table.get(j)
        	        addElems(tmpLine, "", lineLength-longest)
        	    }
        	    longest = lineLength
        	} else if (lineLength < longest) {
        	    addElems(line, "", longest-lineLength)
        	}
        }
        
        return longest
    }
    
    private def <T> addElems(List<T> list, T elem, int cnt) {
        for (var i = 0; i < cnt; i++) {
            list.add(elem)
        }
    }
    
    def String getCSV() {
        if (!built) {
            build()
        }
        return csvString
    }
}