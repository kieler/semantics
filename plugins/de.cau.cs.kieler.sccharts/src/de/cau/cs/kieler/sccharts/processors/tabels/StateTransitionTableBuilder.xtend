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

/**
 * @author stu114663
 *
 */
class StateTransitionTableBuilder extends TableBuilder {
    // header line: [ID] State Condition Effect Target Comment
    
    override build() {}
    
    override insertTransition(Transition outTrans) {
        val ArrayList<String> line = <String> newArrayList
        
        // fill line list
//        line.add(ID)
        line.add(outTrans.sourceState.name)
        line.add(outTrans.trigger.toString)
//        line.add(outTrans.effects.fold(String str, [Effect eff, String str | str += eff.]))
        
        line.add(outTrans.targetState.name)
        
        // add line list to table list
        table.add(line)
    }
}