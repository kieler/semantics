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
package de.cau.cs.kieler.scg.guardCreation

import com.google.inject.Guice
import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsSerializeExtension
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.BranchType
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Guard
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Predecessor
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.analyzer.PotentialInstantaneousLoopAnalyzer
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.scg.extensions.UnsupportedSCGException
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.optimizer.CopyPropagation
import de.cau.cs.kieler.scg.sequentializer.AbstractSequentializer
import de.cau.cs.kieler.scg.synchronizer.SynchronizerSelector
import de.cau.cs.kieler.scg.transformations.SCGTransformations
import java.util.HashMap
import java.util.List

import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*

/** 
 * This class is part of the SCG transformation chain. The chain is used to gather information 
 * about the schedulability of a given SCG. This is done in several key steps. Contrary to the first 
 * version of SCGs, there is only one SCG meta-model. In each step the gathered data will be added to 
 * the model. 
 * You can either call the transformation manually or use KiCo to perform a series of transformations.
 * <pre>
 * SCG 
 *   |-- Dependency Analysis 	 					
 *   |-- Basic Block Analysis				
 *   |-- Scheduler
 *   |-- Sequentialization (new SCG)	<== YOU ARE HERE
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2013-12-05 proposed 
 * @kieler.rating 2013-12-05 proposed yellow
 */
class GuardCreator extends AbstractGuardCreator {
    
        
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    
    override getId() {
        return SCGTransformations::GUARD_ID
    }

    override getName() {
        return SCGTransformations::GUARD_NAME
    }

    override getExpandsFeatureId() {
        return SCGFeatures::BASICBLOCK_ID
    }

    override getProducesFeatureIds() {
        return newHashSet(SCGFeatures::GUARD_ID)
    }

    override getNotHandlesFeatureIds() {
        return newHashSet()
    }

    //-------------------------------------------------------------------------


    //TODO Fix this shitty logging stuff
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
    extension KExpressionsExtension

    @Inject
    extension AnnotationsExtensions

    @Inject
    extension SynchronizerSelector

    @Inject
    extension KExpressionsSerializeExtension

    // -------------------------------------------------------------------------
    // -- Globals
    // -------------------------------------------------------------------------
    protected val schedulingBlocks = <SchedulingBlock>newArrayList
    protected val schedulingBlockCache = new HashMap<Node, SchedulingBlock>
    protected val schedulingBlockGuardCache = <Guard, SchedulingBlock>newHashMap
    protected var KielerCompilerContext compilerContext

    /** Caching for predecessors */
    protected val predecessorTwinCache = <Predecessor, Predecessor>newHashMap
    protected val predecessorBBCache = <BasicBlock, List<Predecessor>>newHashMap
    protected val predecessorSBCache = <Predecessor, List<SchedulingBlock>>newHashMap
    protected val predecessorTwinMark = <SchedulingBlock>newHashSet

    /*    public static val SCHIZOPHRENIC_SUFFIX = "_s"
    protected val schizophrenicGuards = <ValuedObject> newHashSet
    protected var schizophrenicGuardCounter = 0
    protected var Declaration schizoDeclaration = null
    protected var Set<Node> pilData = null
    protected var SynchronizerData joinData = null
    
    protected val newSchizoGuards = <Guard> newHashSet*/
    protected val conditionalGuards = <Conditional, Guard>newHashMap

