/*
8 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.VariableStore

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
    
    public static val IProperty<Boolean> GO_INIT_OPTIMIZER_ENABLED = 
        new Property<Boolean>("de.cau.cs.kieler.scg.opt.goInit", false)
    // If, by convention, the inputs are set correctly before the reset call, then they can be ignored in the optimization.
    // This is an aggre88ssive optimization that is switched off by default.    
    public static val IProperty<Boolean> GO_INIT_OPTIMIZER_IGNORE_INPUTS = 
        new Property<Boolean>("de.cau.cs.kieler.scg.opt.goInit.ignoreInputs", false)    
	
    override getId() {
        "de.cau.cs.kieler.scg.processors.goInitOptimizer"
    }
    
    override getName() {
        "GO Init Optimizer"
    }
    
    override process() {
        if (!environment.getProperty(GO_INIT_OPTIMIZER_ENABLED)) return;
        
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
	    val variableStore = VariableStore.getVariableStore(environment)
	    
	    // Search for assignments that do not depend on input variables.
	    // Only move those.
        val inputAssignments = <Assignment> newLinkedList
        val resetAssignments = <Assignment> newLinkedList

        val elseNode = conditional.^else.target as Node
        var node = conditional.then.target as Node
        
        conditional.then.target = null
        conditional.then.remove

        // Assumption: Nested nodes are assignments
        while (node != elseNode) {
            if (node instanceof Assignment) {
                val hasInputReference = node.expression.allReferences.exists[ variableStore.getInfo(valuedObject)?.isInput && !getProperty(GO_INIT_OPTIMIZER_IGNORE_INPUTS) ]
                if (hasInputReference) {
                    inputAssignments += node
                } else {
                    resetAssignments += node
                }
            } else {
                annotationModel.addError(node, "A node nested inside the GO conditional is not an assignment.")
            }
            node = node.allNext.map[target].head as Node
        }
        
        inputAssignments.forEach[ next.target = null next.remove ]
        resetAssignments.forEach[ next.target = null next.remove ]
        
        if (!resetAssignments.empty) {
    	    val resetSCG = createSCGraph
	        val resetSCGEntry = createEntry => [
	            it.createStringAnnotation("label", "reset")
	            resetSCG.nodes += it
	        ]
            val resetSCGExit = createExit 
           
            resetSCGEntry.createControlFlowTo(resetAssignments.head)
            var last = resetAssignments.head
            resetSCG.nodes += last
            for (n : resetAssignments.drop(1)) {
                resetSCG.nodes += n
                last.createControlFlowTo(n)
                last = n
            }
            last.createControlFlowTo(resetSCGExit)
            
            resetSCG.nodes += resetSCGExit
    	    entry.resetSCG = resetSCG
	    }

	    if (inputAssignments.empty) {
            entry.next.target = elseNode
            
            conditional.^else.target = null
            conditional.^else.remove
            conditional.remove
	    } else {
            conditional.createControlFlowTo(inputAssignments.head)
            var last = inputAssignments.head
            for (n : inputAssignments.drop(1)) {
                last.createControlFlowTo(n)
                last = n
            }
            last.createControlFlowTo(elseNode)
	    }
	}
}

