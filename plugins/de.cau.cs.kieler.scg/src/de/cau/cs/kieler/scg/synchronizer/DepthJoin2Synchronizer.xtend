/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.scg.synchronizer

import com.google.common.collect.ImmutableList
import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsReplacementExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsSerializeExtensions
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Guard
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.extensions.ThreadPathType
import de.cau.cs.kieler.scg.sequentializer.EmptyExpression

/** 
 * This class is part of the SCG transformation chain. In particular a synchronizer is called by the scheduler
 * whenever multiple threads join again. <br>
 * The chain is used to gather important information 
 * about the schedulability of a given SCG. This is done in several key steps. Between two steps the results 
 * are cached in specifically designed metamodels for further processing. At the end of the transformation
 * chain a newly generated (and sequentialized) SCG is returned. <br>
 * You can either call the transformations manually or use the SCG transformation extensions to enrich the
 * SCGs with the desired information.<br>
 * <pre>
 * SCG 
 *   |-- Dependency Analysis 	 					
 *   |-- Basic Block Analysis
 *   |-- Scheduler
 *   |    |-- Graph analyses
 *   |    |-- Scheduling
 *   |    |   |-- Synchonize threads			<== YOU ARE HERE
 *   |    |-- Optimization
 *   |-- Sequentialization (new SCG)
 *       |-- Optimization					
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2013-11-28 proposed 
 * @kieler.rating 2013-11-28 proposed yellow
 * 
 * @extends AbstractSCGSynchronizer
 */

class DepthJoin2Synchronizer extends SurfaceSynchronizer {

    static final boolean DEBUG = true;

    def static void debug(String debugText) {
        debug(debugText, true);
    }

    def static void debug(String debugText, boolean lineBreak) {
        if (DEBUG) {
            if (lineBreak) {
                System.out.println(debugText);
            } else {
                System.out.print(debugText);
            }
        }
    }
     
    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    
    @Inject
    extension KExpressionsValuedObjectExtensions
    
    @Inject
    extension SCGCoreExtensions
    
    @Inject
    extension SCGControlFlowExtensions
    
    @Inject
    extension SCGThreadExtensions

    @Inject
    extension AnnotationsExtensions
    
    @Inject
    extension KEffectsSerializeExtensions
    
    @Inject
    extension KExpressionsReplacementExtensions
   
    protected val OPERATOREXPRESSION_DEPTHLIMIT = 16
    protected val OPERATOREXPRESSION_DEPTHLIMIT_SYNCHRONIZER = 8

    public static val SYNCHRONIZER_ID = "de.cau.cs.kieler.scg.synchronizer.depthJoin2"

    // -------------------------------------------------------------------------
    // -- Synchronizer
    // -------------------------------------------------------------------------
    /**
     * In general (according to the Esterel v5 primer) a synchronizer is active if
     * all threads are exited or already finished in this tick AND if at least one 
     * thread reached its end in this tick.<br>
	 * The <em>surface synchronizer</em> looks for surface blocks in the threads and uses them
	 * to determine active threads. Any thread currently residing in a surface node
	 * is not finished and consumes time. This is used to build the empty flags of 
	 * the synchronizer.<br>
	 * To build the expression for the thread termination it is sufficient to check the
	 * activity state of the basic block which comprises the exit node of the tread.<br>
	 * To implement the actual synchronizer we must override the build method.<br>
	 * 
	 * @param join
	 * 			the join node in question
	 * @return
	 * 		Returns a {@code SynchronizerData} class including all mandatory data for the scheduler.
	 */  
    override protected build(Join join, Guard guard, SchedulingBlock schedulingBlock, SCGraph scg) {
    	// Create a new SynchronizerData class which holds the data to return.
        var data = new SynchronizerData() => [ 
            setJoin(join)
            setGuard(guard)
        ]
		// Since we are working we completely enriched SCGs, we can use the SCG extensions 
		// to retrieve the scheduling block of the join node in question.
		val joinSB = join.getCachedSchedulingBlock
        
        // The valued object of the GuardExpression of the synchronizer is the guard of the
        // scheduling block of the join node. 
//        data.guardExpression.valuedObject = joinSB.guard.valuedObject

		// Create a new expression that determines if at least on thread exits in this tick instance.
		// At first this simple scheduler assumes that the fork node spawns more than one thread.
		// Hence, we create an or-operator expression. 
        val terminationExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression => 
        	[ setOperator(OperatorType::LOGICAL_OR) ]
        
		data.createEmptyExpressions(terminationExpression, join.fork)
		for (emptyExpression : data.guardExpression.emptyExpressions) {
			emptyExpression.expression = unfoldExp(emptyExpression.expression, join.fork.cachedSchedulingBlock.guard, scg)
			System.err.println(emptyExpression.expression.serialize)
		}
		data.createGuardExpression(terminationExpression)
//        data.guardExpression.expression = FALSE
        
//		data.fixEmptyExpressions.fixSynchronizerExpression
		guard.expression = data.guardExpression.expression
		for(emptyExp : data.guardExpression.emptyExpressions) {
			val newGuard = ScgFactory::eINSTANCE.createGuard
            newGuard.valuedObject = emptyExp.valuedObject
            newGuard.expression = emptyExp.expression
            scg.guards += newGuard
            
            debug("Generated NEW guard " + newGuard.valuedObject.name + " with expression " + newGuard.expression.serialize)
		}
    }
    
