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
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.scg.Assignment
import com.google.inject.Inject
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scg.transformations.guardExpressions.AbstractGuardExpressions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.VectorValue
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions

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
    
    public static val IProperty<Boolean> SMART_REGISTER_ALLLOCATION_CONSIDER_CONDITIONAL_GUARDS = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.copyPropagation.considerConditionalGuards", false)     
            
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension SCGControlFlowExtensions
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.smartRegisterAllocation"
    }
    
    override getName() {
        "Smart Register Allocation"
    }
    
    override process() {
        val model = getModel
        
        for (scg : model.scgs) {
            scg.performSmartRegisterAllocation
        }
    }
    
    def performSmartRegisterAllocation(SCGraph scg) {
        val nextNodes = <Node> newLinkedList(scg.nodes.head)
        val registerAllocation = new RegisterAllocation
        val preNodes = <Assignment> newLinkedList        
        
        while (!nextNodes.empty) {
            val node = nextNodes.pop
            
            if (node instanceof Assignment) {
                if (!node.reference.valuedObject.name.startsWith(AbstractGuardExpressions.CONDITIONAL_EXPRESSION_PREFIX)) {
                    registerAllocation.registerRange.put(node.reference.valuedObject.name, node)
                }
                node.expression.setRegisterRanges(node, registerAllocation)
                
                if (node.expression instanceof OperatorExpression && 
                    node.expression.asOperatorExpression.operator == OperatorType.PRE) {
                    preNodes += node
                } 
            } else if (node instanceof Conditional) {
                node.condition.setRegisterRanges(node, registerAllocation)
            }
            
            if (node instanceof Conditional) {
                nextNodes.add(node.^else.target)
            } else {
                val newNodes = node.allNext.map[ target ].filter[ it !== null ].toList
                if (!newNodes.empty && newNodes.head !== nextNodes.peek) {
                    nextNodes.addAll(newNodes)
                } 
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
                if (!node.reference.valuedObject.name.startsWith(AbstractGuardExpressions.CONDITIONAL_EXPRESSION_PREFIX)) {
                    if (!registerAllocation.freedRegister.empty) {
                        val recycledRegister = registerAllocation.freedRegister.pop
                        val vo = scg.findValuedObjectByName(recycledRegister) 
                        if (vo !== null) {
                            replacements.push(node.reference.valuedObject.name, vo.reference)
                            node.reference.valuedObject = vo
                        }
                    }
                }
                
                node.expression.replaceExpression(replacements, node)
            } else if (node instanceof Conditional) {
                node.condition.replaceExpression(replacements, node)
            }
            
            if (node instanceof Conditional) {
                nextNodes.add(node.^else.target)
            } else {
                val newNodes = node.allNext.map[ target ].filter[ it !== null ].toList
                if (!newNodes.empty && newNodes.head !== nextNodes.peek) {
                    nextNodes.addAll(newNodes)
                } 
            }
        }
        
        for (node : preNodes) {
            node.expression.replaceExpression(replacements, node)
        }
    }
    
    private def void setRegisterRanges(Expression expression, Node node, RegisterAllocation registerAllocation) {
        for (ref : expression.allReferences) {
            val register = ref.valuedObject.name
            if (registerAllocation.registerRange.keySet.contains(register)) {
                registerAllocation.registerRange.put(register, node)
            }
        }
    }
    
    
    // Replace inplace... only applicable with valued object references.
    private def void replaceExpression(Expression expression, Replacements replacements, Node node) {
        if (expression instanceof ValuedObjectReference) {
            if (replacements.keySet.contains(expression.valuedObject.name)) { 
                val VOR = replacements.peek(expression.valuedObject.name) as ValuedObjectReference
                expression.valuedObject = VOR.valuedObject
                environment.infos.add("SRA", node, true)
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