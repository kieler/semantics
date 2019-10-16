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

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.processors.SCGAnnotations

import static de.cau.cs.kieler.scg.processors.ssa.SSAFunction.*
import static de.cau.cs.kieler.scg.processors.ssa.SSAParameterProperty.*

/**
 * The SSA transformation for SCGs
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSATransformation extends InplaceProcessor<SCGraphs> implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.scg.processors.ssa.sequential"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Sequential SSA"
    }
    
    override process() {
        model.scgs.forEach[transform]
        model = model
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    
    @Inject extension AnnotationsExtensions
    @Inject extension SSATransformationExtensions
    @Inject extension SSACoreExtensions

    // -------------------------------------------------------------------------
    def SCGraph transform(SCGraph scg) {
        validateStructure(scg)
        validateExpressions(scg)
        
        if (scg.nodes.exists[it instanceof Fork || it instanceof Surface]) {
            environment.warnings.add("Cannot handle SCG with Concurrency or synchronous ticks")
        }
        
        scg.prepareUpdates
        
        val entryBB = scg.basicBlocks.head
        
        // Create new declarations for SSA versions
        val ssaDecl = scg.createSSADeclarations
        val dt = new DominatorTree(scg)
        
        // ---------------
        // 1. Place Phi
        // ---------------
        dt.placePhi
        scg.snapshot
        
        // ---------------
        // 2. Renaming
        // ---------------
        val parameters = dt.rename(entryBB, ssaDecl)[isSSA(PHI)]
        environment.setProperty(SSA_PARAMETER_PROPERTY, new SSAParameterProperty(parameters))
        scg.annotations += createStringAnnotation(SCGAnnotations.ANNOTATION_SSA, id)
        scg.snapshot

        // ---------------
        // 3. Remove unused ssa versions
        // ---------------
        scg.removeUnusedSSAVersions

        // ---------------
        // 4. Update SSA VO version numbering
        // ---------------   
        scg.updateSSAVersions
        
        return scg
    }
}
    