    private def Expression unfoldExp(Expression exp, Guard upperBound, SCGraph scg) {
		if (exp instanceof OperatorExpression) {
			if (exp.operator == OperatorType::PRE) {
				// Copy PRE
				val preExp = KExpressionsFactory::eINSTANCE.createOperatorExpression
				preExp.operator = OperatorType::PRE
				val subExpValObj = (exp.subExpressions.head as ValuedObjectReference).valuedObject
				val newVOR = KExpressionsFactory::eINSTANCE.createValuedObjectReference
				newVOR.valuedObject = subExpValObj
				preExp.subExpressions.add(newVOR)
				return preExp
			}

			// Create a new, unfolded expression
			val newExp = KExpressionsFactory::eINSTANCE.createOperatorExpression
			newExp.operator = exp.operator
			if (exp.subExpressions.size > 1) {
				exp.subExpressions.forEach[newExp.subExpressions.add(it.unfoldExp(upperBound, scg))]
			} else {
				newExp.subExpressions.add(exp.subExpressions.head.unfoldExp(upperBound, scg))
			}
			return optimize(newExp)

		} else if (exp instanceof ValuedObjectReference) {
			val newVOR = KExpressionsFactory::eINSTANCE.createValuedObjectReference

			// If it is the upper bound or a _cond, return a copy
			if (exp.valuedObject == upperBound.valuedObject) {
				val replacingValObjRef = KExpressionsFactory::eINSTANCE.createValuedObjectReference
				val replacingValObj = KExpressionsFactory::eINSTANCE.createValuedObject
				replacingValObj.name = "false"
				replacingValObjRef.valuedObject = replacingValObj
				return replacingValObjRef
			}
			if (exp.valuedObject.name.startsWith("_cond")) {
				newVOR.valuedObject = exp.valuedObject
				return newVOR
			}

			// Get the guard expression and unfold it
			val guardExp = scg.guards.filter[it.valuedObject.name == exp.valuedObject.name].head.expression
			if (guardExp == null) {
				newVOR.valuedObject = exp.valuedObject
				return newVOR
			} else {
				return unfoldExp(guardExp, upperBound, scg)
			}
		}
	}

	def Expression optimize(OperatorExpression newExp) {
		if (newExp.operator == OperatorType::LOGICAL_OR) {
			newExp.subExpressions.removeAll(newExp.subExpressions.filter [
				(it instanceof ValuedObjectReference && (it as ValuedObjectReference).valuedObject.name == "false")
			])
			return newExp
		} else if (newExp.operator == OperatorType::LOGICAL_AND) {
			if (!newExp.subExpressions.filter [
				(it instanceof ValuedObjectReference && (it as ValuedObjectReference).valuedObject.name == "false")
			].isEmpty) {
				val replacerVO = KExpressionsFactory::eINSTANCE.createValuedObject
				replacerVO.name = "false"
				val replacerVOR = KExpressionsFactory::eINSTANCE.createValuedObjectReference
				replacerVOR.valuedObject = replacerVO
				return replacerVOR
			}
		}
		return newExp
	}
    
