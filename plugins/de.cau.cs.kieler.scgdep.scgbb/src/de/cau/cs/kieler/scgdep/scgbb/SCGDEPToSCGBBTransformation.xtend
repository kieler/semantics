/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scgdep.scgbb

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGExtensions
import de.cau.cs.kieler.scgdep.AssignmentDep
import de.cau.cs.kieler.scgdep.ConditionalDep
import de.cau.cs.kieler.scgdep.Dependency
import de.cau.cs.kieler.scgdep.SCGraphDep
import de.cau.cs.kieler.scgdep.ScgdepFactory
import java.util.HashMap

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scgbb.ScgbbFactory
import de.cau.cs.kieler.scgbb.SCGraphBB
import de.cau.cs.kieler.scgdep.NodeDep
import java.util.List
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.scgbb.SchedulingBlock
import de.cau.cs.kieler.scgbb.BasicBlock
import java.util.ArrayList

/** 
 * SCGDEP to SCGBB Transformation 
 * 
 * @author ssm
 * @kieler.design 2013-10-24 proposed 
 * @kieler.rating 2013-10-24 proposed yellow
 */

// This class contians all mandatory methods for the SCGDEP-to-SCGBB-Transformation.
class SCGDEPToSCGBBTransformation {
    
    // Inject SCG Extensions.    
    @Inject
    extension SCGExtensions
         
    // M2M Mapping
    private val nodeMapping = new HashMap<Node, Node>
    private val revNodeMapping = new HashMap<Node, Node>
    private val valuedObjectMapping = new HashMap<ValuedObject, ValuedObject>
    
    // -------------------------------------------------------------------------
    // -- M2M Transformation 
    // -------------------------------------------------------------------------
    
    def SCGraphDep transformSCGDEPToSCGBB(SCGraphDep scgdep) {
        // Create new SCGDEP...
        val scgbb = ScgbbFactory::eINSTANCE.createSCGraphBB()
                  
        // ... and copy declarations.
        for(valuedObject : scgdep.valuedObjects) {
            val newValuedObject = valuedObject.copy
            scgbb.valuedObjects.add(newValuedObject)
            valuedObjectMapping.put(valuedObject, newValuedObject)
        }
        
        // Additionally, copy all nodes and fill the mapping structures.
        for(node : scgdep.nodes) {
            val nodeCopy = node.copySCGNode
            nodeMapping.put(node, nodeCopy)
            revNodeMapping.put(nodeCopy, node)
            scgbb.nodes.add(nodeCopy)
        }

        // Add all control flows.
        scgbb.nodes.forEach[ it.addControlFlow ]
        
        // Resolves all cross references.
        scgbb.nodes.forEach[ it.adjustCrossReferences ]
        
        // Copy all dependencies.
        scgdep.eAllContents.filter(typeof(Dependency)).forEach[ it.copyDependency(scgbb) ]
        
        // Create basic blocks.
        scgbb.createBasicBlocks(scgbb.nodes.head, 0)
        
        return scgbb;
    }   
    

    // -------------------------------------------------------------------------
    // -- CREATE Basic Blocks 
    // -------------------------------------------------------------------------
    
    def int createBasicBlocks(SCGraphBB scg, Node rootNode, int guardIndex) {
        var newIndex = guardIndex
        var node = rootNode
        
        val List<Node> nodes = new ArrayList<Node> => [ n |
            scg.basicBlocks.forEach[bb|bb.schedulingBlocks.forEach[sb|n.addAll(sb.nodes)]]
        ]
        if (nodes.contains(rootNode)) return newIndex;
        
        val guard = KExpressionsFactory::eINSTANCE.createValuedObject
        guard.name = 'guard' + newIndex.toString
        newIndex = newIndex + 1
        
        var schedulingBlock = ScgbbFactory::eINSTANCE.createSchedulingBlock
        while(node != null) {
            schedulingBlock.nodes.add(node)
            
            if (node instanceof Conditional) {
                scg.insertBasicBlock(guard, schedulingBlock)
                newIndex = scg.createBasicBlocks((node as Conditional).then.target, newIndex)
                newIndex = scg.createBasicBlocks((node as Conditional).getElse.target, newIndex)
                node = null
            } else 
            if (node instanceof Surface) {
                scg.insertBasicBlock(guard, schedulingBlock)
                newIndex = scg.createBasicBlocks((node as Surface).depth, newIndex)
                node = null
            }  else
            if (node.eAllContents.filter(typeof(ControlFlow)).size != 1) {
                scg.insertBasicBlock(guard, schedulingBlock)
                if (node instanceof Fork) {
                    newIndex = scg.createBasicBlocks((node as Fork).join, newIndex)
                }
                for(flow : node.eAllContents.filter(typeof(ControlFlow)).toList) {
                    newIndex = scg.createBasicBlocks(flow.target, newIndex)
                }
                node = null                
            } else {
                val next = node.eAllContents.filter(typeof(ControlFlow)).head.target
                if (next instanceof Join) {
                    scg.insertBasicBlock(guard, schedulingBlock)
                    node = null
                } else {
                    node = next
                }
            }
        }
                
        newIndex
    }
    
