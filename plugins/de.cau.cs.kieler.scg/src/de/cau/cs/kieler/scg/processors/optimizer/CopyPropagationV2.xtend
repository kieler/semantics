/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.optimizer

import com.google.inject.Inject
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VectorValue
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGSerializeHRExtensions
import org.eclipse.emf.ecore.EObject

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scg.processors.SimpleGuardExpressions
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration

/**
 * Copy Propagation
 * ----------------
 * Single pass, does only work with standard sequentialized SCGs with a maximum conditional depth of 1 and
 * no nodes on the else branch. 
 * 
 * @author ssm
 * @kieler.design 2018-01-12 proposed 
 * @kieler.rating 2018-01-12 proposed yellow
 *
 */
class CopyPropagationV2 extends InplaceProcessor<SCGraphs> {
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGSerializeHRExtensions
    
    public static val IProperty<Boolean> COPY_PROPAGATION_REPLACE_ALL_EXPRESSIONS = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.copyPropagation.replaceAllExpressions", false)
    public static val IProperty<Boolean> COPY_PROPAGATION_PROPAGATE_EQUAL_EXPRESSIONS = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.copyPropagation.propagateEqualExpressions", true)       
    public static val IProperty<Boolean> COPY_PROPAGATION_REPLACE_TERM_GUARD_PREDECESSOR = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.copyPropagation.replaceTermGuardPredecessor", true)
    public static val IProperty<Boolean> COPY_PROPAGATION_REPLACE_UNMODIFIED_INPUT_GUARDS = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.copyPropagation.replaceUnmodifiedInputGuards", true)
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.copyPropagation"
    }
    
    override getName() {
        "Copy Propagation V2"
    }
    
    override process() {
        val model = getModel
        
        for (scg : model.scgs) {
            scg.performCopyPropagation
        }
        
        VariableStore.get(environment).removeAllUncontainedVO(model, environment)
    }
    
    def performCopyPropagation(SCGraph scg) {
        val replacements = new Replacements
        val GO = scg.findValuedObjectByName(SimpleGuardExpressions.GO_GUARD_NAME) 
        replacements.push(SimpleGuardExpressions.GO_GUARD_NAME, GO.reference)
        
        val nextNodes = <Node> newLinkedList(scg.nodes.head)
        val visited = <Node> newHashSet
        val removeList = <EObject> newLinkedList
        val preNodes = <Assignment> newLinkedList
        val registerExpressions = <String, Node> newHashMap
        val guardNodeMapping = <ValuedObject, Assignment> newHashMap
        val conditionalGuardMapping = <ValuedObject, Conditional> newHashMap
        val modifiedInputs = <ValuedObject> newHashSet
        
        if (environment.getProperty(COPY_PROPAGATION_REPLACE_UNMODIFIED_INPUT_GUARDS)) {
            val inputs = scg.declarations.filter(VariableDeclaration).filter[ input ].map[ valuedObjects ].flatten.toSet
            modifiedInputs += 
                scg.nodes.filter(Assignment).filter[ it.reference !== null && inputs.contains(it.reference.valuedObject) ].map[ reference.valuedObject ]
        } else {
            modifiedInputs += scg.declarations.filter(VariableDeclaration).filter[ input ].map[ valuedObjects ].flatten.toSet
        }
        
        while (!nextNodes.empty) {
            val node = nextNodes.pop
            visited += node
            
            if (node instanceof Assignment) {
                if (node.reference !== null) {
                    guardNodeMapping.put(node.reference.valuedObject, node)
                }
                
                if (node.expression instanceof ValuedObjectReference) {
                    if ((!node.reference.valuedObject.name.startsWith(SimpleGuardExpressions.CONDITIONAL_EXPRESSION_PREFIX) 
                        || !modifiedInputs.contains((node.expression as ValuedObjectReference).valuedObject)) 
                        && !node.reference.valuedObject.name.startsWith(SimpleGuardExpressions.TERM_GUARD_NAME)
                    ) {
                        node.expression.replaceExpression(replacements, node)
                        node.expression.replaceExpression(replacements, node)
                        replacements.push(node.reference.valuedObject.name, node.expression)
                        for (incoming :node.allPrevious.toList) {
                            incoming.target = node.next.target
                        }
                        removeList += node.next
                        removeList += node
                    }
                    else if (node.reference.valuedObject.name.startsWith(SimpleGuardExpressions.TERM_GUARD_NAME)) {
                        // Term guards usually only depend on one guard. Simply replace it.
                        // The replaced guard should also not be contained in pre expression, since _TERM signals a final state.
                        if (environment.getProperty(COPY_PROPAGATION_REPLACE_TERM_GUARD_PREDECESSOR)) {
                            val gTNode = guardNodeMapping.get((node.expression as ValuedObjectReference).valuedObject)
                            if (gTNode !== null) {
                                
                                val affectedConditionals = conditionalGuardMapping.filter[ k, v | k == gTNode.reference.valuedObject ].values
                                for (c : affectedConditionals) {
                                    (c.condition as ValuedObjectReference).valuedObject = node.reference.valuedObject
                                }
                                
                                gTNode.reference.valuedObject = node.reference.valuedObject
                                for (incoming :node.allPrevious.toList) {
                                    incoming.target = node.next.target
                                }
                                removeList += node.next
                                removeList += node
                            }    
                        }
                    }
                } else {
                    if (node.expression instanceof OperatorExpression && 
                        node.expression.asOperatorExpression.operator == OperatorType.PRE) {
                        preNodes += node  
                        node.expression.replaceExpression(replacements, node)                          
                    } else {
                        node.expression.replaceExpression(replacements, node)
                    }                
                        
                    if (environment.getProperty(COPY_PROPAGATION_PROPAGATE_EQUAL_EXPRESSIONS)) {
                        val serializedExpression = node.expression.serializeHR.toString
                        if (!node.reference.valuedObject.name.startsWith(SimpleGuardExpressions.CONDITIONAL_EXPRESSION_PREFIX) &&
                            (registerExpressions.keySet.contains(serializedExpression))) {
                            val originalNode = registerExpressions.get(serializedExpression)
                            replacements.push(node.reference.valuedObject.name, originalNode.asAssignment.reference)
                            for (incoming :node.allPrevious.toList) {
                                incoming.target = node.next.target
                            }
                            removeList += node.next
                            removeList += node                        
                        } else {
                            registerExpressions.put(serializedExpression, node)
                        }
                    }
                }  
                
            } else if (node instanceof Conditional) {
                node.condition.replaceExpression(replacements, node)
                
                if (node.condition instanceof ValuedObjectReference) {
                    conditionalGuardMapping.put((node.condition as ValuedObjectReference).valuedObject, node)
                }
            }
            
            if (node instanceof Conditional) {
                nextNodes.add(node.^else.targetNode)
            } else {
                val newNodes = node.allNext.map[ targetNode ].filter[ it !== null && !visited.contains(it)].toList
                if (!newNodes.empty && newNodes.head !== nextNodes.peek) {
                    nextNodes.addAll(newNodes)
                } 
            }
        }
        
        for (node : preNodes) {
            node.expression.replaceExpression(replacements, node)
        }
        
        for (r : removeList) {
            if (r instanceof ControlFlow) r.target = null
            r.remove
        }
        
    }
    
    
    
    
    // Replace inplace... only applicable with valued object references.
    private def void replaceExpression(Expression expression, Replacements replacements, Node node) {
        if (expression instanceof ValuedObjectReference) {
            if (replacements.keySet.contains(expression.valuedObject.name)) { 
                val VOR = replacements.peek(expression.valuedObject.name) as ValuedObjectReference
                environment.infos.add("CP: " + expression.valuedObject.name + " / " + VOR.valuedObject.name, node, true)
                expression.valuedObject = VOR.valuedObject
            } else {
                // Should only happen at GO guard. Do nothing.
            }
        } else if (expression instanceof OperatorExpression) {
//            if (expression.operator != OperatorType.PRE) {
                for (subExpression : expression.subExpressions) {
                    subExpression.replaceExpression(replacements, node)
                }
//            }
        } else if (expression instanceof VectorValue) {
            for (value : expression.values) {
                value.replaceExpression(replacements, node)
            }
        } else {
            // Literal? Do nothing.
        }
    }
    
}