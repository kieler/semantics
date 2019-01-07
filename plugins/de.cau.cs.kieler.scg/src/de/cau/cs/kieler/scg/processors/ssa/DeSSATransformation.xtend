/*
RegularSSATransformation.xtend * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.ssa

import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGManipulationExtensions
import de.cau.cs.kieler.scg.ssa.SSACoreExtensions
import de.cau.cs.kieler.scg.ssa.SSATransformationExtensions
import javax.inject.Inject
import static de.cau.cs.kieler.scg.ssa.SSAFunction.*
import static de.cau.cs.kieler.scg.ssa.SSAParameterProperty.*
import de.cau.cs.kieler.scg.ssa.SSAParameterProperty
/**
 * The SSA transformation for SCGs
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class DeSSATransformation extends InplaceProcessor<SCGraphs> implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "de.cau.cs.kieler.scg.processors.ssa.dessa.sequential"
    }

    override getName() {
        return "Sequential DeSSA"
    }
    
    override process() {
        model.scgs.forEach[transform]
        model = model
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    
    @Inject extension AnnotationsExtensions
    @Inject extension SCGManipulationExtensions
    @Inject extension SSATransformationExtensions
    @Inject extension SSACoreExtensions

    // -------------------------------------------------------------------------
    def SCGraph transform(SCGraph scg) {
        if (scg.nodes.exists[it instanceof Fork || it instanceof Surface]) {
            environment.warnings.add("Cannot handle SCG with concurrency or synchronous ticks!")
        }
        if (scg.nodes.exists[isSSA && !isSSA(PHI)]) {
            environment.warnings.add("Cannot handle SSA function other than phi!")
        }
        
        val parameterMapping = environment.getProperty(SSA_PARAMETER_PROPERTY)?.parameterMapping
        if (parameterMapping === null) {
            environment.errors.add("Missing SSA parameter mapping information!")
            return scg
        }
        
        // ---------------
        // 1. Place Move Instructions
        // ---------------
        val placed = scg.placeMoveInstructions(parameterMapping)
        scg.snapshot
        
        // ---------------
        // 2. Remove Phi functions
        // ---------------
        for (phi : placed.keySet) {
            phi.removeNode(true)
        }

        // This transformation removes the SSA property!       
        scg.unmarkSSA 
        
        return scg
    }
}
    