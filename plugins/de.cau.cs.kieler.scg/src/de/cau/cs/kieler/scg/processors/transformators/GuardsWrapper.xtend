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
package de.cau.cs.kieler.scg.processors.transformators

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.transformations.guards.SimpleGuardTransformation
import de.cau.cs.kieler.scg.ScgFactory

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

/**
 * It would be nice to use generics here, but this is not possible, because the old transform methods are invoked by
 * reflection. Hence, {@code extends AbstractExpansionTransformation} as generic super class is unfortunately useless here.
 * Of course, you could again use reflection, but I would not recommend it.
 * 
 * @author ssm
 * @kieler.design 2017-06-16 proposed
 * @kieler.rating 2017-06-16 proposed yellow  
 */
class GuardsWrapper extends Processor<SCGraphs, SCGraphs> {
    
    @Inject Injector injector
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.transformators.guards.wrapper"
    }
    
    override getName() {
        "Guards"
    }
    
    override process() {
        val model = getModel
        val wrappedTransformation = injector.getInstance(SimpleGuardTransformation)
        val SCGGraphs = ScgFactory.eINSTANCE.createSCGraphs => [
            for (pragma : model.pragmas) {
                it.pragmas += pragma.copy
            }              
        ] 
        for (scg : model.scgs) {
           SCGGraphs.scgs += wrappedTransformation.transform(scg, null)    
        }        
        setModel(SCGGraphs)
    }
    
    override getType() {
        ProcessorType.TRANSFORMATOR
    }
    

}