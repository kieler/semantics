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
package de.cau.cs.kieler.scg.scgdep

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
import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.core.kexpressions.IntValue

/** 
 * SCG to SCGDEP Transformation 
 * 
 * @author ssm
 * @kieler.design 2013-10-23 proposed 
 * @kieler.rating 2013-10-23 proposed yellow
 */

// This class contians all mandatory methods for the SCG-to-SCGDEP-Transformation.
class SCGToSCGDEPTransformation {
    
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
    
    def SCGraphDep transformSCGToSCGDEP(SCGraph scg) {
        // Create new SCGDEP...
        val scgdep = ScgdepFactory::eINSTANCE.createSCGraphDep()
                  
        // ... and copy declarations.
        for(valuedObject : scg.valuedObjects) {
            val newValuedObject = valuedObject.copy
            scgdep.valuedObjects.add(newValuedObject)
            valuedObjectMapping.put(valuedObject, newValuedObject)
        }
        
        // Additionally, copy all nodes and fill the mapping structures.
        for(node : scg.nodes) {
            val nodeCopy = node.copySCGNode
            nodeMapping.put(node, nodeCopy)
            revNodeMapping.put(nodeCopy, node)
            scgdep.nodes.add(nodeCopy)
        }

        // Add all control flows.
        scgdep.nodes.forEach[ it.addControlFlow ]
        
        // Resolves all cross references.
        scgdep.nodes.forEach[ it.adjustCrossReferences ]
        
        // Finally, add all dependencies.
        scgdep.nodes.filter(typeof(AssignmentDep)).forEach[ it.createDependencies(scgdep) ]
        
        return scgdep;
    }   
    
    
    // -------------------------------------------------------------------------
    // -- DEPENDENCIES 
    // -------------------------------------------------------------------------
    
    // All dependencies are originating at assignment nodes. 
    // Thus, it is sufficient to check all assignments for dependencies and add them as children.
    def createDependencies(AssignmentDep assignment, SCGraphDep scg) {
        // Cache own absolute/relative state.
        val iAmAbsoluteWriter = !assignment.isRelativeWriter
        
        // Filter all other assignments...
        scg.nodes.filter(typeof(AssignmentDep)).forEach[ node |
            if (node != assignment) {
                var Dependency dependency = null
                // If they write to the same variable...
                if (node.valuedObject == assignment.valuedObject) {
                    // check absolute / relative writes and add the corresponding dependency.
                    if (iAmAbsoluteWriter && node.isRelativeWriter) {
                        dependency = ScgdepFactory::eINSTANCE.createAbsoluteWrite_RelativeWrite                        
                    } else 
                    if (iAmAbsoluteWriter && !node.isRelativeWriter) {
                        dependency = ScgdepFactory::eINSTANCE.createWrite_Write       
                    }
                } else
                // Otherwise, check if the assignment reads the variable and add the dependency
                // if necessary.
                if (node.assignment.isReader(assignment.valuedObject)) {
                    if (iAmAbsoluteWriter) dependency = ScgdepFactory::eINSTANCE.createAbsoluteWrite_Read
                    else dependency = ScgdepFactory::eINSTANCE.createRelativeWrite_Read    
                }
                // If a dependency was created, add the target, the concurrency state and update the 
                // assignment.
                if (dependency != null) {
                    dependency.target = node;
                    if (assignment.areConcurrent(node)) dependency.concurrent = true
                    if (assignment.areConfluent(node)) dependency.confluent = true
                    assignment.dependencies.add(dependency);
                }
            }
        ]
        
        // Basically, do the same stuff with conditionals as target. 
        // Conditionals will never write a variable, so it's sufficient to check the reader.
        scg.nodes.filter(typeof(Conditional)).forEach[ node |
            var Dependency dependency = null
            if (node.condition.isReader(assignment.valuedObject)) {
                if (iAmAbsoluteWriter) dependency = ScgdepFactory::eINSTANCE.createAbsoluteWrite_Read
                else dependency = ScgdepFactory::eINSTANCE.createRelativeWrite_Read    
            }
            if (dependency != null) {
                dependency.target = node;
                if (assignment.areConcurrent(node)) dependency.concurrent = true
                assignment.dependencies.add(dependency);
            }
        ]
    }
    
    // Checks whether or not an assignment is a relative writer.
    def boolean isRelativeWriter(AssignmentDep assignment) {
        assignment.assignment instanceof OperatorExpression &&
        assignment.assignment.eAllContents.filter(typeof(ValuedObjectReference)).filter[ e |
            e.valuedObject == assignment.valuedObject ].size > 0
    }
    
    // Checks whether or not an expression reads a specific ValuedObject.
    def boolean isReader(Expression expression, ValuedObject valuedObject) {
        if (expression instanceof ValuedObjectReference) {
            return (expression as ValuedObjectReference).valuedObject == valuedObject
        } else {
            return expression.eAllContents.filter(typeof(ValuedObjectReference)).filter[ e |
                e.valuedObject == valuedObject].size > 0
        }
    }
    
    // Checks whether or not two nodes are concurrent.
    // By DATE'13 definition two statements are concurrent if and only if they are not in the same thread
    // and share a least common ancestor fork node. 
    def boolean areConcurrent(Node node1, Node node2) {
        var node1AF = node1.getAncestorForks
        var node2AF = node2.getAncestorForks
        for (node : node1AF) {
            if (node2AF.contains(node)) {
                var isConcurrent = true
                val threadEntries = node.getAllNext
                for(t : threadEntries) {
                    if (t.target instanceof Entry 
                        && (t.target as Entry).getThreadNodes.contains(node1)
                        && (t.target as Entry).getThreadNodes.contains(node2)
                    ) isConcurrent = false 
                }
                if (isConcurrent) return true
            }
        }
        return false
    }
    
    // Checks whether or not two assignments are confluent.
    def boolean areConfluent(AssignmentDep asg1, AssignmentDep asg2) {
        if (asg1.assignment instanceof BoolValue && asg2.assignment instanceof BoolValue &&
            (asg1.assignment as BoolValue).value == (asg2.assignment as BoolValue).value
        ) return true
        if (asg1.assignment instanceof IntValue && asg2.assignment instanceof IntValue &&
            (asg1.assignment as IntValue).value == (asg2.assignment as IntValue).value
        ) return true
        if (asg1.assignment instanceof ValuedObjectReference && asg2.assignment instanceof ValuedObjectReference &&
            (asg1.assignment as ValuedObjectReference).valuedObject == (asg2.assignment as ValuedObjectReference).valuedObject
        ) return true

        
        false
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
    
    def dispatch Node addControlFlow(Assignment assignment) {
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
    
    def dispatch adjustCrossReferences(Assignment assignment) { }

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
    def dispatch Assignment  copySCGNode(Assignment  node) { 
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