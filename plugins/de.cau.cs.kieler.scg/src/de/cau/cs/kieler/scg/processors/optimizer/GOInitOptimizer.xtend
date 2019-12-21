/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.scg.processors.optimizer

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scg.processors.SimpleGuardExpressions
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Assignment

/** 
 * @author ssm
 * @kieler.design 2019-12-21 proposed 
 * @kieler.rating 2019-12-21 proposed yellow
 */
class GOInitOptimizer extends InplaceProcessor<SCGraphs> {
	
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCGControlFlowExtensions
    extension ScgFactory = ScgFactory::eINSTANCE 
	
    override getId() {
        "de.cau.cs.kieler.scg.processors.goInitOptimizer"
    }
    
    override getName() {
        "GO Init Optimizer"
    }
    
    override process() {
        val model = getModel
        applyAnnotations

        for (scg : model.scgs) {
            scg.performGoInitOptimization
        }
    }	
    
    private def performGoInitOptimization(SCGraph scg) {
        val entryNode = (scg.nodes.findFirst[ it instanceof Entry ] as Entry)
        val firstNode = entryNode.next.target
        if (firstNode instanceof Conditional) {
            if (firstNode.condition instanceof ValuedObjectReference && 
                firstNode.condition.asValuedObjectFromReference.name == SimpleGuardExpressions.GO_GUARD_NAME
            ) {      
                firstNode.createResetSCG(entryNode)                         
            }                        
        }
    }
	
	private def createResetSCG(Conditional conditional, Entry entry) {
	    val resetSCG = createSCGraph
	    val resetSCGEntry = createEntry => [
	        it.createStringAnnotation("label", "reset")
	        resetSCG.nodes += it
	    ]
        val resetSCGExit = createExit
	    
	    val elseNode = conditional.^else.target
	    var node = conditional.then.target as Node

        if (node != elseNode) {
            conditional.then.remove
            resetSCGEntry.createControlFlowTo(node)
            // Assumption: Nested nodes are assignments
            while (node.allNext.map[target].head != elseNode) {
                resetSCG.nodes += node
                node = node.allNext.map[target].head as Node
            }
            if (node instanceof Assignment) {
                resetSCG.nodes += node
                node.next.remove
                node.createControlFlowTo(resetSCGExit)
            } else {
                annotationModel.addError(node, "A node nested inside the GO conditional is not an assignment.")
            }
        }	    

        resetSCG.nodes += resetSCGExit
	    entry.resetSCG = resetSCG
	    
	    entry.next.target = elseNode
	    conditional.^else.remove
	    conditional.remove
	}
}

