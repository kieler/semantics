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
package de.cau.cs.kieler.esterel

import de.cau.cs.kieler.kicool.registration.ISystemProvider

/**
 * Provider to make systems available to KiCool.
 * 
 * @author Wechselberg
 */
class EsterelSystemProvider implements ISystemProvider {
    
    override getBundleId() {
        "de.cau.cs.kieler.esterel"
    }
    
    override getSystems() {
        #[
            "system/de.cau.cs.kieler.esterel.scest.scl.kico",
            "system/de.cau.cs.kieler.esterel.scest.scl.netlist.c.kico",
            "system/de.cau.cs.kieler.esterel.scest.scl.netlist.java.kico",
            "system/de.cau.cs.kieler.esterel.scest.scl.priority.c.kico",
            "system/de.cau.cs.kieler.esterel.scest.scl.priority.java.kico",
            "system/de.cau.cs.kieler.esterel.scest.scl.simulation.netlist.c.kico",
            "system/de.cau.cs.kieler.esterel.scest.scl.simulation.netlist.java.kico",
            "system/de.cau.cs.kieler.esterel.scest.scl.simulation.priority.c.kico",
            "system/de.cau.cs.kieler.esterel.scest.scl.simulation.priority.java.kico",
            "system/de.cau.cs.kieler.esterel.scest.scl.slic.kico",
            "system/de.cau.cs.kieler.esterel.scest.scl.slic.netlist.c.kico",
            "system/de.cau.cs.kieler.esterel.scest.scl.slic.netlist.java.kico",
            "system/de.cau.cs.kieler.esterel.scest.scl.slic.priority.c.kico",
            "system/de.cau.cs.kieler.esterel.scest.scl.slic.priority.java.kico",
            "system/de.cau.cs.kieler.esterel.scest.scl.slic.simulation.netlist.c.kico",
            "system/de.cau.cs.kieler.esterel.scest.scl.slic.simulation.netlist.java.kico",
            "system/de.cau.cs.kieler.esterel.scest.scl.slic.simulation.priority.c.kico",
            "system/de.cau.cs.kieler.esterel.scest.scl.slic.simulation.priority.java.kico",
            "system/de.cau.cs.kieler.esterel.scc.kico",
            "system/de.cau.cs.kieler.esterel.kernel.scc.kico",
            "system/de.cau.cs.kieler.esterel.compiler.inria.xes.kico",
            "system/de.cau.cs.kieler.esterel.compiler.inria.simulation.kico"
        ]
    }
    
}