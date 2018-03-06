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

import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGManipulationExtensions
import de.cau.cs.kieler.scg.ssa.SSACoreExtensions
import javax.inject.Inject
import de.cau.cs.kieler.scg.ssa.SSATransformationExtensions

/**
 * The SSA transformation for SCGs
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class UnSSATransformation extends InplaceProcessor<SCGraphs> implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "de.cau.cs.kieler.scg.processors.ssa.unssa"
    }

    override getName() {
        return "UnSSA"
    }
    
    override process() {
        model.scgs.forEach[transform]
        model = model
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    
    @Inject extension SCGManipulationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SSACoreExtensions
    @Inject extension SSATransformationExtensions

    // -------------------------------------------------------------------------
    def SCGraph transform(SCGraph scg) {
        
        // ---------------
        // 1. Remove SSA nodes
        // ---------------
        for (n : scg.nodes.filter(Assignment).filter[isSSA].toList) {
            n.removeNode(true)
        }
        if (environment.inDeveloperMode) scg.snapshot
        
        // ---------------
        // 2. Undo renaming
        // --------------- 
        for (n : scg.nodes) {
            for (vor : n.eAllContents.filter(ValuedObjectReference).toIterable) {
                val orig = vor.valuedObject.declaration.ssaOrigVO
                if (orig !== null) {
                    vor.valuedObject = orig
                }
            }
        } 
        if (environment.inDeveloperMode) scg.snapshot              

        // This transformation removes the SSA property!       
        scg.unmarkSSA 
        
        // ---------------
        // 3. Remove SSA declarations
        // --------------- 
        scg.declarations.removeIf[isSSA]
        
        // ---------------
        // 4. Restore Update form
        // --------------- 
        scg.restoreUpdates
        
        return scg
    }
}
    