/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.processors

import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions

/**
 * @author ssm
 * @kieler.design 2017-05-18 proposed
 * @kieler.rating 2017-05-18 proposed yellow  
 */
class Snapshot extends SCChartsProcessor {
    
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.snapshot"
    }
    
    override getName() {
        "Snapshot"
    }
    
    override getType() {
        ProcessorType.DEVELOPER
    }
    
    override process() {
        val scc = SCChartsFactory::eINSTANCE.createSCCharts
        
        val root = createState => [
            id = "Snapshots"
            scc.rootStates += it
        ]
        
        val region = root.createControlflowRegion("")
        
        val s0 = region.createState("S0"); 
        
        snapshot(scc)
        
        s0.initial = true
        s0.id = "Init"
        
        val s1 = region.createState("S1")
        
        snapshot(scc)
        
        s1.final = true
        
        snapshot(scc)
        
        s0.createTransitionTo(s1)
        
        setModel(scc)
    }
    
}