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
package de.cau.cs.kieler.scg.ssc.ssa

import de.cau.cs.kieler.core.annotations.AnnotationsFactory
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.ScgPackage
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import javax.inject.Inject
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions

/**
 * The SSA transformation for SCGs
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSAVariablePreserverExtensions {

    // -------------------------------------------------------------------------
    @Inject
    extension SCGCoreExtensions
    @Inject
    extension SCGControlFlowExtensions
    extension ScgFactory = ScgPackage.eINSTANCE.scgFactory
    
    @Inject
    extension KExpressionsValuedObjectExtensions

    @Inject
    extension AnnotationsExtensions
    extension AnnotationsFactory = AnnotationsFactory::eINSTANCE
    
    @Inject
    extension SSACoreExtensions

    // -------------------------------------------------------------------------
    public static val OUTPUT_PRESERVER = "scg.ssa.output.preserver"

    // -------------------------------------------------------------------------
    def preserveOutput(SCGraph scg, Entry entryNode) {
        entryNode.exit.preserveOutput(scg)
        for (surf : scg.nodes.filter(Surface).toList) {
            surf.preserveOutput(scg)
        }
    }

    private def preserveOutput(Node node, SCGraph scg) {
        if(!node.basicBlock.deadBlock) {
            for (decl : scg.declarations.reverseView.filter[output]) {
                for (vo : decl.valuedObjects.reverseView) {
                    // Create self assignment which will not be renamed
                    val asm = createAssignment => [
                        valuedObject = vo
                        assignment = vo.reference
                        markOutputPreserver
                    ]
                    val sb = node.schedulingBlock
                    sb.nodes.add(sb.nodes.indexOf(node), asm)
                    scg.nodes.add(scg.nodes.indexOf(node), asm)
                    // Insert before
                    node.allPrevious.toList.forEach[target = asm]
                    asm.createControlFlow.target = node
                }
            }
        }
    }
    
    def preservePreValues(SCGraph scg) {
        // TODO Insert ?pre(x) in all phi function with lowest priority
        // Work for variables with preserved output but do i want to always preserve all variables ? even if VS hold their value
        /*
         * x = 0
         * if x == 0
         *  x = 1;
         *  pause
         * else
         *  pause
         * y = x
         * 
         * PHI function both signals are absent but which branch to take is unknown
         * MOVE assignments in branches such as fry's ssa
         * But what about shared variables
         */
    }
    
    def preserveInputVariables(SCGraph scg) {
        // TODO Insert input variable in all phi functions with lowest priority
        // What about presence value?
        // How about input output
    }

    def isOutputPreserver(Assignment asm) {
        return asm.hasAnnotation(OUTPUT_PRESERVER)
    }
    
    private def markOutputPreserver(Assignment asm) {
        asm.annotations += createAnnotation => [
            name = OUTPUT_PRESERVER
        ]
    }
}
