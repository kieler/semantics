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
import de.cau.cs.kieler.scg.processors.analyzer.LoopAnalyzerV2
import de.cau.cs.kieler.scg.GuardDependency
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import java.util.List
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.eval.PartialExpressionEvaluator
import de.cau.cs.kieler.kexpressions.BoolValue

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
        environment.setProperty(LoopAnalyzerV2.LOOP_DATA, null)
        
        for (scg : model.scgs) {
            scg.optimizeGuards
        }        
    }    

    public def void optimizeGuards(SCGraph scg) {
        val PartialExpressionEvaluator parEval = new PartialExpressionEvaluator(<ValuedObject, Value> newHashMap) => [ 
            compute = true
            inplace = true
        ]
        
        var step = 0
        val visited = <Node> newHashSet
        val nextNodes = <Node> newLinkedList => [ add(scg.nodes.filter(Entry).head) ]
        
        while(!nextNodes.empty) {
            val nextNode = nextNodes.peek
            visited += nextNode
            
            if (nextNode.optimizeNode(visited, nextNodes, parEval)) {
                nextNodes.pop
                nextNodes.removeIf[ it === nextNode ]
                annotationModel.addInfo(nextNode, "Step " + (step++))
                snapshot
            }
        }
    }
    
    public def boolean optimizeNode(Node node, Set<Node> visited, LinkedList<Node> nextNodes, PartialExpressionEvaluator parEval) {
        // Check if incoming dependencies are met. If not, redirect. 
        // This is basically a topological sort.
        val incomingDependencies = node.incomingLinks.filter(Dependency).
            filter[ !(it instanceof TickBoundaryDependency) ].toList
        
        var ret = false
        for (d : incomingDependencies) {
            if (!visited.contains(d.eContainer)) {
                nextNodes.push(d.eContainer.asNode)
                ret = true
            }
        }
        if (ret) return false
        
        var List<Dependency> nextNodesDependencies = null
        
        // All dependencies are met. Perform the optimizations. 
        

        if (node instanceof Assignment) {
            if ((!node.reference.valuedObject.name.startsWith(SimpleGuardTransformation.TERM_GUARD_NAME))) {
                // I) Perform Partial Evaluation
                node.expression.replace(parEval.evaluate(node.expression))
                snapshot
                
                // II) Copy Propagation
                // Handle single references 
                if (node.expression instanceof ValuedObjectReference) {
                    val expressionDependencies = node.dependenciesView.filter(ExpressionDependency).toList
                    val replacedExpressions = <Node> newLinkedList
                    for (ed : expressionDependencies.immutableCopy) {
                        if (ed.target.asNode.asAssignment.expression.allReferences.exists[ it.valuedObject == node.reference.valuedObject ])
                            replacedExpressions += ed.target.asNode
                        ed.target.asNode.asAssignment.expression.replaceValuedObjectReferences(node.reference, node.expression.asValuedObjectReference)
                    }
                    
                    if (expressionDependencies.size == replacedExpressions.size) {
                        // All references were replaced. Remove the node and propagate its dependencies.
                        // If a dependency is propagated to the target of the dependency in question, it may be removed as well.
                        nextNodesDependencies = node.removeNode
                    }
                }

                // III) Constant Propagation
                // Handle single references 
                if (node.expression instanceof Value) {
                    val expressionDependencies = node.dependenciesView.filter(ExpressionDependency).toList
                    val replacedExpressions = <Node> newLinkedList
                    for (ed : expressionDependencies.immutableCopy) {
                        if (ed.target.asNode.asAssignment.expression.allReferences.exists[ it.valuedObject == node.reference.valuedObject ])
                            replacedExpressions += ed.target.asNode
                        ed.target.asNode.asAssignment.expression.replaceValuedObjectReferenceWithValue(node.reference, node.expression.asValue)
                    }
                    
                    if (expressionDependencies.size == replacedExpressions.size) {
                        // All references were replaced. Remove the node and propagate its dependencies.
                        // If a dependency is propagated to the target of the dependency in question, it may be removed as well.
                        nextNodesDependencies = node.removeNode
                    }
                }

            }
        }
        
        if (nextNodesDependencies === null) {
            nextNodesDependencies = node.dependenciesView.
                filter[ !(it instanceof TickBoundaryDependency) ].
                filter[ !(it instanceof GuardDependency) ].
                toList
        }
        
        nextNodes.addAll(
            nextNodesDependencies.map[ target ].filter[ !visited.contains(it) && !nextNodes.contains(it) ].filter(Node)
        )
        
        return true
    }
    
    private def void replaceValuedObjectReferences(Expression container, ValuedObjectReference what, ValuedObjectReference with) {
        container.allReferences.forEach[
            if (it.valuedObject == what.valuedObject) it.valuedObject = with.valuedObject
        ]
    }

    private def dispatch Expression replaceValuedObjectReferenceWithValue(ValuedObjectReference container, ValuedObjectReference what, Value with) {
        if (container.valuedObject == what.valuedObject)
            return with.copy
        else
            return container
    }

    private def dispatch Expression replaceValuedObjectReferenceWithValue(OperatorExpression container, ValuedObjectReference what, Value with) {
        var seList = <Expression> newArrayList
        for (se : container.subExpressions) {
             if (se instanceof ValuedObjectReference) {
                 seList += se.replaceValuedObjectReferenceWithValue(what, with)
             } else if (se instanceof OperatorExpression) {
                 seList += se.replaceValuedObjectReferenceWithValue(what, with)
             }
        }
        if (seList.exists[ !container.subExpressions.contains(it) ]) {
            container.subExpressions.clear
            container.subExpressions.addAll(seList)
        }
        
        return container
    }

    
    private def List<Dependency> removeNode(Node node) {
        val nextNodes = <Node> newLinkedList
        
        val incomingDependencies = node.incomingLinks.filter(Dependency).
            filter[ !(it instanceof TickBoundaryDependency) ].
            filter[ (!(it instanceof DataDependency) || (((it as DataDependency).concurrent) && (!(it as DataDependency).confluent))) ].
            toList
        
        val outgoingDependencies = node.dependenciesView.
            filter[ !(it instanceof TickBoundaryDependency) ].
            filter[ !(it instanceof GuardDependency) ].
            filter[ (!(it instanceof DataDependency) || (((it as DataDependency).concurrent) && (!(it as DataDependency).confluent))) ].
            toList

        val guardDependencies = node.dependenciesView.
            filter(GuardDependency).
            toList
            
        val dominator = incomingDependencies.head?.eContainer.asNode

        if (node instanceof Assignment) {
            val expression = node.expression
            if (expression instanceof BoolValue) {
                if (expression.value) {
                    
                } else {
                    for (gd : guardDependencies) {
                        val targetNode = gd.target.asNode
                        targetNode.dependenciesView.toList.forEach[ it.removeDependency ]
                        targetNode.remove
                        gd.removeDependency
                    }
                    guardDependencies.clear
                }             
            }
        }
        
                    
        for (gd : guardDependencies) {
            val domGDs = dominator.outgoingLinks.filter(GuardDependency).toList
            var GuardDependency lastGD = if (domGDs.empty) null else domGDs.last
            dominator.outgoingLinks.add(gd)
            if (lastGD !== null) {
                lastGD.target.asNode.createControlDependency(gd.target.asNode)
            }
        }        
        
        
        val controlGuardDependencies = node.dependenciesView.
            filter(ControlDependency).filter[ it.target.incomingLinks.exists[ it instanceof GuardDependency ]].
            toList
            
        for (cgd : controlGuardDependencies) {
            val guardAssignment = cgd.target.incomingLinks.filter(GuardDependency).head.eContainer.asNode.asAssignment
            
            val otherSuccessors = node.dependenciesView.
                filter(ExpressionDependency).
                filter[ it.target != guardAssignment ].
                map[ target ].filter(Node).
                toList
                
            for (os : otherSuccessors) {
                cgd.copyDependency(cgd.target.asNode, os)
            }
            
            cgd.target = null
            cgd.remove
        }
        
        
        for (id : incomingDependencies) {
            for (od : outgoingDependencies) {
                if (od.target != dominator) {
                    if (dominator.dependenciesView.forall[ it.target != od.target || !it.class.isInstance(id) ]) {
                        val newID = id.copy
                        dominator.outgoingLinks.add(newID)        
                        newID.target = od.target     
                    }
                }
            }
            
            id.target = null
            id.remove
        }
        
        for (od : outgoingDependencies) {
            od.target = null
            od.remove
        }
        
        node.remove
        
        if (dominator === null) 
            return null
        else 
            return dominator.dependenciesView.
                filter[ !(it instanceof GuardDependency) ].
                toList
    }
    
    private def Dependency copyDependency(Dependency dependency, Node newTarget) {
        if (newTarget != dependency.eContainer) {
            if (dependency.eContainer.asNode.dependenciesView.forall[ it.target != newTarget || !it.class.isInstance(dependency) ]) {
                val newDependency = dependency.copy
                dependency.eContainer.asNode.outgoingLinks.add(newDependency)        
                newDependency.target = newTarget
                return newDependency     
            }
        }
        return null
    }
    
    private def Dependency copyDependency(Dependency dependency, Node newTarget, Node newSource) {
        if (newTarget != newSource) {
            if (newSource.dependenciesView.forall[ it.target != newTarget || !it.class.isInstance(dependency) ]) {
                val newDependency = dependency.copy
                newSource.outgoingLinks.add(newDependency)        
                newDependency.target = newTarget
                return newDependency     
            }
        }
        return null
    }
    
	
}
