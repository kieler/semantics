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
package de.cau.cs.kieler.scl.providers

import de.cau.cs.kieler.kicool.registration.ISystemProvider

/**
 * Provider to make systems available to KiCool.
 * 
 * @author Wechselberg
 */
class SCLSystemProvider implements ISystemProvider {
    
    override getBundleId() {
        "de.cau.cs.kieler.scl"
    }
    
    override getSystems() {
        #[
            "system/de.cau.cs.kieler.scl.netlist.c.kico",
            "system/de.cau.cs.kieler.scl.netlist.java.kico",
            "system/de.cau.cs.kieler.scl.priority.c.kico",
            "system/de.cau.cs.kieler.scl.priority.java.kico",
            "system/de.cau.cs.kieler.scl.simulation.netlist.c.kico",
            "system/de.cau.cs.kieler.scl.simulation.netlist.java.kico",
            "system/de.cau.cs.kieler.scl.simulation.priority.c.kico",
            "system/de.cau.cs.kieler.scl.simulation.priority.java.kico",
            "system/de.cau.cs.kieler.scl.ssa.seq.kico",
            "system/de.cau.cs.kieler.scl.ssa.scssa.kico",
            "system/de.cau.cs.kieler.scl.ssa.cssa.kico",
            "system/de.cau.cs.kieler.scl.ssa.cssa.sccp.kico",
            "system/de.cau.cs.kieler.scl.scc.kico",
            "system/de.cau.cs.kieler.slic.schedule.kico"
        ]
    }
    
}