    protected def SynchronizerData createEmptyExpressions(SynchronizerData data, OperatorExpression terminationExpression, Fork fork) {
        // Count the exit nodes. The counter is used for enumerating the empty expressions.        
        var exitNodeCount = 0
        
        val threadPathTypes = <Exit, ThreadPathType> newHashMap;
        
        var delayFound = false
        for(entry:data.join.getEntryNodes) {
            val t = entry.getStringAnnotationValue(ANNOTATION_CONTROLFLOWTHREADPATHTYPE).fromString2 
            threadPathTypes.put(entry.exit, t)
            if (t != ThreadPathType::INSTANTANEOUS) {
                delayFound = true
            }
        }
        
		// Create a new list for all exit nodes of the threads of the fork-join-combination...
        val exitNodes = <Exit> newLinkedList
        // ... and fill the list with the exit nodes of all threads.
        data.join.allPrevious.forEach[ exitNodes.add(it.eContainer as Exit) ]        
        
        // Build an empty expression for each exit node.
        for(exit:exitNodes){
            
            if ((!exit.entry.hasAnnotation(ANNOTATION_IGNORETHREAD)) &&
                ((!delayFound || threadPathTypes.get(exit) != ThreadPathType::INSTANTANEOUS))) {
	            
	        	// Increment the exit node counter and retrieve the scheduling block of the exit node.
	        	exitNodeCount = exitNodeCount + 1
	            val exitSB = exit.getCachedSchedulingBlock
	            // This scheduling block is a predecessor of the join node. Add it to the data structure.
	            data.predecessors.add(exitSB)
	            
	            // Now, retrieve all surfaces of the actual thread.
	            val threadSurfaces = exit.entry.getThreadNodes.filter(typeof(Surface)).toList
	            
	            // If there are surface, build an empty expression.
	            if (threadSurfaces.size>0) {
	            	/**
	            	 * To build an empty expression we use the Scgsched factory and create a new object.
	            	 * As name of the valued object of the expression, we use the name of the guard and
	            	 * add a human-readable suffix for the empty expression. The type is boolean.<br>
	            	 * It is important to add the new valued object to the list of valued objects in the
	            	 * SynchronizerData structure since the object has to be added to the list of 
	            	 * valued objects in the SCG. 
	            	 */
	            	 val graph = data.join.graph
	            	while (graph.guardExists(exitSB.guard.valuedObject.name + '_e' + exitNodeCount)) {
	            	    exitNodeCount = exitNodeCount + 1
	            	} 
	            	 
	      			val emptyExp = new EmptyExpression()  
	      			emptyExp.valuedObject = KExpressionsFactory::eINSTANCE.createValuedObject
	      			emptyExp.valuedObject.name = exitSB.guard.valuedObject.name + '_e' + exitNodeCount
	//      			emptyExp.valuedObject.type = ValueType::BOOL
	      			data.valuedObjects.add(emptyExp.valuedObject)
	
					/**
					 * In the surface synchronizer a thread is called empty if none of its surface is active
					 * in this tick instance. Therefore, create a new not-operator expression and add 
					 * all surface to an included or-operator expression.   
					 */
	            	val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression
	            	expression.setOperator(OperatorType::NOT)
	            	// Add an or-operatr expression if there are more than one surfaces.
	            	if (threadSurfaces.size>1) {
		            	val subExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression
	    	        	subExpression.setOperator(OperatorType::LOGICAL_OR)
	//        	    	threadSurfaces.forEach[subExpression.subExpressions.add(it.schedulingBlock.guard.reference)]
	                    threadSurfaces.forEach[subExpression.subExpressions.add(it.getCachedSchedulingBlock.guard.valuedObject.reference)
	                    	System.err.println(it.cachedSchedulingBlock.guard.expression.serialize)
	                    ]
		            	expression.subExpressions.add(subExpression)
	            	} else {
	            		// Otherwise, add a reference to the surface block directly.
	//                    expression.subExpressions.add(threadSurfaces.head.schedulingBlock.guard.reference)
	                    expression.subExpressions.add(threadSurfaces.head.getCachedSchedulingBlock.guard.valuedObject.reference)
	            	}
	            	// Add the newly created expression to the empty expression and link the thread exit object field
	            	// to the guard of the exit node. This enables further processors to identify the block responsible
	            	// for the creation of the empty expression. 
	            	emptyExp.expression = expression
	//            	emptyExp.threadExitObject = exitSB.guard
	                emptyExp.threadExitObject = exitSB.guard.valuedObject
	            
	            	// Subsequently, add the newly created empty expression to the list of empty expressions
	            	// in the guard expression of the synchronizer.
	            	data.guardExpression.emptyExpressions.add(emptyExp)
	           	}           
	           	
	           	// For each exit node, add the guard of the scheduling block of the exit node to the termination expression.
	           	// At least one thread must be exited in this tick to trigger the synchronizer.
	//            terminationExpr.subExpressions.add(exitSB.guard.reference)
	            terminationExpression.subExpressions.add(exitSB.guard.valuedObject.reference)
	        }
        }
        
        data    	
    }
    
    
       
    override String getId() {
        return SYNCHRONIZER_ID
    }
    
    override isSynchronizable(Fork fork, Iterable<ThreadPathType> threadPathTypes, boolean instantaneousFeedback) {
        System.err.println(threadPathTypes.filter[it == ThreadPathType::DELAYED].isEmpty)
        return !(threadPathTypes.filter[it == ThreadPathType::DELAYED].isEmpty)
        
    }
    
    
    
//    override getExcludedPredecessors(Join join, Map<Node, SchedulingBlock> schedulingBlockCache, 
//    	List<AbstractKielerCompilerAncillaryData> ancillaryData) {
//        val excludeSet = <Predecessor> newHashSet
//
//        val predecessors = schedulingBlockCache.get(join).basicBlock.predecessors.toSet
//        
//        var delayFound = false
//        for(entry:join.getEntryNodes) {
//            val t = entry.getStringAnnotationValue(ANNOTATION_CONTROLFLOWTHREADPATHTYPE).fromString2 
//            if (t != ThreadPathType::INSTANTANEOUS) {
//                delayFound = true
//            } else {
//                excludeSet += predecessors.filter[ it.basicBlock == schedulingBlockCache.get(entry.exit).basicBlock ]
//            }
//        }
//       
//        if (!delayFound) { 
//            excludeSet.clear
//        }
//        return excludeSet
//    }
//    
//	override getAdditionalPredecessors(Join join, Map<Node, SchedulingBlock> schedulingBlockCache, List<AbstractKielerCompilerAncillaryData> ancillaryData) {
//		<Predecessor> newHashSet
//	}    
    
}