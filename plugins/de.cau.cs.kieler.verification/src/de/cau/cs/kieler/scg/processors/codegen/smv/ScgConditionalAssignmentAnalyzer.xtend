/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.codegen.smv

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
class ScgConditionalAssignmentAnalyzer {
    
    @Inject extension KEffectsExtensions
    @Inject extension SCGControlFlowExtensions

    private val nodeToParentConditional = <Node, ConditionalTree>newHashMap
    private val valuedObjectToAssignments = <ValuedObject, List<Assignment>>newHashMap
    private val nodeStack = <Node> newLinkedList
    
    public def void init(SCGraph scg) {
        val processedNodes = <Node>newHashSet
        nodeStack.clear
        nodeToParentConditional.clear
        valuedObjectToAssignments.clear
        
        nodeStack.add(scg.nodes.head)
        while(!nodeStack.isEmpty) {
            val node = nodeStack.pop
            if (!processedNodes.contains(node)) {
                node.handleConditionalNesting
                node.analyze
                processedNodes.add(node)    
            }
        }
    }

    public def List<Assignment> getAssignments(ValuedObject valuedObject) {
        return valuedObjectToAssignments.get(valuedObject)
    }

    public def ConditionalTree getConditionalTree(Assignment assignment) {
        return nodeToParentConditional.get(assignment)
    }
    
    private def dispatch void analyze(Assignment assignment) {
        val writtenValuedObject = assignment.valuedObject
        if (writtenValuedObject !== null) {
            // Remember the valued object that was written in this assignment
            addValuedObjectAsWritten(writtenValuedObject, assignment)
        }
        if (assignment.next !== null) {
            nodeStack.push(assignment.next.targetNode)
            assignment.assignParentConditionalToNextNode(assignment.next.targetNode)
        }
    }
    
    private def dispatch void analyze(Entry entry) {
        if (entry.next !== null) {
            nodeStack.push(entry.next.targetNode)
            entry.assignParentConditionalToNextNode(entry.next.targetNode)
        }
    }
    
    private def dispatch void analyze(Exit entry) {
        
    }

    private def void assignParentConditionalToNextNode(Node currentNode, Node nextNode) {
        if(!nodeToParentConditional.containsKey(nextNode)) {
            val currentParentConditional = nodeToParentConditional.get(currentNode)
            nodeToParentConditional.put(nextNode, currentParentConditional)    
        }
    }
    
    private def dispatch void analyze(Conditional conditional) {
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
    
    private def void handleConditionalNesting(Node node) {
        val parentConditional = nodeToParentConditional.get(node)
        val incomingControlFlows = node.incomingLinks.filter(ControlFlow).toList
        if (incomingControlFlows.size > 1 && parentConditional !== null) {
            nodeToParentConditional.put(node, parentConditional.parent)    
        }
    }
    
    private def void addValuedObjectAsWritten(ValuedObject valuedObject, Assignment assignment) {
        var assignments = valuedObjectToAssignments.get(valuedObject)
        if(assignments === null) {
            assignments = newLinkedList
            valuedObjectToAssignments.put(valuedObject, assignments)
        }
        assignments.add(assignment)
    }
    
    ///////////////////////////////////////////////////////////////////////
    // ConditionalTree
    
    public static class ConditionalTree {
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
}