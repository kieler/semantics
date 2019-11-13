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
package de.cau.cs.kieler.simulation.providers

import de.cau.cs.kieler.kicool.registration.ISystemProvider

/**
 * Provider to make systems available to KiCool.
 * 
 * @author Wechselberg
 */
class SimulationSystemProvider implements ISystemProvider {
    
    override getBundleId() {
        "de.cau.cs.kieler.simulation"
    }
    
    override getSystems() {
        #[
            "system/de.cau.cs.kieler.internal.simulation.kico",
            "system/de.cau.cs.kieler.simulation.netlist.c.kico",
            "system/de.cau.cs.kieler.simulation.netlist.java.kico",
            "system/de.cau.cs.kieler.simulation.priority.c.kico",
            "system/de.cau.cs.kieler.simulation.priority.java.kico",
            "system/de.cau.cs.kieler.simulation.statebased.c.kico",
            "system/de.cau.cs.kieler.simulation.statebased.lean.c.kico",
            "system/de.cau.cs.kieler.simulation.testsuite.kico",
            "system/de.cau.cs.kieler.simulation.testsuite.single.kico",
            "system/de.cau.cs.kieler.simulation.testsuite.single.netlist.kico",
            "system/de.cau.cs.kieler.simulation.testsuite.single.prio.kico",
            "system/de.cau.cs.kieler.simulation.testsuite.single.statebased.kico",
            "system/de.cau.cs.kieler.simulation.testsuite.trace.kico"
        ]
    }
    
}