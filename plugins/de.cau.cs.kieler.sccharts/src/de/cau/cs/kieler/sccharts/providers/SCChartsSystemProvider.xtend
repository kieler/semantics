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
package de.cau.cs.kieler.sccharts.providers

import de.cau.cs.kieler.kicool.registration.ISystemProvider

/**
 * Provider to make processors available to KiCool.
 * 
 * @author als ssm Wechselberg
 */
class SCChartsSystemProvider implements ISystemProvider {
    
    override getBundleId() {
        "de.cau.cs.kieler.sccharts"
    }
    
    override getSystems() {
        #[
            "system/de.cau.cs.kieler.sccharts.core.kico",
            "system/de.cau.cs.kieler.sccharts.extended.kico",
            "system/de.cau.cs.kieler.sccharts.extended.core.kico",
            "system/de.cau.cs.kieler.sccharts.core.core.kico",
            "system/de.cau.cs.kieler.sccharts.statebased.kico",
            "system/de.cau.cs.kieler.sccharts.dataflow.kico",
            "system/de.cau.cs.kieler.sccharts.causalView.kico",
            "system/de.cau.cs.kieler.sccharts.dataflow.lustre.kico",
            "system/de.cau.cs.kieler.sccharts.interactiveScheduling.kico",
            "system/de.cau.cs.kieler.sccharts.statebased.woComments.kico",
            "system/de.cau.cs.kieler.sccharts.statebased.lean.kico",
            "system/de.cau.cs.kieler.sccharts.statebased.lean.c.template.kico",
            "system/de.cau.cs.kieler.sccharts.statebased.lean.cs.c.template.kico",
            "system/de.cau.cs.kieler.sccharts.statebased.lean.java.template.kico",
            "system/de.cau.cs.kieler.sccharts.csv.kico",
            "system/de.cau.cs.kieler.sccharts.statebased.lean.arduino.deploy.kico",
            "system/de.cau.cs.kieler.sccharts.netlist.arduino.deploy.kico",
            "system/de.cau.cs.kieler.sccharts.netlist.nxj.deploy.kico",
            "system/de.cau.cs.kieler.sccharts.netlist.nxj.deploy.RConsole.kico",
            "system/de.cau.cs.kieler.sccharts.expansion.only.kico",
            "system/de.cau.cs.kieler.sccharts.simulation.netlist.c.kico",
            "system/de.cau.cs.kieler.sccharts.simulation.tts.netlist.c.kico",
            "system/de.cau.cs.kieler.sccharts.simulation.netlist.java.kico",
            "system/de.cau.cs.kieler.sccharts.simulation.tts.netlist.java.kico",
            "system/de.cau.cs.kieler.sccharts.simulation.priority.c.kico",
            "system/de.cau.cs.kieler.sccharts.simulation.tts.priority.c.kico",
            "system/de.cau.cs.kieler.sccharts.simulation.priority.c.legacy.kico",
            "system/de.cau.cs.kieler.sccharts.simulation.tts.priority.c.legacy.kico",
            "system/de.cau.cs.kieler.sccharts.simulation.priority.java.kico",
            "system/de.cau.cs.kieler.sccharts.simulation.tts.priority.java.kico",
            "system/de.cau.cs.kieler.sccharts.simulation.statebased.c.kico",
            "system/de.cau.cs.kieler.sccharts.simulation.statebased.lean.c.kico",
            "system/de.cau.cs.kieler.sccharts.simulation.statebased.lean.cs.c.kico",
            "system/de.cau.cs.kieler.sccharts.simulation.statebased.lean.java.kico",
            "system/de.cau.cs.kieler.sccharts.simulation.tts.statebased.c.kico",
            "system/de.cau.cs.kieler.sccharts.simulation.tts.statebased.lean.c.kico",
            "system/de.cau.cs.kieler.sccharts.simulation.tts.statebased.lean.cs.c.kico",
            "system/de.cau.cs.kieler.sccharts.simulation.tts.statebased.lean.java.kico",
            "system/de.cau.cs.kieler.c.sccharts.dataflow.kico",
            "system/de.cau.cs.kieler.sccharts.simulation.priority.java.legacy.kico",
            "system/de.cau.cs.kieler.sccharts.simulation.tts.priority.java.legacy.kico"
        ]
    }
    
}