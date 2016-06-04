/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
package de.cau.cs.kieler.scg.ssc.ssa.domtree

import com.google.common.collect.LinkedHashMultimap
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.ScgPackage
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.UnsupportedSCGException
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.ssc.features.SSAFeature
import javax.inject.Inject

import static com.google.common.collect.Maps.*

/**
 * The SSA transformation for SCGs
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class DomTreeTransformation extends AbstractProductionTransformation {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "scg.domtree"
    }

    override getName() {
        return "Dominator tree"
    }

    override getProducedFeatureId() {
        return SSAFeature.ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::BASICBLOCK_ID)
    }

    // -------------------------------------------------------------------------
    
    @Inject
    extension SCGCoreExtensions

    @Inject
    extension KExpressionsCreateExtensions

    extension ScgFactory = ScgPackage.eINSTANCE.scgFactory

    // -------------------------------------------------------------------------

    def SCGraph transform(SCGraph scg, KielerCompilerContext context) {
        // It is expected that this node is an entry node.
        if (!(scg.nodes.head instanceof Entry))
            throw new UnsupportedSCGException("The basic block analysis expects an entry node as first node!")
        val entryBB = scg.nodes.head.basicBlock

        // Calculate BB successors
        val bbSuccessors = LinkedHashMultimap.create
        for (bb : scg.basicBlocks) {
            for (preBB : bb.predecessors.map[basicBlock]) {
                bbSuccessors.put(preBB, bb)
            }
        }
        val dt = new DominatorTree(entryBB, bbSuccessors)
        val dtSCG = createSCGraph
        val map = newHashMap
        scg.basicBlocks.forEach[ bb |
            val ass = createAssignment
            ass.assignment = createTextExpression(bb.schedulingBlocks.head.guard.valuedObject.name)
            map.put(bb, ass)
            dtSCG.nodes += ass
        ]
        scg.basicBlocks.forEach[ bb |
            val edge = dt.idom(bb)
            if (edge != null) {
               map.get(edge).dependencies += createAbsoluteWrite_Read => [
                   target = map.get(bb)
               ]
            }
            dt.getDominanceFrontiers(bb).forEach[
                map.get(it).dependencies += createControlDependency => [
                    target = map.get(bb)
                ]
            ]
        ]
        return dtSCG
    }
}
