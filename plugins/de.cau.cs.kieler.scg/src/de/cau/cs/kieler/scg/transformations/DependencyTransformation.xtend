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
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.IntValue
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Dependency
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.features.SCGFeatures
import java.util.HashMap
import java.util.LinkedList
import java.util.List

import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/** 
 * This class is part of the SCG transformation chain. The chain is used to gather information 
 * about the schedulability of a given SCG. This is done in several key steps. Contrary to the first 
 * version of SCGs, there is only one SCG meta-model. In each step the gathered data will be added to 
 * the model. 
 * You can either call the transformation manually or use KiCo to perform a series of transformations.
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

class DependencyTransformation extends AbstractProductionTransformation implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    
    override getId() {
        return SCGTransformations::DEPENDENCY_ID
    }

    override getName() {
        return SCGTransformations::DEPENDENCY_ID
    }

    override getProducedFeatureId() {
        return SCGFeatures::DEPENDENCY_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::BASIC_ID)
    }
    
    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
       
    @Inject
    extension SCGControlFlowExtensions
    
    @Inject
    extension SCGThreadExtensions
    
    @Inject
    extension KExpressionsExtension
    
    @Inject
    extension AnnotationsExtensions    


    // -------------------------------------------------------------------------
    // -- Globals 
    // -------------------------------------------------------------------------
        
    /** 
     * threadNodeCache caches the entry nodes a specific node belongs to w.r.t. hierarchy
     * The entry node list is mainly used to speed up the efficiency of concurrency tests.
     * In the same manner, ancestorForkCache stores information about ancestor fork nodes.
     */
    protected val threadNodeCache = new HashMap<Node, List<Entry>>    
    protected val ancestorForkCache = new HashMap<Node, List<Fork>>
    
    /**
     * relativeWriterCache caches if a specific writer (meaning an assignment) is a relative writer or 
     * not.
     */
    protected val relativeWriterCache = new HashMap<Assignment, Boolean>
    
    /**
     * valuedObjectCache stores all distinct valued objects and a list of nodes that are using them.
     */
    protected val valuedObjectCache = new HashMap<ValuedObject, List<Node>> 
    
    protected var dependencyCounter = 0
    protected var concurrentDependencyCounter = 0
    
    private static val SKIPIDENTICALDEPENDENCIES = true
    
    
    // -------------------------------------------------------------------------
    // -- Transformation method
    // -------------------------------------------------------------------------
	
    /**
     * transformSCGToSCGDEP executes the transformation from a standard SCG to 
     * an SCG with dependency information.
     * 
     * @param scg 
     * 			the originating source scg
     * @return Returns a copy of the scg enriched with dependency information.
     */   
    def SCGraph transform(SCGraph scg) {
        // KiCo does this check via feature isContained
        //if (scg.hasAnnotation(AbstractSequentializer::ANNOTATION_SEQUENTIALIZED)
        //    || scg.hasAnnotation(DependencyTransformation::ANNOTATION_DEPENDENCYRANSFORMATION)
        //) {
        //    return scg
        //}
        
        // Since KiCo may use the transformation instance several times, we must clear the caches manually. 
        threadNodeCache.clear
        relativeWriterCache.clear
        ancestorForkCache.clear
        valuedObjectCache.clear
        dependencyCounter = 0
        concurrentDependencyCounter = 0
        
        
        // Timestamp for performance information. Should be moved to the KiCo interface globally.
        val timestamp = System.currentTimeMillis
        
        // Generate a data basis for the subsequent analysis. 
        val allAssignments = scg.nodes.filter(typeof(Assignment))  
        val assignments = allAssignments.filter[ valuedObject != null || assignment instanceof FunctionCall ].toList //.immutableCopy
        val conditionals = scg.nodes.filter(typeof(Conditional)).filter[ condition != null ].toList //.immutableCopy
        var time = (System.currentTimeMillis - timestamp) as float
        System.out.println("Preparation for dependency: Nodes (time elapsed: "+(time / 1000)+"s).")  

        // Generate cache for relative writers.
        assignments.forEach[ 
            relativeWriterCache.put(it, it.isRelativeWriter)
        ]
        time = (System.currentTimeMillis - timestamp) as float
        System.out.println("Preparation for dependency: Relative writer (time elapsed: "+(time / 1000)+"s).")  
        
        // Generate thread node cache. 
        // ThreadNodeMap contains all entry nodes with the nodes in their thread.
        // Therefore, we travel through the nodes of each entry node and if its an assignment or a conditional
        // we add the node to the thread node cache. 
        val threadNodeMap = getAllThreadNodes(scg.nodes.head as Entry)
        val rootEntryNode = scg.nodes.head as Entry
        for(entry : threadNodeMap.keySet) { 
            // If the entry node has incoming flows, it also has a fork node.
        	var Fork fork = null
        	if (entry.incoming.size>0) fork = (entry.incoming.filter(ControlFlow).head.eContainer as Fork)
        	val finalFork = fork
        	threadNodeMap.get(entry).forEach[ node |
        		if ((node instanceof Assignment) || (node instanceof Conditional)) {
            	    if (!threadNodeCache.containsKey(node)) {
            	        val entryNodes = new LinkedList<Entry>();
            	        entryNodes.add(entry);
                        threadNodeCache.put(node, entryNodes);
                    } else {
                        val entryNodes = threadNodeCache.get(node);
                        entryNodes.add(entry);
                    }
                    
                    // If present, add the fork to the ancestor fork cache in the same step.
                    if (finalFork != null) {
                    	val ancestorForks = ancestorForkCache.get(node)
                    	if (ancestorForks == null) {
                    		ancestorForkCache.put(node, <Fork> newArrayList(finalFork))
                    	} else {
  							if (!ancestorForks.contains(finalFork)) {
  								ancestorForks.add(finalFork)
  							}                   	
                    	}
                   	}
	           	}
        	]
        }
        
        // Generate the valued object cache for assignments.
        assignments.forEach[ assignment |
        	val references = assignment.assignment.eAllContents.filter(typeof(ValuedObjectReference)).toList
        	if (assignment.assignment instanceof ValuedObjectReference) {
        	    references += assignment.assignment as ValuedObjectReference
       	    }
        	val valuedObjects = <ValuedObject> newArrayList => [ v | 
        	    references.forEach[ v += it.valuedObject ]; 
        	    v += assignment.valuedObject
        	]
        	valuedObjects.forEach[ vo | 
        		val cache = valuedObjectCache.get(vo)
        		if (cache == null) {
        			valuedObjectCache.put(vo, <Node> newArrayList(assignment))
        		} else {
        			cache += assignment	
        		}
        	] 
        	// If there is no ancestor fork information for this node, insert an empty list.
        	if (ancestorForkCache.get(assignment) == null) {
        	    ancestorForkCache.put(assignment, <Fork> newArrayList())
        	}
        ]
        time = (System.currentTimeMillis - timestamp) as float
        System.out.println("Preparation for dependency: assignment VO cache (time elapsed: "+(time / 1000)+"s).")  

        // Generate the valued object cache for conditionals.
        conditionals.forEach[ conditional |
        	val references = conditional.condition.eAllContents.filter(typeof(ValuedObjectReference)).toList
        	if (conditional.condition instanceof ValuedObjectReference) {
        	    references += conditional.condition as ValuedObjectReference
      	    }
        	val valuedObjects = <ValuedObject> newArrayList => [ v | 
        	    references.forEach[ v += it.valuedObject ]
        	]
        	valuedObjects.forEach[ vo | 
        		val vocl = valuedObjectCache.get(vo)
        		if (vocl == null) {
        			valuedObjectCache.put(vo, <Node> newArrayList(conditional))
        		} else {
        			vocl += conditional	
        		}
        	] 
            // If there is no ancestor fork information for this node, insert an empty list.
            if (ancestorForkCache.get(conditional) == null) {
                ancestorForkCache.put(conditional, <Fork> newArrayList())
            }
        ]
        time = (System.currentTimeMillis - timestamp) as float
        System.out.println("Preparation for dependency: conditional VO cache (time elapsed: "+(time / 1000)+"s).")  
        
        val VOCacheSize = valuedObjectCache.keySet.size

        time = (System.currentTimeMillis - timestamp) as float
        System.out.println("Preparation for dependency analysis finished (time elapsed: "+(time / 1000)+"s) "
        	+"(assignments: "+assignments.size+", conditionals: "+conditionals.size+", VO cache: "+VOCacheSize+").")  
        

        // Perform dependency analysis on the nodes of the filtered valued objects. 
        var i = 0
        for(vo : valuedObjectCache.keySet) {
        	val nodeList = valuedObjectCache.get(vo)
        	val assignmentList = nodeList.filter(typeof(Assignment)).toList
        	val conditionalList = nodeList.filter(typeof(Conditional)).toList
        	for (assignment : assignmentList) {
	        	assignment.createDependencies(assignmentList, conditionalList, scg) 
        	}
        	
        	// Console activity output. Should be moved to KiCo in a more generic way. 
        	i = i + 1
        	if (i % 100 == 0) System.out.print("o")
      	 }
      	 System.out.println("o")

        scg.addAnnotation(SCGFeatures.DEPENDENCY_ID, SCGFeatures.DEPENDENCY_NAME)   

        time = (System.currentTimeMillis - timestamp) as float
        System.out.println("Dependency analysis finished (overall time elapsed: "+(time / 1000)+"s).")  
        System.out.println("Dependencies: " + dependencyCounter + " (concurrent: " + concurrentDependencyCounter + ")")
        
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
                    if (assignment.areConcurrent(node)) dependency.concurrent = true
                    if (assignment.areConfluent(node)) dependency.confluent = true
                    dependency.target = node;
                    dependency.trace(node);
                    if (SKIPIDENTICALDEPENDENCIES && !assignment.dependencies.dependencyExists(dependency)) {
                        assignment.dependencies.add(dependency);
                        dependency.trace(assignment);
                        dependencyCounter = dependencyCounter + 1
                        if (dependency.concurrent) concurrentDependencyCounter = concurrentDependencyCounter + 1
                    } else {
                        dependency.target = null
                        dependency.remove
                    }
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
                if (assignment.areConcurrent(node)) dependency.concurrent = true
                dependency.target = node;
                dependency.trace(node);
                if (SKIPIDENTICALDEPENDENCIES && !assignment.dependencies.dependencyExists(dependency)) {
                    assignment.dependencies.add(dependency);
                    dependency.trace(assignment);
                    dependencyCounter = dependencyCounter + 1
                    if (dependency.concurrent) concurrentDependencyCounter = concurrentDependencyCounter + 1
                } else {
                    dependency.target = null
                    dependency.remove
                }
            }
        ]
        
        assignment
    }
    
    private def boolean dependencyExists(List<Dependency> dependencies, Dependency dependency) {
        for(d : dependencies) {
            if (
                d.class == dependency.class &&
                d.target == dependency.target &&
                d.concurrent == dependency.concurrent &&
                d.confluent == dependency.confluent
            ) {
                return true
            }            
        }
        return false
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
                val threadEntries = node.getAllNext.map[ target ]
                for(t : threadEntries) {
                	val t1Nodes = threadNodeCache.get(node1)
                	val t2Nodes = threadNodeCache.get(node2)
                    if (t instanceof Entry 
                        && t1Nodes.contains(t as Entry)
                        && t2Nodes.contains(t as Entry)
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