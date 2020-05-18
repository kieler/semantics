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

import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.scg.Assignment
import com.google.inject.Inject
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.VectorValue
import de.cau.cs.kieler.kexpressions.OperatorType
import java.util.Set
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.scg.processors.SimpleGuardExpressions
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions

/**
 * Smart Register Allocation
 * -------------------------
 * 
 * @author ssm
 * @kieler.design 2018-01-12 proposed 
 * @kieler.rating 2018-01-12 proposed yellow
 *
 */
class SmartRegisterAllocation extends InplaceProcessor<SCGraphs> {

    public static val IProperty<Boolean> SMART_REGISTER_ALLOCATION_ENABLED = 
        new Property<Boolean>("de.cau.cs.kieler.scg.opt.smartRegisterAllocation", false)
    public static val IProperty<Boolean> SMART_REGISTER_ALLLOCATION_CONSIDER_CONDITIONAL_GUARDS = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.smartRegisterAllocation.considerConditionalGuards", false)     
    public static val IProperty<Boolean> SMART_REGISTER_ALLLOCATION_FREE_AFTER_RECYCLE_RANGE = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.smartRegisterAllocation.freeAfterRecycleRange", true)     
            
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGMethodExtensions
    
    val replacedNodeReference = <Pair<Node, ValuedObjectReference>> newHashSet
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.smartRegisterAllocation"
    }
    
    override getName() {
        "Smart Register Allocation"
    }
    
    override process() {
        if (!environment.getProperty(SMART_REGISTER_ALLOCATION_ENABLED)) return;
        
        val model = getModel
        
        for (scg : model.scgs.ignoreMethods) {
            scg.performSmartRegisterAllocation
        }
        VariableStore.get(environment).removeAllUncontainedVO(model, environment)
    }
    
    def performSmartRegisterAllocation(SCGraph scg) {
        val nextNodes = <Node> newLinkedList(scg.nodes.head)
        val registerAllocation = new RegisterAllocation
        val preNodes = <Assignment> newLinkedHashSet  
        val usedInPreNodes = <String> newHashSet      
        val assignedVariables = <String> newHashSet
        
        while (!nextNodes.empty) {
            val node = nextNodes.pop
            
            if (node instanceof Assignment) {
                if (!node.reference.valuedObject.name.startsWith(SimpleGuardExpressions.CONDITIONAL_EXPRESSION_PREFIX) &&
                    !node.reference.valuedObject.name.startsWith(SimpleGuardExpressions.TERM_GUARD_NAME)
                ) {
                    registerAllocation.registerRange.push(node.reference.valuedObject.name, node)
                }
                node.expression.setRegisterRanges(node, registerAllocation)
                
                if (node.expression instanceof OperatorExpression && 
                    node.expression.asOperatorExpression.getPreOperatorExpressions.size > 0) {
                    preNodes += node
                } 
            } else if (node instanceof Conditional) {
                node.condition.setRegisterRanges(node, registerAllocation)
            }
            
            if (node instanceof Conditional) {
                nextNodes.add(node.^else.targetNode)
            } else {
                val newNodes = node.allNext.map[ targetNode ].filter[ it !== null ].toList
                if (!newNodes.empty && newNodes.head !== nextNodes.peek) {
                    nextNodes.addAll(newNodes)
                } 
            }
        }


        registerAllocation.createReverseRangeMap
        for (r : registerAllocation.registerRange.keySet.immutableCopy) {
            val range = registerAllocation.registerRange.get(r)
            if (range !== null && range.size < 2) {
                r.removeIneffectiveAssignment(registerAllocation, preNodes)        
            }
        }

        for (node : preNodes) {        
            val preObject = node.expression.asOperatorExpression.subExpressions.head
            if (preObject instanceof ValuedObjectReference) {
                registerAllocation.registerRange.remove(preObject.valuedObject.name)        
            }          
        }          
        registerAllocation.createReverseRangeMap     
             
        val replacements = new Replacements
        nextNodes.add(scg.nodes.head)
        
        while (!nextNodes.empty) {
            val node = nextNodes.pop
            
            if (registerAllocation.reverseRegisterRange.keySet.contains(node)) {
                for (register : registerAllocation.reverseRegisterRange.get(node)) {
                    registerAllocation.freedRegister.add(register)
                }
            }                
            if (node instanceof Assignment) {
                if (node.expression.isPreOperatorExpression) {
                    usedInPreNodes.add(node.expression.asOperatorExpression.subExpressions.head.asValuedObjectReference.valuedObject.name)
                }
                
                if (!node.reference.valuedObject.name.startsWith(SimpleGuardExpressions.CONDITIONAL_EXPRESSION_PREFIX) &&
                    !node.reference.valuedObject.name.startsWith(SimpleGuardExpressions.TERM_GUARD_NAME)
                ) {
                    if (!registerAllocation.freedRegister.empty) {
                        val recycledRegister = node.selectRecycledRegister(registerAllocation, preNodes, usedInPreNodes, assignedVariables)
                        val vo = scg.findValuedObjectByName(recycledRegister) 
                        if (vo !== null) {
                            if (getProperty(SMART_REGISTER_ALLLOCATION_FREE_AFTER_RECYCLE_RANGE)
                                && !usedInPreNodes.contains(node.reference.valuedObject.name)
                            ) {
                                registerAllocation.recycleAfterNode.put(
                                    registerAllocation.registerRange.peek(node.reference.valuedObject.name), 
                                    recycledRegister)
                            }
                            replacements.push(node.reference.valuedObject.name, vo.reference)
                            node.reference.valuedObject = vo
                        }
                    }
                }
                
                node.expression.replaceExpression(replacements, node)
                assignedVariables.add(node.reference.valuedObject.name)
            } else if (node instanceof Conditional) {
                node.condition.replaceExpression(replacements, node)
            }
            
            if (registerAllocation.recycleAfterNode.keySet.contains(node)) {
                for (fr : registerAllocation.recycleAfterNode.get(node)) {
                    registerAllocation.freedRegister.push(fr)
                }
            }
            
            if (node instanceof Conditional) {
                nextNodes.add(node.^else.targetNode)
            } else {
                val newNodes = node.allNext.map[ targetNode ].filter[ it !== null ].toList
                if (!newNodes.empty && newNodes.head !== nextNodes.peek) {
                    nextNodes.addAll(newNodes)
                } 
            }
        }
        
        for (node : preNodes) {
            node.expression.replaceExpression(replacements, node)
        }
    }
    
    private def String selectRecycledRegister(Assignment assignment, RegisterAllocation registerAllocation, 
        Set<Assignment> preNodes, Set<String> usedInPreNodes, Set<String> assignedVariables
    ) {
        if (usedInPreNodes.contains(assignment.reference.valuedObject.name)) {
            val check = <String> newLinkedList
            var String reg = null
            while (reg === null && !registerAllocation.freedRegister.empty) {
                val r = registerAllocation.freedRegister.pop
                val isPreReceiver = false //preNodes.exists[ reference.valuedObject.name == r ] 
                if (!isPreReceiver && assignedVariables.exists[ it == r ]) {
                    reg = r
                } else {
                    check.push(r)
                }
            }
            while (!check.empty) registerAllocation.freedRegister.push(check.pop)
            return reg
        } else {
            return registerAllocation.freedRegister.pop
        }
    }
    
    private def void setRegisterRanges(Expression expression, Node node, RegisterAllocation registerAllocation) {
        for (ref : expression.allReferences) {
            val register = ref.valuedObject.name
            if (registerAllocation.registerRange.keySet.contains(register)) {
                registerAllocation.registerRange.push(register, node)
            }
        }
    }
    
    
    // Replace inplace... only applicable with valued object references.
    private def void replaceExpression(Expression expression, Replacements replacements, Node node) {
        if (expression instanceof ValuedObjectReference) {
            if (replacements.keySet.contains(expression.valuedObject.name)) { 
                if (replacedNodeReference.contains(new Pair<Node, ValuedObjectReference>(node, expression))) return;
                val VOR = replacements.peek(expression.valuedObject.name) as ValuedObjectReference
                environment.infos.add("RR: " + expression.valuedObject.name + " / " + VOR.valuedObject.name, node, true)
                replacedNodeReference.add(new Pair<Node, ValuedObjectReference>(node, expression))
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
    
    private def void removeIneffectiveAssignment(String registerName, RegisterAllocation registerAllocation, Set<Assignment> preNodes) {
        val node = registerAllocation.registerRange.pop(registerName)
        
        if (node === null) return;
        
        for (p : preNodes) {
            if (p.expression instanceof OperatorExpression) {
                for (preOE : p.expression.asOperatorExpression.getPreOperatorExpressions) {
                    if (preOE.subExpressions.head.asValuedObjectReference.valuedObject.name == registerName) {
                        return
                    }
                }
            }
        }
        
        
        val next = node.allNext.map[target].head
        node.allPrevious.toList.immutableCopy.forEach[ target = next ]
        
        if (node instanceof Assignment) {
            if ((!(node.expression instanceof OperatorExpression)) || (node.expression.asOperatorExpression.operator != OperatorType.PRE)) {
                val refList = node.expression.allReferences.immutableCopy
                for (ref : refList) {
                    val range = registerAllocation.registerRange.get(ref.valuedObject.name)
                    if (range !== null) {
                        if (registerAllocation.registerRange.get(ref.valuedObject.name).contains(node)) {
                            registerAllocation.registerRange.del(ref.valuedObject.name, node)
                        }
                    }
                }
                for (ref : refList) {
                    val range = registerAllocation.registerRange.get(ref.valuedObject.name)
                    if (range !== null && range.size < 2) {
                        ref.valuedObject.name.removeIneffectiveAssignment(registerAllocation, preNodes)
                    }
                }
            }
        }
        
        for (c : node.allNext.toList) {
            c.target = null
            c.remove
        }
        node.remove
        registerAllocation.registerRange.remove(registerName)
    }
    
}