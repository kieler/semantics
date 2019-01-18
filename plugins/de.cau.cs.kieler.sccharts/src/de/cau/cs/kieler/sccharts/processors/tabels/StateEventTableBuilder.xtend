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

import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author stu114663
 *
 */
class StateEventTableBuilder extends TableBuilder {
    static final String CELL_DELIMITER = " GO TO "
    
    @Accessors
    final TableType tableType = TableType.StateEvent
    
    val List<HeaderType> headerLine = new ArrayList<HeaderType>(#[HeaderType.STATE])
    val List<String> conditionRow = new ArrayList<String>
    val HashMap<String,List<String>> statename2row = new HashMap<String,List<String>>
    
    override build() {
        if (model !== null) {
            table = new ArrayList<List<String>>
        
            // TODO model may not have a rootstate or region
        	val region = model.rootStates.get(0).regions.get(0)
        	if (region instanceof ControlflowRegion) {
        	    for (state : region.states) {
        	    	for (transition : state.outgoingTransitions) {
        	    		insertTransition(transition)
        	    	}
        	    }
        	    
        	    insertHeader()
        	} else {
        		// TODO Throw exception when the region is not a ControlFlowRegion
        	}
        } else {
            // TODO throw exception
            table = null
        }
        
        return table
    }
    
    override insertHeader() {
        // add condition row
        conditionRow.add(0, "")
        table.add(0,conditionRow)
        
        // add header line
        table.add(headerLine.map[HeaderType ht | ht.name])
        
        // add table type
        table.add(#[this.tableType.name])
    }
    
    override insertTransition(Transition outTrans) {
        val State sourceState = outTrans.sourceState
        val String sourceStateName = sourceState.name
        val String trigger = trigger2String(outTrans.trigger)
        val String effect = effects2String(outTrans.effects)
        val String targetStateName = outTrans.targetState.name
        
        var List<String> line = statename2row.get(sourceStateName)
        if (line === null) {
        	line = new ArrayList<String>(#[sourceStateName])
            statename2row.put(sourceStateName, line)
            if (sourceState.isInitial) {
            	table.add(0, line)
            } else {
                table.add(line)
            }
        }
        
        val condi = if (conditionRow.indexOf(trigger) != -1) {
            conditionRow.indexOf(trigger)+1
        } else {
            headerLine.add(HeaderType.CONDITION)
            conditionRow.add(trigger)
            conditionRow.size
        }
        
        line.add(condi, effect + CELL_DELIMITER + targetStateName)
    }
}