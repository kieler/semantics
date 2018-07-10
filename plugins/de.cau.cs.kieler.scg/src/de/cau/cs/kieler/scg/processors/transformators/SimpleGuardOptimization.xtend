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
package de.cau.cs.kieler.scg.processors.transformators

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlDependency
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Guard
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.common.SCGAnnotations
import de.cau.cs.kieler.scg.extensions.SCGCacheExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.scg.features.SCGFeatures

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kexpressions.kext.extensions.ValuedObjectMapping
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.kicool.environments.AnnotationModel
import de.cau.cs.kieler.scg.Node
import java.util.LinkedList
import java.util.Set
import de.cau.cs.kieler.kexpressions.keffects.Dependency
import de.cau.cs.kieler.scg.TickBoundaryDependency
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scg.ExpressionDependency
import de.cau.cs.kieler.kexpressions.Expression

/** 
 * @author ssm
 * @kieler.design 2018-07-09 proposed 
 * @kieler.rating 2018-07-09 proposed yellow
 */
class SimpleGuardOptimization extends Processor<SCGraphs, SCGraphs> implements Traceable {
        
    @Inject extension SCGCoreExtensions
    @Inject extension SCGDeclarationExtensions
    @Inject extension SCGCacheExtensions
    @Inject extension SCGDependencyExtensions    
    @Inject extension KExpressionsDeclarationExtensions       
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsComplexCreateExtensions 
    @Inject extension KEffectsExtensions
    @Inject extension AnnotationsExtensions    
    
    var AnnotationModel<SCGraphs> annotationModel 
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.guards.optimization"
    }
    
    override getName() {
        "Guards Opt"
    }
    
    override getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override process() {
        val model = getModel
        annotationModel = model.createAnnotationModel
        
        for (scg : model.scgs) {
            scg.optimizeGuards
        }        
    }    

    public def void optimizeGuards(SCGraph scg) {
        
        var step = 0
        val visited = <Node> newHashSet
        val nextNodes = <Node> newLinkedList => [ add(scg.nodes.filter(Entry).head) ]
        
        while(!nextNodes.empty) {
            val nextNode = nextNodes.peek
            visited += nextNode
            
            if (nextNode.optimizeNode(visited, nextNodes)) {
                nextNodes.pop
                annotationModel.addInfo(nextNode, "Step " + (step++) + " completed.")
                snapshot
            }
        }
    }
    
    public def boolean optimizeNode(Node node, Set<Node> visited, LinkedList<Node> nextNodes) {
        val incomingDependencies = node.incomingLinks.filter(Dependency).
            filter[ !(it instanceof TickBoundaryDependency) ].toList
        
        for (d : incomingDependencies) {
            if (!visited.contains(d.target)) {
                nextNodes.add(d.target.asNode)
                return false
            }
        }
        
        if (node instanceof Assignment) {
            // Handle single references (copy propagation)
            if (node.expression instanceof ValuedObjectReference) {
                for (ed : node.dependenciesView.filter(ExpressionDependency)) {
                    ed.target.asNode.asAssignment.expression.replaceValuedObjectReferences(node.reference, node.expression.asValuedObjectReference)
                }
            }
        }
        
        val outgoingDependencies = node.dependenciesView.
            filter[ !(it instanceof TickBoundaryDependency) ].toList
        
        nextNodes.addAll(
            outgoingDependencies.map[ target ].filter[ !visited.contains(it) && !nextNodes.contains(it) ].filter(Node)
        )
        
        return true
    }
    
    private def void replaceValuedObjectReferences(Expression container, ValuedObjectReference what, ValuedObjectReference with) {
        container.allReferences.forEach[
            if (it.valuedObject == what.valuedObject) it.valuedObject = with.valuedObject
        ]
    }
	
}
