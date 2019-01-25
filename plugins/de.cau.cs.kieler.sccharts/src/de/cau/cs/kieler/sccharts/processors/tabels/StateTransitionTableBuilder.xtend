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

import de.cau.cs.kieler.sccharts.Transition
import java.util.ArrayList
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
    
    override insertHeader() {
        // insert header line
        table.add(0, HEADER_LINE.map[HeaderType ht | ht.name])
        // insert table type
        table.add(0, new ArrayList => [it.add(this.tableType.name)])
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