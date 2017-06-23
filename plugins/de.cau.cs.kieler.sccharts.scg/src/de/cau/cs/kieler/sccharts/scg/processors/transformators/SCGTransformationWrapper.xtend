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
package de.cau.cs.kieler.sccharts.scg.processors.transformators

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.scg.SCGTransformation

/**
 * It would be nice to use generics here, but this is not possible, because the old transform methods are invoked by
 * reflection. Hence, {@code extends AbstractExpansionTransformation} as generic super class is unfortunately useless here.
 * Of course, you could again use reflection, but I would not recommend it.
 * 
 * @author ssm
 * @kieler.design 2017-06-16 proposed
 * @kieler.rating 2017-06-16 proposed yellow  
 */
class SCGTransformationWrapper extends Processor {
    
    @Inject Injector injector
    
    override getId() {
        "de.cau.cs.kieler.sccharts.scg.processors.transformators.SCG"
    }
    
    override getName() {
        "SCG"
    }
    
    override process() {
        val model = environment.model
        val wrappedTransformation = injector.getInstance(SCGTransformation)
        switch (model) {
            State: environment.model = wrappedTransformation.transform(model)
            SCCharts: environment.model = wrappedTransformation.transform(model, null)
        }
    }
    
    override getType() {
        ProcessorType.TRANSFORMATOR
    }
    

}