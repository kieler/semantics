/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.trace.printer

import de.cau.cs.kieler.prom.FileExtensions
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.NDimensionalArray
import de.cau.cs.kieler.simulation.core.NDimensionalArrayElement
import de.cau.cs.kieler.simulation.core.Variable
import java.util.HashMap
import java.util.List

/**
 * @author aas
 *
 */
class KTraceFilePrinter extends TracePrinter {
    
    private val TICK_SEPARATOR = ";"
    private val ASSIGNMENT_SEPARATOR = " "
    
    override getFileExtension() {
        return FileExtensions.KTRACE
    }
    
    override getFileContent(List<DataPool> history) {
        var String content = ""
        // Start with a reset
        content += "reset ;\n"
        // Print data pools as assignments
        val lastValues = <String,Object> newHashMap
        var tickCount = 0
        for(pool : history) {
            tickCount++
            // Inputs of the current tick
            var inputContent = convert(pool, true, lastValues)
            // Outputs of the current tick
            var outputContent = convert(pool, false, lastValues)
            // Combine inputs and outputs in trace file with appropriate separators
//            content += "// After tick "+tickCount+"\n" // TODO: These comments gives error markers in the trace files for some reason. 
            content += "   " + inputContent + "\n"
                     + "=> " + outputContent + TICK_SEPARATOR
            content += "\n"
        }
        return content
    }
    
    private def String convert(DataPool pool, boolean useInputs, HashMap<String, Object> lastValues) {
        var String content = ""
        for(m : pool.models) {
            for(v : m.variables) {
                if(useInputs && v.isInput || !useInputs && v.isOutput) {
                    val newContent = convert(v, lastValues)
                    if(newContent !== null) {
                        if(!content.isNullOrEmpty) {
                            content += ASSIGNMENT_SEPARATOR + newContent
                        } else {
                            content += newContent
                        }
                    }
                }
            }
        }
        return content
    }   
     
    private def String convert(Variable v, HashMap<String, Object> lastValues) {
        var String varName = v.name
        if(v.model.pool.models.size > 1) {
           varName = v.fullyQualifiedName
        }
        if(v.isArray) {
            val arr = v.value as NDimensionalArray
            var content = ""
            for(e : arr.elements) {
                val newContent = convert(varName, e, lastValues)
                if(newContent !== null) {
                    if(!content.isNullOrEmpty) {
                        content += ASSIGNMENT_SEPARATOR + newContent
                    } else {
                        content += newContent
                    }
                }
            }
            return content
        } else {
            val lastValue = lastValues.get(varName)
            if(lastValue != v.value) {
                lastValues.put(varName, v.value)
                return getAssignment(varName, v.value)
            }
        }
    }
    
    private def String convert(String varName, NDimensionalArrayElement e, HashMap<String, Object> lastValues) {
        val arrayIndices = e.index.map["["+it.toString+"]"].join("")
        val fullName = varName+arrayIndices
        val lastValue = lastValues.get(fullName)
        if(lastValue != e.value) {
            lastValues.put(fullName, e.value)
            return getAssignment(fullName, e.value)
        }
    }
    
    private def String getAssignment(String leftSideText, Object rightSide) {
        var rightSideText = rightSide.toString
        // Quote strings
        if(rightSide !== null && rightSide instanceof String) {
            rightSideText = '"' +rightSideText + '"'
        }
        return leftSideText + "=" + rightSideText
    }
}