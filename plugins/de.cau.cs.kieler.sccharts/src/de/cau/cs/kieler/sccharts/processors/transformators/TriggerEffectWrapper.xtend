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
package de.cau.cs.kieler.sccharts.processors.transformators

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import de.cau.cs.kieler.sccharts.transformations.TriggerEffect

/**
 * It would be nice to use generics here, but this is not possible, because the old transform methods are invoked by
 * reflection. Hence, {@code extends AbstractExpansionTransformation} as generic super class is unfortunately useless here.
 * Of course, you could again use reflection, but I would not recommend it.
 * 
 * @author ssm
 * @kieler.design 2017-07-09 proposed
 * @kieler.rating 2017-07-09 proposed yellow  
 */
class TriggerEffectWrapper extends SCChartsProcessor {
    
    @Inject Injector injector
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.transformators.triggerEffect"
    }
    
    override getName() {
        "Trigger / Effect"
    }
    
    override process() {
        val wrappedTransformation = injector.getInstance(TriggerEffect)
        setModel(wrappedTransformation.transform(getModel))
    }
    
    override getType() {
        ProcessorType.TRANSFORMATOR
    }
    

}