    def BasicBlock insertBasicBlock(SCGraphBB scg, ValuedObject guard, SchedulingBlock schedulingBlock) {
        val basicBlock = ScgbbFactory::eINSTANCE.createBasicBlock
        basicBlock.schedulingBlocks.add(schedulingBlock)
        basicBlock.guard = guard
        scg.basicBlocks.add(basicBlock)
        basicBlock
    }


    // -------------------------------------------------------------------------
    // -- TRANSFORM Dependencies 
    // -------------------------------------------------------------------------

    def copyDependency(Dependency dependency, SCGraphBB scgbb) {
        var newDependency = dependency.copy;
        (nodeMapping.get(dependency.eContainer as Node) as NodeDep).dependencies.add(newDependency)
        newDependency.target = nodeMapping.get(dependency.target)
    }

    // -------------------------------------------------------------------------
    // -- TRANSFORM Control flow 
    // -------------------------------------------------------------------------
    
    // The control flow dispatcher copy each control flow element according to the node mapping. 
    
    def dispatch Node addControlFlow(Entry entry) {
        val sourceEntry = revNodeMapping.get(entry) as Entry
        if (sourceEntry.next != null) {
            entry.next = ScgFactory::eINSTANCE.createControlFlow()
            entry.next.target = nodeMapping.get(sourceEntry.next.target)
        }
        entry
    }    

    def dispatch Node addControlFlow(Exit exit) {
        val sourceExit = revNodeMapping.get(exit) as Exit
        if (sourceExit.next != null) {
            exit.next = ScgFactory::eINSTANCE.createControlFlow()
            exit.next.target = nodeMapping.get(sourceExit.next.target)
        }
        exit
    }    
    
    def dispatch Node addControlFlow(Surface surface) { surface }    

    def dispatch Node addControlFlow(Depth depth) {
        val sourceDepth = revNodeMapping.get(depth) as Depth
        if (sourceDepth.next != null) {
            depth.next = ScgFactory::eINSTANCE.createControlFlow();
            depth.next.target = nodeMapping.get(sourceDepth.next.target)
        }
        depth
    }     
    
    def dispatch Node addControlFlow(Fork fork) {
        val sourceFork = revNodeMapping.get(fork) as Fork
        if (sourceFork.next.size > 0) {
            for (scf : sourceFork.next) {
              val cf = ScgFactory::eINSTANCE.createControlFlow()
              cf.target = nodeMapping.get(scf.target)
              fork.next.add(cf)
            }
        }
        fork
    }    

    def dispatch Node addControlFlow(Join join) {
        val sourceJoin = revNodeMapping.get(join) as Join
        if (sourceJoin.next != null) {
            join.next = ScgFactory::eINSTANCE.createControlFlow()
            join.next.target = nodeMapping.get(sourceJoin.next.target)
        }
        join
    }
    
    def dispatch Node addControlFlow(AssignmentDep assignment) {
        val sourceAssignment = revNodeMapping.get(assignment) as Assignment
        if (sourceAssignment.next != null) {
            assignment.next = ScgFactory::eINSTANCE.createControlFlow()
            assignment.next.target = nodeMapping.get(sourceAssignment.next.target)
        }
        assignment
    }
        
