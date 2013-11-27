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
package de.cau.cs.kieler.scg.transformations

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
import de.cau.cs.kieler.core.kexpressions.IntValueimport de.cau.cs.kieler.scg.extensions.SCGCopyExtensions

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
    
    @Inject
    extension SCGCopyExtensions
         
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
                  
        scg.copySCG(scgdep)
        
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
}