    // -------------------------------------------------------------------------
    // -- Guard Creator
    // -------------------------------------------------------------------------    
    override SCGraph createGuards(SCGraph scg, KielerCompilerContext context) {
        // KiCo does this check via feature isContained
        //if (scg.hasAnnotation(AbstractSequentializer::ANNOTATION_SEQUENTIALIZED)
        //    || scg.hasAnnotation(AbstractGuardCreator::ANNOTATION_GUARDCREATOR)
        //) {
        //    return scg
        //}

        val timestamp = System.currentTimeMillis
        compilerContext = context

        val PotentialInstantaneousLoopAnalyzer potentialInstantaneousLoopAnalyzer = Guice.createInjector().
            getInstance(typeof(PotentialInstantaneousLoopAnalyzer))
        context.compilationResult.addAuxiliaryData(potentialInstantaneousLoopAnalyzer.analyze(scg))

        //        pilData = context.compilationResult.ancillaryData.filter(typeof(PotentialInstantaneousLoopResult)).head.criticalNodes.toSet
        /**
         * Since we want to build a new SCG, we cannot use the SCG copy extensions because it would 
         * preserve all previous (node) data.
         * Therefore, we only copy the interface and extend the declaration by the guards of the 
         * basic blocks.
         */
        scg => [
            annotations += createStringAnnotation(ANNOTATION_GUARDCREATOR, "")
        ]

        //        schizoDeclaration = createDeclaration=>[ setType(ValueType::BOOL) ]
        val predecessorList = <Predecessor>newArrayList
        val basicBlockList = <BasicBlock>newArrayList
        scg.createGOSignal

        conditionalGuards.clear

        //        newSchizoGuards.clear
        schedulingBlocks.clear
        schedulingBlockCache.clear
        schedulingBlockGuardCache.clear
        for (basicBlock : scg.basicBlocks) {
            if (basicBlock.isDeadBlock) {
                for (schedulingBlock : basicBlock.schedulingBlocks) {
                    schedulingBlock.guard.dead = true
                }
            } else {
                predecessorList += basicBlock.predecessors
                for (schedulingBlock : basicBlock.schedulingBlocks) {
                    schedulingBlocks += schedulingBlock
                    for (node : schedulingBlock.nodes) {
                        schedulingBlockCache.put(node, schedulingBlock)
                        schedulingBlockGuardCache.put(schedulingBlock.guard, schedulingBlock)
                    }
                }
            }
        }

        var time = (System.currentTimeMillis - timestamp) as float
        System.out.println("Preparation for guard creation: caches finished (time elapsed: " + (time / 1000) + "s).")

        // Create the predecessor caches for each predecessor.
        predecessorList.forEach [ p |
            if (p.branchType == BranchType::TRUEBRANCH) {
                p.cacheTwin(basicBlockList)
            } else if (p.branchType == BranchType::ELSEBRANCH) {
                p.cacheTwin(basicBlockList)
            }
            val conditional = p.conditional
            if (conditional != null && !conditionalGuards.keySet.contains(conditional)) {
                val newVO = KExpressionsFactory::eINSTANCE.createValuedObject
                newVO.name = CONDITIONAL_EXPRESSION_PREFIX + p.basicBlock.schedulingBlocks.head.guard.valuedObject.name

                val newGuard = ScgFactory::eINSTANCE.createGuard
                newGuard.valuedObject = newVO
                newGuard.expression = conditional.condition.copy
                newGuard.sequentialize = false
                newGuard.schedulingBlockLink = p.basicBlock.schedulingBlocks.head
                scg.guards += newGuard

                conditionalGuards.put(conditional, newGuard)
                debug(
                    "Generated NEW conditional guard " + newGuard.valuedObject.name + " with expression " +
                        newGuard.expression.serialize)
            }
        ]

        time = (System.currentTimeMillis - timestamp) as float
        System.out.println("Preparation for guard creation finished (time elapsed: " + (time / 1000) + "s).")

        for (schedulingBlock : schedulingBlocks) {
            schedulingBlock.guard.createGuardEquation(schedulingBlock, scg)
        }
        
        val CopyPropagation copyPropagation = 
            Guice.createInjector().getInstance(typeof(CopyPropagation))    
// FIXME: temporary disabled
// needs further efficiency improvements and bug-fixing in conditional nodes       
//        copyPropagation.optimize(scg)         
        
        scg     	
    }

