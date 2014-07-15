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
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.core.model.transformations.AbstractModelTransformation
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGExtensions
import de.cau.cs.kieler.scg.Dependency
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.ScgFactory

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
    
    @Inject
    extension KExpressionsExtension
    
    private val threadNodeList = new HashMap<Node, List<Entry>>
    private val ancestorForkCache = new HashMap<Node, List<Fork>>
    private val relativeWriterCache = new HashMap<Assignment, Boolean>
    
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
    def SCGraph transformSCGToSCGDEP(SCGraph scg) {
        // Finally, add all dependencies. Therefore, search all assignmentdep nodes and create their 
        // dependency information. The data is automatically stored in the SCG by the createDependencies
        // function.
        threadNodeList.clear
        relativeWriterCache.clear
        ancestorForkCache.clear
        
        val timestamp = System.currentTimeMillis
        val allAssignments = scg.nodes.filter(typeof(Assignment))  
        val assignments = allAssignments.filter[ valuedObject != null || assignment instanceof FunctionCall ].toList.immutableCopy
        val conditionals = scg.nodes.filter(typeof(Conditional)).filter[ condition != null ].toList.immutableCopy

        assignments.forEach[ 
            relativeWriterCache.put(it, it.isRelativeWriter)
        ]
        
        scg.nodes.filter(typeof(Entry)).forEach[ entry |
        	entry.getThreadNodes.forEach[ node |
        		if ((node instanceof Assignment) || (node instanceof Conditional)) {
            	    if (!threadNodeList.containsKey(node)) {
            	        var entryNodes = new LinkedList<Entry>();
            	        entryNodes.add(entry);
                        threadNodeList.put(node, entryNodes);
                    } else {
                        var entryNodes = threadNodeList.get(node);
                        entryNodes.add(entry);
                        threadNodeList.put(node, entryNodes);
                    }
	           	}
        	]
        ]
        
        var time = (System.currentTimeMillis - timestamp) as float
        System.out.println("Preparation for dependency analysis finished (time elapsed: "+(time / 1000)+"s).")  
        
        for(node : assignments) {
        	 node.createDependencies(assignments, conditionals, scg) 
      	 }

        time = (System.currentTimeMillis - timestamp) as float
        System.out.println("Dependency analysis finished (overall time elapsed: "+(time / 1000)+"s).")  
        
        // Return the SCG with dependency data.
        scg
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
    private def Assignment createDependencies(Assignment assignment, 
        List<Assignment> assignments,
        List<Conditional> conditionals,
        SCGraph scg
    ) {
        // Cache own absolute/relative state.
        val iAmAbsoluteWriter = !relativeWriterCache.get(assignment)
        
        // Filter all other assignments.
        assignments.forEach[ node |
            if (node != assignment) {
                var Dependency dependency = null
                // If they write to the same variable...
                if (node.isSameScalar(assignment)) {
                    // Check absolute / relative writes and add the corresponding dependency.
                    // The Scgdep factory is used to create the appropriate depenency.
                    val isRelW = relativeWriterCache.get(node)
                    if (iAmAbsoluteWriter && isRelW) {
                        dependency = ScgFactory::eINSTANCE.createAbsoluteWrite_RelativeWrite                        
                    } else 
                    if (iAmAbsoluteWriter && !isRelW) {
                        dependency = ScgFactory::eINSTANCE.createWrite_Write       
                    }
                } else
                // Otherwise, check if the assignment reads the variable and add the dependency
                // if necessary.
                if (node.isReader(assignment)) {
                    if (iAmAbsoluteWriter) dependency = ScgFactory::eINSTANCE.createAbsoluteWrite_Read
                    else dependency = ScgFactory::eINSTANCE.createRelativeWrite_Read    
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
        conditionals.forEach[ node |
            var Dependency dependency = null
            if (node.isReader(assignment)) {
                if (iAmAbsoluteWriter) dependency = ScgFactory::eINSTANCE.createAbsoluteWrite_Read
                else dependency = ScgFactory::eINSTANCE.createRelativeWrite_Read    
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
    private def boolean isRelativeWriter(Assignment assignment) {
    	// Returns true if the assignment in the assignment node is an OperatorExpression
    	// and accesses the same ValuedObject as the assignment is writing to.
    	if (assignment instanceof FunctionCall) return false
    	
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
    private def boolean isReader(Expression expression, Assignment asg2) {
        if (expression instanceof ValuedObjectReference) {
            return isSameScalar((expression as ValuedObjectReference), asg2)
        } else {
            return expression.eAllContents.filter(typeof(ValuedObjectReference)).toList.
               filter[ isSameScalar(it, asg2) ].size > 0
        }
    }
    
    private def boolean isReader(Assignment asg1, Assignment asg2) {
    	// Returns true if the ValuedObject is referenced directly in the expression or
    	// if the object is part of a more complex expression.
    	if (asg1.assignment == null || asg2.assignment == null) return false
    	if (asg1.assignment instanceof FunctionCall) {
    	    for(par : (asg1.assignment as FunctionCall).parameters) {
    	        if (par.expression.isReader(asg2)) return true
    	    }
    	    return false    
    	} else {
    	    (asg1.assignment as Expression).isReader(asg2)
        }
    }
        
    private def boolean isReader(Conditional cond, Assignment asg2) {
    	// Returns true if the ValuedObject is referenced directly in the expression or
    	// if the object is part of a more complex expression.
        if (asg2.assignment == null) return false
        if (cond.condition instanceof FunctionCall) {
            for(par : (cond.condition as FunctionCall).parameters) {
                if (par.expression.isReader(asg2)) return true
            }
            return false    
        } else {
            (cond.condition as Expression).isReader(asg2)
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
        var node1AF = node1.getCachedAncestorForks
        var node2AF = node2.getCachedAncestorForks
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
                        && threadNodeList.get(node1).contains((t.target as Entry))
                        && threadNodeList.get(node2).contains((t.target as Entry))
                    ) isConcurrent = false 
                }
                // If they are in separate threads, return true.
                if (isConcurrent) return true
            }
        }
        return false
    }
    
    private def List<Fork> getCachedAncestorForks(Node node) {
    	var af = ancestorForkCache.get(node)
    	if (af == null) {
    		af = node.getAncestorForks
    		ancestorForkCache.put(node, af)
    	}
    	return af
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
    private def boolean areConfluent(Assignment asg1, Assignment asg2) {
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
    
    private def boolean isSameScalar(Assignment asg1, Assignment asg2) {
        if (asg1.assignment instanceof FunctionCall && !(asg2.assignment instanceof FunctionCall)) {
            return asg2.isSameScalar(asg1)
        }
        
        if (asg2.assignment instanceof FunctionCall) {
            for(par : (asg2.assignment as FunctionCall).parameters) {
                if (par.callByReference) {
                    val refs = par.expression.getAllReferences
                    for(ref : refs) {
                        if (ref.isSameScalar(asg1)) return true
                    }
                }
            }   
            return false 
        }        
        
    	if (asg1.valuedObject != asg2.valuedObject) return false
    	else if (!asg1.indices.nullOrEmpty && !asg2.indices.nullOrEmpty && asg1.indices.size == asg2.indices.size) {
    		var i = 0
    		for(idx1 : asg1.indices) {
    			val idx2 = asg2.indices.get(i)
    			
    			if (idx1 instanceof IntValue && idx2 instanceof IntValue && (idx1 as IntValue).value != (idx2 as IntValue).value) 
    				return false
    			
    			i = i + 1
    		}
    	}
    	true
    }
    
    private def boolean isSameScalar(ValuedObjectReference vor1, Assignment asg2) {
        if (asg2.assignment instanceof FunctionCall) {
            for(par : (asg2.assignment as FunctionCall).parameters) {
                val refs = par.expression.getAllReferences
                for(ref : refs) {
                    if (vor1.isSameScalar(ref)) return true
                }
            }   
            return false 
        }
        
    	if (vor1.valuedObject != asg2.valuedObject) return false
    	else if (!vor1.indices.nullOrEmpty && !asg2.indices.nullOrEmpty && vor1.indices.size == asg2.indices.size) {
    		var i = 0
    		for(idx1 : vor1.indices) {
    			val idx2 = asg2.indices.get(i)
    			
    			if (idx1 instanceof IntValue && idx2 instanceof IntValue && (idx1 as IntValue).value != (idx2 as IntValue).value) 
    				return false
    			
    			i = i + 1
    		}
    	}
    	true
    }
    
    private def boolean isSameScalar(ValuedObjectReference vor1, ValuedObjectReference vor2) {
        if (vor1.valuedObject != vor2.valuedObject) return false
        else if (!vor1.indices.nullOrEmpty && !vor2.indices.nullOrEmpty && vor1.indices.size == vor2.indices.size) {
            var i = 0
            for(idx1 : vor1.indices) {
                val idx2 = vor2.indices.get(i)
                
                if (idx1 instanceof IntValue && idx2 instanceof IntValue && (idx1 as IntValue).value != (idx2 as IntValue).value) 
                    return false
                
                i = i + 1
            }
        }
        true
    }    
 
}