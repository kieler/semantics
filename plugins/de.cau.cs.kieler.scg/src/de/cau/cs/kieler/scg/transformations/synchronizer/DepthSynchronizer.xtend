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
 package de.cau.cs.kieler.scg.transformations.synchronizer

import com.google.common.collect.ImmutableList
import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsSerializeExtensions
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Guard
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.extensions.ThreadPathType
import de.cau.cs.kieler.scg.transformations.sequentializer.EmptyExpression

import static de.cau.cs.kieler.scg.SCGAnnotations.*

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

class DepthSynchronizer extends AbstractSynchronizer {

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
    extension KExpressionsDeclarationExtensions
    
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
   
    protected val OPERATOREXPRESSION_DEPTHLIMIT = 16
    protected val OPERATOREXPRESSION_DEPTHLIMIT_SYNCHRONIZER = 8

    public static val SYNCHRONIZER_ID = "de.cau.cs.kieler.scg.synchronizer.depth"

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
        
		data.createEmptyExpressions(terminationExpression)
		data.createGuardExpression(terminationExpression)
//        data.guardExpression.expression = FALSE
        
		data.fixEmptyExpressions.fixSynchronizerExpression
		
		val emptyDeclaration = createBoolDeclaration => [
			scg.declarations += it
		]
		guard.expression = data.guardExpression.expression
		for(emptyExp : data.guardExpression.emptyExpressions) {
			val newGuard = ScgFactory::eINSTANCE.createGuard
            newGuard.valuedObject = emptyExp.valuedObject
            newGuard.expression = emptyExp.expression
            scg.guards += newGuard
            emptyDeclaration.valuedObjects += newGuard.valuedObject
            
            debug("Generated NEW guard " + newGuard.valuedObject.name + " with expression " + newGuard.expression.serialize)
		}
    }
    
    protected def SynchronizerData createEmptyExpressions(SynchronizerData data, OperatorExpression terminationExpression) {
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
	            val threadSurfaces = exit.entry.getThreadNodes.filter(typeof(Depth)).toList
	            
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
	            	while (graph.guardExists(exitSB.guards.head.valuedObject.name + '_e' + exitNodeCount)) {
	            	    exitNodeCount = exitNodeCount + 1
	            	} 
	            	 
	      			val emptyExp = new EmptyExpression()  
	      			emptyExp.valuedObject = KExpressionsFactory::eINSTANCE.createValuedObject
	      			emptyExp.valuedObject.name = exitSB.guards.head.valuedObject.name + '_e' + exitNodeCount
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
	                    threadSurfaces.forEach[subExpression.subExpressions.add(it.getCachedSchedulingBlock.guards.head.valuedObject.reference)]
		            	expression.subExpressions.add(subExpression)
	            	} else {
	            		// Otherwise, add a reference to the surface block directly.
	//                    expression.subExpressions.add(threadSurfaces.head.schedulingBlock.guard.reference)
	                    expression.subExpressions.add(threadSurfaces.head.getCachedSchedulingBlock.guards.head.valuedObject.reference)
	            	}
	            	// Add the newly created expression to the empty expression and link the thread exit object field
	            	// to the guard of the exit node. This enables further processors to identify the block responsible
	            	// for the creation of the empty expression. 
	            	emptyExp.expression = expression
	//            	emptyExp.threadExitObject = exitSB.guard
	                emptyExp.threadExitObject = exitSB.guards.head.valuedObject
	            
	            	// Subsequently, add the newly created empty expression to the list of empty expressions
	            	// in the guard expression of the synchronizer.
	            	data.guardExpression.emptyExpressions.add(emptyExp)
	           	}           
	           	
	           	// For each exit node, add the guard of the scheduling block of the exit node to the termination expression.
	           	// At least one thread must be exited in this tick to trigger the synchronizer.
	//            terminationExpr.subExpressions.add(exitSB.guard.reference)
	            terminationExpression.subExpressions.add(exitSB.guards.head.valuedObject.reference)
	        }
        }
        
        data    	
    }
    
    protected def SynchronizerData createGuardExpression(SynchronizerData data, OperatorExpression terminationExpression) {
    	/**
		 * At this point a termination expression and an empty expression for each thread have been created.
		 * Now, we have to concatenate these expressions via an and-operator expression. 
		 * As stated in the introduction of the build function, a thread must be empty or exited in this thread. 
		 * Therefore, for each thread a new expression, called thread expression, is created. 
		 * Finally, the termination expression is added since at least one thread must exit in this tick instance. 
		 */
		if (data.guardExpression.emptyExpressions.size > 0) {
    		// Create a new and-operator expression.
            val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression
            expression.setOperator(OperatorType::LOGICAL_AND)
        
            // Create thread expressions (or-operator expressions) for each thread. 
            // They include the empty expression - the thread already finished in previous ticks - 
            // and the threadExitObject - the thread just finished in this tick.
            data.guardExpression.emptyExpressions.forEach[
        	   val threadExpr = KExpressionsFactory::eINSTANCE.createOperatorExpression
        	   threadExpr.setOperator(OperatorType::LOGICAL_OR)
        	   threadExpr.subExpressions.add(it.valuedObject.reference)
        	   threadExpr.subExpressions.add(it.threadExitObject.reference)
        	   expression.subExpressions.add(threadExpr)
            ]
            // Conclusively, add the termination expression - at least one thread must exit this tick.
            if (terminationExpression.subExpressions.size == 1) {
                expression.subExpressions.add(terminationExpression.subExpressions.head)        
            } else {
                expression.subExpressions.add(terminationExpression)
            }
            data.guardExpression.expression = expression
        } else {
            // No surface found! Synchronizer exists immediately!
            data.guardExpression.expression = terminationExpression
        }
        
        data
    }
    
    protected def SynchronizerData fixEmptyExpressions(SynchronizerData data) {
    	/** Fix for too long empty expressions. */
        var ok = false
        while (!ok) {
            ok = true
            val emptyCopy = ImmutableList::copyOf(data.guardExpression.emptyExpressions)
            for(empty : emptyCopy) {
                var Expression exp = null
                if (empty.expression instanceof OperatorExpression) {
                    if ((empty.expression as OperatorExpression).getOperator == OperatorType::NOT) {
                        exp = (empty.expression as OperatorExpression).subExpressions.head
                    } else { 
                        exp = empty.expression
                    }
                }
                val encapsExp = exp
                if (encapsExp instanceof OperatorExpression) {
                    val opExp = encapsExp as OperatorExpression
                    val depth = opExp.subExpressions.size
                    if (depth > OPERATOREXPRESSION_DEPTHLIMIT) {
                        ok = false
                        val emptyExp = new EmptyExpression()  
                        emptyExp.valuedObject = KExpressionsFactory::eINSTANCE.createValuedObject
                        emptyExp.valuedObject.name = empty.valuedObject.name + "_fix"
                        data.valuedObjects.add(emptyExp.valuedObject)
                        val subExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression
                        subExpression.setOperator(OperatorType::LOGICAL_OR)
                        var gd = OPERATOREXPRESSION_DEPTHLIMIT/2
                        while (gd < depth-1) {
                            subExpression.subExpressions += opExp.subExpressions.get(OPERATOREXPRESSION_DEPTHLIMIT/2)
                            gd = gd + 1
                        }
                        emptyExp.expression = subExpression;
                        (encapsExp as OperatorExpression).subExpressions.add(emptyExp.valuedObject.reference) 
                        data.guardExpression.emptyExpressions.add(0,emptyExp)
                    }
                }
            }
        }
        
        data
    }
    
    protected def SynchronizerData fixSynchronizerExpression(SynchronizerData data) {
        /** Basically, do the same thing for the synchronizer expression. */
        var ok = false
        if (data.guardExpression.expression instanceof OperatorExpression &&
            (data.guardExpression.expression as OperatorExpression).operator == OperatorType::LOGICAL_AND
        ) {
            val sExp = data.guardExpression.expression as OperatorExpression
            var fixcnt = 0
            while(sExp.subExpressions.size > OPERATOREXPRESSION_DEPTHLIMIT_SYNCHRONIZER) {
                val eExp = new EmptyExpression()  
                eExp.valuedObject = KExpressionsFactory::eINSTANCE.createValuedObject
//                eExp.valuedObject.name = data.guardExpression.valuedObject.name + "_fix" + fixcnt
                eExp.valuedObject.name = data.guard.valuedObject.name + "_fix" + fixcnt
                data.valuedObjects.add(eExp.valuedObject)
                val subExp = KExpressionsFactory::eINSTANCE.createOperatorExpression
                subExp.setOperator(OperatorType::LOGICAL_AND)
                var gd = OPERATOREXPRESSION_DEPTHLIMIT_SYNCHRONIZER/2
                while (gd > 0) {
                    subExp.subExpressions += sExp.subExpressions.get(0)
                    gd = gd - 1
                }
                eExp.expression = subExp;
                sExp.subExpressions.add(0, eExp.valuedObject.reference)
                data.guardExpression.emptyExpressions.add(eExp)
                fixcnt = fixcnt + 1
            }
            
            if (sExp.subExpressions.last instanceof OperatorExpression) {
            	val OperatorExpression tExp = sExp.subExpressions.last as OperatorExpression            
        	    while(tExp.subExpressions.size > OPERATOREXPRESSION_DEPTHLIMIT_SYNCHRONIZER) {
    	            val eExp = new EmptyExpression()  
	                eExp.valuedObject = KExpressionsFactory::eINSTANCE.createValuedObject
//                    eExp.valuedObject.name = data.guardExpression.valuedObject.name + "_fix" + fixcnt
                    eExp.valuedObject.name = data.guard.valuedObject.name + "_fix" + fixcnt
            	    data.valuedObjects.add(eExp.valuedObject)
        	        val subExp = KExpressionsFactory::eINSTANCE.createOperatorExpression
    	            subExp.setOperator(OperatorType::LOGICAL_OR)
	                var gd = OPERATOREXPRESSION_DEPTHLIMIT_SYNCHRONIZER/2
                	while (gd > 0) {
                    	subExp.subExpressions += tExp.subExpressions.get(0)
                	    gd = gd - 1
            	    }
        	        eExp.expression = subExp;
    	            tExp.subExpressions.add(0, eExp.valuedObject.reference)
	                data.guardExpression.emptyExpressions.add(eExp)
                	fixcnt = fixcnt + 1
            	}           
            }
        }  
        
        data  	
    }
       
    override String getId() {
        return SYNCHRONIZER_ID
    }
    
    override isSynchronizable(Fork fork, Iterable<ThreadPathType> threadPathTypes, boolean instantaneousFeedback) {
        var synchronizable = true
        
        for(tpt : threadPathTypes) {
            if (tpt != ThreadPathType::DELAYED) synchronizable = false
        } 
        
        synchronizable
    }
    
    protected def boolean guardExists(SCGraph scg, String name) {
        for(g : scg.guards) {
            if (g.valuedObject.name == name) return true
        }
        return false
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