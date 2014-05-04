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
import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGCopyExtensions
import de.cau.cs.kieler.scg.extensions.SCGExtensions
import de.cau.cs.kieler.scgdep.AssignmentDep
import de.cau.cs.kieler.scgdep.Dependency
import de.cau.cs.kieler.scgdep.SCGraphDep
import de.cau.cs.kieler.scgdep.ScgdepFactory
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.core.model.transformations.AbstractModelTransformation

/** 
 * This class is part of the SCG transformation chain. The chain is used to gather important information 
 * about the schedulability of a given SCG. This is done in several key steps. Between two steps the results 
 * are cached in specifically designed metamodels for further processing. At the end of the transformation
 * chain a newly generated (and sequentialized) SCG is returned. <br>
 * You can either call the transformations manually or use the SCG transformation extensions to enrich the
 * SCGs with the desired information.<br>
 * <pre>
 * SCG 
 *   |-- Dependency Analysis 	 					<== YOU ARE HERE
 *   |-- Basic Block Analysis
 *   |-- Scheduler
 *   |-- Sequentialization (new SCG)
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2013-10-23 proposed 
 * @kieler.rating 2013-10-23 proposed yellow
 */

class DependencyTransformation extends AbstractModelTransformation {
    
    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    
    /** Inject SCG extensions. */    
    @Inject
    extension SCGExtensions
    /** Inject SCG copy extensions. */  
    @Inject
    extension SCGCopyExtensions
    
    // -------------------------------------------------------------------------
    // -- Transformation method
    // -------------------------------------------------------------------------
    
	override transform(EObject eObject) {
		return transformSCGToSCGDEP(eObject as SCGraph)
	}
	
    /**
     * transformSCGToSCGDEP executes the transformation from a standard SCG to 
     * an SCG with dependency information.
     * 
     * @param scg 
     * 			the originating source scg
     * @return Returns a copy of the scg enriched with dependency information.
     */   
    def SCGraphDep transformSCGToSCGDEP(SCGraph scg) {
        // Create new SCGDEP with the appropriate Scgdep factory.
        val scgdep = ScgdepFactory::eINSTANCE.createSCGraphDep()
        
        // Since we want to preserve the standard SCG data, we use the SCG copy extensions to copy the SCG.          
        // The SCG cop extensions will replace all assignment nodes with corresponding assignmentdep nodes.
        scg.copySCG(scgdep)
        
        // Finally, add all dependencies. Therefore, search all assignmentdep nodes and create their 
        // dependency information. The data is automatically stored in the SCG by the createDependencies
        // function.
        scgdep.nodes.filter(typeof(AssignmentDep)).filter[ valuedObject != null ].forEach[ it.createDependencies ]
        
        // Return the SCG with dependency data.
        scgdep
    }   
    
    
    // -------------------------------------------------------------------------
    // -- Dependency methods
    // -------------------------------------------------------------------------
    