    /**
     * createGuardExpression creates an expression for a guard of a specific scheduling block.
     * 
     * @param schedulingBlock
     *          the scheduling block in question.
     * @param scg
     *          the SCG
     * @return Returns the guard expression.
     * @throws UnsupportedSCGException 
     *      Throws an UnsupportedSCGException if a standard guarded block has no predecessor information.
     */
    protected def void createGuardEquation(Guard guard, SchedulingBlock schedulingBlock, SCGraph scg) {

        // Query the basic block of the scheduling block.
        val basicBlock = schedulingBlock.basicBlock

        /*if (guard.schizophrenic && basicBlock.entryBlock && 
        	((basicBlock.schedulingBlocks.head.nodes.head as Entry).allPrevious.head as Fork).join.getSynchronizer.id 
        	== DepthJoinSynchronizer::SYNCHRONIZER_ID
        ) {
            guard.expression = FALSE
        } else {      */
        /** 
         * If the scheduling block is the first scheduling block in the basic block,
         * create an appropriate expression for the activity state of this guard.
         * A more accurate description of the interconnectivity between the activity states
         * of the basic blocks can be found in rtsys:ssm-dt, 2013.
         */
        // Is the scheduling block the first scheduling block of the basic block?
        if (basicBlock.schedulingBlocks.head == schedulingBlock) {
            if (basicBlock.goBlock) {

                /**
                 * If the basic block is a GO block, meaning it should be active when the programs starts,
                 * add a reference to the GO signal as expression for the guard.
                 */
                guard.createGoBlockGuardExpression(schedulingBlock, scg)
            } else if (basicBlock.depthBlock) {

                /**
                 * If the basic block is a depth block, meaning it is delayed in its execution,
                 * add a pre operator expression as expression for the guard.
                 */
                guard.createDepthBlockGuardExpression(schedulingBlock, scg)
            } else if (basicBlock.synchronizerBlock) {

                /**
                 * If the basic block is a surface block, meaning it is responsible for joining concurrent threads,
                 * invoke a synchronizer. The synchronizer will create the guard expression for this node.
                 * Additionally, the synchronizer may create new valued objects mandatory for the expression.
                 * These must be added to the graph in order to be serializable later on. 
                 */
                guard.createSynchronizerBlockGuardExpression(schedulingBlock, scg)

            //                if (joinData.synchronizerId == DepthJoinSynchronizer::SYNCHRONIZER_ID ||
            //                	scheduledBlock.schizophrenic
            //                ) {
            //                    assignment.assignment = scg.fixSchizophrenicExpression(assignment.assignment)
            //                }
            } else {

                /**
                 * If the block is neither of them, it solely depends on the activity states of previous basic blocks.
                 * At least one block must be active to activate the current block. Therefore, connect all guards
                 * of the predecessors with OR expressions.
                 */
                guard.createStandardBlockGuardExpression(schedulingBlock, scg)
            }
        } else {

            /**
             * If the scheduling block is not the first scheduling block in the basic block, it is active 
             * if and only if its basic block, and in this case the first scheduling block of the basic block,
             * is active but possibly at a later stage in the net list. Add a reference of the guard of the first
             * scheduling block as expression.
             * 
             * HINT: There were some concerns that the expression would maybe evaluate differently at a later stage in 
             * the net list and that the whole expression must be re-evaluated at that particular point of time.
             * However, due to the rules valid for the basic block and scheduling block creation, this scenario 
             * cannot occur. A difference of guard evaluation with respect to data dependencies can only occur 
             * between conditional nodes but conditional nodes force the create of new basic blocks after their execution.
             * Therefore, there will always be a new basic block with a new guard expression in this scenario.
             */
            guard.createSubsequentSchedulingBlockGuardExpression(schedulingBlock, scg)
        }

        /*if (guard.schizophrenic) {
    	    val newGuards = scg.handleSchizophrenicExpression(guard.expression, pilData)
    	    for(ng : newGuards) {
                val sb = ng.schedulingBlockLink
                if (sb != null) {
                    ng.createGuardEquation(sb, scg)
                }
            }
            scg.handleSchizophrenicConditions(guard.expression)
    	}
    	
    	var volatileText = " "
    	if (!guard.volatile.empty) {
    		volatileText = volatileText + "and volatiles "
    		for(volatile : guard.volatile) {
    			volatileText = volatileText + volatile.name + " "
    		}
    	}*/
        debug("Generated guard " + guard.valuedObject.name + " with expression " + guard.expression.serialize) // + volatileText)      
    }

