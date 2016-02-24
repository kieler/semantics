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

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.extensions.ThreadPathType
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import java.util.Set
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.scg.Guard
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsSerializeExtensions
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.processors.analyzer.PotentialInstantaneousLoopResult

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

class DepthJoinSynchronizer extends SurfaceSynchronizer {
    
    static final boolean DEBUG = false;

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
    extension SCGCoreExtensions    
    
    @Inject
    extension SCGDeclarationExtensions
    
    @Inject
    extension SCGControlFlowExtensions
    
    @Inject
    extension SCGThreadExtensions

    @Inject
    extension AnnotationsExtensions
    
    @Inject
    extension KEffectsSerializeExtensions   
    
    public var Declaration schizophrenicDeclaration = null
   
    public static val SYNCHRONIZER_ID = "de.cau.cs.kieler.scg.synchronizer.depthJoin"
    
    public static val SCHIZOPHRENIC_SUFFIX = "_s"

    // -------------------------------------------------------------------------
    // -- Synchronizer
    // -------------------------------------------------------------------------
    
       
    override String getId() {
        return SYNCHRONIZER_ID
    }
    
    override isSynchronizable(Fork fork, Iterable<ThreadPathType> threadPathTypes, boolean instantaneousFeedback) {
        var synchronizable = false

		if ((!threadPathTypes.filter[ it == ThreadPathType::DELAYED ].empty) &&
			(!threadPathTypes.filter[ it == ThreadPathType::POTENTIALLY_INSTANTANEOUS ].empty)
		) {
			synchronizable = true
		}         
        
        synchronizable
    }
    
    override protected build(Join join, Guard guard, SchedulingBlock schedulingBlock, SCGraph scg) {
        // Create a new SynchronizerData class which holds the data to return.
        var data = new SynchronizerData() => [ 
            setJoin(join)
            setGuard(guard)
        ]
        
        // Since we are working we completely enriched SCGs, we can use the SCG extensions 
        // to retrieve the scheduling block of the join node in question.
        val joinSB = join.getCachedSchedulingBlock
        
        val pilData = compilerContext.compilationResult.getAuxiliaryData(PotentialInstantaneousLoopResult).head.criticalNodes.toSet
        
        // The valued object of the GuardExpression of the synchronizer is the guard of the
        // scheduling block of the join node. 
        data.guardExpression.valuedObject = joinSB.guards.head.valuedObject

        // Create a new expression that determines if at least on thread exits in this tick instance.
        // At first this simple scheduler assumes that the fork node spawns more than one thread.
        // Hence, we create an or-operator expression. 
        val terminationExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression => 
            [ setOperator(OperatorType::LOGICAL_OR) ]
        
        data.createEmptyExpressions(terminationExpression)
        data.createGuardExpression(terminationExpression)
        data.guardExpression.expression = join.graph.fixSchizophrenicExpression(data.guardExpression.expression, pilData) 
        
//        data.fixEmptyExpressions.fixSynchronizerExpression
        
		guard.expression = data.guardExpression.expression
		for(emptyExp : data.guardExpression.emptyExpressions) {
			val newGuard = ScgFactory::eINSTANCE.createGuard
            newGuard.valuedObject = emptyExp.valuedObject
            newGuard.expression = emptyExp.expression
            scg.guards += newGuard
            
            debug("Generated NEW guard " + newGuard.valuedObject.name + " with expression " + newGuard.expression.serialize)
		}        
    }    
    
    protected def Expression fixSchizophrenicExpression(SCGraph scg, Expression expression, Set<Node> pilData) {
        if (expression instanceof ValuedObjectReference) {
            // TODO
        } else if (expression instanceof OperatorExpression) {
            // TODO: performance!
            val vors = (expression as OperatorExpression).eAllContents.filter(typeof(ValuedObjectReference))
            for(vor : vors.toIterable) {
                val originalGuard = scg.guards.filter[ it.valuedObject == vor.valuedObject ].head
                if (originalGuard != null && originalGuard.isOnCriticalPath(pilData)) {
                    
                    val guardExists = newGuards.filter[ it.valuedObject.name == originalGuard.valuedObject.name + SCHIZOPHRENIC_SUFFIX ].toList
                    if (guardExists.empty) {
                    
                        val newValuedObject = KExpressionsFactory::eINSTANCE.createValuedObject
                        newValuedObject.name = originalGuard.valuedObject.name + SCHIZOPHRENIC_SUFFIX
                    
                        val newGuard = ScgFactory::eINSTANCE.createGuard
                        newGuard.valuedObject = newValuedObject
// FIXME: Verify removal                        
//                        newGuard.schedulingBlockLink = originalGuard.schedulingBlockLink
//                        newGuard.schizophrenic = true
//                        newGuard.originalObject += originalGuard.originalObject
                        scg.guards += newGuard
                    
                        vor.valuedObject = newGuard.valuedObject 
                    
                        newGuards += newGuard
                        debug("Generated NEW _SCHIZOPHRENIC_ guard " + newGuard.valuedObject.name)
                    
                    } else {
                        vor.valuedObject = guardExists.head.valuedObject
                    }
                }
            }
        }
        
        expression
    }   
    
    def ValuedObject findValuedObjectByName(Declaration declaration, String name) {
        for(vo : declaration.valuedObjects) {
            if (vo.name == name) return vo
        }
        return null
    } 
    
    private def boolean isOnCriticalPath(Guard guard, Set<Node> pilData) {
// FIXME: FIXME!    	
//        if (guard.schedulingBlockLink == null) return false
//        for(n : guard.schedulingBlockLink.nodes) {
//            if (pilData.contains(n)) return true
//        }
        return false
    } 
    
}