    /**
     * All dependencies are originating at assignment nodes. 
     * Thus, it is sufficient to check all assignments for dependencies and add them as children.
     * 
     * @param assignment
     * 			the assignment node in question
     * @return Returns the given assignment for further processing.
     */
    private def AssignmentDep createDependencies(AssignmentDep assignment) {
    	// Retrieve the SCG of the assignment node. This is done via the SCG extensions method graph.
    	val scg = assignment.graph
        // Cache own absolute/relative state.
        val iAmAbsoluteWriter = !assignment.isRelativeWriter
        
        // Filter all other assignments.
        scg.nodes.filter(typeof(AssignmentDep)).forEach[ node |
            if (node != assignment) {
                var Dependency dependency = null
                // If they write to the same variable...
                if (node.valuedObject == assignment.valuedObject) {
                    // Check absolute / relative writes and add the corresponding dependency.
                    // The Scgdep factory is used to create the appropriate depenency.
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
        // Since conditionals will never write to a variable, it is sufficient to check the reader.
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
        
        assignment
    }
    
    /**
     * Checks whether or not an assignment is a relative writer.<br>
     * At the moment this is done naively. Since absolute write do not
     * need an OperatorExpression, the function assumes an OperatorExpression
     * is a relative write. 
     * 
     * @param assignment
     * 			the assignment in question
     * @return Returns true if the given assignment is a relative reader.
     * 
     * @TODO make this function more robust w.r.t. absolute writes in OperatorExpressions.
     */
    private def boolean isRelativeWriter(AssignmentDep assignment) {
    	// Returns true if the assignment in the assignment node is an OperatorExpression
    	// and accesses the same ValuedObject as the assignment is writing to.
        assignment.assignment instanceof OperatorExpression &&
        assignment.assignment.eAllContents.filter(typeof(ValuedObjectReference)).filter[ e |
            e.valuedObject == assignment.valuedObject ].size > 0
    }
    
    /** 
     * Checks whether or not an expression reads a specific ValuedObject.
     * 
     * @param expression
     * 			the expression that needs to be checked
     * @param valuedObject
     * 			the valuedObject in question
     * @return returns to if the given expression reads the given object.
     */
    private def boolean isReader(Expression expression, ValuedObject valuedObject) {
    	// Returns true if the ValuedObject is referenced directly in the expression or
    	// if the object is part of a more complex expression.
        if (expression instanceof ValuedObjectReference) {
            return (expression as ValuedObjectReference).valuedObject == valuedObject
        } else {
            return expression.eAllContents.filter(typeof(ValuedObjectReference)).filter[ e |
                e.valuedObject == valuedObject].size > 0
        }
    }
    
    /**
     * Checks whether or not two nodes are concurrent.<br>
     * By DATE'13 definition two statements are concurrent if and only if they are not in the same thread
     * and share a least common ancestor fork node.
     * 
     * @param node1
     * 			the first node of the concurrency check
     * @param node2
     * 			the second node of the concurrncy check
     * @return Returns true if node1 and node2 are concurrent in the SC MoC sense (DATE'13).
     */ 
    private def boolean areConcurrent(Node node1, Node node2) {
    	// Use the SCG extensions to retrieve all ancestor forks for both nodes.
        var node1AF = node1.getAncestorForks
        var node2AF = node2.getAncestorForks
        // For each ancestor fork of node1 check if it is also present in the list of node2.
        for (node : node1AF) {
            if (node2AF.contains(node)) {
            	// If the node is present in both lists, check if it is the least fork node.
            	// Assume the nodes are concurrent but withdraw this assumption if both nodes
            	// are present in the nodes of a single thread of the fork node.
                var isConcurrent = true
                val threadEntries = node.getAllNext
                for(t : threadEntries) {
                    if (t.target instanceof Entry 
                        && (t.target as Entry).getThreadNodes.contains(node1)
                        && (t.target as Entry).getThreadNodes.contains(node2)
                    ) isConcurrent = false 
                }
                // If they are in separate threads, return true.
                if (isConcurrent) return true
            }
        }
        return false
    }
    
    /** 
     * Checks whether or not two assignments are confluent.<br>
     * At the moment this is only done for objects, boolean and integer values and only if 
     * these are simple (instead of complex expression assignments).<br>
     * Conservatively, all other assignments are not considered confluent.
     * 
     * @param asg1
     * 			the first assignment for the confluence test
     * @param asg2
     * 			the second assignment for the confluence test
     * @return Returns true if the two assignments are confluent.
     */
    private def boolean areConfluent(AssignmentDep asg1, AssignmentDep asg2) {
    	// If both assignments assign boolean values, check them.
        if (asg1.assignment instanceof BoolValue && asg2.assignment instanceof BoolValue &&
            (asg1.assignment as BoolValue).value == (asg2.assignment as BoolValue).value
        ) return true
        // If both assignments assign integer values, check them. 
        if (asg1.assignment instanceof IntValue && asg2.assignment instanceof IntValue &&
            (asg1.assignment as IntValue).value == (asg2.assignment as IntValue).value
        ) return true
        // If both assignments assign objects, check them.
        if (asg1.assignment instanceof ValuedObjectReference && asg2.assignment instanceof ValuedObjectReference &&
            (asg1.assignment as ValuedObjectReference).valuedObject == (asg2.assignment as ValuedObjectReference).valuedObject
        ) return true

        
        false
    }
 
}