    //    } // schizo entry
    /*    protected def Set<Guard> handleSchizophrenicExpression(SCGraph scg, Expression expression, Set<Node> pilData) {
        val createdGuards = <Guard> newHashSet
        val vors = <ValuedObjectReference> newHashSet
        if (expression instanceof ValuedObjectReference) {
            vors += expression as ValuedObjectReference
        } else if (expression instanceof OperatorExpression) {
            vors += (expression as OperatorExpression).eAllContents.filter(typeof(ValuedObjectReference)).toSet
        }
            // TODO: performance!
            for(vor : vors) {
                val originalGuard = scg.guards.filter[ it.valuedObject == vor.valuedObject ].head
                if (originalGuard != null && (
                	originalGuard.isOnCriticalPath(pilData)) ||
                	(originalGuard.schedulingBlockLink != null && originalGuard.schedulingBlockLink.nodes.last instanceof Conditional)
                	) {
                    
                    val guardExists = newSchizoGuards.filter[ it.valuedObject.name == originalGuard.valuedObject.name + SCHIZOPHRENIC_SUFFIX ].toList
                    if (guardExists.empty) {
                        val newValuedObject = KExpressionsFactory::eINSTANCE.createValuedObject
                        newValuedObject.name = originalGuard.valuedObject.name + SCHIZOPHRENIC_SUFFIX
                    
                        val newGuard = ScgFactory::eINSTANCE.createGuard
                        newGuard.valuedObject = newValuedObject
                        newGuard.schedulingBlockLink = originalGuard.schedulingBlockLink
                        newGuard.volatile += originalGuard.volatile
                        newGuard.schizophrenic = true
                        newGuard.sequentialize = originalGuard.sequentialize
                        scg.guards += newGuard
                    
                        vor.valuedObject = newGuard.valuedObject 
                    
                        newSchizoGuards += newGuard

                        if (!newGuard.sequentialize) {
                        	newGuard.expression = originalGuard.expression.copy
                        } else {
	                        createdGuards += newGuard
                        }
                        System.out.println("Generated NEW _SCHIZOPHRENIC_ guard " + newGuard.valuedObject.name)
                    } else {
                        vor.valuedObject = guardExists.head.valuedObject
                    }
                }
            }
        createdGuards
    }    
    
    protected def Set<Guard> handleSchizophrenicConditions(SCGraph scg, Expression expression) {
        val createdGuards = <Guard> newHashSet
        val vors = <ValuedObjectReference> newHashSet
        
        if (expression instanceof ValuedObjectReference) {
//            vors += expression as ValuedObjectReference
        } else if (expression instanceof OperatorExpression) {
            vors += (expression as OperatorExpression).eAllContents.filter(typeof(ValuedObjectReference)).
            	filter[ it.valuedObject.name.startsWith(CONDITIONAL_EXPRESSION_PREFIX) && !it.valuedObject.name.endsWith(SCHIZOPHRENIC_SUFFIX) ].toSet
        }
        
            // TODO: performance!
            for(vor : vors) {
                val originalGuard = scg.guards.filter[ it.valuedObject == vor.valuedObject ].head
                if (originalGuard != null) {
                    
                    val guardExists = newSchizoGuards.filter[ it.valuedObject.name == originalGuard.valuedObject.name + SCHIZOPHRENIC_SUFFIX ].toList
                    if (guardExists.empty) {
                        val newValuedObject = KExpressionsFactory::eINSTANCE.createValuedObject
                        newValuedObject.name = originalGuard.valuedObject.name + SCHIZOPHRENIC_SUFFIX
                    
                        val newGuard = ScgFactory::eINSTANCE.createGuard
                        newGuard.valuedObject = newValuedObject
                        newGuard.schedulingBlockLink = originalGuard.schedulingBlockLink
                        newGuard.volatile += originalGuard.volatile
                        newGuard.schizophrenic = true
                        newGuard.sequentialize = originalGuard.sequentialize
                       	newGuard.expression = originalGuard.expression.copy
                        scg.guards += newGuard
                    
                        vor.valuedObject = newGuard.valuedObject 
                    
                        newSchizoGuards += newGuard

                        System.out.println("Generated NEW _SCHIZOPHRENIC_ guard " + newGuard.valuedObject.name)
                    } else {
                        vor.valuedObject = guardExists.head.valuedObject
                    }
                }
            }
        createdGuards
    }        
    
   private def boolean isOnCriticalPath(Guard guard, Set<Node> pilData) {
        if (guard.schedulingBlockLink == null) return false
        for(n : guard.schedulingBlockLink.nodes) {
            if (pilData.contains(n)) return true
        }
        return false
    } */
    // --- CREATE GUARDS: GO BLOCK 
    protected def void createGoBlockGuardExpression(Guard guard, SchedulingBlock schedulingBlock, SCGraph scg) {
        guard.setDefaultTrace
        guard.expression = scg.findValuedObjectByName(GOGUARDNAME).reference
    }

    // --- CREATE GUARDS: DEPTH BLOCK 
    protected def void createDepthBlockGuardExpression(Guard guard, SchedulingBlock schedulingBlock, SCGraph scg) {
        guard.setDefaultTrace
        guard.expression = KExpressionsFactory::eINSTANCE.createOperatorExpression => [
            setOperator(OperatorType::PRE)
            subExpressions.add(schedulingBlock.basicBlock.preGuard.reference)
        ]
    }

