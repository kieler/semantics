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

package de.cau.cs.kieler.railsl.compilation

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.railSL.Program
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.SCCharts

/**
 * @author stu121235
 *
 */
class RailSLWrapper extends Processor<Program, SCCharts> {

    @Inject Injector injector
    
    override getId() {
        "de.cau.cs.kieler.railsl.railsl"
    }
    
    override getName() {
        "RailSL"
    }
    
    override process() {
        val model = getModel
        val wrappedTransformation = injector.getInstance(RailSLTransformation)
        val state = wrappedTransformation.transform(model as Program) as State
        
        val scc = SCChartsFactory.eINSTANCE.createSCCharts
        scc.rootStates += state
        
        model = scc
    }
    
    override getType() {
        ProcessorType.TRANSFORMATOR
    }
    

}