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
package de.cau.cs.kieler.scg.processors.transformators.codegen.smv

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.ssa.IOPreserverExtensions
import de.cau.cs.kieler.scg.ssa.SSACoreExtensions
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

import static extension de.cau.cs.kieler.scg.processors.transformators.codegen.smv.SmvCodeGeneratorExtensions.toSmvExpression

/**
 * @author aas
 * 
 */
class SmvCodeGeneratorDefineModule extends SmvCodeGeneratorModuleBase {

    @Inject extension KEffectsExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGCoreExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SSACoreExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions   
    @Inject extension IOPreserverExtensions      
    @Inject extension SmvCodeSerializeHRExtensions serializer

    private val nodeToParentConditional = <Node, ConditionalTree>newHashMap
    private val valuedObjectToAssignments = <ValuedObject, List<Assignment>>newHashMap
    private val nodeStack = <Node> newLinkedList
    
    private static class ConditionalTree {
        @Accessors var Conditional conditional
        @Accessors var boolean branchOfConditional
        @Accessors var ConditionalTree parent
        new(ConditionalTree parent, boolean branchOfParent, Conditional conditional) {
            this.parent = parent
            this.branchOfConditional = branchOfParent
            this.conditional = conditional
        }
        
        override toString() {
            if(parent !== null) {
                return '''ConditionalTree@«hashCode»(«branchOfConditional» branch of «conditional.toString», parent:ConditionalTree@«parent.hashCode»)'''
            } else {
                return '''ConditionalTree@«hashCode»(«branchOfConditional» branch of «conditional.toString», no parent)'''
            }
        }
    }
    
    override getName() {
        return class.simpleName;
    }

    override generateInit() {
        val processedNodes = <Node>newHashSet
        nodeStack.clear
        nodeToParentConditional.clear
        valuedObjectToAssignments.clear
        
        nodeStack.add(scg.nodes.head)
        while(!nodeStack.isEmpty) {
            val node = nodeStack.pop
            if (!processedNodes.contains(node)) {
                node.handleConditionalNestingInInit
                node.generateInInit
                processedNodes.add(node)    
            }
        }
    }

    protected def dispatch void generateInInit(Assignment assignment) {
        if (assignment.valuedObject !== null) {
            var assignments = valuedObjectToAssignments.get(assignment.valuedObject)
            if(assignments === null) {
                assignments = newLinkedList
                valuedObjectToAssignments.put(assignment.valuedObject, assignments)
            }
            assignments.add(assignment)
        }
        if (assignment.next !== null) {
            nodeStack.push(assignment.next.targetNode)
            assignment.assignParentConditionalToNextNode(assignment.next.targetNode)
        }
    }
    
    protected def dispatch void generateInInit(Entry entry) {
        if (entry.next !== null) {
            nodeStack.push(entry.next.targetNode)
            entry.assignParentConditionalToNextNode(entry.next.targetNode)
        }
    }
    
    protected def dispatch void generateInInit(Exit entry) {
        
    }

    protected def void assignParentConditionalToNextNode(Node currentNode, Node nextNode) {
        if(!nodeToParentConditional.containsKey(nextNode)) {
            val currentParentConditional = nodeToParentConditional.get(currentNode)
            nodeToParentConditional.put(nextNode, currentParentConditional)    
        }
    }
    
    protected def dispatch void generateInInit(Conditional conditional) {
        val parentConditional = nodeToParentConditional.get(conditional)
        if (conditional.^else !== null) {
            nodeStack.push(conditional.^else.targetNode)
            nodeToParentConditional.put(conditional.^else.targetNode, new ConditionalTree(parentConditional, false, conditional))
        }
        if (conditional.^then !== null) {
            nodeStack.push(conditional.^then.targetNode)
            nodeToParentConditional.put(conditional.^then.targetNode, new ConditionalTree(parentConditional, true, conditional))
        }
    }
    
    protected def void handleConditionalNestingInInit(Node node) {
        val parentConditional = nodeToParentConditional.get(node)
        val incomingControlFlows = node.incomingLinks.filter(ControlFlow).toList
        if (incomingControlFlows.size > 1 && parentConditional !== null) {
            nodeToParentConditional.put(node, parentConditional.parent)    
        }
    }
    
    override generate() {
        incIndentationLevel
        appendIndentedLine("DEFINE")
        
        // Define valued objects that are no pre-guard and no input to the model
        for (declaration : scg.declarations) {
            if (declaration instanceof VariableDeclaration) {
                if(!declaration.isInput || declaration.isOutput) {
                    for (valuedObject : declaration.valuedObjects) {
                        valuedObject.generateAssignment
                    }
                }
            }
        }
    }

    private def void generateAssignment(ValuedObject valuedObject) {
        val assignments = valuedObjectToAssignments.get(valuedObject)
        if(assignments !== null) {
            if(assignments.size == 1) {
                valuedObject.generateUnconditionalAssignment(assignments.head)
            } else {
                valuedObject.generateConditionalAssignments(assignments)
            }
        }
    }

    private def void generateUnconditionalAssignment(ValuedObject valuedObject, Assignment assignment) {
        val expression = assignment.expression.serializeHR
            .toSmvExpression
            .useBooleanInsteadIntegerIfNeeded(valuedObject)
        appendIndentedLine('''«valuedObject.name» := «expression»;''')    
    }

    private def void generateConditionalAssignments(ValuedObject valuedObject, List<Assignment> assignments) {
        appendIndentedLine('''«valuedObject.name» :=''')
        incIndentationLevel
        appendIndentedLine('''case''')
        incIndentationLevel
        for(assignment : assignments) {
            val parentConditional = nodeToParentConditional.get(assignment)
            val fullyQualifiedCondition = getFullyQualifiedCondition(parentConditional)
            val expression = assignment.expression.serializeHR
                .toSmvExpression
                .useBooleanInsteadIntegerIfNeeded(valuedObject)
            appendIndentedLine('''«fullyQualifiedCondition» : «expression»;''')    
        }
        decIndentationLevel
        appendIndentedLine('''esac;''')
        decIndentationLevel
    }
    
    private def String getFullyQualifiedCondition(ConditionalTree parentConditional) {
        if(parentConditional === null) {
            return "TRUE"
        }
        val conditionForTrueBranch = parentConditional.conditional.condition.serializeHR
            .toSmvExpression
        val condition = if (parentConditional.branchOfConditional)
                            conditionForTrueBranch
                        else
                            '''!(«conditionForTrueBranch»)'''
        if(parentConditional.parent === null) {
            return condition.toString            
        } else {
            return getFullyQualifiedCondition(parentConditional.parent) + " & " + condition
        }
    }
    
    override generateDone() {
    }
    
    private def boolean isBoolean(ValuedObject valuedObject) {
        val declaration = valuedObject.declaration
        if(declaration instanceof VariableDeclaration) {
            return declaration.type == ValueType.BOOL
        }
        return false
    }
    
    private def String useBooleanInsteadIntegerIfNeeded(String s, ValuedObject valuedObject) {
        // FIXME: This is a dirty fix for assignment of 1 and 0 instead proper booleans
        return if(valuedObject.isBoolean && !(s.contains("+") || s.contains("-")))
                   s.replaceAll("\\b1\\b", "TRUE").replaceAll("\\b0\\b", "FALSE")
               else
                   s
    }
}
