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

import java.util.ArrayList
import java.util.List

/**
 * @author stu114663
 *
 */
class CSVParser {
	String csvSource
	String delim
    String escape
    List<List<String>> table
    boolean parsed = false
    
    new(String source, String delimiter, String escapeCharacter) {
        this.csvSource = source
        this.delim = delimiter
        this.escape = escapeCharacter
    }
    
    private def parse() {
        this.table = new ArrayList<List<String>>()
        
        // prototype parser that should probably be replaced by a library call
        var String[] splitLines = csvSource.split("\n")
        for (var i = 0; i < splitLines.length; i++) {
            var String[] splitDelim = splitLines.get(i).split(delim, -1)
            val lineList = new ArrayList<String>
            for (var j = 0; j < splitDelim.length; j++) {
                val tmp = splitDelim.get(j)
                
                if ( tmp.endsWith(escape)) {
                    lineList.add(tmp.substring(0, tmp.length -1).concat(delim).concat(splitDelim.get(j+1)))
                    j++
                } else {
                    lineList.add(tmp)
                }
            }
            table.add(lineList)
        }
        
        this.parsed = true
    }
    
    def List<List<String>> getTable() {
        if (!parsed) {
        	parse()
        }
        return table
    }
}