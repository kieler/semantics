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
package de.cau.cs.kieler.railsl

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.transformations.Connector
import de.cau.cs.kieler.railSL.Program

/**
 * @author stu121235
 *
 */
class RailSLWrapper extends Processor {

    @Inject Injector injector
    
    override getId() {
        "de.cau.cs.kieler.railsl.railsl"
    }
    
    override getName() {
        "RailSL"
    }
    
    override process() {
        val model = environment.model
        val wrappedTransformation = injector.getInstance(RailSLTransformation)
        switch (model) {
            Program: environment.model = wrappedTransformation.transform(model)
            //TODO this will break.
            SCCharts: environment.model = wrappedTransformation.transform(model)
        }
    }
    
    override getType() {
        ProcessorType.TRANSFORMATOR
    }
    

}