    // --- CREATE GUARDS: SYNCHRONIZER BLOCK 
    protected def void createSynchronizerBlockGuardExpression(Guard guard, SchedulingBlock schedulingBlock, SCGraph scg) {
        guard.setDefaultTrace
        // The simple scheduler uses the SurfaceSynchronizer. 
        // The result of the synchronizer is stored in the synchronizerData class joinData.
        val join = schedulingBlock.nodes.head as Join
        if (!join.hasAnnotation(SynchronizerSelector::ANNOTATION_SELECTEDSYNCHRONIZER)) {
            val sync = join.chooseSynchronizer
            sync.annotate(join)
        }
        val synchronizer = join.getSynchronizer
        debug("Creating join guard " + guard.valuedObject.name + " with " + synchronizer.id)

        //        if (synchronizer.id == DepthJoinSynchronizer::SYNCHRONIZER_ID) {
        //            (synchronizer as DepthJoinSynchronizer).schizophrenicDeclaration = schizoDeclaration
        //        }
        synchronizer.synchronize(schedulingBlock.nodes.head as Join, guard, schedulingBlock, scg, this, compilerContext,
            schedulingBlockCache)

        val newGuards = synchronizer.newGuards

        //        newSchizoGuards += newGuards
        for (ng : newGuards) {
            val sb = ng.schedulingBlockLink
            if (sb != null) {
                ng.createGuardEquation(sb, scg)
            }
        }
    }

    // --- CREATE GUARDS: STANDARD BLOCK 
    protected def void createStandardBlockGuardExpression(Guard guard, SchedulingBlock schedulingBlock, SCGraph scg) {
        guard.setDefaultTrace
        val basicBlock = schedulingBlock.basicBlock

        val relevantPredecessors = <Predecessor>newHashSet
        if (guard.schizophrenic) {
            relevantPredecessors += basicBlock.predecessors.filter[!it.basicBlock.entryBlock]
        } else {
            relevantPredecessors += basicBlock.predecessors
        }

        // If there are more than one predecessor, create an operator expression and connect them via OR.
        if (relevantPredecessors.size > 1) {

            // Create OR operator expression via kexpressions factory.
            val expr = KExpressionsFactory::eINSTANCE.createOperatorExpression
            expr.setOperator(OperatorType::OR)

            // For each predecessor add its expression to the sub expressions list of the operator expression.
            relevantPredecessors.forEach [
                //                if (!scheduledBlock.schizophrenic || it.basicBlock.entryBlock)
                expr.subExpressions += guard.predecessorExpression(it, schedulingBlock, scg)
            ]
            guard.expression = expr
        } 
        // If it is exactly one predecessor, we can use its expression directly.
        else if (relevantPredecessors.size == 1) {

            //            if (!scheduledBlock.schizophrenic || basicBlock.predecessors.head.basicBlock.entryBlock)
            guard.expression = guard.predecessorExpression(relevantPredecessors.head, schedulingBlock, scg)
        } else {

            /**
            * If we reach this point, the basic block contains no predecessor information but is not marked as go block.
            * This is not supported by this scheduler: throw an exception. 
            */
            if (!basicBlock.deadBlock && !guard.schizophrenic) {
                throw new UnsupportedSCGException("Cannot handle standard guard without predecessor information!")
            } else {
                guard.expression = FALSE
            }
        }
    }

    // --- CREATE GUARDS: SUBSEQUENT SCHEDULING BLOCK 
    protected def void createSubsequentSchedulingBlockGuardExpression(Guard guard, SchedulingBlock schedulingBlock,
        SCGraph scg) {
        guard.setDefaultTrace
        if (guard.schizophrenic && schedulingBlock.basicBlock.entryBlock) {
            guard.expression = FALSE
        } else {
            guard.expression = schedulingBlock.basicBlock.schedulingBlocks.head.guard.valuedObject.reference
        }
    }

