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
import com.google.inject.Inject

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
    def TableInterpreter identify(List<List<String>> table) {
        if(table.isEmpty) {
            return null
        } else if(table.get(0).isEmpty) {
            return null
        } else {
            return applySettings(switch(table.get(0).get(0)) {
                case TableTypes.StateEvent.name:
                    seti
                case TableTypes.StateTransition.name:
                    stti
                default:
                    null
            })
        }
    }
    
    /** reads settings from the second cell and applies these to the TableInterpreter */
    def TableInterpreter applySettings(TableInterpreter ti) {
        // TODO this is just a dummy for now
        // TODO identify Header
//        switch(ti.class) {
//            case StateEventTableInterpreter:
//                
//            case StateTransitionTableInterpreter:
//            default:
//        }
        return ti
    }
}