    def dispatch Node addControlFlow(Conditional conditional) {
        val sourceConditional = revNodeMapping.get(conditional) as Conditional
        if (sourceConditional.then != null) {
            conditional.then = ScgFactory::eINSTANCE.createControlFlow()
            conditional.then.target = nodeMapping.get(sourceConditional.then.target)
        }
        if (sourceConditional.getElse != null) {
            conditional.setElse(ScgFactory::eINSTANCE.createControlFlow())
            conditional.getElse.target = nodeMapping.get(sourceConditional.getElse.target)
        }
        conditional
    }
    

    // -------------------------------------------------------------------------
    // -- TRANSFORM Cross references 
    // -------------------------------------------------------------------------
    
    // The adjust dispatcher correct all encapsulated references (e.g. opposite relations).
    
    def dispatch adjustCrossReferences(Entry entry) {
        entry.exit = nodeMapping.get((revNodeMapping.get(entry) as Entry).exit) as Exit
    }    
    
    def dispatch adjustCrossReferences(Exit exit) {
        exit.entry = nodeMapping.get((revNodeMapping.get(exit) as Exit).entry) as Entry
    }

    def dispatch adjustCrossReferences(Surface surface) {
        surface.depth = nodeMapping.get((revNodeMapping.get(surface) as Surface).depth) as Depth
    }    
    
    def dispatch adjustCrossReferences(Depth depth) {
        depth.surface = nodeMapping.get((revNodeMapping.get(depth) as Depth).surface) as Surface
    }
    
    def dispatch adjustCrossReferences(Fork fork) {
        fork.join = nodeMapping.get((revNodeMapping.get(fork) as Fork).join) as Join
    }    
    
    def dispatch adjustCrossReferences(Join join) {
        join.fork = nodeMapping.get((revNodeMapping.get(join) as Join).fork) as Fork
    }
    
    def dispatch adjustCrossReferences(AssignmentDep assignment) { }

    def dispatch adjustCrossReferences(Conditional conditional) { }
    
    
    // -------------------------------------------------------------------------
    // -- TRANSFORM Copy SCG 
    // -------------------------------------------------------------------------

    // Create corresponding SCGDEP nodes for each SCG element.
    
    def dispatch Entry       copySCGNode(Entry       node) { ScgFactory::eINSTANCE.createEntry() }
    def dispatch Exit        copySCGNode(Exit        node) { ScgFactory::eINSTANCE.createExit() }
    def dispatch Surface     copySCGNode(Surface     node) { ScgFactory::eINSTANCE.createSurface() }
    def dispatch Depth       copySCGNode(Depth       node) { ScgFactory::eINSTANCE.createDepth() }
    def dispatch Fork        copySCGNode(Fork        node) { ScgFactory::eINSTANCE.createFork() }
    def dispatch Join        copySCGNode(Join        node) { ScgFactory::eINSTANCE.createJoin() }
    
    // Don't forget to copy the assignment expression and the valued object in assignments.
    def dispatch Assignment  copySCGNode(AssignmentDep  node) { 
        val assignment = ScgdepFactory::eINSTANCE.createAssignmentDep()
        assignment.assignment = node.assignment.copyExpression
        assignment.valuedObject = node.valuedObject.copyValuedObject;
        assignment
    }

    // Same goes for conditionals...   
    def dispatch Conditional copySCGNode(Conditional node) { 
        val conditional = ScgFactory::eINSTANCE.createConditional();
        conditional.condition = node.condition.copyExpression
        conditional
    }
   
    
    // Valued objects must be set according to the mapping!
    def ValuedObject copyValuedObject(ValuedObject valuedObject) {
        valuedObjectMapping.get(valuedObject)
    }
    
    // References in expressions must be corrected as well!
    def Expression copyExpression(Expression expression) {
        val newExpression = expression.copy
        if (newExpression instanceof ValuedObjectReference) {
            (newExpression as ValuedObjectReference).valuedObject = 
                (expression as ValuedObjectReference).valuedObject.copyValuedObject                    
        } else {
            newExpression.eAllContents.filter(typeof(ValuedObjectReference)).forEach[ vor |
                vor.valuedObject = vor.valuedObject.copyValuedObject ]        
        }
        newExpression
    }

   // -------------------------------------------------------------------------   
}