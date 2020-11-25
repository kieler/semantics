/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.providers

import de.cau.cs.kieler.kicool.registration.ISystemProvider

/**
 * Provider to make systems available to KiCool.
 * 
 * @author als ssm Wechselberg
 */
class SCGSystemProvider implements ISystemProvider {
    
    override getBundleId() {
        "de.cau.cs.kieler.scg"
    }
    
    override getSystems() {
        #[
            "system/de.cau.cs.kieler.sccharts.netlist.dataflow.kico",
            "system/de.cau.cs.kieler.scg.netlist.kico", 
            "system/de.cau.cs.kieler.sccharts.netlist.simple.kico", 
            "system/de.cau.cs.kieler.sccharts.netlist.kico",  
            "system/de.cau.cs.kieler.sccharts.netlist.ref.kico",  
            "system/de.cau.cs.kieler.sccharts.netlist.java.kico", 
            "system/de.cau.cs.kieler.sccharts.netlist.vhdl.kico", 
            "system/de.cau.cs.kieler.sccharts.priority.kico", 
            "system/de.cau.cs.kieler.sccharts.priority.java.kico",  
            "system/de.cau.cs.kieler.sccharts.netlist.sccp.kico", 
            "system/de.cau.cs.kieler.sccharts.scssa.kico",  
            "system/de.cau.cs.kieler.scg.priority.kico",  
            "system/de.cau.cs.kieler.sccharts.netlist.guardOpt.kico",
            "system/de.cau.cs.kieler.sccharts.priority.legacy.kico",
            "system/de.cau.cs.kieler.sccharts.priority.java.legacy.kico",
            "system/de.cau.cs.kieler.scl.add.kico"
        ]
    }
}