    /**
     * PredecessorExpression forms a single expression with respect to the predecessor,
     * meaning that the expression is a reference to the guard of the predecessor and
     * combined with the (negated) expression of a condition in the case of a 
     * conditional predecessor.
     *  
     * @param predecessor
     *          The predecessor in question.
     * @return Returns the expression for this predecessor.
     * @throws UnsupportedSCGException
     *      Throws an UnsupportedSCGException if the predecessor does not contain sufficient information to form the expression.
     */
    protected def Expression predecessorExpression(Guard guard, Predecessor predecessor, SchedulingBlock schedulingBlock,
        SCGraph scg) {
        guard.setDefaultTrace
        // Return a solely reference as expression if the predecessor is not a conditional
        if (predecessor.branchType == BranchType::NORMAL) {
            return predecessor.basicBlock.schedulingBlocks.last.guard.valuedObject.reference
        }
        // If we are in the true branch of the predecessor, combine the predecessor guard reference with
        // the condition of the conditional and return the expression.
        else if (predecessor.branchType == BranchType::TRUEBRANCH) {
            val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression
            expression.setOperator(OperatorType::AND)
            expression.subExpressions += predecessor.basicBlock.schedulingBlocks.last.guard.valuedObject.reference
            expression.subExpressions += conditionalGuards.get(predecessor.conditional).valuedObject.reference

            // Conditional branches are mutual exclusive. Since the other branch may modify the condition 
            // make sure the subsequent branch will not evaluate to true if the first one was already taken.
            val twin = predecessor.getSchedulingBlockTwin(BranchType::ELSEBRANCH, scg)
            if (predecessorTwinMark.contains(twin)) {
                val twinVOR = twin.guard.valuedObject.reference

            //            	guard.volatile += twinVOR.valuedObject
            //                expression.subExpressions.add(0, twinVOR.negate)
            }
            predecessorTwinMark.add(schedulingBlock)

            return expression.fix
        }
        // If we are in the true branch of the predecessor, combine the predecessor guard reference with
        // the negated condition of the conditional and return the expression.
        else if (predecessor.branchType == BranchType::ELSEBRANCH) {
            val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression
            expression.setOperator(OperatorType::AND)
            expression.subExpressions += predecessor.basicBlock.schedulingBlocks.last.guard.valuedObject.reference
            expression.subExpressions += conditionalGuards.get(predecessor.conditional).valuedObject.reference.negate

            // Conditional branches are mutual exclusive. Since the other branch may modify the condition 
            // make sure the subsequent branch will not evaluate to true if the first one was already taken.
            val twin = predecessor.getSchedulingBlockTwin(BranchType::TRUEBRANCH, scg)
            if (predecessorTwinMark.contains(twin)) {
                val twinVOR = twin.guard.valuedObject.reference

            //            	guard.volatile += twinVOR.valuedObject
            //                expression.subExpressions.add(0, twinVOR.negate)
            }
            predecessorTwinMark.add(schedulingBlock)

            return expression.fix
        }

        throw new UnsupportedSCGException(
            "Cannot create predecessor expression without predecessor block type information.")
    }

    protected def SchedulingBlock getSchedulingBlockTwin(Predecessor predecessor, BranchType blockType, SCGraph scg) {
        val twin = predecessorTwinCache.get(predecessor)
        predecessorSBCache.get(twin).head
    }

    private def cacheTwin(Predecessor predecessor, List<BasicBlock> basicBlocks) {
        val bb = predecessor.basicBlock
        var predList = predecessorBBCache.get(bb)
        if (predList == null) {
            predList = <Predecessor>newArrayList => [add(predecessor)]
            predecessorBBCache.put(bb, predList)
        } else {
            val fPred = predList.get(0)
            predList.add(predecessor)
            predecessorTwinCache.put(fPred, predecessor)
            predecessorTwinCache.put(predecessor, fPred)

            val sbList1 = <SchedulingBlock>newArrayList
            val basicBlock1 = fPred.eContainer as BasicBlock
            sbList1 += basicBlock1.schedulingBlocks.head
            predecessorSBCache.put(fPred, sbList1)

            val sbList2 = <SchedulingBlock>newArrayList
            val basicBlock2 = predecessor.eContainer as BasicBlock
            sbList2 += basicBlock2.schedulingBlocks.head
            predecessorSBCache.put(predecessor, sbList2)
        }
    }

    /*    protected def Expression fixSchizophrenicExpression(SCGraph scg, Expression expression) {
        if (expression instanceof ValuedObjectReference) {
            val vor = (expression as ValuedObjectReference)
            val newVO = schizoDeclaration.findValuedObjectByName(vor.valuedObject.name + SCHIZOPHRENIC_SUFFIX)
            if (newVO != null) {
                vor.valuedObject = newVO 
            }
        } else if (expression instanceof OperatorExpression) {
            val vors = (expression as OperatorExpression).eAllContents.filter(typeof(ValuedObjectReference))
            for(vor : vors.toIterable) {
                val newVO = schizoDeclaration.findValuedObjectByName(vor.valuedObject.name + SCHIZOPHRENIC_SUFFIX)
                if (newVO != null) {
                    vor.valuedObject = newVO 
                }
            }
        }
        
        expression
    }*/
    def ValuedObject findValuedObjectByName(Declaration declaration, String name) {
        for (vo : declaration.valuedObjects) {
            if(vo.name == name) return vo
        }
        return null
    }

}
