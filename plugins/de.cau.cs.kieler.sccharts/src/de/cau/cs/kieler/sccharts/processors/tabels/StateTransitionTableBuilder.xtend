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
import de.cau.cs.kieler.sccharts.Transition
import java.util.ArrayList
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author stu114663
 *
 */
class StateTransitionTableBuilder extends TableBuilder {
    @Accessors
    final TableType tableType = TableType.StateTransition
    
    // header line: [ID] State Condition Effect Target Comment
    final HeaderType[] HEADER_LINE= #[
        HeaderType.STATE,
        HeaderType.CONDITION,
        HeaderType.EFFECT,
        HeaderType.TARGET_STATE
    ]
    
    override build() {
        if (model !== null) {
            table = new ArrayList<List<String>>
            insertHeader()
        
        	val region = model.rootStates.get(0).regions.get(0)
        	if (region instanceof ControlflowRegion) {
        	    for (state : region.states) {
        	    	for (transition : state.outgoingTransitions) {
        	    		insertTransition(transition)
        	    	}
        	    }
        	} else {
        		// TODO Throw exception when the region is not a ControlFlowRegion
        	}
        } else {
            table = null
        }
        
        return table
    }
    
    override insertHeader() {
        // insert table type
        table.add(#[this.tableType.name])
        
        // insert header line
        table.add(HEADER_LINE.map[HeaderType ht | ht.name])
    }
    
    override insertTransition(Transition outTrans) {
        val ArrayList<String> line = <String> newArrayList
        
        // fill line list
//        line.add(ID)
        line.add(outTrans.sourceState.name)
        line.add(trigger2String(outTrans.trigger))
        line.add(effects2String(outTrans.effects))
        line.add(outTrans.targetState.name)
        
        // add line list to table list
        table.add(line)
    }
}